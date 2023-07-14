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

public class ACSTransactionStatusSettingsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    @FindBy(xpath = "//span/a[.='Transaction status settings']")
    private WebElement transactionStatusSettingsMenu;
    // objects used to add transaction status settings
    @FindBy(xpath = "//button[@id='transactionStatusSettingForm:addTransactionStatusSettingButton']/span[.='Add']")
    private WebElement addButton;
    @FindBy(xpath = "//div[@id='addTransactionStatusSettingForm:transactionStatusSettingEventTypeInput']")
    private WebElement eventTypeDropdown;
    String eventTypeString = "//ul[@id='addTransactionStatusSettingForm:transactionStatusSettingEventTypeInput_items']/li[.='";
    @FindBy(xpath = "//td/input[@id='addTransactionStatusSettingForm:transactionStatusSettingModifierInput']")
    private WebElement modifier;
    @FindBy(xpath = "//div[@id='addTransactionStatusSettingForm:transactionStatusSettingNetworkInput']")
    private WebElement networkDropdown;
    String networkString = "//ul[@id='addTransactionStatusSettingForm:transactionStatusSettingNetworkInput_items']/li[.='";
    @FindBy(xpath = "//div[@id='addTransactionStatusSettingForm:transactionStatusSettingProtocolVersionInput']")
    private WebElement protocolVersionDropdown;
    String protocolVersionString = "//ul[@id='addTransactionStatusSettingForm:transactionStatusSettingProtocolVersionInput_items']/li[.='";
    @FindBy(xpath = "//div[@id='addTransactionStatusSettingForm:transactionStatusSettingTransStatusReason']")
    private WebElement transactionStatusReasonDropdown;
    String transactionStatusReasonString = "//ul[@id='addTransactionStatusSettingForm:transactionStatusSettingTransStatusReason_items']/li[.='";
    @FindBy(xpath = "//button[@id='addTransactionStatusSettingForm:addTransactionStatusSettingAddButton']/span[.='Add']")
    private WebElement addOrSaveButton;
    // objects used to search transaction status settings
    @FindBy(xpath = "//div[@id='transactionStatusSettingFilterForm:transactionStatusSettingEventTypeFilter']")
    private WebElement eventTypeFilterDropdown;
    String eventTypeFilterString = "//ul[@id='transactionStatusSettingFilterForm:transactionStatusSettingEventTypeFilter_items']/li[.='";
    @FindBy(xpath = "//button/span[.='Search']")
    private WebElement searchButton;
    @FindBy(xpath = "//tbody[@id='transactionStatusSettingForm:transactionStatusSettingTable_data']/tr[1]/td[1]")
    private WebElement returnedEvenType;
    // objects used to edit transaction status settings
    @FindBy(xpath = "//tbody[@id='transactionStatusSettingForm:transactionStatusSettingTable_data']/tr[1]")
    private WebElement returnedTransactionStatusSettingsRow;
    @FindBy(xpath = "//button/span[.='Edit']")
    private WebElement editButton;
    @FindBy(xpath = "//tbody[@id='transactionStatusSettingForm:transactionStatusSettingTable_data']/tr[1]/td[6]")
    private WebElement returnedTransactionStatusReason;
    @FindBy(xpath = "//button[@id='addTransactionStatusSettingForm:addTransactionStatusSettingEditButton']/span[.='Save']")
    private WebElement saveUpdateButton;
    // objects used to delete transaction status settings
    @FindBy(xpath = "//button/span[.='Delete']")
    private WebElement deleteButton;
    @FindBy(xpath = "//button/span[.='Yes']")
    private WebElement yesButtonToConfirmDeletion;
    @FindBy(xpath = "//tbody[@id='transactionStatusSettingForm:transactionStatusSettingTable_data']/tr/td")
    private WebElement returnedNoRecordsFound;


    public ACSTransactionStatusSettingsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
        this.actions = new Actions(driver);
    }

    public String getNoRecordsFound() {
        return this.returnedNoRecordsFound.getText();
    }
    public void clickOnYesButtonToConfirmDeletionOfTransactionStatusSettings() {
        this.yesButtonToConfirmDeletion.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnDeleteButton() {
        this.deleteButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnSaveUpdateButton() {
        this.saveUpdateButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String getReturnedTransactionStatusReason() {
        return this.returnedTransactionStatusReason.getText();
    }
    public void clickOnEditButton() {
        this.editButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnReturnedTransactionStatusSettingsRow() {
        this.returnedTransactionStatusSettingsRow.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String getReturnedEventType() {
        return this.returnedEvenType.getText();
    }
    public void clickOnSearchButton() {
        this.searchButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void selectEventTypeFilter(String eventTypeFilter) {
        this.eventTypeFilterDropdown.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(eventTypeFilterString + "" + eventTypeFilter + "']")).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnAddOrSaveButton() {
        this.addOrSaveButton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void selectTransactionStatusReason(String transactionStatusReason) {
        this.transactionStatusReasonDropdown.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(transactionStatusReasonString + "" + transactionStatusReason + "']")).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void selectProtocolVersion(String protocolVersion) {
        this.protocolVersionDropdown.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(protocolVersionString + "" + protocolVersion + "']")).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void selectNetwork(String network) {
        this.networkDropdown.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(networkString + "" + network + "']")).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setModifier(String modifierName) {
        this.modifier.sendKeys(modifierName);
    }
    public void selectEventType(String eventType) {
        this.eventTypeDropdown.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(eventTypeString + "" + eventType + "']")).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnAddTransactionStatusSettingsButton() {
        this.addButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnTransactionStatusSettingsMenu() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", transactionStatusSettingsMenu);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.transactionStatusSettingsMenu.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
