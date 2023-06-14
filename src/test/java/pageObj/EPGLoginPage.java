package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class EPGLoginPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(id = "username-inputEl")
    private WebElement txtUsername;

    @FindBy(xpath = "//*[contains(@class,'passwordField')]")
    private WebElement txtPassword;

    @FindBy(xpath = "//*[text()='Log In']")
    private WebElement btnLogin;

    @FindBy(xpath = "//span[contains(@class,'error')]")
    private WebElement errorDisplay;

    @FindBy(id = "button-1075-btnInnerEl")
    private WebElement logoutButton;

    @FindBy(id = "ext-comp-1088")
    private WebElement authenticationForm;


    public EPGLoginPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }
    public void setTxtUsername(String username){
        wait.until(ExpectedConditions.visibilityOf(txtUsername));
        txtUsername.clear();
        txtUsername.sendKeys(username);
    }
    public void setTxtPassword(String password){
        wait.until(ExpectedConditions.visibilityOf(txtPassword));
        txtPassword.clear();
        txtPassword.sendKeys(password);
    }
    public EPGAdminDashboardPage clickBtnLogin(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOf(btnLogin));
        wait.until(ExpectedConditions.elementToBeClickable(btnLogin)).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new EPGAdminDashboardPage(driver);
    }

    public EPGSuperAdminPage clickLoginButton() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOf(btnLogin));
        wait.until(ExpectedConditions.elementToBeClickable(btnLogin)).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new EPGSuperAdminPage(driver);
    }

    public String getErrorDisplayed(){
        return errorDisplay.getText();
    }
    public String getURL(){
        return driver.getCurrentUrl();
    }

    public void assertAuthenticationFormIsDisplayed() {
        Assert.assertTrue(this.authenticationForm.isDisplayed());
    }

}