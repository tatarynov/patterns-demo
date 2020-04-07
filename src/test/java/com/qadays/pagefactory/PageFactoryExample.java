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

        // dumb assertion
        Assert.assertTrue(true);
    }

    @Test
    public void defaultSeleniumPageFactoryTest() {
        WebDriver driver = new ChromeDriver();

        // you can create page object using PageFactory selenium class
        LoginAnotherPageFactory loginPage = PageFactory.initElements(
                driver, LoginAnotherPageFactory.class);

        loginPage.search("QA Days");

        // dumb assertion
        Assert.assertTrue(true);
    }
}


