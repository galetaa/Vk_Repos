package com.tests.pages;

import static com.codeborne.selenide.Selenide.*;

public class SettingsPage {

    public SettingsPage openSettingsMenu() {

        $x("//div[@class='toolbar_dropdown_w h-mod']").click();
        return this;
    }

    public void selectDarkTheme() {

        $x("//button[@class='u-menu_a u-menu_btn theme-switcher_btn']").click();
        $x("//li[@class='u-menu_li theme-switcher_item __dark']").click();
    }
}
