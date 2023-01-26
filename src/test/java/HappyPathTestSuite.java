import config.BaseTestSuite;
import pages.HomePage;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Happy Path Test Suite")
public class HappyPathTestSuite extends BaseTestSuite {
    @Test
    @DisplayName("Home Screen validation - Default presentation")
    public void defaultStartTest() {
        HomePage homePage = new HomePage(this.driver);
        assertTrue(homePage.emptyListMessage.isDisplayed(), "The Notes list is not empty when the apps starts");
        assertEquals(homePage.emptyListMessage.getText(), "No notes found!", "The empty list text doesn't match");
        assertTrue(homePage.newNoteButton.isDisplayed(), "There is no new note button preset");
        assertEquals(homePage.toolBarHeaderLabel.getText(), "info.androidhive.sqlite.view.MainActivity", "The header text is incorrect");
        assertTrue(homePage.toolBarHeaderLabel.isDisplayed(), "There is no header present");
    }
}