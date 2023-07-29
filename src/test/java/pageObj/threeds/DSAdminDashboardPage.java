package pageObj.threeds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObj.DSLoginPage;
import pageObj.threeds.*;

import java.time.Duration;

public class DSAdminDashboardPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(xpath = "//button[@id=\"profileMenu\"]")
    private WebElement profileMenu;

    @FindBy(xpath = "(//a[@class=\"dropdown-item\"])[2]")
    private WebElement signOutMenu;

    @FindBy(xpath = "//li/a[.='3DS2 Transactions']")
    private WebElement ds2TransactionsSubMenu;

    @FindBy(xpath = "//li/a[.='Acquirers']")
    private WebElement acquirersSubMenu;

    @FindBy(xpath = "//li/a[.='Issuers']")
    private WebElement issuersSubMenu;

    @FindBy(xpath = "//li/a[.='3DS2 Transactions']")
    private WebElement tdsTwoTransactions;

    @FindBy(id = "cardRangesDropdown")
    private WebElement cardRangesMenu;
    @FindBy(xpath = "//li/a[.='List Card Ranges ']")
    private WebElement listCardRangesSubMenu;
    @FindBy(xpath = "//li/a[.='Batch Upload History']")
    private WebElement batchUploadHistorySubMenu;

    @FindBy(id = "auditDropdown")
    private WebElement auditMenu;
    @FindBy(xpath = "//li/a[.='Logins']")
    private WebElement loginsSubMenu;
    @FindBy(xpath = "//li/a[.='Actions']")
    private WebElement actionsSubMenu;

    @FindBy(id = "administrationDropdown")
    private WebElement administrationMenu;
    @FindBy(xpath = "//li/a[.='List 3DS Server Certificated Solutions']")
    private WebElement tdsServCertSolution;
    @FindBy(xpath = "//li/a[.='List ACS Certificated Solutions']")
    private WebElement tdsAcsCertSolution;
    @FindBy(xpath = "//li/a[.='List Operator Roles']")
    private WebElement listOperatorRoles;
    @FindBy(xpath = "//li/a[.='List Operators']")
    private WebElement listOperators;

    public DSAdminDashboardPage(WebDriver driver) {
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }
    public void clickProfileMenu(){
        wait.until(ExpectedConditions.visibilityOf(profileMenu)).click();
    }
    public DSLoginPage clickSignOutMenu(){
        wait.until(ExpectedConditions.visibilityOf(signOutMenu)).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new DSLoginPage(driver);
    }

    public String getURL(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.getCurrentUrl();
    }

    public TDSAcquirersPage clickOnAcquirers() {
        wait.until(ExpectedConditions.visibilityOf(acquirersSubMenu)).click();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new TDSAcquirersPage(driver);
    }

    public TDSIssuersPage clickOnIssuers() {
        wait.until(ExpectedConditions.visibilityOf(issuersSubMenu)).click();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new TDSIssuersPage(driver);
    }

    public TDSTwoTransactionsPage clickOnTDSTwoTransactions() {
        wait.until(ExpectedConditions.visibilityOf(tdsTwoTransactions)).click();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new TDSTwoTransactionsPage(driver);
    }

    public void clickOnCardRangesMenu() {
        wait.until(ExpectedConditions.visibilityOf(cardRangesMenu)).click();
    }
    public TDSListCardRangesPage clickOnListCardRangesSubMenu() {
        wait.until(ExpectedConditions.visibilityOf(listCardRangesSubMenu)).click();
        smartWait(300);
        return new TDSListCardRangesPage(driver);
    }

    public TDSBatchUploadHistoryPage clickOnBatchUploadHistorySubMenu() {
        wait.until(ExpectedConditions.visibilityOf(batchUploadHistorySubMenu)).click();
        smartWait(300);
        return new TDSBatchUploadHistoryPage(driver);
    }

    public void clickOnAuditMenu() {
        wait.until(ExpectedConditions.visibilityOf(auditMenu)).click();
    }
    public TDSLoginsAuditPage clickOnLoginsSubMenu() {
        wait.until(ExpectedConditions.visibilityOf(loginsSubMenu)).click();
        smartWait(300);

        return new TDSLoginsAuditPage(driver);
    }

    public TDSActionsAuditPage clickOnActionsSubMenu() {
        wait.until(ExpectedConditions.visibilityOf(actionsSubMenu)).click();
        smartWait(300);

        return new TDSActionsAuditPage(driver);
    }

    public void clickOnAdministrationMenu() {
        wait.until(ExpectedConditions.visibilityOf(administrationMenu)).click();
    }
    public TDSCertifiedSolutionsPage clickOnTDSServCertSolutionSubMenu() {
        wait.until(ExpectedConditions.visibilityOf(tdsServCertSolution)).click();
        smartWait(300);

        return new TDSCertifiedSolutionsPage(driver);
    }
    public TDSACSCertifiedSolutionsPage clickOnTDSACSCertifiedSolutionsSubMenu() {
        wait.until(ExpectedConditions.visibilityOf(tdsAcsCertSolution)).click();
        smartWait(300);

        return new TDSACSCertifiedSolutionsPage(driver);
    }

    public TDSOperatorRolesPage clickOnTDSListOperatorRolesSubMenu() {
        wait.until(ExpectedConditions.visibilityOf(listOperatorRoles)).click();
        smartWait(300);

        return new TDSOperatorRolesPage(driver);
    }



    public void smartWait(int milliSec) {
        try {
            Thread.sleep(milliSec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
