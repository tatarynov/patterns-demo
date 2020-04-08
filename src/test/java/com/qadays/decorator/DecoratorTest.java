package com.qadays.decorator;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;

public class DecoratorTest {

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();

        DecoratorRemoteWebDriver decoratorRemoteWebDriver = new DecoratorRemoteWebDriver();
        WebDriverRunner.setWebDriver(decoratorRemoteWebDriver);
    }

    @Test
    public void testDecoratorExample() {
        Selenide.open("https://google.com");
        // other test
    }
}