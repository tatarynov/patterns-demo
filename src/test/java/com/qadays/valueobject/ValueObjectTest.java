package com.qadays.valueobject;

import com.qadays.builder.CheckCreditCard;
import com.qadays.builder.CreditCard;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class ValueObjectTest {

    @DataProvider
    public static Object[][] dataProvider() {
        return new Object[][]{
                {CreditCard
                        .builder()
                        .name("Name")
                        .creditCardNumber(1234567891)
                        .cvc(123)
                        .date("12/03")
                        .build()},
                {CreditCard
                        .builder()
                        .name("Name")
                        .creditCardNumber(1234567891)
                        .cvc(123)
                        .date("12/03")
                        .build()}
        };
    }

    @Test
    @UseDataProvider("dataProvider")
    public void testCreditCard(CreditCard testCreditCard) {
        // check the credit card
        Assert.assertTrue(CheckCreditCard.testCreditCard(testCreditCard));
    }
}



