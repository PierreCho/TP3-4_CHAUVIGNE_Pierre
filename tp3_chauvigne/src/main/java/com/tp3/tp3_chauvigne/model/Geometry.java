package com.tp3.tp3_chauvigne.model;

import java.util.ArrayList;

public class Geometry{
    private String type;
    private ArrayList<Double> coordinates;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ArrayList<Double> coordinates) {
        this.coordinates = coordinates;
    }

}
