package stepDef;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pageObj.AbstractPage;
import pageObj.ManualPaymentMOTOPage;

public class ManualPaymentMOTOStepDef extends AbstractPage {
    private WebDriver driver;
    private ManualPaymentMOTOPage manualPaymentMOTOPage;

    public ManualPaymentMOTOStepDef() {
        this.driver = super.driver;
    }


    @And("EPG user clicks create order for payment by link submenu")
    public void epgUserClicksCreateOrderForPaymentByLinkSubmenu() {
        this.manualPaymentMOTOPage = epgAdminDashboardPage.clickCreateOrderForPaymentByTheLinkMenu();
    }



    @And("EPG user clicks Create order and render the payment submenu")
    public void epgUserClicksCreateOrderAndRenderThePaymentSubmenu() {
        this.manualPaymentMOTOPage = epgAdminDashboardPage.clickCreateOrderAndRenderThePaymentSubMenu();
    }

    @And("EPG user enters {string} inot merchant text field")
    public void epgUserEntersInotMerchantTextField(String merchant) {
        manualPaymentMOTOPage.setMerchantTextField(merchant);
    }

    @And("EPG user enters {int} into amount text field")
    public void epgUserEntersIntoAmountTextField(int amount) {
        manualPaymentMOTOPage.setAmountTextField(amount);
    }

    @And("EPG user enters {string} into customer name text field")
    public void epgUserEntersIntoCustomerNameTextField(String name) {
        manualPaymentMOTOPage.setCustomerNameTextField(name);
    }

    @And("EPG user enters {int} into customer phone text field")
    public void epgUserEntersIntoCustomerPhoneTextField(int phoneNumber) {
        manualPaymentMOTOPage.setCustomerPhoneTextField(phoneNumber);
    }

    @And("EPG user enters {string} into email text field")
    public void epgUserEntersIntoEmailTextField(String email) {
        manualPaymentMOTOPage.setEmailTextField(email);
    }

    @And("EPG user selects authorization type")
    public void epgUserSelectsAuthorizationType() {
        manualPaymentMOTOPage.selectAuthorizationType();
    }

    @And("EPG user clicks on the Submit button")
    public void epgUserClicksOnTheSubmitButton() {
        manualPaymentMOTOPage.clickOnSubmitButton();
    }

    @And("EPG user enters {string} into order number text field")
    public void epgUserEntersIntoOrderNumberTextField(String orderNumber) {
        manualPaymentMOTOPage.setOrderNumberTextField(orderNumber);
    }


    @And("EPG user enters {string} into description text field")
    public void epgUserEntersIntoDescriptionTextField(String description) {
        manualPaymentMOTOPage.setDescriptionTextArea(description);
    }

    @And("EPG user enters {string} into PAN text field")
    public void epgUserEntersIntoPANTextField(String PAN) {
        manualPaymentMOTOPage.setPAN(PAN);
    }

    @And("EPG user enters {int} into expiry month text field")
    public void epgUserEntersIntoExpiryMonthTextField(int expiryMonth) {
        manualPaymentMOTOPage.setCardExpiryMonth(expiryMonth);
    }

    @And("EPG user enters {int} into expiry year text field")
    public void epgUserEntersIntoExpiryYearTextField(int expiryYear) {
        manualPaymentMOTOPage.setCardExpiryYear(expiryYear);
    }

    @And("EPG user enters {string} into cardholder name text field")
    public void epgUserEntersIntoCardholderNameTextField(String cardholderName) {
        manualPaymentMOTOPage.setCardholderName(cardholderName);
    }
}
