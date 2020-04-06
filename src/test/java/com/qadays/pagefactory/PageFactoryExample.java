package com.qadays.pagefactory;

import org.junit.Assert;
import org.junit.Test;

public class PageFactoryExample {

    private final LoginPageFactory pageFactory = new LoginPageFactory();

    @Test
    public void testMobile() {
        LoginPage loginPage = pageFactory.getInstance();
        loginPage.logIn("Test", "Test");

        // login successfull
        Assert.assertTrue(true);
    }
}
