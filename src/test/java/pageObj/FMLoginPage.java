package pageObj;

import config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FMLoginPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(id = "loginForm:login")
    private WebElement txtUserName;

    @FindBy(id = "loginForm:password")
    private WebElement txtPassword;

    @FindBy(id = "loginForm:submit")
    private WebElement btnEnter;

    @FindBy(xpath = "//*[@id=\"growl_container\"]/div/div/div[3]/span")
    private WebElement msgInvalidUserPassword;

    @FindBy(xpath = "/html/body/div[5]/div[1]/div/div[3]/p")
    private WebElement msgEmptyUsername;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div/div[3]/p")
    private WebElement msgEmptyPassword;

    @FindBy(xpath = "//p[@class=\"ui-growl-details\"]")
    private WebElement msgCommonMessageDisplay;

    private String emptyUserMessage;
    private String emptyPasswordMessage;

    private String errorMessage;

    public FMLoginPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }
    public void setTxtUserName(String userName){
        wait.until(ExpectedConditions.visibilityOf(txtUserName)).sendKeys(userName);
    }
    public void setTxtPassword(String password){
        wait.until(ExpectedConditions.visibilityOf(txtPassword)).sendKeys(password);
    }
    public FMAdminDashboardPage clickLoginButton(){
        String username=txtUserName.getAttribute("value");
        String password=txtPassword.getAttribute("value");
        wait.until(ExpectedConditions.visibilityOf(btnEnter)).click();
        try {
            Thread.sleep(500);
            if(!driver.getCurrentUrl().equals(Config.fmAdminDashboardPageURL)) {
                if (username.length() != 0 && password.length() != 0) {
                    errorMessage = msgInvalidUserPassword.getText();
                } else {
                    if (username.length() == 0 && password.length() == 0) {
                        emptyUserMessage = msgEmptyUsername.getText();
                        emptyPasswordMessage = msgEmptyPassword.getText();
                    } else {
                        if (username.length() == 0) {
                            emptyUserMessage = msgCommonMessageDisplay.getText();
                        } else {
                            emptyUserMessage = msgCommonMessageDisplay.getText();
                            emptyPasswordMessage = msgCommonMessageDisplay.getText();
                        }
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new FMAdminDashboardPage(driver);
    }
    public String getEmptyUserMessage(){
        return emptyUserMessage;
    }
    public String getEmptyPasswordMessage(){
        return emptyPasswordMessage;
    }
    public String getErrorMessage(){
        return errorMessage;
    }

    public String getEmptyUsernameErrorMessage(){
        return emptyUserMessage;
    }
    public String getEmptyPasswordErrorMessage(){
        return emptyPasswordMessage;
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}
