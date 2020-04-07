package com.qadays.valueobject;

import com.qadays.builder.CreditCard;
import org.junit.Before;
import org.junit.Test;

import static com.qadays.builder.CheckCreditCard.verifyCreditCard;
import static org.junit.Assert.assertTrue;

/***
 * The example for ValueObject pattern
 * The one test can be extended with multiple data sets to enable Data Driven Approach
 */
public class ValueObjectTest {

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
        // check the credit card object instead of verifying each field
        assertTrue(verifyCreditCard(creditCard));
    }
}



