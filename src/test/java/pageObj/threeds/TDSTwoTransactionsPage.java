package pageObj.threeds;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TDSTwoTransactionsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    // objects used to search 3ds two transactions
    @FindBy(xpath = "//app-date-time-picker[@name='startDate']/div/input")
    private WebElement startDate;
    @FindBy(xpath = "//app-date-time-picker[@name='endDate']/div/input")
    private WebElement endDate;
    @FindBy(id = "acquirerBin")
    private WebElement acquirerBin;
    @FindBy(xpath = "//div/button[.='Search ']")
    private WebElement searchButton;
    @FindBy(xpath = "//div/input[@placeholder='PAN']")
    private WebElement panNum;
    @FindBy(id = "issuer")
    private WebElement issuerDropdown;
    String issuerString = "//select/option[.='";
    @FindBy(id = "merchantName")
    private WebElement merchant;
    @FindBy(id = "aResTransStatus")
    private WebElement aResTransStatusDropdown;
    String aResTransStatusString = "//select[@id='aResTransStatus']/option[.='";
    @FindBy(id = "messageCategoryId")
    private WebElement messageCategoryDropdown;
    String messageCategoryString = "//select/option[.='";
    @FindBy(id = "deviceChannelId")
    private WebElement deviceChannelDropdown;
    String deviceChannelString = "//select/option[.='";
    @FindBy(id = "protocolVersion")
    private WebElement protocolVersionDropdown;
    String protocolVersionString = "//select/option[.='";
    @FindBy(xpath = "//tbody/tr[1]/td[3]")
    private WebElement returnedIssuer;
    @FindBy(xpath = "//tbody/tr[1]/td[4]")
    private WebElement returnedAcquirerBin;
    @FindBy(xpath = "//tbody/tr[1]/td[5]")
    private WebElement returnedPan;

    public TDSTwoTransactionsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
        this.actions = new Actions(driver);
    }


    public String getReturnedPan() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", returnedPan);
        return this.returnedPan.getText();
    }
    public String getReturnedAcquirerBin() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", returnedAcquirerBin);
        return this.returnedAcquirerBin.getText();
    }
    public String getReturnedIssuer() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", returnedIssuer);
        return this.returnedIssuer.getText();
    }
    public void setProtocolVersion(String protocolVersion) {
        this.protocolVersionDropdown.click();
        driver.findElement(By.xpath(protocolVersionString + "" + protocolVersion + "']")).click();
        smartWait(400);
    }
    public void setDeviceChannel(String deviceChannel) {
        this.deviceChannelDropdown.click();
        driver.findElement(By.xpath(deviceChannelString + "" + deviceChannel + "']")).click();
        smartWait(400);
    }
    public void setMessageCategory(String messageCategory) {
        this.messageCategoryDropdown.click();
        driver.findElement(By.xpath(messageCategoryString + "" + messageCategory + "']")).click();
        smartWait(400);
    }
    public void setAResTransStatus(String aResTransStatus) {
        this.aResTransStatusDropdown.click();
        driver.findElement(By.xpath(aResTransStatusString + "" + aResTransStatus + "']")).click();
        smartWait(400);
    }
    public void setMerchant(String merchantName) {
        this.merchant.clear();
        this.merchant.sendKeys(merchantName);
    }
    public void setIssuer(String issuer) {
        this.issuerDropdown.click();
        driver.findElement(By.xpath(issuerString + "" + issuer + "']")).click();
        smartWait(200);
    }
    public void setPanNum(String pan) {
        this.panNum.clear();
        this.panNum.sendKeys(pan);
    }
    public void clickOnSearchButton() {
        this.searchButton.click();
        smartWait(10000);
    }
    public void setAcquirerBin(String acquirer) {
        this.acquirerBin.clear();
        this.acquirerBin.sendKeys(acquirer);
    }
    public void setEndDate(String endD) {
        this.endDate.sendKeys(endD);
    }
    public void setStartDate(String startD) {
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
