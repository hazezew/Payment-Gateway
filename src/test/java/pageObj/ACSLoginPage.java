package pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ACSLoginPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;
    private String alertMessage="";

    @FindBy(id = "j_username")
    private WebElement txtUsername;

    @FindBy(id = "j_password")
    private WebElement txtPassword;

//    @FindBy(id = "loginButton")
    @FindBy(id = "loginButton")
    private WebElement btnLogin;

    public ACSLoginPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }
    public void setTxtUsername(String username){
        wait.until(ExpectedConditions.visibilityOf(txtUsername));
        txtUsername.sendKeys(username);
    }
    public void setTxtPassword(String password){
        wait.until(ExpectedConditions.visibilityOf(txtPassword));
        txtPassword.sendKeys(password);
    }
    public ACSAdminDashboardPage clickBtnLogin(){
//        driver.findElement(By.cssSelector("#login.Button")).click();
        try {
            wait.until(ExpectedConditions.visibilityOf(btnLogin));
            btnLogin.click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new ACSAdminDashboardPage(driver);
    }
    public String getURL(){
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.getCurrentUrl();
    }
}
