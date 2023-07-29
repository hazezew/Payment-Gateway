package pageObj.threeds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TDSLoginPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(xpath = "//input[@id=\"login\"]")
    private WebElement txtUsername;

    @FindBy(xpath = "//input[@id=\"password\"]")
    private WebElement txtPassword;

    @FindBy(xpath = "//button[contains(@class,\"btn-block form-control\")]")
    private WebElement btnLogin;

    @FindBy(xpath = "//div[contains(@class,\"alert-danger\")]")
    private WebElement messageDisplay;

    public TDSLoginPage(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }
    public String getURL(){
        return driver.getCurrentUrl();
    }
}
