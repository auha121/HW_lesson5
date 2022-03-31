package ru.gb.locators.iOS;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import ru.gb.locators.interfaces.FormsPageLocators;

public class iOSFormsPageLocators implements FormsPageLocators {

    public By formsSwitchButton() {
        return MobileBy.AccessibilityId("switch");
    }

    public By formScreen() {
        return MobileBy.AccessibilityId("Forms-screen");
    }
}
