package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.acs.ACSPerformersPage;

public class ACSPerformersStepDef extends AbstractPage {
    private WebDriver driver;
    private ACSPerformersPage acsPerformersPage;

    public ACSPerformersStepDef() {
        this.driver = super.driver;
    }

    @And("ACS user clicks on Menu Icon for Performers")
    public void acsUserClicksOnMenuIconForPerformers() {
        acsPerformersPage = acsAdminDashboardPage.clickOnPerformers();
    }

    @And("ACS user clicks on Performers menu")
    public void acsUserClicksOnPerformersMenu() {
        acsPerformersPage.clickOnPerformersMenu();
    }

    @And("ACS user clicks on the Add performers button")
    public void acsUserClicksOnTheAddPerformersButton() {
        acsPerformersPage.clickOnAddButton();
    }

    @And("ACS user enters {string} into performer name text field")
    public void acsUserEntersIntoPerformerNameTextField(String name) {
        acsPerformersPage.setPerformersName(name);
    }

    @And("ACS user enters {string} into url text field")
    public void acsUserEntersIntoUrlTextField(String url) {
        acsPerformersPage.setUrl(url);
    }

    @And("ACS user enter {int} seconds into timeout number field")
    public void acsUserEnterSecondsIntoTimeoutNumberField(int timeout) {
        acsPerformersPage.setTimeout(timeout);
    }

    @And("ACS user clicks on the Save performers button")
    public void acsUserClicksOnTheSavePerformersButton() {
        acsPerformersPage.clickOnSaveButton();
    }

    @And("ACS user enters {string} into performer name filter text field")
    public void acsUserEntersIntoPerformerNameFilterTextField(String nameFilter) {
        acsPerformersPage.setPerformerNameFilter(nameFilter);
    }

    @And("ACS user clicks on the Search performers button")
    public void acsUserClicksOnTheSearchPerformersButton() {
        acsPerformersPage.clickOnSearchButton();
    }

    @Then("ACS user would get {string} from the returned list of performers")
    public void acsUserWouldGetFromTheReturnedListOfPerformers(String actualName) {
        String expectedName = acsPerformersPage.getReturnedPerformerName();
        Assert.assertEquals(actualName, expectedName);
    }

    @And("ACS user clicks on the returned performers row")
    public void acsUserClicksOnTheReturnedPerformersRow() {
        acsPerformersPage.clickOnReturnedPerformerRow();
    }

    @And("ACS user clicks on the Edit performers button")
    public void acsUserClicksOnTheEditPerformersButton() {
        acsPerformersPage.clickOnEditButton();
    }

    @And("ACS user selects {string} for protocol type")
    public void acsUserSelectsForProtocolType(String protocolType) {
        acsPerformersPage.setPerformerProtocolType(protocolType);
    }

    @And("ACS user clicks on the Delete performers button")
    public void acsUserClicksOnTheDeletePerformersButton() {
        acsPerformersPage.clickOnDeleteButton();
    }

    @And("ACS user clicks on the Yes button to confirm deletion of performers")
    public void acsUserClicksOnTheYesButtonToConfirmDeletionOfPerformers() {
        acsPerformersPage.clickOnYesButtonToConfirmDeletion();
    }

    @Then("ACS user would get {string} text rather than the performer")
    public void acsUserWouldGetTextRatherThanThePerformer(String actualResult) {
        String expectedResult = acsPerformersPage.getNoRecordsFound();
        Assert.assertEquals(actualResult, expectedResult);
    }

}