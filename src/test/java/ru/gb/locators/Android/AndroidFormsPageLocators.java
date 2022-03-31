package ru.gb.locators.Android;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import ru.gb.locators.interfaces.FormsPageLocators;

public class AndroidFormsPageLocators implements FormsPageLocators {

    @Override
    public By formsSwitchButton() {
        return MobileBy.AccessibilityId("switch");
    }

    @Override
    public By formScreen() {
        return MobileBy.AccessibilityId("Forms-screen");
    }
}
