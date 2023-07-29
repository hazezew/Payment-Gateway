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

public class TDSACSCertifiedSolutionsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    // objects used to search tds acs certified solutions
    @FindBy(id = "tdsServCertSolutionRefNum")
    private WebElement acsRefNum;
    @FindBy(id = "acsStartProtocolVersion")
    private WebElement acsProtocolVersionDropdown;
    @FindBy(id = "validOnly")
    private WebElement validOnlyCheckbox;
    @FindBy(id = "searchButton")
    private WebElement searchButton;
    @FindBy(xpath = "//tbody/tr/td[1]")
    private WebElement returnedRefNum;
    @FindBy(xpath = "//tbody/tr/td[4]")
    private WebElement returnedPV;

    // objects used to add tds acs certified solutions
    @FindBy(xpath = "//button/span[.='Add ACS Certified Solution']")
    private WebElement addACSCertSolutionButton;
    @FindBy(id = "approvalDatetime")
    private WebElement approvalDateTime;
    @FindBy(id = "expireDatetime")
    private WebElement approvalExpiryDateTime;
    @FindBy(id = "referenceNumber")
    private WebElement referenceNumber;
    @FindBy(id = "startProtocolVersion")
    private WebElement startPVDropdown;
    @FindBy(id = "endProtocolVersion")
    private WebElement endPVDropdown;
    @FindBy(xpath = "//div/button[.='Save ACS Certified Solutions']")
    private WebElement saveACSCertSolutionButton;

    // objects used to delete tds acs certified solution
    @FindBy(xpath = "//button/i[@class='fa fa-trash-o fa-lg']")
    private WebElement deleteIcon;
    @FindBy(xpath = "//button[.='Yes']")
    private WebElement yesButtonToConfirmDeletion;
    @FindBy(xpath = "//div[@class='alert alert-success']")
    private WebElement deletionOfTDSAcsCertSolAlertMessage;


    public TDSACSCertifiedSolutionsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
        this.actions = new Actions(driver);
    }

    public String getReturnedAlertMessageAfterDeletion() {
        return this.deletionOfTDSAcsCertSolAlertMessage.getText();
    }
    public void clickOnYesButtonToConfirmDeletion() {
        this.yesButtonToConfirmDeletion.click();
        smartWait(1000);
    }
    public void clickOnDeleteIcon() {
        this.deleteIcon.click();
        smartWait(400);
    }
    public void clickOnSaveACSCertSolutionButton() {
        this.saveACSCertSolutionButton.click();
        smartWait(2000);
    }
    public void selectEndingProtocolVersion(String pv) {
        this.endPVDropdown.click();
        Select sel = new Select(endPVDropdown);
        sel.selectByVisibleText(pv);
    }
    public void selectStartingProtocolVersion(String pv) {
        this.startPVDropdown.click();
        Select sel = new Select(startPVDropdown);
        sel.selectByVisibleText(pv);
    }
    public void setReferenceNumber(String refNum) {
        this.referenceNumber.clear();
        this.referenceNumber.sendKeys(refNum);
    }
    public void setApprovalExpiryDateTime(String approvalExpiryDT) {
        this.approvalExpiryDateTime.clear();
        this.approvalExpiryDateTime.sendKeys(approvalExpiryDT);
    }
    public void setApprovalDateTime(String approvalDT) {
        this.approvalDateTime.clear();
        this.approvalDateTime.sendKeys(approvalDT);
    }
    public void clickOnAddTDSCertSolutionButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addACSCertSolutionButton);
        this.addACSCertSolutionButton.click();
        smartWait(2000);
    }
    public String getReturnedPV() {
        return this.returnedPV.getText();
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
    public void selectACSProtocolVersion(String protocolVersion) {
        this.acsProtocolVersionDropdown.click();
        Select sel = new Select(acsProtocolVersionDropdown);
        sel.selectByVisibleText(protocolVersion);
    }
    public void setAcsRefNum(String refNum) {
        this.acsRefNum.clear();
        this.acsRefNum.sendKeys(refNum);
    }
    public void smartWait(int milliSec) {
        try {
            Thread.sleep(milliSec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
