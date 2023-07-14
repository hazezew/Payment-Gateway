package pageObj.acs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ACSUserSettingsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    // objects used to change user settings
    @FindBy(xpath = "//span/a[.='User settings']")
    private WebElement userSettingsMenu;
    @FindBy(xpath = "//td/input[@id='changePasswordForm:operatorCurrentPasswordInput']")
    private WebElement currentPassword;
    @FindBy(xpath = "//td/input[@id='changePasswordForm:operatorPasswordInput']")
    private WebElement newPassword;
    @FindBy(xpath = "//td/input[@id='changePasswordForm:operatorPasswordConfirmationInput']")
    private WebElement confirmationPassword;
    @FindBy(xpath = "//button/span[.='Save']")
    private WebElement saveButton;

    public ACSUserSettingsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
        this.actions = new Actions(driver);
    }


    public void clickOnSaveButton() {
        this.saveButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setConfirmationPassword(String confirmationP) {
        this.confirmationPassword.clear();
        this.confirmationPassword.sendKeys(confirmationP);
    }
    public void setNewPassword(String newP) {
        this.newPassword.clear();
        this.newPassword.sendKeys(newP);
    }
    public void setCurrentPassword(String currentP) {
        this.currentPassword.clear();
        this.currentPassword.sendKeys(currentP);
    }
    public void clickOnUserSettingsMenu() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", userSettingsMenu);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.userSettingsMenu.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
