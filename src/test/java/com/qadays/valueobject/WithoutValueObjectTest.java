package com.qadays.valueobject;

import com.qadays.builder.CreditCard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/***
 * The example of not using ValueObject pattern
 *  It's better to use objects which reflect your business logic for verification
 */
public class WithoutValueObjectTest {

    private CreditCard creditCard;

    @Before
    public void setUpData() {
        creditCard = CreditCard.builder()
                .name("Name")
                .creditCardNumber(1234567891)
                .cvc(123)
                .date("12/03")
                .build();
    }

    @Test
    public void testCreditCard() {
        assertEquals("Credit card number value does not meet expected result",
                creditCard.getCreditCardNumber(), 1234567891);

        assertEquals("CVC value does not meet expected result",
                creditCard.getCvc(), 1234567891);

        assertEquals("Name value does not meet expected result",
                creditCard.getName(), "Some Name");
    }
}
