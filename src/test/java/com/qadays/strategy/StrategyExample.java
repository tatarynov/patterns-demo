package com.qadays.strategy;

import com.qadays.builder.CreditCard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StrategyExample {

    private CreditCard creditCard;

    @Before
    public void setUp() {
        creditCard = CreditCard.builder()
                .name("Name")
                .creditCardNumber(1234567891)
                .cvc(123)
                .date("12/03")
                .build();
    }

    @Test
    public void testCreditCardPayment() {
        ShoppingCard shoppingCard = new ShoppingCard(10);
        shoppingCard.pay(new CreditCardStrategy(creditCard));

        // some assertion
        assertTrue(true);
    }

    @Test
    public void testPayPalPayment() {
        ShoppingCard shoppingCard = new ShoppingCard(20);
        shoppingCard.pay(new PayPalStrategy());

        // some assertion
        assertTrue(true);
    }
}
