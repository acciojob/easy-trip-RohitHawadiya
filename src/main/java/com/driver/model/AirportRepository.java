package com.driver.model;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class AirportRepository {

    HashMap<String,Airport> airportDb=new HashMap<>();
    public String addAirport(Airport airport){

        String key=airport.getAirportName();

        airportDb.put(key,airport);

        return "SUCCESS";


    }

    public List<Airport> getLargestAirportName(){

        List<Airport> l=new ArrayList<>();
          for(Airport p:airportDb.values())
          {
              l.add(p);
          }
          return l;
    }
}
