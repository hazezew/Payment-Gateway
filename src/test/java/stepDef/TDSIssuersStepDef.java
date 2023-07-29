package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.threeds.TDSIssuersPage;

public class TDSIssuersStepDef extends AbstractPage {
    private WebDriver driver;
    private TDSIssuersPage tdsIssuersPage;

    public TDSIssuersStepDef() {
        this.driver = super.driver;
    }

    @And("DS user clicks on Issuers menu")
    public void dsUserClicksOnIssuersMenu() {
        tdsIssuersPage = dsAdminDashboardPage.clickOnIssuers();
    }

    @And("DS user clicks on the Add DS issuers button")
    public void dsUserClicksOnTheAddDSIssuersButton() {
        tdsIssuersPage.clickOnAddIssuerButton();
    }

    @And("DS user enters {string} into issuer name text field")
    public void dsUserEntersIntoIssuerNameTextField(String name) {
        tdsIssuersPage.setIssuerName(name);
    }

    @And("DS user enters {string} into contact text field")
    public void dsUserEntersIntoContactTextField(String contact) {
        tdsIssuersPage.setIssuerContact(contact);
    }

    @And("DS user selects {string} for tDSOne status")
    public void dsUserSelectsForTDSOneStatus(String tDSOneStatus) {
        tdsIssuersPage.selectTDSOneStatus(tDSOneStatus);
    }

    @And("DS user selects {string} for tDSTwo status")
    public void dsUserSelectsForTDSTwoStatus(String tDSTwoStatus) {
        tdsIssuersPage.selectTDSTwoStatus(tDSTwoStatus);
    }

    @And("DS user selects {string} for acs certified solution")
    public void dsUserSelectsForAcsCertifiedSolution(String acsCertSolution) {
        tdsIssuersPage.selectACSCertifiedSolution(acsCertSolution);
    }

    @And("DS user clicks on the Add or Save DS issuers button")
    public void dsUserClicksOnTheAddOrSaveDSIssuersButton() {
        tdsIssuersPage.clickOnAddOrSaveIssuerButton();
    }

    @Then("DS user would get {string} in Name field and {string} in tDSOne field {string} in tDSTwo field and {string} in acs reference number field")
    public void dsUserWouldGetInNameFieldAndInTDSOneFieldInTDSTwoFieldAndInAcsReferenceNumberField(String actualName, String actualTDSOneStatus, String actualTDSTwoStatus, String actualAcsRefNum) {
        String expectedName = tdsIssuersPage.getReturnedDSIssuerName();
        Assert.assertEquals(actualName, expectedName);
        String expectedTDSOneStatus = tdsIssuersPage.getReturnedTDSOneStatus();
        Assert.assertEquals(actualTDSOneStatus, expectedTDSOneStatus);
        String expectedTDSTwoStatus = tdsIssuersPage.getReturnedTDSTwoStatus();
        Assert.assertEquals(actualTDSTwoStatus, expectedTDSTwoStatus);
        String expectedAcsRefNum = tdsIssuersPage.getReturnedAcsRefNum();
        Assert.assertEquals(actualAcsRefNum, expectedAcsRefNum);
    }


    @And("DS user enters {string} into issuer name filter text field")
    public void dsUserEntersIntoIssuerNameFilterTextField(String issuerSearchName) {
        tdsIssuersPage.setIssuerNameFilter(issuerSearchName);
    }

    @And("DS user clicks on the Search DS issuers button")
    public void dsUserClicksOnTheSearchDSIssuersButton() {
        tdsIssuersPage.clickOnSearchButton();
    }

    @Then("DS user would get {string} in the name field")
    public void dsUserWouldGetInTheNameField(String actualIssuerName) {
        String expectedIssuerName = tdsIssuersPage.getReturnedDSIssuerName();
        Assert.assertEquals(actualIssuerName, expectedIssuerName);
    }

    @And("DS user clicks on the edit tDS issuers icon")
    public void dsUserClicksOnTheEditTDSIssuersIcon() {
        tdsIssuersPage.clickOnEditIssuerIcon();
    }

    @And("DS user selects {string} for tDSTwo status update")
    public void dsUserSelectsForTDSTwoStatusUpdate(String tDSTwoStatusUpdate) {
        tdsIssuersPage.selectTDSTwoStatusUpdate(tDSTwoStatusUpdate);
    }

    @And("DS user clicks on the Update DS Issuer button")
    public void dsUserClicksOnTheUpdateDSIssuerButton() {
        tdsIssuersPage.clickOnUpdateIssuerButton();
    }

    @Then("DS user would get {string} alert message")
    public void dsUserWouldGetAlertMessage(String actualAlertMessage) {
        String expectedAlertMessage = tdsIssuersPage.getIssuerUpdateAlertMessage();
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage);
    }

    @And("DS user clicks on Back to Issuers button")
    public void dsUserClicksOnBackToIssuersButton() {
        tdsIssuersPage.clickOnBackToIssuersButton();
    }
}
