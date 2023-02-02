package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class NewNotePage extends BasePage{

    @AndroidFindBy(id = "parentPanel")
    public WebElement containerPanel;
    @AndroidFindBy(id = "dialog_title")
    public WebElement dialogTitleLabel;
    @AndroidFindBy(id = "note")
    public WebElement noteInput;
    @AndroidFindBy(id = "android:id/button2")
    public WebElement cancelButton;
    @AndroidFindBy(id = "android:id/button1")
    public WebElement saveButton;

    public NewNotePage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(120)), this);
    }

}
