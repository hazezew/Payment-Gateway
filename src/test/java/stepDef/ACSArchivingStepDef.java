package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.acs.ACSArchivingPage;

public class ACSArchivingStepDef extends AbstractPage {
    private WebDriver driver;
    private ACSArchivingPage acsArchivingPage;

    public ACSArchivingStepDef() {
        this.driver = super.driver;
    }

    @And("ACS user clicks on Menu Icon for Archiving")
    public void acsUserClicksOnMenuIconForArchiving() {
        acsArchivingPage = acsAdminDashboardPage.clickOnArchiving();
    }

    @And("ACS user clicks on Archiving menu")
    public void acsUserClicksOnArchivingMenu() {
        acsArchivingPage.clickOnArchivingMenu();
    }

    @And("ACS user clicks on the Archiving data button")
    public void acsUserClicksOnTheArchivingDataButton() {
        acsArchivingPage.clickOnArchiveDataButton();
    }

    @And("ACS user selects {string} for data type to be archived")
    public void acsUserSelectsForDataTypeToBeArchived(String archiveType) {
        acsArchivingPage.setArchivedDataType(archiveType);
    }

    @And("ACS user selects a starting date time")
    public void acsUserSelectsAStartingDateTime() {
        acsArchivingPage.setStartingDateTime();
    }

    @And("ACS user selects an end date time")
    public void acsUserSelectsAnEndDateTime() {
        acsArchivingPage.setEndingDateTime();
    }

    @And("ACS user checks the clean main tables checkbox")
    public void acsUserChecksTheCleanMainTablesCheckbox() {
        acsArchivingPage.checkCleanMainTablesCheckbox();
    }

    @And("ACS user clicks on the Save archiving data button")
    public void acsUserClicksOnTheSaveArchivingDataButton() {
        acsArchivingPage.clickOnSaveButton();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("ACS user selects {string} for archiving entity filter")
    public void acsUserSelectsForArchivingEntityFilter(String archivingEntityFilter) {
        acsArchivingPage.selectArchivingEntityFilter(archivingEntityFilter);
    }

    @And("ACS user selects day {int} as a starting date time filter")
    public void acsUserSelectsDayAsAStartingDateTimeFilter(int startDate) {
        acsArchivingPage.selectStartingDateTimeFilter(startDate);
    }

    @And("ACS user selects day {int} as an end date time filter")
    public void acsUserSelectsDayAsAnEndDateTimeFilter(int endDate) {
        acsArchivingPage.selectEndingDateTimeFilter(endDate);
    }

    @And("ACS user clicks on the Search archived data button")
    public void acsUserClicksOnTheSearchArchivedDataButton() {
        acsArchivingPage.clickOnSearchButton();
    }

    @Then("ACS user would get {string} in the archiving entity field")
    public void acsUserWouldGetInTheArchivingEntityField(String actualEntityType) {
        String expectedEntityType = acsArchivingPage.getReturnedArchivingEntity();
        Assert.assertEquals(actualEntityType, expectedEntityType);
    }


    @And("ACS user clicks on the returned archived data row")
    public void acsUserClicksOnTheReturnedArchivedDataRow() {
        acsArchivingPage.clickOnReturnedArchivedDataRow();
    }

    @And("ACS user clicks on the Restore archived data button")
    public void acsUserClicksOnTheRestoreArchivedDataButton() {
        acsArchivingPage.clickOnRestoreArchivedDataButton();
    }

    @And("ACS user clicks on Yes button to confirm restoration of archived data")
    public void acsUserClicksOnYesButtonToConfirmRestorationOfArchivedData() {
        acsArchivingPage.clickOnYesButtonToConfirmRestoration();
    }

    @Then("ACS user would get {string} in the status field of archived data row")
    public void acsUserWouldGetInTheStatusFieldOfArchivedDataRow(String actualStatus) {
        String expectedStatus = acsArchivingPage.getReturnedArchivedDataStatus();
        Assert.assertEquals(actualStatus, expectedStatus);
    }

    @And("ACS user clicks on the Clean main tables data button")
    public void acsUserClicksOnTheCleanMainTablesDataButton() {
        acsArchivingPage.clickOnCleanMainTablesDataButton();
    }

    @And("ACS user clicks on the Yes button to confirm cleaning of main tables")
    public void acsUserClicksOnTheYesButtonToConfirmCleaningOfMainTables() {
        acsArchivingPage.clickOnYesButtonToConfirmCleaningOfMainTablesData();
    }

    @Then("ACS user would get {string} in the latest action field of archived data row")
    public void acsUserWouldGetInTheLatestActionFieldOfArchivedDataRow(String actualLatestAction) {
        String expectedLatestAction = acsArchivingPage.getLatestActionOfArchivedData();
        Assert.assertEquals(actualLatestAction, expectedLatestAction);
    }

    @And("ACS user clicks on the Drop archived data button")
    public void acsUserClicksOnTheDropArchivedDataButton() {
        acsArchivingPage.clickOnDropArchivedDataButton();
    }

    @And("ACS user clicks on Yes button to confirm dropping of archived data")
    public void acsUserClicksOnYesButtonToConfirmDroppingOfArchivedData() {
        acsArchivingPage.clickOnYesButtonToConfirmDroppingOfArchivedData();
    }

    @And("ACS user clicks on the Delete archive record and history button")
    public void acsUserClicksOnTheDeleteArchiveRecordAndHistoryButton() {
        acsArchivingPage.clickOnDeleteArchiveRecordAndHistoryButton();
    }

    @And("ACS user clicks on Yes button to confirm deletion of archived record and history data")
    public void acsUserClicksOnYesButtonToConfirmDeletionOfArchivedRecordAndHistoryData() {
        acsArchivingPage.clickOnYesButtonToConfirmDeletionOfArchivedRecordAndHistory();
    }

    @Then("ACS user would get {string} rather than the archived data")
    public void acsUserWouldGetRatherThanTheArchivedData(String actualNoRecord) {
        String expectedNoRecord = acsArchivingPage.getNoRecordsFound();
        Assert.assertEquals(actualNoRecord, expectedNoRecord);
    }
}
