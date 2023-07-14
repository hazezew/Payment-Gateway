package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.acs.ACSKeysForCVVCalculationPageObj;

public class ACSKeysForCVVCalculationStepDef extends AbstractPage {
    private WebDriver driver;
    private ACSKeysForCVVCalculationPageObj acsKeysForCVVCalculationPageObj;

    public ACSKeysForCVVCalculationStepDef() {
        this.driver = super.driver;
    }

    @And("ACS user clicks on Menu Icon for Keys for CVV Calculation")
    public void acsUserClicksOnMenuIconForKeysForCVVCalculation() {
        acsKeysForCVVCalculationPageObj = acsAdminDashboardPage.clickOnKeysForCVVCalculation();
    }

    @And("ACS user clicks on Keys for CVV Calculation menu")
    public void acsUserClicksOnKeysForCVVCalculationMenu() {
        acsKeysForCVVCalculationPageObj.clickOnKeyForCVVCalculationMenu();
    }

    @And("ACS user clicks on the Add Keys for CVV Calculation button")
    public void acsUserClicksOnTheAddKeysForCVVCalculationButton() {
        acsKeysForCVVCalculationPageObj.clickOnAddButton();
    }

    @And("ACS user selects {string} for network of Keys for CVV Calculation")
    public void acsUserSelectsForNetworkOfKeysForCVVCalculation(String networkType) {
        acsKeysForCVVCalculationPageObj.selectNetwork(networkType);
    }

    @And("ACS user selects {string} for profile of Keys for CVV Calculation")
    public void acsUserSelectsForProfileOfKeysForCVVCalculation(String profileType) {
        acsKeysForCVVCalculationPageObj.selectProfile(profileType);
    }

    @And("ACS user enters {int} into key index text field")
    public void acsUserEntersIntoKeyIndexTextField(int keyI) {
        acsKeysForCVVCalculationPageObj.setKeyIndex(keyI);
    }

    @And("ACS user enters {string} into key check value text field")
    public void acsUserEntersIntoKeyCheckValueTextField(String keyCheckValueN) {
        acsKeysForCVVCalculationPageObj.setKeyCheckValue(keyCheckValueN);
    }

    @And("ACS user selects {string} for type of Keys for CVV Calculation")
    public void acsUserSelectsForTypeOfKeysForCVVCalculation(String keyType) {
        acsKeysForCVVCalculationPageObj.setType(keyType);
    }

    @And("ACS user enters {string} into key text field")
    public void acsUserEntersIntoKeyTextField(String keyN) {
        acsKeysForCVVCalculationPageObj.setKey(keyN);
    }

    @And("ACS user clicks on the Save Keys for CVV Calculation button")
    public void acsUserClicksOnTheSaveKeysForCVVCalculationButton() {
        acsKeysForCVVCalculationPageObj.clickOnAddOrSaveButton();
    }

    @And("ACS user selects {string} for network filter of Keys for CVV Calculation")
    public void acsUserSelectsForNetworkFilterOfKeysForCVVCalculation(String networkType) {
        acsKeysForCVVCalculationPageObj.setNetworkFilter(networkType);
    }

    @And("ACS user selects {string} for profile filter of Keys for CVV Calculation")
    public void acsUserSelectsForProfileFilterOfKeysForCVVCalculation(String profileType) {
        acsKeysForCVVCalculationPageObj.setProfileFilter(profileType);
    }

    @And("ACS user clicks on the Search keys for cvv calculation button")
    public void acsUserClicksOnTheSearchKeysForCvvCalculationButton() {
        acsKeysForCVVCalculationPageObj.clickOnSearchButton();
    }

    @Then("ACS user would get {string} in network field and {string} in profile field and {string} in key check value field")
    public void acsUserWouldGetInNetworkFieldAndInProfileFieldAndInKeyCheckValueField(String actualNetwork, String actualProfile, String actualCheckValue) {
        String expectedNetwork = acsKeysForCVVCalculationPageObj.getReturnedNetworkName();
        Assert.assertEquals(actualNetwork, expectedNetwork);
        String expectedProfile = acsKeysForCVVCalculationPageObj.getReturnedProfileName();
        Assert.assertEquals(actualProfile, expectedProfile);
        String expectedCheckValue = acsKeysForCVVCalculationPageObj.getReturnedKeyCheckValueName();
        Assert.assertEquals(actualCheckValue, expectedCheckValue);
    }

    @And("ACS user clicks on the returned keys for cvv calculation row")
    public void acsUserClicksOnTheReturnedKeysForCvvCalculationRow() {
        acsKeysForCVVCalculationPageObj.clickOnTheReturnedKeysForCVVCalculationRow();
    }

    @And("ACS user clicks on the Edit keys for cvv calculation button")
    public void acsUserClicksOnTheEditKeysForCvvCalculationButton() {
        acsKeysForCVVCalculationPageObj.clickOnEditButton();
    }

    @And("ACS user clicks on the Save Editing Keys for CVV Calculation button")
    public void acsUserClicksOnTheSaveEditingKeysForCVVCalculationButton() {
        acsKeysForCVVCalculationPageObj.clickOnSaveEditButton();
    }

    @And("ACS user clicks on the Delete keys for cvv calculation button")
    public void acsUserClicksOnTheDeleteKeysForCvvCalculationButton() {
        acsKeysForCVVCalculationPageObj.clickOnDeleteButton();
    }

    @And("ACS user clicks on the Yes button to confirm deletion of keys for cvv calculation")
    public void acsUserClicksOnTheYesButtonToConfirmDeletionOfKeysForCvvCalculation() {
        acsKeysForCVVCalculationPageObj.clickOnYesButtonToConfirmDeletion();
    }

    @Then("ACS user would get {string} rather than keys for cvv calculation")
    public void acsUserWouldGetRatherThanKeysForCvvCalculation(String actualNoRecordsFound) {
        String expectedNoRecordsFound = acsKeysForCVVCalculationPageObj.getNoRecordsFoundRow();
        Assert.assertEquals(actualNoRecordsFound, expectedNoRecordsFound);
    }
}
