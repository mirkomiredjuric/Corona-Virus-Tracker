package com.tracker.covid.service;

import com.tracker.covid.entity.Country;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

@Service
public class CoronaTrackerService {

    private static final String CORONA_DATA_URL = "https://covid19.who.int/WHO-COVID-19-global-table-data.csv";

    private List<Country> listOfAllCountries = new ArrayList<>();

    public List<Country> getStatusForAllCountries() throws IOException {
        if(listOfAllCountries.isEmpty()){
            getDataFromURL();
            return listOfAllCountries;
        }
        return listOfAllCountries;
    }

    @Scheduled(cron = "05 15 * * *")
    private void getDataFromURL() throws IOException {

        URL coronaDataURL = new URL(CORONA_DATA_URL);
        URLConnection urlConnection = coronaDataURL.openConnection();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader( urlConnection.getInputStream()));
        String inputLine;

        while ((inputLine = bufferedReader.readLine()) != null){
            if(inputLine.contains("occupied Palestinian territory")){
                inputLine = inputLine.replaceFirst(",", "");
            }
            if(!inputLine.contains("Name,WHO Region")){
                if(!inputLine.contains("Global")){
                    Country country = fillCountryWithData(inputLine);
                    listOfAllCountries.add(country);
                }
            }
        }
    }

    private Country fillCountryWithData(String inputLine) {
        String[] data = inputLine.split(",");
        Country country = new Country();

        country.setName(data[0]);
        country.setWHORegion(data[1]);
        country.setTotalCases(Integer.parseInt(data[2].replace(".","")));
        country.setTotalCasesPer100k(Integer.parseInt(replaceEmptyStringWithZero(data[3]).replace(".","")));
        country.setTotalCasesInLast7Days(Integer.parseInt(replaceEmptyStringWithZero(data[4]).replace(".","")));
        country.setTotalCasesInLast7DaysPer100k(Integer.parseInt(replaceEmptyStringWithZero(data[5]).replace(".","")));
        country.setTotalCasesInLast24h(Integer.parseInt(replaceEmptyStringWithZero(data[6]).replace(".","")));
        country.setTotalDeaths(Integer.parseInt(replaceEmptyStringWithZero(data[7]).replace(".","")));
        country.setTotalDeathsPer100k(Integer.parseInt(replaceEmptyStringWithZero(data[8]).replace(".","")));
        country.setTotalDeathsInLast7Days(Integer.parseInt(replaceEmptyStringWithZero(data[9]).replace(".","")));
        country.setTotalDeathsInLast7DaysPer100k(Integer.parseInt(replaceEmptyStringWithZero(data[10]).replace(".","")));
        country.setTotalDeathsInLast24h(Integer.parseInt(replaceEmptyStringWithZero(data[11]).replace(".","")));
        country.setTransmissionClassification(data[12]);

        return country;
    }

    private String replaceEmptyStringWithZero(String str){
        if(str.equals("")){
            return "0";
        }
        return str;
    }
}
