package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class EPGAdminDashboardPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

//    Order Main menu
    @FindBy(xpath = "//*[text()='Orders']")
    private WebElement linkOrder;

    @FindBy(xpath = "//span[text()='Refunds']")
    private WebElement linkRefunds;

    @FindBy(xpath = "//span[text()='Audit']")
    private WebElement linkAudit;

    @FindBy(xpath = "//*[text()='Quit']")
    private WebElement logout;

//    Administration main menu
    @FindBy(id = "button-1013-btnInnerEl")
    private WebElement linkAdministration;

    @FindBy(id = "button-1044-btnInnerEl")
    private WebElement manualPaymentMOTOLink;

    @FindBy(id = "button-1052-btnInnerEl")
    private WebElement batchOperationsMenu;

    @FindBy(id = "menuitem-1028-textEl")
    private WebElement linkMerchant;

    @FindBy(id = "menuitem-1026-textEl")
    private WebElement apiUsersMenu;

    @FindBy(id = "menuitem-1027-textEl")
    private WebElement groupsMenu;

    @FindBy(id = "menuitem-1039-itemEl")
    private WebElement acquirersMenu;

    @FindBy(id = "menuitem-1046-itemEl")
    private WebElement createOrderForPaymentByTheLink;


    @FindBy(id = "menuitem-1054-itemEl")
    private WebElement batchProcessingOfRefundsSubMenu;

    @FindBy(id = "menuitem-1056-textEl")
    private WebElement batchProcessingOfBindingsSubMenu;

    @FindBy(id = "menuitem-1057-textEl")
    private WebElement batchSendingOfThePaymentFormSubMenu;

    @FindBy(id = "menuitem-1047-textEl")
    private WebElement createOrderAndRenderThePayment;

    @FindBy(xpath = "//button/span[text()='Administration']")
    private WebElement administrationMenu;

    @FindBy(id = "menuitem-1026-textEl")
    private WebElement usersMenu;


    @FindBy(id = "button-1075-btnInnerEl")
    private WebElement logoutButton;

    public EPGAdminDashboardPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }
    public EPGLoginPage clickLogout(){
//        action.scrollToElement(logout).build().perform();
        action.moveToElement(logout).build().perform();
        wait.until(ExpectedConditions.visibilityOf(logout)).click();
        return new EPGLoginPage(driver);
    }

    public OrderPage clickLinkOrder(){
        wait.until(ExpectedConditions.visibilityOf(linkOrder)).click();
        return new OrderPage(driver);
    }

    public RefundsPage clickLinkRefunds(){
        wait.until(ExpectedConditions.visibilityOf(linkRefunds)).click();
        return new RefundsPage(driver);
    }
    public AuditPage clickLinkAudit(){
        wait.until(ExpectedConditions.visibilityOf(linkAudit)).click();
        return new AuditPage(driver);
    }

    public void clickLinkAdministration(){
        wait.until(ExpectedConditions.visibilityOf(linkAdministration));
        linkAdministration.click();
    }
    public void clickManualPaymentLink() {
        wait.until(ExpectedConditions.visibilityOf(manualPaymentMOTOLink));
        manualPaymentMOTOLink.click();
    }
    public void clickBatchOperationsMenu() {
        wait.until(ExpectedConditions.visibilityOf(batchOperationsMenu));
        batchOperationsMenu.click();
    }
    public MerchantPage clickLinkMerchant(){
        wait.until(ExpectedConditions.visibilityOf(linkMerchant));
        linkMerchant.click();
        return new MerchantPage(driver);
    }

    public APIUserPage clickAPIUsersMenu() {
        wait.until(ExpectedConditions.visibilityOf(apiUsersMenu));
        apiUsersMenu.click();
        return new APIUserPage(driver);
    }

    public GroupsPage clickGroupsMenu() {
        wait.until(ExpectedConditions.visibilityOf(groupsMenu));
        groupsMenu.click();
        return new GroupsPage(driver);
    }

    public AcquirersPage clickAcquirersMenu() {
        wait.until(ExpectedConditions.visibilityOf(acquirersMenu));
        acquirersMenu.click();
        return new AcquirersPage(driver);
    }

    public ManualPaymentMOTOPage clickCreateOrderForPaymentByTheLinkMenu() {
        wait.until(ExpectedConditions.visibilityOf(createOrderForPaymentByTheLink));
        createOrderForPaymentByTheLink.click();
        return new ManualPaymentMOTOPage(driver);
    }
    public BatchOperationsPage clickBatchProcessingOfRefundsSubMenu() {
        wait.until(ExpectedConditions.visibilityOf(batchProcessingOfRefundsSubMenu));
        batchProcessingOfRefundsSubMenu.click();
        return new BatchOperationsPage(driver);
    }
    public BatchOperationsPage clickBatchProcessingOfBindingsSubMenu() {
        wait.until(ExpectedConditions.visibilityOf(batchProcessingOfBindingsSubMenu));
        batchProcessingOfBindingsSubMenu.click();
        return new BatchOperationsPage(driver);
    }
    public BatchOperationsPage clickBatchSendingOfThePaymentForm() {
        wait.until(ExpectedConditions.visibilityOf(batchSendingOfThePaymentFormSubMenu));
        batchSendingOfThePaymentFormSubMenu.click();
        return new BatchOperationsPage(driver);
    }
    public ManualPaymentMOTOPage clickCreateOrderAndRenderThePaymentSubMenu() {
        wait.until(ExpectedConditions.visibilityOf(createOrderAndRenderThePayment));
        createOrderAndRenderThePayment.click();
        return new ManualPaymentMOTOPage(driver);
    }

    public EPGSuperAdminPage clickAdministrationMenu() {
        wait.until(ExpectedConditions.visibilityOf(administrationMenu));
        administrationMenu.click();
        return new EPGSuperAdminPage(driver);
    }

    public APIUserPage clickUsersMenu() {
        wait.until(ExpectedConditions.visibilityOf(usersMenu));
        usersMenu.click();
        return new APIUserPage(driver);
    }

    public EPGLoginPage clickLogoutButton() {
        wait.until(ExpectedConditions.visibilityOf(logoutButton));
        logoutButton.click();
        return new EPGLoginPage(driver);
    }

//    public EPGSuperAdminPage returnSuperAdminPage() {
//        return new EPGSuperAdminPage(driver);
//    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}
