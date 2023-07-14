package pageObj.acs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ACSAdminDashboardPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;
    private String alertMessage="";

    @FindBy(id="hamburger")
    private WebElement menuIcon;

    @FindBy(xpath = "//a[text()='Log out']")
    private WebElement linkLogout;

    public ACSAdminDashboardPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }
    public void clickMenuIcon(){
        wait.until(ExpectedConditions.visibilityOf(menuIcon));
        menuIcon.click();
    }
    public void clickLinkLogout(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", linkLogout);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOf(linkLogout));
        linkLogout.click();
    }
    public String getURL(){
        return driver.getCurrentUrl();
    }
    public void logout(){
        clickMenuIcon();
        clickLinkLogout();
    }

    public ACSUsersPage clickOnMenuIcon() {
        wait.until(ExpectedConditions.visibilityOf(menuIcon));
        menuIcon.click();

        return new ACSUsersPage(driver);
    }

    public ACSRolesPage clickOnMenuIconForRole() {
        wait.until(ExpectedConditions.visibilityOf(menuIcon));
        menuIcon.click();

        return new ACSRolesPage(driver);
    }

    public MerchantTrustManagementPage clickOnMenuIconForMerchantTrustManagement() {
        wait.until(ExpectedConditions.visibilityOf(menuIcon));
        menuIcon.click();

        return new MerchantTrustManagementPage(driver);
    }

    public ACSProfilesPage clickOnMenuIconForProfiles() {
        wait.until(ExpectedConditions.visibilityOf(menuIcon));
        menuIcon.click();

        return new ACSProfilesPage(driver);
    }

    public ACSAuthenticationSchemesPage clickOnAuthenticationSchemes() {
        wait.until((ExpectedConditions.visibilityOf(menuIcon)));
        menuIcon.click();

        return new ACSAuthenticationSchemesPage(driver);
    }

    public ACSAuthenticationMethodsPage clickOnAuthenticationMethods() {
        wait.until(ExpectedConditions.visibilityOf(menuIcon));
        menuIcon.click();

        return new ACSAuthenticationMethodsPage(driver);
    }

    public ACSPerformersPage clickOnPerformers() {
        wait.until(ExpectedConditions.visibilityOf(menuIcon));
        menuIcon.click();

        return new ACSPerformersPage(driver);
    }

    public ACSEnrolledCardsPage clickOnEnrolledCards() {
        wait.until(ExpectedConditions.visibilityOf(menuIcon));
        menuIcon.click();

        return new ACSEnrolledCardsPage(driver);
    }

    public ACSCardRegistryLoadingHistoryPage clickOnCardRegistryLoadingHistory() {
        wait.until(ExpectedConditions.visibilityOf(menuIcon));
        menuIcon.click();

        return new ACSCardRegistryLoadingHistoryPage(driver);
    }

    public ACSEnrollmentVerificationPage clickOnEnrollmentVerification() {
        wait.until(ExpectedConditions.visibilityOf(menuIcon));
        menuIcon.click();

        return new ACSEnrollmentVerificationPage(driver);
    }

    public ACSAuthenticationPage clickOnAuthentication() {
        wait.until(ExpectedConditions.visibilityOf(menuIcon));
        menuIcon.click();

        return new ACSAuthenticationPage(driver);
    }

    public ACSKeysForCVVCalculationPageObj clickOnKeysForCVVCalculation() {
        wait.until(ExpectedConditions.visibilityOf(menuIcon));
        menuIcon.click();

        return new ACSKeysForCVVCalculationPageObj(driver);
    }

    public ACSArchivingPage clickOnArchiving() {
        wait.until(ExpectedConditions.visibilityOf(menuIcon));
        menuIcon.click();

        return new ACSArchivingPage(driver);
    }

    public ACSTransactionStatusSettingsPage clickOnTransactionStatusSettings() {
        wait.until(ExpectedConditions.visibilityOf(menuIcon));
        menuIcon.click();

        return new ACSTransactionStatusSettingsPage(driver);
    }

    public ACSUserSettingsPage clickOnUserSettings() {
        wait.until(ExpectedConditions.visibilityOf(menuIcon));
        menuIcon.click();

        return new ACSUserSettingsPage(driver);
    }

    public ACSAuditPage clickOnAudit() {
        wait.until(ExpectedConditions.visibilityOf(menuIcon));
        menuIcon.click();

        return new ACSAuditPage(driver);
    }





}