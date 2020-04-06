package com.qadays.pagefactory;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryExample {

    private final LoginPageFactory pageFactory = new LoginPageFactory();

    @Test
    public void testMobile() {
        LoginPage loginPage = pageFactory.getInstance();
        loginPage.logIn("Test", "Test");

        // login successfull
        Assert.assertTrue(true);
    }

    @Test
    public void defaultSeleniumPageFactoryTest() {
        WebDriver driver = new ChromeDriver();

        // you can create page object using PageFactory selenium class
        AnotherPageFactoryExample examplePage = PageFactory.initElements(driver,
                AnotherPageFactoryExample.class);

        // login successfull
        Assert.assertTrue(true);
    }
}


