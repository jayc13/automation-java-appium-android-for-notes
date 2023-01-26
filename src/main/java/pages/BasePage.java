package pages;

import io.appium.java_client.AppiumDriver;

public abstract class BasePage {
    public AppiumDriver driver;

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
    }
}
