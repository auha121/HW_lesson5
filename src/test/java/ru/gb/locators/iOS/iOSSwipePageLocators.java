package ru.gb.locators.iOS;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import ru.gb.locators.interfaces.SwipePageLocators;

public class iOSSwipePageLocators implements SwipePageLocators {

    public By swipeButton(Integer swipe_number) {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Carousel\"]/android.view.ViewGroup["+ swipe_number + "]/android.view.ViewGroup");
    }

    public By swipeScreen() {
        return MobileBy.AccessibilityId("Swipe-screen");
    }
}
