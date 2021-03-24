package com.tracker.covid.entity;

public class Country {

    private String name;
    private String WHORegion;
    private int totalCases;
    private int totalCasesPer100k;
    private int totalCasesInLast7Days;
    private int totalCasesInLast7DaysPer100k;
    private int totalCasesInLast24h;
    private int totalDeaths;
    private int totalDeathsPer100k;
    private int totalDeathsInLast7Days;
    private int totalDeathsInLast7DaysPer100k;
    private int totalDeathsInLast24h;
    private String transmissionClassification;

    public Country() {
    }

    public Country(String name, String WHORegion, int totalCases, int totalCasesPer100k, int totalCasesInLast7Days, int totalCasesInLast7DaysPer100k, int totalCasesInLast24h, int totalDeaths, int totalDeathsPer100k, int totalDeathsInLast7Days, int totalDeathsInLast7DaysPer100k, int totalDeathsInLast24h, String transmissionClassification) {
        this.name = name;
        this.WHORegion = WHORegion;
        this.totalCases = totalCases;
        this.totalCasesPer100k = totalCasesPer100k;
        this.totalCasesInLast7Days = totalCasesInLast7Days;
        this.totalCasesInLast7DaysPer100k = totalCasesInLast7DaysPer100k;
        this.totalCasesInLast24h = totalCasesInLast24h;
        this.totalDeaths = totalDeaths;
        this.totalDeathsPer100k = totalDeathsPer100k;
        this.totalDeathsInLast7Days = totalDeathsInLast7Days;
        this.totalDeathsInLast7DaysPer100k = totalDeathsInLast7DaysPer100k;
        this.totalDeathsInLast24h = totalDeathsInLast24h;
        this.transmissionClassification = transmissionClassification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWHORegion() {
        return WHORegion;
    }

    public void setWHORegion(String WHORegion) {
        this.WHORegion = WHORegion;
    }

    public int getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(int totalCases) {
        this.totalCases = totalCases;
    }

    public int getTotalCasesPer100k() {
        return totalCasesPer100k;
    }

    public void setTotalCasesPer100k(int totalCasesPer100k) {
        this.totalCasesPer100k = totalCasesPer100k;
    }

    public int getTotalCasesInLast7Days() {
        return totalCasesInLast7Days;
    }

    public void setTotalCasesInLast7Days(int totalCasesInLast7Days) {
        this.totalCasesInLast7Days = totalCasesInLast7Days;
    }

    public int getTotalCasesInLast7DaysPer100k() {
        return totalCasesInLast7DaysPer100k;
    }

    public void setTotalCasesInLast7DaysPer100k(int totalCasesInLast7DaysPer100k) {
        this.totalCasesInLast7DaysPer100k = totalCasesInLast7DaysPer100k;
    }

    public int getTotalCasesInLast24h() {
        return totalCasesInLast24h;
    }

    public void setTotalCasesInLast24h(int totalCasesInLast24h) {
        this.totalCasesInLast24h = totalCasesInLast24h;
    }

    public int getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(int totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public int getTotalDeathsPer100k() {
        return totalDeathsPer100k;
    }

    public void setTotalDeathsPer100k(int totalDeathsPer100k) {
        this.totalDeathsPer100k = totalDeathsPer100k;
    }

    public int getTotalDeathsInLast7Days() {
        return totalDeathsInLast7Days;
    }

    public void setTotalDeathsInLast7Days(int totalDeathsInLast7Days) {
        this.totalDeathsInLast7Days = totalDeathsInLast7Days;
    }

    public int getTotalDeathsInLast7DaysPer100k() {
        return totalDeathsInLast7DaysPer100k;
    }

    public void setTotalDeathsInLast7DaysPer100k(int totalDeathsInLast7DaysPer100k) {
        this.totalDeathsInLast7DaysPer100k = totalDeathsInLast7DaysPer100k;
    }

    public int getTotalDeathsInLast24h() {
        return totalDeathsInLast24h;
    }

    public void setTotalDeathsInLast24h(int totalDeathsInLast24h) {
        this.totalDeathsInLast24h = totalDeathsInLast24h;
    }

    public String getTransmissionClassification() {
        return transmissionClassification;
    }

    public void setTransmissionClassification(String transmissionClassification) {
        this.transmissionClassification = transmissionClassification;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", WHORegion='" + WHORegion + '\'' +
                ", totalCases=" + totalCases +
                ", totalCasesPer100k=" + totalCasesPer100k +
                ", totalCasesInLast7Days=" + totalCasesInLast7Days +
                ", totalCasesInLast7DaysPer100k=" + totalCasesInLast7DaysPer100k +
                ", totalCasesInLast24h=" + totalCasesInLast24h +
                ", totalDeaths=" + totalDeaths +
                ", totalDeathsPer100k=" + totalDeathsPer100k +
                ", totalDeathsInLast7Days=" + totalDeathsInLast7Days +
                ", totalDeathsInLast7DaysPer100k=" + totalDeathsInLast7DaysPer100k +
                ", totalDeathsInLast24h=" + totalDeathsInLast24h +
                ", transmissionClassification='" + transmissionClassification + '\'' +
                '}';
    }
}
