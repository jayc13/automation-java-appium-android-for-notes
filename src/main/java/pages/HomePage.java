package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class HomePage extends BasePage{

    @AndroidFindBy(id = "empty_notes_view")
    public WebElement emptyListMessage;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'toolbar')]/android.widget.TextView")
    public WebElement toolBarHeaderLabel;
    @AndroidFindBy(id = "fab")
    public WebElement newNoteButton;

    public HomePage (AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(120)), this);
    }

}
