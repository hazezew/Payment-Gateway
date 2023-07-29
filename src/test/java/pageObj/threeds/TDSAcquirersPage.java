package pageObj.threeds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TDSAcquirersPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    // objects to add acquirer
    @FindBy(xpath = "//div/button[.='Add']")
    private WebElement addButton;
    @FindBy(id = "acquirerBin")
    private WebElement acquirerBin;
    @FindBy(id = "acquirerName")
    private WebElement acquirerName;
    @FindBy(id = "tdsServCertSolutionId")
    private WebElement serverCertSolutionDropdown;
    String serverCertSolutionString = "//select/option[.='";
    @FindBy(id = "threeDSServerOperatorID")
    private WebElement serverOperatorId;
    @FindBy(xpath = "//button[.=' Add Acquirer ']")
    private WebElement addAcquirerButton;
    @FindBy(xpath = "//tbody/tr[1]/th")
    private WebElement newlyAddedAcquirerBin;
    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    private WebElement newlyAddedAcquirerName;

    // objects used to search tDS acquirer
    @FindBy(xpath = "//div/input[@placeholder='Search by BIN']")
    private WebElement tDSAcquirerBinFilter;
    @FindBy(xpath = "//div/button[.=' Search ']")
    private WebElement searchButton;

    // objects used to edit tDS acquirer
    @FindBy(xpath = "//button/i[@class='fa fa-pencil fa-lg']")
    private WebElement editIcon;
    @FindBy(xpath = "//button[.=' Update Acquirer ']")
    private WebElement updateAcquirerButton;
    @FindBy(xpath = "//div[@class='alert alert-success']")
    private WebElement updateOrDeleteAcquirerAlertMessage;

    // objects used to delete tDS acquirer
    @FindBy(xpath = "//button[@aria-label='Delete']")
    private WebElement deleteAcquirerIcon;
    @FindBy(xpath = "//button[.='Yes']")
    private WebElement yesButtonToConfirmDeletion;

    public TDSAcquirersPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
        this.actions = new Actions(driver);
    }

    public void clickOnYesButtonToConfirmDeletionOfTDSAcquirer() {
        this.yesButtonToConfirmDeletion.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnDeleteAcquirerButton() {
        this.deleteAcquirerIcon.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String getDeleteAcquirerAlertMessage(String text1, int acquirerBin, String text2) {
        String returnedAlertMessage = text1 + " " + acquirerBin + " " + text2;
        return returnedAlertMessage;
    }
    public String getUpdateAcquirerAlertMessage() {
        return this.updateOrDeleteAcquirerAlertMessage.getText();
    }
    public void clickOnUpdateAcquirerButton() {
        this.updateAcquirerButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnEditIcon() {
        this.editIcon.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnSearchButton() {
        this.searchButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void settDSAcquirerBinFilter(String tDSAcquirerBin) {
        this.tDSAcquirerBinFilter.clear();
        this.tDSAcquirerBinFilter.sendKeys(tDSAcquirerBin);
    }
    public String getNewlyAddedAcquirerName() {
        return this.newlyAddedAcquirerName.getText();
    }
    public String getNewlyAddedAcquirerBin() {
        return this.newlyAddedAcquirerBin.getText();
    }
    public void clickOnAddAcquirerButton() {
        this.addAcquirerButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setServerOperatorId(String servOperatorId) {
        this.serverOperatorId.clear();
        this.serverOperatorId.sendKeys(servOperatorId);
    }
    public void selectServerCertSolution(String serverCertSolution) {
        this.serverCertSolutionDropdown.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(serverCertSolutionString + "" + serverCertSolution + "']")).click();
    }
    public void setAcquirerName(String name) {
        this.acquirerName.clear();
        this.acquirerName.sendKeys(name);
    }
    public void setAcquirerBin(String acquirerBin) {
        this.acquirerBin.clear();
        this.acquirerBin.sendKeys(acquirerBin);
    }
    public void clickOnAcquirersMenu() {
        this.addButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
