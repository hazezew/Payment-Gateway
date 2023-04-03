package stepDef;

import config.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.MerchantPage;

public class MerchantStepDef extends AbstractPage {
    private WebDriver driver;
    private MerchantPage merchantPage;

    public MerchantStepDef(){
        this.driver=super.driver;
    }

    @And("EPG user clicks Administration menu")
    public void epgUserClicksAdministrationMenu() {
        epgAdminDashboardPage.clickLinkAdministration();
    }

    @And("EPG user clicks Merchants submenu")
    public void epgUserClicksMerchantsSubmenu() {
        merchantPage=epgAdminDashboardPage.clickLinkMerchant();
    }

    @Then("EPG system displays Merchants management page")
    public void epgSystemDisplaysMerchantsManagementPage() {
        Assert.assertEquals(merchantPage.getURL(), Config.merchantPageURL);
    }

    @And("EPG user clicks on create link")
    public void epgUserClicksOnCreateLink() {
        merchantPage.clickLinkCreateMerchant();
    }
    @And("EPG user click on Main Information tab")
    public void epgUserClickOnMainInformationTab() {
        merchantPage.clickTabMainInformation();
    }

    @And("EPG user enters {string} into EPG Merchant Login text field")
    public void epgUserEntersIntoEPGMerchantLoginTextField(String loginID) {
        merchantPage.setTxtEPGMerchantLogin(loginID);
    }

    @And("EPG user enters {string} into Merchant Name text field")
    public void epgUserEntersIntoMerchantNameTextField(String name) {
        merchantPage.setTxtMerchantName(name);
    }

    @And("EPG user enters {string} into MCC text field")
    public void epgUserEntersIntoMCCTextField(String mcc) {
        merchantPage.setTxtMCC(mcc);
    }

    @And("EPG user enters {string} into Merchant Website Address text field")
    public void epgUserEntersIntoMerchantWebsiteAddressTextField(String website) {
        merchantPage.setTxtMerchantWebsiteAddress(website);
    }
    @And("EPG user enters {string} into Merchant email Address\\(s) text field")
    public void epgUserEntersIntoMerchantEmailAddressSTextField(String email) {
        merchantPage.setTxtMerchantEmailMain(email);
    }

    @And("EPG user enters selects {string} Payment Language dropdown")
    public void epgUserEntersSelectsPaymentLanguageDropdown(String language) {
        merchantPage.setDdlPaymentLanguage(language);
    }

    @And("EPG user enters {string} into List Of Locals text field")
    public void epgUserEntersIntoListOfLocalsTextField(String locals) {
        merchantPage.setTxtListOfLocals(locals);
    }

    @And("EPG user enters {string} into Pan Masked Digit Count text field")
    public void epgUserEntersIntoPanMaskedDigitCountTextField(String count) {
        merchantPage.setTxtPanMaskedDigitCount(count);
    }
    @And("EPG user selects the Merchant Permissions")
    public void epgUserSelectsTheMerchantPermissions() {
        merchantPage.selectNewMerchantPermissions();
    }

    @Then("EPG user clicks on Acquirer tab for new Merchant")
    public void epgUserClicksOnAcquirerTabForNewMerchant() {
        merchantPage.clickTabAcquirer();
    }

    @And("EPG user clicks on add new Acquirer button")
    public void epgUserClicksOnAddNewAcquirerButton() {
        merchantPage.clickBtnAddNewAcquirer();
    }

    @And("EPG user selects {string} from new Acquirer Name dropdown")
    public void epgUserSelectsFromNewAcquirerNameDropdown(String acquirer) {
        merchantPage.setDDAcquirerName(acquirer);
    }

    @And("EPG user enters {string} into Processing Merchant ID text field")
    public void epgUserEntersIntoProcessingMerchantIDTextField(String merchantID) {
        merchantPage.setTxtProcessingMerchantID(merchantID);
    }

    @And("EPG user enters {string} into Terminal ID text field")
    public void epgUserEntersIntoTerminalIDTextField(String terminal) {
        merchantPage.setTxtTerminalID(terminal);
    }

    @And("EPG user enters {string} into User Login text field")
    public void epgUserEntersIntoUserLoginTextField(String user) {
        merchantPage.setTxtUserLogin(user);
    }

    @And("EPG user enters {string} into User Password text field")
    public void epgUserEntersIntoUserPasswordTextField(String password) {
        merchantPage.setTxtUserPassword(password);
    }

    @And("EPG user clicks on Save Acquirer button")
    public void epgUserClicksOnSaveAcquirerButton() {
        merchantPage.clickBtnSaveAcquirer();
    }
    @And("EPG user checks Default Acquirer checkbox")
    public void epgUserChecksDefaultAcquirerCheckbox() {
        merchantPage.checkChkDefaultAcquirer();
    }

    @Then("EPG user clicks on Additional information tab")
    public void epg_user_clicks_on_Additional_information_tab() {
        merchantPage.clickTabAdditionalInfo();
    }

    @Then("EPG user checks ETB under currency list")
    public void epg_user_checks_ETB_under_currency_list() {
        merchantPage.checkChkETB();
    }

    @And("EPG user selects {string} Default Currency dropdown")
    public void epgUserSelectsDefaultCurrencyDropdown(String defaultCurrency) {
        merchantPage.selectDdlDefaultCurrency(defaultCurrency);
    }

    @Then("EPG user enters {string} into Number of payment attempts text field")
    public void epg_user_enters_into_Number_of_payment_attempts_text_field(String noOfAttempts) {
        merchantPage.setTxtNoOfAttempts(noOfAttempts);
    }

    @Then("EPG user selects {string} from Version of getOrderStatusExtended text field")
    public void epg_user_selects_from_Version_of_getOrderStatusExtended_text_field(String version) {
        merchantPage.selectDdlVersion(version);
    }

    @Then("EPG user selects {string} from Version of getPTwoPStatus text field")
    public void epg_user_selects_from_Version_of_getP_PStatus_text_field(String version) {
        merchantPage.selectDdlVersionOfGetP2PStatus(version);
    }

    @Then("EPG user checks Use verification checkbox")
    public void epg_user_checks_Use_verification_checkbox() {
        merchantPage.checkChkUseVerification();
    }

    @Then("EPG user checks External fraud control checkbox")
    public void epg_user_checks_External_fraud_control_checkbox() {
        merchantPage.checkChkExternalFraudControl();
    }

    @Then("EPG user enters {string} into Name for fraud control text field")
    public void epg_user_enters_into_Name_for_fraud_control_text_field(String name) {
        merchantPage.setTxtNameForFraudControl(name);
    }

    @Then("EPG user checks Use name for fraud control checkbox")
    public void epg_user_checks_Use_name_for_fraud_control_checkbox() {
        merchantPage.checkChkUseNameForFraudControl();
    }
    @And("EPG user enters {string} into Duration of displaying order information text field")
    public void epgUserEntersIntoDurationOfDisplayingOrderInformationTextField(String duration) {
        merchantPage.setTxtDurationOfDisplayingOrderInfoDays(duration);
    }

    @Then("EPG user selects {string} ThreeDSTwo Requester Challenge Indicator dropdown")
    public void epg_user_selects_ThreeDS_Requester_Challenge_Indicator_dropdown(String requestChallenge) {
        merchantPage.setDdlVersion(requestChallenge);
    }

    @Then("EPG user clicks on ThreeDS Configuration tab")
    public void epgUserClicksOnThreeDSConfigurationTab() {
        merchantPage.clickTab3DSConfiguration();
    }

    @And("EPG user selects {string} from Permissions checkbox list")
    public void epgUserSelectsFromPermissionsCheckboxList(String permission) {
        merchantPage.checkPermissions(permission);
    }

    @And("EPG user clicks on Add new ThreeDS Configuration button")
    public void epgUserClicksOnAddNewThreeDSConfigurationButton() {
        merchantPage.clickBtnAddNew3DSConfiguration();
    }

    @And("EPG user selects {string} from Payment System dropdown")
    public void epgUserSelectsFromPaymentSystemDropdown(String payment) {
        merchantPage.selectDdlPaymentSystem(payment);
    }

    @And("EPG user checks ThreeDSTwo Enabled checkbox")
    public void epgUserChecksThreeDSTwoEnabledCheckbox() {
        merchantPage.checkChk3DS2Enabled();
    }

    @And("EPG user checks Try ssl if U in VeRes checkbox")
    public void epgUserChecksTrySslIfUInVeResCheckbox() {
        merchantPage.checkChkTrySslIfUInVeRes();
    }

    @And("EPG user checks Try ssl if U in PaRes checkbox")
    public void epgUserChecksTrySslIfUInPaResCheckbox() {
        merchantPage.checkChkTrysslIfUInPaRes();
    }

    @And("EPG user clicks on Save ThreeDS Configuration button")
    public void epgUserClicksOnSaveThreeDSConfigurationButton() {
        merchantPage.clickBtnSave3DSConfiguration();
    }

    @Then("EPG user clicks on Routing rules tab")
    public void epgUserClicksOnRoutingRulesTab() {
        merchantPage.clickTabRouting();
    }

    @Then("EPG user clicks on Additional Information tab")
    public void epgUserClicksOnAdditionalInformationTab() {
        merchantPage.clickTabAdditionalInfo();
    }

    @Then("EPG user clicks on Additional parameters tab")
    public void epg_user_clicks_on_Additional_parameters_tab() {
        merchantPage.clickTabAdditionalParameters();
    }

    @Then("EPG user clicks on Add new parameters button")
    public void epg_user_clicks_on_Add_new_parameters_button() {
        merchantPage.clickBtnAddNewAdditionalParameter();
    }

    @Then("EPG user enters {string} into Name and payment method text field")
    public void epg_user_enters_into_Name_and_payment_method_text_field(String paymentMethod) {
        merchantPage.setTxtPaymentMethod(paymentMethod);
    }

    @Then("EPG user enters {string} into value text field")
    public void epg_user_enters_into_value_text_field(String value) {
        merchantPage.setTxtValue(value);
    }

    @Then("EPG user clicks on Notifications tab")
    public void epg_user_clicks_on_Notifications_tab() {
        merchantPage.clickTabNotifications();
    }

    @Then("EPG user checks on all customer EMail checkbox")
    public void epg_user_checks_on_all_customer_EMail_checkbox() {
        merchantPage.checkChkSendEmailToCustomer();
    }

    @Then("EPG user checks on all Merchant EMail checkbox")
    public void epg_user_checks_on_all_Merchant_EMail_checkbox() {
        merchantPage.checkChkSendEmailToMerchant();
    }
    @And("EPG user enters {string} into Email address for certificate expiration notifications text field")
    public void epgUserEntersIntoEmailAddressForCertificateExpirationNotificationsTextField(String email) {
        merchantPage.setTxtMerchantEmail(email);
    }

    @And("EPG user clicks on SMS Notification tab")
    public void epgUserClicksOnSMSNotificationTab() {
        merchantPage.checkNotificationTabSMS();
    }

    @And("EPG user checks all to Send SMS to customer checkbox")
    public void epgUserChecksAllToSendSMSToCustomerCheckbox() {
        merchantPage.checkAllCustomerSMS();
    }

    @And("EPG user checks all to Send SMS to merchant checkbox")
    public void epgUserChecksAllToSendSMSToMerchantCheckbox() {
        merchantPage.checkAllMerchantSMS();
    }

    @Then("EPG user clicks on Address tab")
    public void epg_user_clicks_on_Address_tab() {
        merchantPage.clickTabAddress();
    }
    @Then("EPG user enters {string} into Address text field")
    public void epg_user_enters_into_Address_text_field(String address) {
        merchantPage.setTxtAddress(address);
    }

    @Then("EPG user enters {string} into into City text field")
    public void epg_user_enters_into_into_City_text_field(String city) {
        merchantPage.setTxtCity(city);
    }

    @Then("EPG user enters {string} into into Region text field")
    public void epg_user_enters_into_into_Region_text_field(String region) {
        merchantPage.setTxtRegionState(region);
    }

    @Then("EPG user enters {string} into into Country text field")
    public void epg_user_enters_into_into_Country_text_field(String country) {
        merchantPage.setTxtCountry(country);
    }

    @Then("EPG user enters {string} into into Postal Code text field")
    public void epg_user_enters_into_into_Postal_Code_text_field(String postalCode) {
        merchantPage.setTxtPostalZipCode(postalCode);
    }

    @Then("EPG user enters {string} into into Phone Number text field")
    public void epg_user_enters_into_into_Phone_Number_text_field(String phone) {
        merchantPage.setTxtPhoneNumber(phone);
    }

    @Then("EPG user enters {string} into into Additional Information Code text field")
    public void epg_user_enters_into_into_Additional_Information_Code_text_field(String additionalInfo) {
        merchantPage.setTxtAdditionalInfo(additionalInfo);
    }
    @And("EPG user clicks on Save merchant button")
    public void epgUserClicksOnSaveMerchantButton() {
        merchantPage.clickBtnSave();
    }

    @Then("EPG add merchant page displays an alert message containing {string}")
    public void epgAddMerchantPageDisplaysAnAlertMessageContaining(String partOfMessage) {
        Assert.assertTrue(merchantPage.getAlertMessage().contains(partOfMessage));
    }
    @And("EPG user clicks on Close merchant button")
    public void epgUserClicksOnCloseMerchantButton() {
        merchantPage.clickBtnClose();
    }

    @And("EPG user enters {string} into search merchant text field")
    public void epgUserEntersIntoSearchMerchantTextField(String merchantName) {
        merchantPage.setTxtSearch(merchantName);
    }

    @And("EPG user clicks on find button")
    public void epgUserClicksOnFindButton() {
        merchantPage.clickBtnFind();
    }

    @Then("EPG system displays the merchant based on merchant name")
    public void epgSystemDisplaysTheMerchantBasedOnMerchantName() {
        merchantPage.merchantDisplayed();
    }

    @And("EPG user clicks on the merchant {string} for update")
    public void epgUserClicksOnTheMerchantForUpdate(String merchantName) {
        merchantPage.clickMerchant(merchantName);
    }

    @Then("EPG user clicks on Send Payment Form tab")
    public void epgUserClicksOnSendPaymentFormTab() {
        merchantPage.clickTabSendPaymentForm();
    }

    @And("EPG user enters {string} into Return URL after payment text field")
    public void epgUserEntersIntoReturnURLAfterPaymentTextField(String url) {
        merchantPage.setTxtReturnURLAfterPayment(url);
    }

    @And("EPG user enters {string} into Return URL on error text field")
    public void epgUserEntersIntoReturnURLOnErrorTextField(String url) {
        merchantPage.setTxtReturnURLOnError(url);
    }

    @Then("EPG system updates merchant details")
    public void epgSystemUpdatesMerchantDetails() {
        merchantPage.merchantDisplayed();
    }
}