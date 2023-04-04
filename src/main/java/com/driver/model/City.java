package com.driver.model;

import java.security.PrivateKey;

public enum City {

    KANPUR("Kanpur"),
    DELHI("Delhi"),
    CHANDIGARH("Chandigarh"),
    BANGLORE("Banglore"),
    JAIPUR("Jaipur"),
    KOLKATA("kolkata"),
    CHENNAI("Chennai");

    private final String cityName;

    City(String cityName){
        this.cityName=cityName;
    }

    public String getCityName(){
        return cityName;
    }
}
