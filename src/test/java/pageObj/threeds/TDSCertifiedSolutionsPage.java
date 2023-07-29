package pageObj.threeds;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TDSCertifiedSolutionsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    // objects used to search tdsServCertSolutions
    @FindBy(id = "tdsServCertSolutionRefNum")
    private WebElement tdsServCertSolRefNum;
    @FindBy(id = "acsStartProtocolVersion")
    private WebElement supportedProtocolVersionDropdown;
    @FindBy(id = "validOnly")
    private WebElement validOnlyCheckbox;
    @FindBy(id = "searchButton")
    private WebElement searchButton;
    @FindBy(xpath = "//tbody/tr/td[1]")
    private WebElement returnedRefNum;
    @FindBy(xpath = "//tbody/tr/td[4]")
    private WebElement returnedProtocolVersion;

    // objects used to add tdsServCertSolutions
    @FindBy(xpath = "//button/span[.='Add 3DS Server Certified Solution']")
    private WebElement addTDSServCertSolutionButton;
    @FindBy(id = "approvalDatetime")
    private WebElement approvalDate;
    @FindBy(id = "expireDatetime")
    private WebElement approvalExpiredDate;
    @FindBy(id = "referenceNumber")
    private WebElement refNumber;
    @FindBy(id = "startProtocolVersion")
    private WebElement startProtocolVersionDropdown;
    @FindBy(id = "endProtocolVersion")
    private WebElement endProtocolVersionDropdown;
    @FindBy(xpath = "//div/button[.='Save 3DS Server Solution']")
    private WebElement saveTDSServSolutionButton;

    // objects used to delete tdsServCertSolution
    @FindBy(xpath = "//button/i[@class='fa fa-trash-o fa-lg']")
    private WebElement deleteIcon;
    @FindBy(xpath = "//button[.='Yes']")
    private WebElement yesButtonToConfirmDeletion;
    @FindBy(xpath = "//div[@class='alert alert-success']")
    private WebElement tdsServCertSolDeletionAlertMessage;


    public TDSCertifiedSolutionsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
        this.actions = new Actions(driver);
    }

    public String getTDSServCertSolDeletionAlertMessage() {
        return this.tdsServCertSolDeletionAlertMessage.getText();
    }
    public void clickOnYesButtonToConfirmDeletion() {
        this.yesButtonToConfirmDeletion.click();
        smartWait(2000);
    }
    public void clickOnDeleteIcon() {
        this.deleteIcon.click();
        smartWait(2000);
    }
    public void clickOnSaveTDSServSolutionButton() {
        this.saveTDSServSolutionButton.click();
        smartWait(2000);
    }
    public void selectEndingProtocolVersion(String endPV) {
        this.endProtocolVersionDropdown.click();
        Select sel = new Select(endProtocolVersionDropdown);
        sel.selectByVisibleText(endPV);
    }
    public void selectStartingProtocolVersion(String startPV) {
        this.startProtocolVersionDropdown.click();
        Select sel = new Select(startProtocolVersionDropdown);
        sel.selectByVisibleText(startPV);
    }
    public void setRefNumber(String refNum) {
        this.refNumber.clear();
        this.refNumber.sendKeys(refNum);
    }
    public void setApprovalExpiredDate(String approvalED) {
        this.approvalExpiredDate.clear();
        this.approvalExpiredDate.sendKeys(approvalED);
    }
    public void setApprovalDate(String approvalD) {
        this.approvalDate.clear();
        this.approvalDate.sendKeys(approvalD);
    }
    public void clickOnAddTDSServerCertSolutionButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addTDSServCertSolutionButton);
        smartWait(2000);
        this.addTDSServCertSolutionButton.click();
        smartWait(2000);
    }
    public String getReturnedProtocolVersion() {
        return this.returnedProtocolVersion.getText();
    }
    public String getReturnedRefNum() {
        return this.returnedRefNum.getText();
    }
    public void clickOnSearchButton() {
        this.searchButton.click();
        smartWait(2000);
    }
    public void checkValidOnlyCheckbox() {
        this.validOnlyCheckbox.click();
    }
    public void selectSupportedProtocolVersion(String version) {
        this.supportedProtocolVersionDropdown.click();
        Select select = new Select(supportedProtocolVersionDropdown);
        select.selectByVisibleText(version);
    }
    public void setTdsServCertSolRefNum(String tdsServCertSolRefNumber) {
        this.tdsServCertSolRefNum.clear();
        this.tdsServCertSolRefNum.sendKeys(tdsServCertSolRefNumber);
    }

    public void smartWait(int milliSec) {
        try {
            Thread.sleep(milliSec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
