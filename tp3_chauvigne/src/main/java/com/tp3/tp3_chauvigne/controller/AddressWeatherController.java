package com.tp3.tp3_chauvigne.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddressWeatherController {
    @GetMapping("/addresse")
    public String address(@RequestParam(name="name", required=false, defaultValue="World") String nameGET, Model model) {
        model.addAttribute("nomTemplate", nameGET);
        return "addresse";
    }
}
