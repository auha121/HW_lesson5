package ru.gb.locators.Android;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import ru.gb.locators.interfaces.SwipePageLocators;

public class AndroidSwipePageLocators implements SwipePageLocators {

    @Override
    public By swipeButton(Integer swipe_number) {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Carousel\"]/android.view.ViewGroup["+ swipe_number + "]/android.view.ViewGroup");
    }

    @Override
    public By swipeScreen() {
        return MobileBy.AccessibilityId("Swipe-screen");
    }
}
