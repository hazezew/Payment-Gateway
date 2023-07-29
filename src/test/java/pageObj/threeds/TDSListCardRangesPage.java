package pageObj.threeds;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;

public class TDSListCardRangesPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    // objects used to search tds list of card ranges
    @FindBy(xpath = "//div/input[@placeholder='Search by PAN']")
    private WebElement searchByPan;
    @FindBy(xpath = "//div/button[.='Search']")
    private WebElement searchButton;
    @FindBy(xpath = "//tbody/tr/td[1]")
    private WebElement returnedStartRange;
    @FindBy(xpath = "//tbody/tr/td[2]")
    private WebElement returnedEndRange;
    @FindBy(xpath = "//tbody/tr/td[3]")
    private WebElement returnedIssuer;

    // objects used to edit tds list of card ranges
    @FindBy(xpath = "//td/button[@aria-label='Edit']")
    private WebElement editIcon;
    @FindBy(xpath = "//div[@class='mb-3']/div/div[5]/select")
    private WebElement tdsOneAttemptsStatusDropdown;
    @FindBy(xpath = "//div[@class='mb-3']/div/div[6]/select")
    private WebElement tdsTwoAttemptsStatusDropdown;
    String tdsTwoAttemptsStatusString = "//select[@id='threeds2status']/option[.='";
    @FindBy(xpath = "//*[contains(text(),\"Update Card Range\")]")
    private WebElement updateCardRangeButton;
    @FindBy(xpath = "//select[@id='threeDs1AttemptsStatus']/option[1]")
    private WebElement returnedTDSOneAttemptsStatus;
    @FindBy(xpath = "//select[@id='threeDs2AttemptsStatus']/option[1]")
    private WebElement returnedTDSTwoAttemptsStatus;

    @FindBy(xpath = "//div/input[@id='threeDSMethodURL']")
    private WebElement tdsMethodUrl;

    public TDSListCardRangesPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
        this.actions = new Actions(driver);
    }

    public void setTdsMethodUrl(String tdsUrl) {
        this.tdsMethodUrl.clear();
        smartWait(3000);
        this.tdsMethodUrl.sendKeys(tdsUrl);
        smartWait(3000);
        this.tdsMethodUrl.sendKeys(Keys.TAB);
    }
    public String getReturnedTdsTwoAttemptsStatus() {
        return returnedTDSTwoAttemptsStatus.getText();
    }
    public String getReturnedTdsOneAttemptsStatus() {
        return returnedTDSOneAttemptsStatus.getText();
    }
    public void clickOnUpdateCardRangeButton() {
        smartWait(1000);
        this.updateCardRangeButton.click();
        smartWait(2000);
    }
    public void setTdsTwoAttemptStatus(String status) {
        this.tdsTwoAttemptsStatusDropdown.click();
        Select sel = new Select(tdsTwoAttemptsStatusDropdown);
        sel.selectByValue(status);
    }
    public void setTdsOneAttemptsStatus(String status) {
        this.tdsOneAttemptsStatusDropdown.click();
        Select sel = new Select(tdsOneAttemptsStatusDropdown);
        sel.selectByValue(status);
    }
    public void clickOnEditIcon() {
        this.editIcon.click();
        smartWait(2000);
    }
    public String getReturnedIssuer() {
        return this.returnedIssuer.getText();
    }
    public String getReturnedEndRange() {
        return this.returnedEndRange.getText();
    }
    public String getReturnedStartRange() {
        return this.returnedStartRange.getText();
    }
    public void clickOnSearchButton() {
        this.searchButton.click();
        smartWait(2000);
    }
    public void setPanFilter(String panNum) {
        this.searchByPan.clear();
        this.searchByPan.sendKeys(panNum);
    }
    public void smartWait(int milliSec) {
        try {
            Thread.sleep(milliSec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
