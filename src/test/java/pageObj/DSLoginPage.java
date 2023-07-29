package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObj.threeds.DSAdminDashboardPage;

import java.time.Duration;

public class DSLoginPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameTextField;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordTextField;
    @FindBy(xpath = "//button[text()='Login']")
    private WebElement loginButton;
    @FindBy(xpath = "//div[contains(@class,\"alert-danger\")]")
    private WebElement messageDisplay;

    public DSLoginPage(WebDriver driver) {
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void setUsernameTextField(String username) {
        this.usernameTextField.clear();
        this.usernameTextField.sendKeys(username);
    }
    public void setPasswordTextField(String password) {
        this.passwordTextField.clear();
        this.passwordTextField.sendKeys(password);
    }
    public DSAdminDashboardPage clickLoginButton() {
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        loginButton.click();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new DSAdminDashboardPage(driver);
    }
    public String getMessageDisplay(){
        return wait.until(ExpectedConditions.visibilityOf(messageDisplay)).getText();
    }

    public String getURL() {
        return this.driver.getCurrentUrl();
    }
}
