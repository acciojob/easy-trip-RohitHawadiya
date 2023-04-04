package com.driver.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class FlightService {

    FlightRepository flightRepository=new FlightRepository();

    PassengerRepository passengerRepository=new PassengerRepository();
    public String addFlight(Flight flight){

        String ans=flightRepository.addFlight(flight);

        return ans;
    }

    public double getShortestDurationOfPossibleBetweenTwoCities(City fromCity,City toCity){

         List<Flight> ans=new ArrayList<>();

         ans=flightRepository.flightList();

         double shortestDuration=-1;

         for(Flight f: ans)
         {
             if(f.getFromCity()==fromCity && f.getToCity()==toCity)
             {
                 if(shortestDuration == -1 || f.getDuration() < shortestDuration) {
                     shortestDuration = f.getDuration();
                 }
             }
         }
         return shortestDuration;
    }

    public int getNumberOfPeopleOn(Date date,String airportName){

        List<Flight>ans=new ArrayList<>();

        List<Flight> flights=new ArrayList<>();

        ans=flightRepository.flightList();

        int totalPeople=0;

        for(Flight f:ans) {
            if (f.getFlightDate().equals(date) && ((f.getFromCity().getCityName().equalsIgnoreCase(airportName)) || (f.getToCity().getCityName().equalsIgnoreCase(airportName)))) {
                flights.add(f);

            }
        }

        for(Flight f:flights)
        {
            totalPeople+=f.getMaxCapacity();
        }

        return totalPeople;
    }

    public int flightPrice(int flightId){

        List<Flight> ans=new ArrayList<>();

        ans=flightRepository.flightList();

        int count= ans.size();

        return 3000+(count*50);
    }

//    public String bookATicket(int flightId,int passengerId){
//
//        Flight flight = flightRepository.findId(flightId);
//        if (flight == null) {
//            return "FAILURE";
//        }
//
//        // Check if passenger exists
//        Passenger passenger = passengerRepository.findId(passengerId);
//        if (passenger == null) {
//            return "FAILURE";
//        }
//
//        if(passenger.getFlightId()!=null)
//        {
//            return "FAILURE";
//        }
//

}

