package pageObj.acs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ACSAuditPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    @FindBy(xpath = "//span/a[.='Audit']")
    private WebElement auditMenu;
    @FindBy(xpath = "//span[@id='auditFilterForm:startDateFromFilter']//button[@aria-label='Show Calendar']")
    private WebElement startDateFromDatePicker;
    @FindBy(xpath = "//a/span[.='Previous']")
    private WebElement previousIcon;
    @FindBy(xpath = "//td/a[.='1']")
    private WebElement firstDate;
    @FindBy(xpath = "//span[@id='auditFilterForm:startDateToFilter']//button[@aria-label='Show Calendar']")
    private WebElement endDateToDatePicker;
    @FindBy(xpath = "//td/a[.='30']")
    private WebElement finalDate;
    @FindBy(xpath = "//td/div[@id='auditFilterForm:eventTypeFilter']")
    private WebElement eventTypeDropdown;
    String eventTypeString = "//ul[@id='auditFilterForm:eventTypeFilter_items']/li[.='";
    @FindBy(xpath = "//td/div[@id='auditFilterForm:objectTypeFilter']")
    private WebElement objectTypeDropdown;
    String objectTypeString = "//ul[@id='auditFilterForm:objectTypeFilter_items']/li[.='";
    @FindBy(xpath = "//button/span[.='Search']")
    private WebElement searchButton;
    @FindBy(xpath = "//tbody[@id='auditForm:auditTable_data']/tr[1]/td[3]")
    private WebElement returnedEventType;

    public ACSAuditPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
        this.actions = new Actions(driver);
    }

    public String getReturnedEventType() {
        return this.returnedEventType.getText();
    }
    public void clickOnSearchButton() {
        this.searchButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setObjectType(String objectType) {
        this.objectTypeDropdown.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(objectTypeString + "" + objectType + "']")).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setEventType(String eventType) {
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
    public void selectEndDate() {
        this.endDateToDatePicker.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.previousIcon.click();
        this.finalDate.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void selectStartDate() {
        this.startDateFromDatePicker.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 12; i++) {
            this.previousIcon.click();
        }
        this.firstDate.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnAuditMenu() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", auditMenu);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.auditMenu.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
