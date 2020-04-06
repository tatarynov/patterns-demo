package com.qadays.builder;


import lombok.Builder;

@Builder
public class CreditCard {

    private String name;
    private int cvc;
    private String date;
    private int creditCardNumber;
}
