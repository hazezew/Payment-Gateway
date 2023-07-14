package pageObj.acs;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ACSPerformersPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(xpath = "//span/a[.='Performers']")
    private WebElement performersMenu;
    // add performers
    @FindBy(xpath = "//button/span[.='Add']")
    private WebElement addButton;
    @FindBy(xpath = "//td/input[@id='addPerformerForm:nameInput']")
    private WebElement performersName;
    @FindBy(xpath = "//td/input[@id='addPerformerForm:urlInput']")
    private WebElement url;
    @FindBy(xpath = "//td/input[@id='addPerformerForm:timeoutInput']")
    private WebElement timeout;
    @FindBy(xpath = "//button/span[.='Save']")
    private WebElement saveButton;
    // search performers
    @FindBy(xpath = "//td/input[@id='performersFilterForm:performerNameFilter']")
    private WebElement performerNameFilter;
    @FindBy(xpath = "//button/span[.='Search']")
    private WebElement searchButton;
    @FindBy(xpath = "//tbody[@id='performersForm:performersTable_data']/tr/td[2]")
    private WebElement returnedPerformerName;
    // edit performers
    @FindBy(xpath = "//tbody[@id='performersForm:performersTable_data']/tr")
    private WebElement returnedPerformerRow;
    @FindBy(xpath = "//button/span[.='Edit']")
    private WebElement editButton;
    @FindBy(xpath = "//div[@id='addPerformerForm:protocolInput']")
    private WebElement protocolTypeDropdown;
    String protocolTypeString = "//div/ul/li[.='";
    // delete performers
    @FindBy(xpath = "//button/span[.='Delete']")
    private WebElement deleteButton;
    @FindBy(xpath = "//button/span[.='Yes']")
    private WebElement yesButtonToConfirmDeletion;


    public ACSPerformersPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
        this.action = new Actions(driver);
    }

    public void clickOnPerformersMenu() {
        this.performersMenu.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnAddButton() {
        this.addButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setPerformersName(String name) {
        this.performersName.clear();
        this.performersName.sendKeys(name);
    }
    public void setUrl(String url) {
        this.url.clear();
        this.url.sendKeys(url);
    }
    public void setTimeout(int timeout) {
        this.timeout.clear();
        this.timeout.sendKeys(Integer.toString(timeout));
    }
    public void clickOnSaveButton() {
        this.saveButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setPerformerNameFilter(String nameFilter) {
        this.performerNameFilter.clear();
        this.performerNameFilter.sendKeys(nameFilter);
    }
    public void clickOnSearchButton() {
        this.searchButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String getReturnedPerformerName() {
        return this.returnedPerformerName.getText();
    }
    public void clickOnReturnedPerformerRow() {
        this.returnedPerformerRow.click();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnEditButton() {
        this.editButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setPerformerProtocolType(String protocolType) {
        this.protocolTypeDropdown.click();
        this.driver.findElement(By.xpath(this.protocolTypeString+""+protocolType+"']")).click();
    }
    public void clickOnDeleteButton() {
        this.deleteButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnYesButtonToConfirmDeletion() {
        this.yesButtonToConfirmDeletion.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String getNoRecordsFound() {
        return this.returnedPerformerRow.getText();
    }
}
