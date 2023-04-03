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

    @FindBy(id = "menuitem-1028-textEl")
    private WebElement linkMerchant;

    public EPGAdminDashboardPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }
    public EPGLoginPage clickLogout(){
        action.scrollToElement(logout).build().perform();
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
    public MerchantPage clickLinkMerchant(){
        wait.until(ExpectedConditions.visibilityOf(linkMerchant));
        linkMerchant.click();
        return new MerchantPage(driver);
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}
