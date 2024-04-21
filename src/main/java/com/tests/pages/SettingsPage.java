package com.tests.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$x;

public class SettingsPage extends BasePage {

    private static final String settingsMenuClosedXPath = "//div[@class='toolbar_dropdown_w h-mod']";

    private static final String settingsMenuOpenedXPath = "//div[@class='toolbar_dropdown_w h-mod toolbar_dropdown_w_hover']";
    private static final String themeButtonXPath = "//button[@class='u-menu_a u-menu_btn theme-switcher_btn']";
    private static final String darkThemeItemXPath = "//li[@class='u-menu_li theme-switcher_item __dark']";
    private static final String lightThemeItemXPath = "//li[@class='u-menu_li theme-switcher_item __light']";


    public SettingsPage openSettingsMenu() {
        $x(settingsMenuClosedXPath).shouldBe(visible).click();
        return this;
    }

    public void closeSettingsMenu() {
        $x(settingsMenuOpenedXPath).shouldBe(visible).click();
    }

    public SettingsPage selectDarkTheme() {
        $x(themeButtonXPath).shouldBe(visible).click();
        $x(darkThemeItemXPath).shouldBe(visible).click();
        return this;
    }

    public SettingsPage selectLightTheme() {
        $x(themeButtonXPath).shouldBe(visible).click();
        $x(lightThemeItemXPath).shouldBe(visible).click();
        return this;
    }

    public boolean isDarkThemeActive() {
        $x(settingsMenuClosedXPath).shouldBe(visible).click();
        boolean exists = $(byText("Topic: Dark")).exists();
        $x(settingsMenuOpenedXPath).shouldBe(visible).click();
        return exists;
    }

    public boolean isLightThemeActive() {
        $x(settingsMenuClosedXPath).shouldBe(visible).click();
        boolean exists = $(byText("Topic: Light")).exists();
        $x(settingsMenuOpenedXPath).shouldBe(visible).click();
        return exists;
    }
}
