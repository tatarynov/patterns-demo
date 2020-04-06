package com.qadays.builder;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@Logger
@RunWith(DataProviderRunner.class)
public class BuilderTest {

    @DataProvider
    public static Object[][] dataProvider() {
        return new Object[][]{
                {1234567891, "Name", 123, "12/03"},
                {912345123, null, 999, "22/03"}
        };
    }

    @Test
    @UseDataProvider("dataProvider")
    public void testCreditCard(int creditCardNumber, String name, int cvc, String date) {
        CreditCard testCreditCard = CreditCard
                .builder()
                .creditCardNumber(creditCardNumber)
                .date(date)
                .name(name)
                .cvc(cvc)
                .build();

        // check the credit card
        Assert.assertTrue(CheckCreditCard.testCreditCard(testCreditCard));
    }
}