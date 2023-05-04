package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class EPGSuperAdminPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(xpath = "//button/span[text()='Administration']")
    private WebElement administrationMenu;
    @FindBy(id = "menuitem-1026-itemEl")
    private WebElement usersLink;
    @FindBy(id = "menuitem-1043-textEl")
    private WebElement applicationInfoMenu;

    @FindBy(id = "button-1103-btnInnerEl")
    private WebElement createButton;
    @FindBy(id = "userwindow-1166_header_hd-textEl")
    private WebElement registerNewUserLabel;
    @FindBy(id = "textfield-1118-inputEl")
    private WebElement loginTextField;
    @FindBy(id = "textfield-1131-inputEl")
    private WebElement passwordTextField;
    @FindBy(id = "textfield-1132-inputEl")
    private WebElement confirmPasswordTextField;
    @FindBy(id = "button-1159-btnInnerEl")
    private WebElement saveButton;
    @FindBy(id = "ext-gen1301")
    private WebElement defaultLanguageDropDown;
    @FindBy(xpath = "//div/ul/li[text()='EN']")
    private WebElement selectEnglishLanguage;
    @FindBy(xpath = "//td/div[text()='ADMIN']")
    private WebElement adminGroupCheckbox;
    @FindBy(xpath = "//td/input[@id='textfield-1105-inputEl']")
    private WebElement searchTextField;
    @FindBy(xpath = "//button/span[text()='Find']")
    private WebElement searchButton;
    @FindBy(xpath = "//tr/td[3]/div")
    private WebElement returnedLoginName;
    @FindBy(xpath = "//tbody/tr[2]")
    private WebElement firstUser;
    @FindBy(id = "displayfield-1102-inputEl")
    private WebElement applicationVersion;

    // permissions
    @FindBy(xpath = "//div[.='Batch bindings allowed']")
    private WebElement batchBindingsAllowed;
    @FindBy(xpath = "//div[.='Batch refunds allowed']")
    private WebElement batchRefundsAllowed;
    @FindBy(xpath = "//div[.='Batch sending of payment form allowed']")
    private WebElement batchSendingOfPaymentFormAllowed;
    @FindBy(xpath = "//div[.='Can configure NSPK cobadge cards']")
    private WebElement canConfigureNSPKCodebaseCards;
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
    private WebElement submerchantsManagementAllowed;
    @FindBy(xpath = "//div[.='Use Merchant API']")
    private WebElement useMerchatAPI;
    // end of permissions locators
    @FindBy(xpath = "//tbody/tr[2]/td[7]")
    private WebElement permissionsColumn;
    @FindBy(id = "button-1075-btnInnerEl")
    private WebElement logoutButton;


    @FindBy(xpath = "ext-comp-1088")
    private WebElement authenticationForm;


    public EPGSuperAdminPage(WebDriver driver) {
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void clickUsersLink() {
        wait.until(ExpectedConditions.visibilityOf(this.usersLink));
        this.usersLink.click();
    }

    public void viewApplicationInfoMenu() {
        wait.until(ExpectedConditions.visibilityOf(applicationInfoMenu));
        this.applicationInfoMenu.click();
    }

    public void assertTheApplicationVersion(String applicationVersion) {
        String version = this.applicationVersion.getText();
        Assert.assertEquals(applicationVersion, version);

    }

    public String getURL(){
        return driver.getCurrentUrl();
    }

    public void clickCreateButton() {
        wait.until((ExpectedConditions.visibilityOf(this.createButton)));
        this.createButton.click();
    }

    public void setLoginTextField(String loginName) {
        this.loginTextField.sendKeys(loginName);
    }

    public void setPasswordTextField(String password) {
        this.passwordTextField.sendKeys(password);
    }
    public void setConfirmPasswordTextField(String password) {
        this.confirmPasswordTextField.sendKeys(password);
    }

    public void clickDefaultLanguageDropDown() {
        this.defaultLanguageDropDown.click();
    }
    public void selectEnglishLanguage() {
        this.selectEnglishLanguage.click();
    }
    public void selectAdminGroup() {
        this.adminGroupCheckbox.click();
    }
    public void clickSaveButton() {
        this.saveButton.click();
    }
    public void setSearchTextField(String loginName) {
        wait.until(ExpectedConditions.visibilityOf(searchTextField));
        this.searchTextField.clear();
        this.searchTextField.sendKeys(loginName);
    }
    public void clickSearchButton() {
        this.searchButton.click();
    }

    public String getReturnedLoginName() {
        return this.returnedLoginName.getText();
    }

    public void viewFirstUserDetail() {
        wait.until(ExpectedConditions.visibilityOf(firstUser));
        this.firstUser.click();
    }

    public void addPermissionsToTheUser() {
        this.batchBindingsAllowed.click();
        this.batchRefundsAllowed.click();
        this.batchSendingOfPaymentFormAllowed.click();
        this.canConfigureNSPKCodebaseCards.click();
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
        this.submerchantsManagementAllowed.click();
    }

    public void assertTheUserHasPermissions() {
        String permissions = this.permissionsColumn.getText();
        Assert.assertNotEquals(permissions, "");
    }

    public void logOutFromSystem() {
        this.logoutButton.click();
    }

    public EPGLoginPage clickLogoutButton() {
        wait.until(ExpectedConditions.visibilityOf(logoutButton));
        logoutButton.click();
        return new EPGLoginPage(driver);
    }
}
