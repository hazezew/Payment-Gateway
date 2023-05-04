package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FMAdminDashboardPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(xpath = "//span[contains(text(),'Log out')]")
    private WebElement linkLogout;

//    main menu items
    @FindBy(xpath = "//span[text()=\"Fraud Management\"]")
    private WebElement lnkFraudManagement;

    @FindBy(xpath = "(//span[text()='Reports'])[1]")
    private WebElement lnkReports;

    @FindBy(xpath = "//span[text()='Analytics tools']")
    private WebElement lnkRAnalyticstools;

    @FindBy(xpath = "//span[text()='System']")
    private WebElement lnkRSystems;

//    Submenu items under Fraud Management main menu
    @FindBy(xpath = "//span[text()='Case management']")
    private WebElement lnkCaseManagement;

    @FindBy(xpath = "(//span[text()=\"Cases queue\"])[1]")
    private WebElement lnkCasesQueue;

    @FindBy(xpath = "//span[text()=\"Operator form\"]")
    private WebElement lnkOperatorForm;

    @FindBy(xpath = "//span[text()='Last reviewed cases']")
    private WebElement lnkLastReviewedCases;

    @FindBy(xpath = "//span[text()='Operator Group']")
    private WebElement lnkOperatorGroup;

    @FindBy(xpath = "//span[text()='Settings']")
    private WebElement lnkCaseManagementSettings;


    public FMAdminDashboardPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }
    public void clickLnkFraudManagement(){
        wait.until(ExpectedConditions.visibilityOf(lnkFraudManagement)).click();
    }
    public void hoverLnkCaseManagement(){
        wait.until(ExpectedConditions.visibilityOf(lnkCaseManagement));
        action.moveToElement(lnkCaseManagement).build().perform();
    }
    public CasesQueuePage clickLnkCasesQueue(){
        wait.until(ExpectedConditions.visibilityOf(lnkCasesQueue)).click();
        return new CasesQueuePage(driver);
    }

    public OperatorFormPage clickLnkOperatorForm(){
        wait.until(ExpectedConditions.visibilityOf(lnkOperatorForm)).click();
        return new OperatorFormPage(driver);
    }

    public LastReviewedCasesPage clickLnkLastReviewedCases(){
        wait.until(ExpectedConditions.visibilityOf(lnkLastReviewedCases)).click();
        return new LastReviewedCasesPage(driver);
    }
    public OperatorGroupPage clickLnkOperatorGroup(){
        wait.until(ExpectedConditions.visibilityOf(lnkOperatorGroup)).click();
        return new OperatorGroupPage(driver);
    }

    public CaseManagementSettingsPage clickLnkCaseManagementSettings(){
        wait.until(ExpectedConditions.visibilityOf(lnkCaseManagementSettings)).click();
        return new CaseManagementSettingsPage(driver);
    }

    public FMLoginPage clickLinkLogout(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().refresh();
        action.moveToElement(linkLogout).build().perform();
        wait.until(ExpectedConditions.visibilityOf(linkLogout)).click();
        return new FMLoginPage(driver);
    }
    public String getURL(){
        return driver.getCurrentUrl();
    }
}
