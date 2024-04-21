package com.tests.pages;

import com.codeborne.selenide.Selenide;

public abstract class BasePage {

    protected static final String BASE_URL = "https://ok.ru/";

    public void openPage(String path) {
        Selenide.open(BASE_URL + path);
    }

}
