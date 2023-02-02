package pages;

import io.appium.java_client.AppiumDriver;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class BasePage {
    public AppiumDriver driver;

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
    }
}
