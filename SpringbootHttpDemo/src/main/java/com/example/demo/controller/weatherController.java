package com.example.demo.controller;

import com.example.demo.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class weatherController {
    @Autowired
    private ApiService api;

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/find")
    public String findWeather(@RequestParam("city") String city, Model model) {

        try {

            model.addAttribute("city", api.find(city).getSuccess());
            model.addAttribute("result", api.find(city).getResult());
            model.addAttribute("realtime", api.find(city).getResult().getRealTime());

            System.out.println(api.find(city));


        } catch (Exception e) {
            e.printStackTrace();
        }

        return "answer";
    }
}
