package com.driver.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirportService {

    AirportRepository airportRepository=new AirportRepository();
    public String addAirport(Airport airport){

        String ans=airportRepository.addAirport(airport);

        return ans;
    }

    public String getLargestAirportName(){

        List<Airport> ans=new ArrayList<>();

        ans=airportRepository.getLargestAirportName();

        String largestAirportName=null;
        int lagestTerminalCount=0;

        for(Airport p:ans)
        {
           String aa=p.getAirportName();
           int tt=p.getNoOfTerminals();

           if(tt>lagestTerminalCount)
           {
               lagestTerminalCount=tt;
               largestAirportName=aa;
           }
           else if(tt==lagestTerminalCount && (largestAirportName == null || aa.compareTo(largestAirportName) < 0))
           {
               largestAirportName=aa;
           }
        }

        return largestAirportName;
    }
}
