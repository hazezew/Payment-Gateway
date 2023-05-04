package stepDef;

import config.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.AcquirersPage;
import pageObj.GroupsPage;

public class AcquirersStepDef extends AbstractPage {
    private WebDriver driver;
    private AcquirersPage acquirersPage;

    public AcquirersStepDef() {
        this.driver = super.driver;
    }

    @And("EPG user clicks Acquirers submenu")
    public void epgUserClicksAcquirersSubmenu() {
         this.acquirersPage = epgAdminDashboardPage.clickAcquirersMenu();
    }


    @And("EPG user clicks on the Create Acquirers button")
    public void epgUserClicksOnTheCreateAcquirersButton() {
        acquirersPage.clickOnCreateAcquirerButton();
    }

    @And("EPG user enters {string} into name text field")
    public void epgUserEntersIntoNameTextField(String name) {
        acquirersPage.setNameTextField(name);
    }

    @And("EPG user enters {string} into url text field")
    public void epgUserEntersIntoUrlTextField(String url) {
        acquirersPage.setUrlTextField(url);
    }

    @And("EPG user enters {string} into timeout text field")
    public void epgUserEntersIntoTimeoutTextField(String timeout) {
        acquirersPage.setTimeoutTextField(timeout);
    }

    @And("EPG user enters {string} into fixed fee text field")
    public void epgUserEntersIntoFixedFeeTextField(String fixedFee) {
        acquirersPage.setFixedFeeTextField(fixedFee);
    }

    @And("EPG user enters {string} into internal identifier text field")
    public void epgUserEntersIntoInternalIdentifierTextField(String internalId) {
        acquirersPage.setInternalIdentifierTextField(internalId);
    }

    @And("EPG user clicks on protocol drop down")
    public void epgUserClicksOnProtocolDropDown() {
        acquirersPage.clickOnProtocolDropdown();
    }

    @And("EPG user selects protocol")
    public void epgUserSelectsProtocol() {
        acquirersPage.selectProtocol();
    }

    @And("EPG user clicks on the Save Acquirer button")
    public void epgUserClicksOnTheSaveAcquirerButton() {
        acquirersPage.clickOnSaveAcquirerButton();
    }

    @And("EPG user clicks on the Add payment system button")
    public void epgUserClicksOnTheAddPaymentSystemButton() {
        acquirersPage.clickOnAddButton();
    }

    @And("EPG user clicks on the Add Payment system label")
    public void epgUserClicksOnTheAddPaymentSystemLabel() {
        acquirersPage.clickOnPaymentSystemLabel();
    }

    @And("EPG user clicks on the Add Payment system combobox")
    public void epgUserClicksOnTheAddPaymentSystemCombobox() {
        acquirersPage.clickOnPaymentSystemComboBox();
    }

    @And("EPG user selects payment system option")
    public void epgUserSelectsPaymentSystemOption() {
        acquirersPage.selectPaymentOption();
    }

    @And("EPG user clicks on the Save payment system button")
    public void epgUserClicksOnTheSavePaymentSystemButton() {
        acquirersPage.clickOnSavePaymentSystemButton();
    }

    @And("EPG user selects payment method")
    public void epgUserSelectsPaymentMethod() {
        acquirersPage.selectPaymentMethod();
    }

    @And("EPG user enters {string} into search acquirer text field")
    public void epgUserEntersIntoSearchAcquirerTextField(String acquirerName) {
        acquirersPage.setAcquirerNameIntoSearchTextField(acquirerName);
    }

    @And("EPG user clicks on the Find Acquirer button")
    public void epgUserClicksOnTheFindAcquirerButton() {
        acquirersPage.clickOnFindAcquirerButton();
    }

    @Then("Assert Acquirer with name {string} is returned")
    public void assertAcquirerWithNameIsReturned(String acquirerName) {
        String returnedAcquirerName = acquirersPage.getSearchedAcquirerName();
        Assert.assertEquals(returnedAcquirerName, acquirerName);
    }

    @And("EPG user opens the returned acquirer to view its detail")
    public void epgUserOpensTheReturnedAcquirerToViewItsDetail() {
        acquirersPage.openReturnedAcquirer();
    }

    @And("EPG user updates acquirer's description with {string}")
    public void epgUserUpdatesAcquirerSDescriptionWith(String updatedDescription) {
        acquirersPage.setUpdatedDescription(updatedDescription);
    }

    @And("EPG user adds additional permissions")
    public void epgUserAddsAdditionalPermissions() {
        acquirersPage.updatePermission();
    }

    @Then("Assert Acquirer with description {string} is returned")
    public void assertAcquirerWithDescriptionIsReturned(String updatedDescription) {
        String acquirerDescription = acquirersPage.getAcquirerDescription();
        Assert.assertEquals(acquirerDescription, updatedDescription);
    }

    @And("EPG user clicks the Delete Acquirer button")
    public void epgUserClicksTheDeleteAcquirerButton() {
        acquirersPage.clickOnDeleteAcquirerButton();
    }

    @And("EPG user confirms deletion of the acquirer")
    public void epgUserConfirmsDeletionOfTheAcquirer() {
        acquirersPage.confirmDeletionOfAcquirer();
    }

    @Then("Assert {int} acquirer is returned")
    public void assertAcquirerIsReturned(int numberOfAcquirers) {
        int returnedNumAcquirers = acquirersPage.returnedAcquirers();
        Assert.assertEquals(returnedNumAcquirers, numberOfAcquirers);
    }

    @And("EPG user enters acquirerName into name text field")
    public void epgUserEntersAcquirerNameIntoNameTextField() {
        acquirersPage.setNameTextField(Config.acquirerName);
    }
}
