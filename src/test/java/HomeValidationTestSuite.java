import config.BaseTestSuite;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Home Validation Test Suite")
public class HomeValidationTestSuite extends BaseTestSuite {
    public HomeValidationTestSuite() {
        super("Home Validation Test Suite");
    }

    @Test
    @DisplayName("Home Screen validation - Default presentation")
    public void defaultStartTest() {
        HomePage homePage = new HomePage(this.driver);
        assertTrue(homePage.emptyListMessage.isDisplayed(), "The Notes list is not empty when the apps starts");
        assertEquals("No notes found!", homePage.emptyListMessage.getText(), "The empty list text doesn't match");
        assertTrue(homePage.newNoteButton.isDisplayed(), "There is no new note button preset");
        assertEquals("Notes App", homePage.toolBarHeaderLabel.getText(), "The header text is incorrect");
        assertTrue(homePage.toolBarHeaderLabel.isDisplayed(), "There is no header present");
    }
}