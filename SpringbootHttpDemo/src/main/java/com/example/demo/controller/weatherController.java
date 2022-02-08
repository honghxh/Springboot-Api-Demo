package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.pojo.parameter;
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

           parameter parameter = JSONObject.parseObject(String.valueOf(api.find(city)), parameter.class);
            model.addAttribute("city", parameter.getSuccess());
            model.addAttribute("result", parameter.getResult());
            model.addAttribute("realtime", parameter.getResult().getRealTime());
            model.addAttribute("futureHour", parameter.getResult().getFutureHour());
            model.addAttribute("toDay", parameter.getResult().getToday());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "answer";
    }
}
