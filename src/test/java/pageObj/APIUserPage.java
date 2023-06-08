package pageObj;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class APIUserPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(id = "menuitem-1026-textEl")
    private WebElement apiUsersMenu;
    @FindBy(id = "button-1103-btnInnerEl")
    private WebElement createAPIUserButton;

    //create user locators
    @FindBy(xpath = "//td/input[@name='username']")
    private WebElement loginTextField;
    @FindBy(xpath = "//tbody/tr/td/input[@name='merchantId']")
    private WebElement merchantTextField;

    @FindBy(xpath = "//div[text()='Merchantone (Merchantone)']")
    private WebElement selectMerchantOne;

    @FindBy(xpath = "//td/input[@name='language']")
    private WebElement defaultLangDrpDwn;
    @FindBy(xpath = "//div/ul/li[text()='EN']")
    private WebElement englishLanguage;
    @FindBy(xpath = "//tbody/tr/td/input[@name='password']")
    private WebElement passwordTextField;
    @FindBy(xpath = "//tbody/tr/td/input[@name='password2']")
    private WebElement confirmPasswordTextField;
    @FindBy(xpath = "//button/span[text()='Save']")
    private WebElement saveButton;
    @FindBy(xpath = "//td/input[@id='textfield-1105-inputEl']")
    private WebElement searchTextField;
    @FindBy(xpath = "//button/span[text()='Find']")
    private WebElement findButton;

    @FindBy(xpath = "//tbody/tr[2]/td[3]")
    private WebElement searchedAPIUserLoginName;

    @FindBy(xpath = "//div[@id='messagebox-1001-displayfield-inputEl']")
    private WebElement valdiationErrorMessage;

    @FindBy(xpath = "//tbody/tr[2]")
    private WebElement returnedAPIUser;

    // locators for API user permissions
    @FindBy(xpath = "//div[.='Batch bindings allowed']")
    private WebElement batchBindingsAllowed;
    @FindBy(xpath = "//div[.='Batch payments allowed']")
    private WebElement batchPaymentsAllowed;
    @FindBy(xpath = "//div[.='Batch refunds allowed']")
    private WebElement batchRefundsAllowed;
    @FindBy(xpath = "//div[.='Batch sending of payment form allowed']")
    private WebElement batchSendingOfPaymentFormAllowed;
    @FindBy(xpath = "//div[.='Can configure NSPK cobadge cards']")
    private WebElement canConfigureNSPKCobadgeCards;
    @FindBy(xpath = "//div[.='Can create order for payment by the link']")
    private WebElement canCreateOrderForPaymentByTheLink;
    @FindBy(xpath = "//div[.='Can download transaction and refund reports']")
    private WebElement canDownloadTransactionAndRefundReports;
    @FindBy(xpath = "//div[.='Can mark transaction as chargeback']")
    private WebElement canMarkTransactionAsChargeback;
    @FindBy(xpath = "//div[.='Can pay orders in console']")
    private WebElement canPayOrdersInConsole;
    @FindBy(xpath = "//div[.='Can use account updater']")
    private WebElement canUseAccountUpdater;
    @FindBy(xpath = "//div[.='Deposit allowed']")
    private WebElement depositAllowed;
    @FindBy(xpath = "//div[.='List transactions of other merchants']")
    private WebElement listTransactionsOfOtherMerchants;
    @FindBy(xpath = "//div[.='Localize descriptions']")
    private WebElement localizeDescriptions;
    @FindBy(xpath = "//div[.='Recurrent payments allowed']")
    private WebElement recurrentPaymentsAllowed;
    @FindBy(xpath = "//div[.='Refund allowed']")
    private WebElement refundAllowed;
    @FindBy(xpath = "//div[.='Reverse after deposit allowed']")
    private WebElement reverseAfterDepositAllowed;
    @FindBy(xpath = "//div[.='Reverse allowed']")
    private WebElement reverseAllowed;
    @FindBy(xpath = "//div[.='Submerchants management allowed']")
    private WebElement submerchantsManagemntAllowed;
    @FindBy(xpath = "//div[.='Use Merchant API']")
    private WebElement useMerchantAPI;
    // end of permissions locators
    @FindBy(xpath = "//tbody/tr[2]/td[7]")
    private WebElement permissionsColumn;


    public APIUserPage(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void clickCreateAPIUserButton() {
        this.createAPIUserButton.click();
    }

    public void setLoginIntoLoginTextField(String loginName) {
//        this.loginTextField.clear();
        this.loginTextField.sendKeys(loginName);
    }

    public void setMerchantIntoMerchantTextField(String merchantName) {
        this.merchantTextField.sendKeys(merchantName);
        this.merchantTextField.sendKeys(Keys.RETURN);
        this.selectMerchantOne.click();
    }

    public void clickDefaultLangDropDown() {
        this.defaultLangDrpDwn.click();
    }

    public void selectEnglishLanguage() {
        this.englishLanguage.click();
    }

    public void setPasswordIntoPasswordTextField(String password) {
//        this.passwordTextField.clear();
        this.passwordTextField.sendKeys(password);
    }
    public void setConfirmPasswordIntoConfirmPasswordTextField(String password) {
//        this.confirmPasswordTextField.clear();
        this.confirmPasswordTextField.sendKeys(password);
    }

    public void clickSaveButton() {
        this.saveButton.click();
    }

    public String getValidationErrorMessage() {
        return this.valdiationErrorMessage.getText();
    }

    public void setLoginNameToSearchTextField(String loginName) {
        this.searchTextField.clear();
        this.searchTextField.sendKeys(loginName);
    }
    public void clickFindButton() {
        this.findButton.click();
    }

    public String getSearchedAPIUserLoginName() {
        return this.searchedAPIUserLoginName.getText();
    }
    public void openReturedUserToViewItsDetail() {
        this.returnedAPIUser.click();
    }

    public void addPermissionsToAPIUser() {
        this.batchBindingsAllowed.click();
        this.batchPaymentsAllowed.click();
        this.batchRefundsAllowed.click();
        this.batchSendingOfPaymentFormAllowed.click();
        this.canConfigureNSPKCobadgeCards.click();
        this.canCreateOrderForPaymentByTheLink.click();
        this.canDownloadTransactionAndRefundReports.click();
        this.canMarkTransactionAsChargeback.click();
        this.canPayOrdersInConsole.click();
        this.canUseAccountUpdater.click();
        this.depositAllowed.click();
        this.listTransactionsOfOtherMerchants.click();
        this.localizeDescriptions.click();
        this.recurrentPaymentsAllowed.click();
        this.refundAllowed.click();
        this.reverseAfterDepositAllowed.click();
        this.reverseAllowed.click();
        this.submerchantsManagemntAllowed.click();
        this.useMerchantAPI.click();
    }
    public void assertTheUpdatedAPIUserHasTheAssignedPriviledges() {
        String permissions = this.permissionsColumn.getText();
        Assert.assertNotEquals(permissions, "");
    }
}
