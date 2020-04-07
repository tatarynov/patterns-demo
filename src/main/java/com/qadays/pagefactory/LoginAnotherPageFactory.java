package com.qadays.pagefactory;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

public class LoginAnotherPageFactory {

    @FindBy(css = "[name='q']")
    private SelenideElement searchInput;

    public void search(String searchValue) {
        $(searchInput)
                .val(searchValue)
                .submit();
    }
}
