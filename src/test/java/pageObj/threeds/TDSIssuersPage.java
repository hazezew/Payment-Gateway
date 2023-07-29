package pageObj.threeds;

import io.cucumber.java.et.Ja;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TDSIssuersPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    @FindBy(xpath = "//div/button[.='Add']")
    private WebElement addIssuerButton;
    @FindBy(id = "issuerName")
    private WebElement issuerName;
    @FindBy(id = "issuerContact")
    private WebElement issuerContact;
    @FindBy(id = "threeDs1Status")
    private WebElement tDSOneStatusDropdown;
    String tDSOneString = "//select[@id='threeDs1Status']/option[.='";
    @FindBy(id = "threeDs2Status")
    private WebElement tDSTwoStatusDropdown;
    String tDSTwoString = "//select[@id='threeDs2Status']/option[.='";
    @FindBy(id = "acsCertSolutionId")
    private WebElement acsCertifiedSolutionDropdown;
    String acsCertifiedSolutionString = "//select[@id='acsCertSolutionId']/option[.='";
    @FindBy(xpath = "//div/button[.='Add Issuer']")
    private WebElement addOrSaveIssuerButton;

    // objects used to search DS issuers
    @FindBy(xpath = "//div/input[@placeholder='Search by Name']")
    private WebElement issuerNameFilter;
    @FindBy(xpath = "//div/button[.=' Search ']")
    private WebElement searchButton;
    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    private WebElement returnedDSIssuerName;
    @FindBy(xpath = "//tbody/tr[1]/td[3]")
    private WebElement returnedTDSOneStatus;
    @FindBy(xpath = "//tbody/tr[1]/td[4]")
    private WebElement returnedTDSTwoStatus;
    @FindBy(xpath = "//tbody/tr[1]/td[6]")
    private WebElement returnedACSRefNum;

    // objects used to edit tDS issuer
    @FindBy(xpath = "//button[@aria-label='Edit']")
    private WebElement editIcon;
    @FindBy(id = "threeds2status")
    private WebElement tDSTwoStatusUpdateDropdown;
    String tDSTwoUpdateString = "//select[@id='threeds2status']/option[.='";
    @FindBy(xpath = "//div/button[.=' Update Issuer ']")
    private WebElement updateIssuerButton;
    @FindBy(xpath = "//div[@class='alert alert-success']")
    private WebElement updateAlertMessage;
    @FindBy(xpath = "//button[.='Back to Issuers']")
    private WebElement backToIssuersButton;


    public TDSIssuersPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
        this.actions = new Actions(driver);
    }

    public void clickOnBackToIssuersButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", backToIssuersButton);
        smartWait(400);
        this.backToIssuersButton.click();
        smartWait(1000);
    }
    public String getIssuerUpdateAlertMessage() {
        return this.updateAlertMessage.getText();
    }
    public void clickOnUpdateIssuerButton() {
        smartWait(400);
        WebElement element = driver.findElement(By.xpath("//div/button[contains(text(), 'Update Issuer')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
//        element.click();
//        this.updateIssuerButton.click();
        smartWait(2000);
    }
    public void selectTDSTwoStatusUpdate(String tDSTwoStatus) {
        this.tDSTwoStatusUpdateDropdown.click();
        smartWait(1000);
        driver.findElement(By.xpath(tDSTwoUpdateString + "" + tDSTwoStatus + "']")).click();
        smartWait(2000);
    }
    public void clickOnEditIssuerIcon() {
        this.editIcon.click();
        smartWait(1000);
    }
    public String getReturnedAcsRefNum() {
        return this.returnedACSRefNum.getText();
    }
    public String getReturnedTDSTwoStatus() {
        return this.returnedTDSTwoStatus.getText();
    }
    public String getReturnedTDSOneStatus() {
        return this.returnedTDSOneStatus.getText();
    }
    public String getReturnedDSIssuerName() {
        return this.returnedDSIssuerName.getText();
    }
    public void clickOnSearchButton() {
        this.searchButton.click();
        smartWait(1000);
    }
    public void setIssuerNameFilter(String nameFilter) {
        this.issuerNameFilter.clear();
        this.issuerNameFilter.sendKeys(nameFilter);
    }
    public void clickOnAddOrSaveIssuerButton() {
        this.addOrSaveIssuerButton.click();
        smartWait(1000);
    }
    public void selectACSCertifiedSolution(String acsCertSolution) {
        this.acsCertifiedSolutionDropdown.click();
        smartWait(400);
        driver.findElement(By.xpath(acsCertifiedSolutionString + "" + acsCertSolution + "']")).click();

    }
    public void selectTDSTwoStatus(String tDSTwoStatus) {
        smartWait(2000);
        this.tDSTwoStatusDropdown.click();
        smartWait(1000);
        driver.findElement(By.xpath(tDSTwoString + "" + tDSTwoStatus + "']")).click();
//        smartWait(1000);
    }
    public void selectTDSOneStatus(String tDSOneStatus) {
        this.tDSOneStatusDropdown.click();
        smartWait(1000);
        driver.findElement(By.xpath(tDSOneString + "" + tDSOneStatus + "']")).click();
//        smartWait(1000);
    }
    public void setIssuerContact(String contact) {
        this.issuerContact.clear();
        this.issuerContact.sendKeys(contact);
    }
    public void setIssuerName(String name) {
        this.issuerName.clear();
        this.issuerName.sendKeys(name);
    }
    public void clickOnAddIssuerButton() {
        this.addIssuerButton.click();
        smartWait(1000);
    }

    public void smartWait(int milliSec) {
        try {
            Thread.sleep(milliSec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
