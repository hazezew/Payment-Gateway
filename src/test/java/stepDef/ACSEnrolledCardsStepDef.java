package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.acs.ACSEnrolledCardsPage;

public class ACSEnrolledCardsStepDef extends AbstractPage {
    private WebDriver driver;
    private ACSEnrolledCardsPage acsEnrolledCardsPage;

    public ACSEnrolledCardsStepDef() {
        this.driver = super.driver;
    }


    @And("ACS user clicks on Menu Icon for Enrolled Cards")
    public void acsUserClicksOnMenuIconForEnrolledCards() {
        acsEnrolledCardsPage = acsAdminDashboardPage.clickOnEnrolledCards(); 
    }

    @And("ACS user clicks on Enrolled Cards menu")
    public void acsUserClicksOnEnrolledCardsMenu() {
        acsEnrolledCardsPage.clickOnEnrolledCardsMenu();
    }


    @And("ACS user enters {string} into card number text field")
    public void acsUserEntersIntoCardNumberTextField(String cardNumberFilter) {
        acsEnrolledCardsPage.setCardNumberFilter(cardNumberFilter);
    }

    @And("ACS user clicks on the Search enrolled cards button")
    public void acsUserClicksOnTheSearchEnrolledCardsButton() {
        acsEnrolledCardsPage.clickOnSearchButton();
    }

    @And("ACS user would get {int} in the id field and {string} in the profile field")
    public void acsUserWouldGetInTheIdFieldAndInTheProfileField(int actualId, String actualProfile) {
        int expectedId = acsEnrolledCardsPage.getCardID();
        Assert.assertEquals(actualId, expectedId);
        String expectedProfile = acsEnrolledCardsPage.getCardProfile();
        Assert.assertEquals(actualProfile, expectedProfile);
    }

    @And("ACS user clicks on the returned enrolled cards row")
    public void acsUserClicksOnTheReturnedEnrolledCardsRow() {
        acsEnrolledCardsPage.clickOnReturnedEnrolledCardsRow();
    }

    @And("ACS user clicks on the cardholder authentication methods tab")
    public void acsUserClicksOnTheCardholderAuthenticationMethodsTab() {
        acsEnrolledCardsPage.clickOnCardholderAuthenticationMethodsTab();
    }

    @And("ACS user clicks on the SMS row")
    public void acsUserClicksOnTheSMSRow() {
        acsEnrolledCardsPage.clickOnSMSRow();
    }

    @And("ACS user clicks on the Edit SMS button")
    public void acsUserClicksOnTheEditSMSButton() {
        acsEnrolledCardsPage.clickOnEditSMSButton();
    }

    @And("ACS user enters {string} into destination text field")
    public void acsUserEntersIntoDestinationTextField(String smsNumber) {
        acsEnrolledCardsPage.setDestinationSMS(smsNumber);
    }

    @And("ACS user clicks on the Edit or Save the change button")
    public void acsUserClicksOnTheEditOrSaveTheChangeButton() {
        acsEnrolledCardsPage.clickOnEditOrSaveButton();
    }

    @Then("ACS user would get {string} in the destination field")
    public void acsUserWouldGetInTheDestinationField(String actualSMSNumber) {
        String expectedSMSNumber = acsEnrolledCardsPage.getDestinationSMSConfirmation();
        Assert.assertEquals(actualSMSNumber, expectedSMSNumber);
    }

    @And("ACS user clicks on the Block enrolled cards button")
    public void acsUserClicksOnTheBlockEnrolledCardsButton() {
        acsEnrolledCardsPage.clickOnBlockButton();
    }

    @And("ACS user clicks on the Yes button to confirm deletion of enrolled card")
    public void acsUserClicksOnTheYesButtonToConfirmDeletionOfEnrolledCard() {
        acsEnrolledCardsPage.clickOnYesButtonToConfirmDeletion();
    }

    @Then("ACS enrolled card status would be changed to {string}")
    public void acsEnrolledCardStatusWouldBeChangedTo(String actualCardStatus) {
        String expectedCardStatus = acsEnrolledCardsPage.getCardStatus();
        Assert.assertEquals(actualCardStatus, expectedCardStatus);
    }

    @And("ACS user clicks on the Activate enrolled card button")
    public void acsUserClicksOnTheActivateEnrolledCardButton() {
        acsEnrolledCardsPage.clickOnActivateButton();
    }

    @And("ACS user clicks on the Yes button to confirm activation of enrolled card")
    public void acsUserClicksOnTheYesButtonToConfirmActivationOfEnrolledCard() {
        acsEnrolledCardsPage.clickOnYesButtonToConfirmActivation();
    }
}
