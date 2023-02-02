package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class NoteListItemPage extends BasePage{

    @AndroidFindBy(id = "dot")
    public WebElement dotIndicator;
    @AndroidFindBy(id = "timestamp")
    public WebElement timestampLabel;
    @AndroidFindBy(id = "note")
    public WebElement noteLabel;

    public NoteListItemPage(AppiumDriver driver, WebElement item) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(item, Duration.ofSeconds(120)), this);
    }
}
