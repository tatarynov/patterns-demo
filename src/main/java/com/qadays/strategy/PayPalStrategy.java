package com.qadays.strategy;


import lombok.extern.java.Log;

@Log
public class PayPalStrategy implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        // logic of payment
        log.info("payment was done with PayPal");
    }
}

