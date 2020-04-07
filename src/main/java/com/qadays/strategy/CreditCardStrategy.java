package com.qadays.strategy;

import com.qadays.builder.CreditCard;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.java.Log;

@Getter
@AllArgsConstructor
@Log
public class CreditCardStrategy implements PaymentStrategy {

    private CreditCard creditCard;


    @Override
    public void pay(int amount) {
        // logic of payment
        log.info(String.format("payment was done with %d credit card", creditCard.getCreditCardNumber()));
    }
}

