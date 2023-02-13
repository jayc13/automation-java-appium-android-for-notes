import config.BaseTestSuite;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import pages.HomePage;
import pages.NewNotePage;
import pages.NoteListItemPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("CRUD Note - Test Suite")
public class CRUDNoteTestSuite extends BaseTestSuite {
    public CRUDNoteTestSuite() {
        super("CRUD Note - Test Suite");
    }

    @Test
    @DisplayName("CRUD Note - Create a Note")
    public void createNote() {
        String NOTE_TEXT = "This is a new note";

        HomePage homePage = new HomePage(this.driver);
        assertTrue(homePage.newNoteButton.isDisplayed(), "There is no new note button preset");
        homePage.newNoteButton.click();
        NewNotePage newNotePage = new NewNotePage(this.driver);

        assertTrue(newNotePage.containerPanel.isDisplayed(), "The dialog was not displayed");
        assertEquals("New Note", newNotePage.dialogTitleLabel.getText(), "The dialog title text is not correct");

        newNotePage.noteInput.clear();
        newNotePage.noteInput.sendKeys(NOTE_TEXT);

        newNotePage.saveButton.click();

        homePage = new HomePage(this.driver);
        assertEquals(1, homePage.noteList.size(), "The dialog title text is not correct");

        // Validate the saved note
        NoteListItemPage savedNotedItem = homePage.getNoteByIndex(0);
        assertTrue(savedNotedItem.dotIndicator.isDisplayed(), "The note item doesn't have a dot");
        assertTrue(savedNotedItem.dotIndicator.isDisplayed(), "The note timestamp is not displayed");
        assertTrue(savedNotedItem.dotIndicator.isDisplayed(), "The note text preview is not displayed");

        assertEquals(savedNotedItem.noteLabel.getText(), NOTE_TEXT, "The note text wasn't saved properly");
        assertEquals(getCurrentDateFormatted("MMM d"), savedNotedItem.timestampLabel.getText(), "The note was saved for another day");
    }

    @Test
    @DisplayName("CRUD Note - Edit a Note")
    public void editNote() {

    }

    @Test
    @DisplayName("CRUD Note - Delete a Note")
    public void deleteNote() {

    }
}