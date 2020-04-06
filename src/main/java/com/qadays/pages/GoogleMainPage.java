package com.qadays.pages;

import static com.codeborne.selenide.Selenide.$;

public class GoogleMainPage {

    private final String searchInput = "[name='q']";

    public void search(String searchValue) {
        $(searchInput)
                .val(searchValue)
                .submit();

    }
}


