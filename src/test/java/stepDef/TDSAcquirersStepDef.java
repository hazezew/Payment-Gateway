package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.threeds.TDSAcquirersPage;

public class TDSAcquirersStepDef extends AbstractPage {
    private WebDriver driver;
    private TDSAcquirersPage TDSAcquirersPage;

    public TDSAcquirersStepDef() {
        this.driver = super.driver;
    }

    @And("DS user clicks on Acquirers menu")
    public void dsUserClicksOnAcquirersMenu() {
        TDSAcquirersPage = dsAdminDashboardPage.clickOnAcquirers();
    }

    @And("DS user clicks on the Add acquirers button")
    public void dsUserClicksOnTheAddAcquirersButton() {
        TDSAcquirersPage.clickOnAcquirersMenu();
    }

    @And("DS user enters {string} into acquirer bin text field")
    public void dsUserEntersIntoAcquirerBinTextField(String acquirerBin) {
        TDSAcquirersPage.setAcquirerBin(acquirerBin);
    }

    @And("DS user enters {string} into acquirer name text field")
    public void dsUserEntersIntoAcquirerNameTextField(String name) {
        TDSAcquirersPage.setAcquirerName(name);
    }

    @And("DS user selects {string} for DS Server Certified Solution type")
    public void dsUserSelectsForDSServerCertifiedSolutionType(String serverCertSolution) {
        TDSAcquirersPage.selectServerCertSolution(serverCertSolution);
    }

    @And("DS user enters {string} into ds server operator id field")
    public void dsUserEntersIntoDsServerOperatorIdField(String servOperatorId) {
        TDSAcquirersPage.setServerOperatorId(servOperatorId);
    }

    @And("DS user clicks on the Add Acquirer button")
    public void dsUserClicksOnTheAddAcquirerButton() {
        TDSAcquirersPage.clickOnAddAcquirerButton();
    }

    @Then("DS user would get {string} in the acquirer bin field and {string} in the acquirer name field in the first row of list of acquirers")
    public void dsUserWouldGetInTheAcquirerBinFieldAndInTheAcquirerNameFieldInTheFirstRowOfListOfAcquirers(String actualAcquirerBin, String actualAcquirerName) {
        String expectedAcquirerBin = TDSAcquirersPage.getNewlyAddedAcquirerBin();
        Assert.assertEquals(actualAcquirerBin, expectedAcquirerBin);
        String expectedAcquirerName = TDSAcquirersPage.getNewlyAddedAcquirerName();
        Assert.assertEquals(actualAcquirerName, expectedAcquirerName);
    }

    @And("DS user enters {string} into search by bin text field")
    public void dsUserEntersIntoSearchByBinTextField(String tDSAcquirerBin) {
        TDSAcquirersPage.settDSAcquirerBinFilter(tDSAcquirerBin);
    }

    @And("DS user clicks on the Search tDS acquirer button")
    public void dsUserClicksOnTheSearchTDSAcquirerButton() {
        TDSAcquirersPage.clickOnSearchButton();
    }

    @And("DS user clicks on the edit tDS acquirer icon")
    public void dsUserClicksOnTheEditTDSAcquirerIcon() {
        TDSAcquirersPage.clickOnEditIcon();
    }

    @And("DS user clicks on the update acquirer button")
    public void dsUserClicksOnTheUpdateAcquirerButton() {
        TDSAcquirersPage.clickOnUpdateAcquirerButton();
    }

    @Then("DS user would get {string} alert success message")
    public void dsUserWouldGetAlertSuccessMessage(String actualAlertSuccessMessage) {
        String expectedAlertSuccessMessage = TDSAcquirersPage.getUpdateAcquirerAlertMessage();
        Assert.assertEquals(actualAlertSuccessMessage, expectedAlertSuccessMessage);
    }

    @Then("DS user would get {string} {int} {string} alert success message while deleting")
    public void dsUserWouldGetAlertSuccessMessageWhileDeleting(String text1, int arg1, String text2) {
        String actualAlertMessage = text1 + " " + arg1 + " " + text2;
        String expectedAlertMessage = TDSAcquirersPage.getDeleteAcquirerAlertMessage("Acquirer with BIN ", arg1, " was deleted");
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage);
    }

    @And("DS user clicks on the delete tDS acquirer icon")
    public void dsUserClicksOnTheDeleteTDSAcquirerIcon() {
        TDSAcquirersPage.clickOnDeleteAcquirerButton();
    }

    @And("DS user clicks on the Yes button to confirm deletion of tDS acquirer")
    public void dsUserClicksOnTheYesButtonToConfirmDeletionOfTDSAcquirer() {
        TDSAcquirersPage.clickOnYesButtonToConfirmDeletionOfTDSAcquirer();
    }

}
