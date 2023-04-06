package com.driver.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class PassengerRepository {

    HashMap<Integer,Passenger> passengerDb=new HashMap<>();

    public String addPassenger(Passenger passenger){

        int key=passenger.getPassengerId();

        passengerDb.put(key,passenger);

        return "SUCCESS";
    }

    public List<Passenger> listPassenger(){

        List<Passenger> l=new ArrayList<>();

        for(Passenger p:passengerDb.values())
        {
            l.add(p);
        }

        return l;
    }
    public Passenger findId(int passengerId){

        for(Passenger p:passengerDb.values())
        {
            if(p.getPassengerId()==passengerId)
                return p;
        }
        return null;
    }

}
