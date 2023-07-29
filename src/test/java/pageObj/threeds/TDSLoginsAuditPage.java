package pageObj.threeds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TDSLoginsAuditPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    // objects used to search logins audit
    @FindBy(xpath = "//app-date-time-picker[@id='startDate']/div/input")
    private WebElement startDate;
    @FindBy(xpath = "//app-date-time-picker[@id='endDate']/div/input")
    private WebElement endDate;
    @FindBy(xpath = "//div/button[.=' Search ']")
    private WebElement searchButton;


    public TDSLoginsAuditPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
        this.actions = new Actions(driver);
    }

    public void clickOnSearchButton() {
        this.searchButton.click();
        smartWait(2000);
    }
    public void setEndDate(String endD) {
        this.endDate.clear();
        this.endDate.sendKeys(endD);
    }
    public void setStartDate(String startD) {
        this.startDate.clear();
        this.startDate.sendKeys(startD);
    }

    public void smartWait(int milliSec) {
        try {
            Thread.sleep(milliSec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
