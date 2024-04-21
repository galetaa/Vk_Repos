package com.tests;

import com.codeborne.selenide.Configuration;
import org.junit.Before;

public abstract class BaseTest {
    @Before
    public void setup() {
        Configuration.browser = "firefox";
        Configuration.baseUrl = "https://ok.ru/";
        Configuration.timeout = 10000;
    }
}
