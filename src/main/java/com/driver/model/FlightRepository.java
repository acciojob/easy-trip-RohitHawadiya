package com.driver.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class FlightRepository {


    HashMap<Integer,Flight> flightDb=new HashMap<>();

    public String addFlight(Flight flight){

        int key=flight.getFlightId();

        flightDb.put(key,flight);

        return "SUCCESS";

    }

    public List<Flight> flightList(){

        List<Flight>l=new ArrayList<>();
        for(Flight f:flightDb.values())
        {
           l.add(f);
        }
        return l;
    }
}
