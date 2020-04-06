package com.qadays.pageobject;

import com.qadays.pages.GoogleMainPage;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.codeborne.selenide.Selenide.open;

@RunWith(DataProviderRunner.class)
public class PageObjectExample {

    @DataProvider
    public static Object[][] dataProvider() {
        return new Object[][]{
                {"QA Days Amsterdam"},
                {"QA Days New York"}
        };
    }

    @Test
    @UseDataProvider("dataProvider")
    public void googleTest(String searchQuery) {
        open("https://www.google.com/");
        GoogleMainPage googleMainPage = new GoogleMainPage();
        googleMainPage.search(searchQuery);

        // dumb assertion
        Assert.assertTrue(true);
    }
}



