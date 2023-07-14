package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.acs.ACSTransactionStatusSettingsPage;

public class ACSTransactionStatusSettingsStepDef extends AbstractPage {
    private WebDriver driver;
    private ACSTransactionStatusSettingsPage acsTransactionStatusSettingsPage;

    public ACSTransactionStatusSettingsStepDef() {
        this.driver = super.driver;
    }

    @And("ACS user clicks on Menu Icon for Transaction Status Settings")
    public void acsUserClicksOnMenuIconForTransactionStatusSettings() {
        acsTransactionStatusSettingsPage = acsAdminDashboardPage.clickOnTransactionStatusSettings();
    }

    @And("ACS user clicks on Transaction Status Settings menu")
    public void acsUserClicksOnTransactionStatusSettingsMenu() {
        acsTransactionStatusSettingsPage.clickOnTransactionStatusSettingsMenu();
    }

    @And("ACS user clicks on the Add Transaction Status Settings button")
    public void acsUserClicksOnTheAddTransactionStatusSettingsButton() {
        acsTransactionStatusSettingsPage.clickOnAddTransactionStatusSettingsButton();
    }

    @And("ACS user selects {string} for event type")
    public void acsUserSelectsForEventType(String eventType) {
        acsTransactionStatusSettingsPage.selectEventType(eventType);
    }

    @And("ACS user enters {string} into modifier text field")
    public void acsUserEntersIntoModifierTextField(String modifierName) {
        acsTransactionStatusSettingsPage.setModifier(modifierName);
    }

    @And("ACS user selects {string} for network")
    public void acsUserSelectsForNetwork(String network) {
        acsTransactionStatusSettingsPage.selectNetwork(network);
    }

    @And("ACS user selects {string} for protocol version")
    public void acsUserSelectsForProtocolVersion(String protocolVersion) {
        acsTransactionStatusSettingsPage.selectProtocolVersion(protocolVersion);
    }

    @And("ACS user selects {string} for transaction status reason")
    public void acsUserSelectsForTransactionStatusReason(String transactionStatusReason) {
        acsTransactionStatusSettingsPage.selectTransactionStatusReason(transactionStatusReason);
    }

    @And("ACS user clicks on the Add or Save transaction status settings button")
    public void acsUserClicksOnTheAddOrSaveTransactionStatusSettingsButton() {
        acsTransactionStatusSettingsPage.clickOnAddOrSaveButton();
    }

    @And("ACS user selects {string} for event type filter")
    public void acsUserSelectsForEventTypeFilter(String eventType) {
        acsTransactionStatusSettingsPage.selectEventTypeFilter(eventType);
    }

    @And("ACS user clicks on the Search transaction status settings button")
    public void acsUserClicksOnTheSearchTransactionStatusSettingsButton() {
        acsTransactionStatusSettingsPage.clickOnSearchButton();
    }

    @Then("ACS user would get {string} in event type field")
    public void acsUserWouldGetInEventTypeField(String actualEventType) {
        String expectedEventType = acsTransactionStatusSettingsPage.getReturnedEventType();
        Assert.assertEquals(actualEventType, expectedEventType);
    }

    @And("ACS user clicks on the returned transaction status settings row")
    public void acsUserClicksOnTheReturnedTransactionStatusSettingsRow() {
        acsTransactionStatusSettingsPage.clickOnReturnedTransactionStatusSettingsRow();
    }

    @And("ACS user clicks on the Edit transaction status settings button")
    public void acsUserClicksOnTheEditTransactionStatusSettingsButton() {
        acsTransactionStatusSettingsPage.clickOnEditButton();
    }

    @And("ACS user clicks on the Save update transaction status settings button")
    public void acsUserClicksOnTheSaveUpdateTransactionStatusSettingsButton() {
        acsTransactionStatusSettingsPage.clickOnSaveUpdateButton();
    }

    @Then("ACS user would get {string} in transaction status reason field")
    public void acsUserWouldGetInTransactionStatusReasonField(String actualTransactionStatusReason) {
        String expectedTransactionStatusReason = acsTransactionStatusSettingsPage.getReturnedTransactionStatusReason();
        Assert.assertEquals(actualTransactionStatusReason, expectedTransactionStatusReason);
    }

    @And("ACS user clicks on the Delete transaction status settings button")
    public void acsUserClicksOnTheDeleteTransactionStatusSettingsButton() {
        acsTransactionStatusSettingsPage.clickOnDeleteButton();
    }

    @And("ACS user clicks on the Yes button to confirm deletion of transaction status settings")
    public void acsUserClicksOnTheYesButtonToConfirmDeletionOfTransactionStatusSettings() {
        acsTransactionStatusSettingsPage.clickOnYesButtonToConfirmDeletionOfTransactionStatusSettings();
    }

    @Then("ACS user would get {string} rather than the transaction status settings")
    public void acsUserWouldGetRatherThanTheTransactionStatusSettings(String actualNoRecordsFound) {
        String expectedNoRecordsFound = acsTransactionStatusSettingsPage.getNoRecordsFound();
        Assert.assertEquals(actualNoRecordsFound, expectedNoRecordsFound);
    }
}
