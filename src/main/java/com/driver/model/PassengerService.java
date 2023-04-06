package com.driver.model;

import org.springframework.stereotype.Service;

@Service
public class PassengerService {

    PassengerRepository passengerRepository=new PassengerRepository();

    public String addPassenger(Passenger passenger){

        String ans=passengerRepository.addPassenger(passenger);

        return ans;
    }
}

