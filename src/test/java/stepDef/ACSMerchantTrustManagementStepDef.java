package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.acs.MerchantTrustManagementPage;

public class ACSMerchantTrustManagementStepDef extends AbstractPage {
    private WebDriver driver;
    private MerchantTrustManagementPage merchantTrustManagementPage;

    public ACSMerchantTrustManagementStepDef() {
        this.driver = super.driver;
    }

    @And("ACS user clicks on Menu Icon for Merchant Trust Management")
    public void acsUserClicksOnMenuIconForMerchantTrustManagement() {
        merchantTrustManagementPage = acsAdminDashboardPage.clickOnMenuIconForMerchantTrustManagement();
    }

    @And("ACS user clicks on Merchant trust menu")
    public void acsUserClicksOnMerchantTrustMenu() {
        merchantTrustManagementPage.clickOnMerchantTrustMenu();
    }

    @And("ACS user clicks on the Add merchant trust button")
    public void acsUserClicksOnTheAddMerchantTrustButton() {
        merchantTrustManagementPage.clickOnAddButton();
    }

    @And("ACS user enters {string} into PAN text field")
    public void acsUserEntersIntoPANTextField(String pan) {
        merchantTrustManagementPage.setPAN(pan);
    }

    @And("ACS user enters {string} into CARDHOLDER text field")
    public void acsUserEntersIntoCARDHOLDERTextField(String cardHolder) {
        merchantTrustManagementPage.setCardHolder(cardHolder);
    }

    @And("ACS user enters {string} into MERCHANT text field")
    public void acsUserEntersIntoMERCHANTTextField(String merchant) {
        merchantTrustManagementPage.setMerchant(merchant);
    }

    @And("ACS user clicks on the Save merchant trust button")
    public void acsUserClicksOnTheSaveMerchantTrustButton() {
        merchantTrustManagementPage.clickOnSaveButton();
    }

    @And("ACS user enters {string} into CARDHOLDER filter text field")
    public void acsUserEntersIntoCARDHOLDERFilterTextField(String cardHolder) {
        merchantTrustManagementPage.setCardHolderFilter(cardHolder);
    }

    @And("ACS user clicks on the Search merchant trust button")
    public void acsUserClicksOnTheSearchMerchantTrustButton() {
        merchantTrustManagementPage.clickOnSearchButton();
    }

    @Then("ACS user would get {string} from the returned merchant trust management page")
    public void acsUserWouldGetFromTheReturnedMerchantTrustManagementPage(String cardHolder) {
        String expectedCardHolder = merchantTrustManagementPage.returnedMerchantTrustViaCardHolder();
        Assert.assertEquals(cardHolder, expectedCardHolder);
    }

    @And("ACS user clicks on the returned merchant trust row")
    public void acsUserClicksOnTheReturnedMerchantTrustRow() {
        merchantTrustManagementPage.clickOnReturnedMerchantTrust();
    }

    @And("ACS user clicks on the Edit merchant trust button")
    public void acsUserClicksOnTheEditMerchantTrustButton() {
        merchantTrustManagementPage.clickOnEditButton();
    }

    @And("ACS user clears CARDHOLDER field and enters {string} into it")
    public void acsUserClearsCARDHOLDERFieldAndEntersIntoIt(String updatedCardHolder) {
        merchantTrustManagementPage.clearAndSetCardHolderUpdate(updatedCardHolder);
    }

    @And("ACS user clicks on the Save update button")
    public void acsUserClicksOnTheSaveUpdateButton() {
        merchantTrustManagementPage.clickOnSaveUpdateButton();
    }

    @And("ACS user clicks on the Delete merchant trust button")
    public void acsUserClicksOnTheDeleteMerchantTrustButton() {
        merchantTrustManagementPage.clickOnDeleteButton();
    }

    @And("ACS user clicks on Yes button to confirm deletion")
    public void acsUserClicksOnYesButtonToConfirmDeletion() {
        merchantTrustManagementPage.clickOnConfirmDeletionButton();
    }

    @Then("ACS user would get {string} text rather than the searched merchant trust")
    public void acsUserWouldGetTextRatherThanTheSearchedMerchantTrust(String returnedText) {
        String expectedText = merchantTrustManagementPage.returnNoRecord();
        Assert.assertEquals(returnedText, expectedText);
    }

}
