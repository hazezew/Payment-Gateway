package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DSAdminDashboardPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(xpath = "//button[@id=\"profileMenu\"]")
    private WebElement profileMenu;

    @FindBy(xpath = "(//a[@class=\"dropdown-item\"])[2]")
    private WebElement signOutMenu;

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
        return driver.getCurrentUrl();
    }
}
