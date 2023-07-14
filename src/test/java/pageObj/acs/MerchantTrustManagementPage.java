package pageObj.acs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MerchantTrustManagementPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(xpath = "//span/a[.='Merchant trust']")
    private WebElement merchantTrustMenu;
    @FindBy(xpath = "//button/span[.='Add']")
    private WebElement addButton;

    @FindBy(xpath = "//input[@id='addWhitelistRecordForm:panInput']")
    private WebElement pan;
    @FindBy(xpath = "//input[@id='addWhitelistRecordForm:cardholderInput']")
    private WebElement cardHolder;
    @FindBy(xpath = "//input[@id='addWhitelistRecordForm:merchantInput']")
    private WebElement merchant;
    @FindBy(xpath = "//button/span[.='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//input[@id='whitelistingFilterForm:panFilter']")
    private WebElement panFilter;
    @FindBy(xpath = "//tbody//td/input[@id='whitelistingFilterForm:cardholderFilter']")
    private WebElement cardHolderFilter;
    @FindBy(xpath = "//input[@id='whitelistingFilterForm:merchantFilter']")
    private WebElement merchantFilter;
    @FindBy(xpath = "//button/span[.='Search']")
    private WebElement searchButton;
    @FindBy(xpath = "//tbody[@id='whitelistRecordsForm:whitelistRecordsTable_data']/tr/td[4]")
    private WebElement returnedMerchantTrustCardHolder;
    @FindBy(xpath = "//tbody[@id='whitelistRecordsForm:whitelistRecordsTable_data']/tr")
    private WebElement returnedMerchantTrust;
    @FindBy(xpath = "//button/span[.='Edit']")
    private WebElement editButton;
    @FindBy(xpath = "//table[@id='addWhitelistRecordForm:addWhitelistRecordGrid']//input[@id='addWhitelistRecordForm:cardholderInput']")
    private WebElement cardHolderUpdate;
    @FindBy(xpath = "//button/span[.='Save']")
    private WebElement saveUpdateButton;
    @FindBy(xpath = "//button/span[.='Delete']")
    private WebElement deleteButton;
    @FindBy(xpath = "//button/span[.='Yes']")
    private WebElement confirmDeletionButton;
    @FindBy(xpath = "//tbody[@id='whitelistRecordsForm:whitelistRecordsTable_data']/tr/td")
    private WebElement noRecordRow;

    public MerchantTrustManagementPage(WebDriver driver) {
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void clickOnMerchantTrustMenu() {
        this.merchantTrustMenu.click();
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
    public void setPAN(String pan) {
        this.pan.clear();
        this.pan.sendKeys(pan);
    }
    public void setCardHolder(String cardHolder) {
        this.cardHolder.clear();
        this.cardHolder.sendKeys(cardHolder);
    }
    public void setMerchant(String merchant) {
        this.merchant.clear();
        this.merchant.sendKeys(merchant);
    }
    public void clickOnSaveButton() {
        this.saveButton.click();
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setCardHolderFilter(String cardHolder) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.cardHolderFilter.clear();
        this.cardHolderFilter.sendKeys(cardHolder);
    }

    public void clickOnSearchButton() {
        this.searchButton.click();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String returnedMerchantTrustViaCardHolder() {
        return this.returnedMerchantTrustCardHolder.getText();
    }
    public void clickOnReturnedMerchantTrust() {
        this.returnedMerchantTrust.click();
        try {
            Thread.sleep(500);
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

    public void clearAndSetCardHolderUpdate(String updatedCardHolder) {
        this.cardHolderUpdate.clear();
        this.cardHolderUpdate.sendKeys(updatedCardHolder);
    }

    public void clickOnSaveUpdateButton() {
        this.saveUpdateButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnDeleteButton() {
        this.deleteButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnConfirmDeletionButton() {
        this.confirmDeletionButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String returnNoRecord() {
        return this.noRecordRow.getText();
    }

}
