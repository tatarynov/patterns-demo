package com.qadays.decorator;

import lombok.extern.java.Log;
import org.openqa.selenium.chrome.ChromeDriver;

@Log
public class DecoratorRemoteWebDriver extends ChromeDriver {

    @Override
    public void get(String url) {
        log.info(url + " will be open");

        // add some logic
        super.get(url);
    }
}
