package pageObj.threeds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TDSBatchUploadHistoryPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    // objects used to search batch uploading history
    @FindBy(xpath = "//app-date-time-picker[@id='startDate']/div/input")
    private WebElement startDate;
    @FindBy(xpath = "//app-date-time-picker[@id='endDate']/div/input")
    private WebElement endDate;
    @FindBy(id = "processingStatus")
    private WebElement processingResultDropdown;
    @FindBy(id = "issuer")
    private WebElement issuerDropdown;
    @FindBy(xpath = "//div/button[.=' Search ']")
    private WebElement searchButton;
    @FindBy(xpath = "//tbody/tr[1]/td[3]")
    private WebElement returnedIssuer;
    @FindBy(xpath = "//tbody/tr[1]/td[7]")
    private WebElement returnedResult;

    public TDSBatchUploadHistoryPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
        this.actions = new Actions(driver);
    }

    public String getReturnedResult() {
        return this.returnedResult.getText();
    }
    public String getReturnedIssuer() {
        return this.returnedIssuer.getText();
    }
    public void clickOnSearchButton() {
        this.searchButton.click();
        smartWait(3000);
    }
    public void setIssuer(String issuer) {
        this.issuerDropdown.click();
        Select sel = new Select(issuerDropdown);
        sel.selectByVisibleText(issuer);
    }
    public void setProcessingResult(String processResult) {
        this.processingResultDropdown.click();
        Select sel = new Select(processingResultDropdown);
        sel.selectByValue(processResult);
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
