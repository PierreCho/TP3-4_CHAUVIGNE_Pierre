package com.tp3.tp3_chauvigne.model;

import java.util.ArrayList;
import java.util.Date;

public class Root1 {

    private City city;
    private Date update;
    private ArrayList<Forecast> forecast;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }

    public ArrayList<Forecast> getForecast() {
        return forecast;
    }

    public void setForecast(ArrayList<Forecast> forecast) {
        this.forecast = forecast;
    }
}
