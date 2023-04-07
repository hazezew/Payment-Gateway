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

    public FMAdminDashboardPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
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
