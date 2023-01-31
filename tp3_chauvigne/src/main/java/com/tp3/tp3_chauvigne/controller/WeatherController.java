package com.tp3.tp3_chauvigne.controller;

import com.tp3.tp3_chauvigne.model.Root;
import com.tp3.tp3_chauvigne.model.Root1;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class WeatherController {

    private static String url = "https://api-adresse.data.gouv.fr/search/?q=";
    private  static String endUrl = "&limit=1";

    private static String token = "af7c70f7bb33eada8433e72b2dce9922889b6a651a3810c4baac5d5e2f5f6afe";
    @PostMapping(value = "/meteo", produces = MediaType.APPLICATION_JSON_VALUE)
    public String meteo(@RequestParam(name="address") String nameGET, Model model) {
        model.addAttribute("addressPOST", nameGET);

        String curl = url + nameGET + endUrl; //URL constitué

        RestTemplate restTemplate = new RestTemplate();
        Root jsonRoot = restTemplate.getForObject(curl, Root.class); //Récupération réponse API
        Double x = jsonRoot.getFeatures().get(0).getGeometry().getCoordinates().get(0);
        Double y = jsonRoot.getFeatures().get(0).getGeometry().getCoordinates().get(1);
        model.addAttribute("xCoordinate", x);
        model.addAttribute("yCoordinate", y);

        Root1 jsonRoot1 = restTemplate.getForObject("https://api.meteo-concept.com/api/forecast/daily?token="+ token + "&latlng="+y+","+x, Root1.class);
        model.addAttribute("forecasts",jsonRoot1.getForecast());

        return "meteo";
    }
}