package com.qadays.dataprovider;

import com.qadays.builder.CreditCard;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.qadays.builder.CheckCreditCard.verifyCreditCard;
import static org.junit.Assert.assertTrue;


/***
 * The example for Data Provider pattern
 * The one test can be extended with multiple data sets to enable Data Driven Approach
 */
@RunWith(DataProviderRunner.class)
public class DataProviderTest {

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
        boolean expectedResult = verifyCreditCard(testCreditCard);
        assertTrue(expectedResult);
    }
}



