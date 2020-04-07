package com.qadays.pageobject;

import com.qadays.pages.GoogleMainPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class PageObjectExample {

    private String searchQuery;

    @Before
    public void setUp() {
        searchQuery = "QA Days";
    }

    @Test
    public void googleTest() {
        open("https://www.google.com/");
        GoogleMainPage googleMainPage = new GoogleMainPage();
        googleMainPage.search(searchQuery);

        // dumb assertion
        Assert.assertTrue(true);
    }
}



