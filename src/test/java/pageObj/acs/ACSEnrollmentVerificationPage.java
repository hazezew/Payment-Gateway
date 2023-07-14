package pageObj.acs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ACSEnrollmentVerificationPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    @FindBy(xpath = "//span/a[.='Enrollment Verification']")
    private WebElement enrollmentVerificationMenu;
    // search enrollment verification
    @FindBy(xpath = "//td/input[@id='historyFilterForm:cardNumberFilter']")
    private WebElement cardNumberFilter;
    @FindBy(xpath = "//td/input[@id='historyFilterForm:phoneFilter']")
    private WebElement phoneNumberFilter;
    @FindBy(xpath = "//td/div[@id='historyFilterForm:profileFilter']")
    private WebElement profileDropdown;
    String profileString = "//ul/li[.='";
    @FindBy(xpath = "//button/span[.='Search']")
    private WebElement searchButton;
    @FindBy(xpath = "//tbody[@id='historyForm:historyTable_data']/tr[1]/td[10]")
    private WebElement returnedProfileName;
    @FindBy(xpath = "//tbody[@id='historyForm:historyTable_data']/tr[1]/td[11]")
    private WebElement returnedPhoneNumber;

    public ACSEnrollmentVerificationPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
        this.actions = new Actions(driver);
    }

    public void clickOnEnrollmentVerificationMenu() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", enrollmentVerificationMenu);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.enrollmentVerificationMenu.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setCardNumberFilter(String cardNumber) {
        this.cardNumberFilter.clear();
        this.cardNumberFilter.sendKeys(cardNumber);
    }
    public void setPhoneNumberFilter(String phoneNumber) {
        this.phoneNumberFilter.clear();
        this.phoneNumberFilter.sendKeys(phoneNumber);
    }
    public void selectProfile(String profile) {
        this.profileDropdown.click();
        driver.findElement(By.xpath(profileString + "" + profile + "']")).click();
    }
    public void clickOnSearchButton() {
        this.searchButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String getReturnedPhoneNumber() {
        return this.returnedPhoneNumber.getText();
    }
    public String getReturnedProfile() {
        return this.returnedProfileName.getText();
    }

}
