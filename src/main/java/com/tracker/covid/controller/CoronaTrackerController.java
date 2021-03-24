package com.tracker.covid.controller;

import com.tracker.covid.entity.Country;
import com.tracker.covid.service.CoronaTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.List;

@Controller
public class CoronaTrackerController {

    @Autowired
    CoronaTrackerService coronaTrackerService;

    @GetMapping("/")
    public String home(Model model) throws IOException {
        List<Country> countries = coronaTrackerService.getStatusForAllCountries();

        model.addAttribute("countries", countries);

        return "home";
    }
}
