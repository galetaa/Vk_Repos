package com.tests.pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    public LoginPage open() {
        Selenide.open("/");
        return this;
    }

    public void loginAs(String username, String password) {
        $(By.id("field_email")).setValue(username);
        $(By.id("field_password")).setValue(password);
        $(By.xpath("//input[@type='submit']")).click();
    }
}
