package com.qadays.strategy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ShoppingCard {

    private int price;

    public void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(price);
    }
}
