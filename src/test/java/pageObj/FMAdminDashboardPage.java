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

    @FindBy(xpath = "//span[text()=\"Cases queue\"]")
    private WebElement lnkCasesQueue;


    public FMAdminDashboardPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }
    public void clickLnkFraudManagement(){
        wait.until(ExpectedConditions.visibilityOf(lnkFraudManagement)).click();
    }
    public void  hoverLnkCaseManagement(){
        wait.until(ExpectedConditions.visibilityOf(lnkCaseManagement));
        action.moveToElement(lnkCaseManagement).build().perform();
    }
    public CasesQueuePage clickLnkCasesQueue(){
        wait.until(ExpectedConditions.visibilityOf(lnkCasesQueue)).click();
//        action.moveToElement(lnkCasesQueue).build().perform();
        return new CasesQueuePage(driver);
    }

    public FMLoginPage clickLinkLogout(){
        wait.until(ExpectedConditions.visibilityOf(linkLogout)).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new FMLoginPage(driver);
    }
    public String getURL(){
        return driver.getCurrentUrl();
    }
}
