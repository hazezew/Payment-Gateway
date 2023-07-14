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

public class ACSArchivingPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    // objects used to add archiving data
    @FindBy(xpath = "//span/a[.='Archiving']")
    private WebElement archivingMenu;
    @FindBy(xpath = "//button/span[.='Archive data']")
    private WebElement archiveDataButton;
    @FindBy(xpath = "//td/div[@id='archiveDataForm:archiveDataEntity']")
    private WebElement archiveDataTypeDropdown;
    String archiveDataTypeString = "//ul[@id='archiveDataForm:archiveDataEntity_items']/li[.='";
    @FindBy(xpath = "//span[@id='archiveDataForm:startDatetimeInput']/button/span[@class='ui-button-icon-left ui-icon ui-icon-calendar']")
    private WebElement startDateTimePicker;
    @FindBy(xpath = "//div/a/span[.='Previous']")
    private WebElement previousIcon;
    @FindBy(xpath = "//span[@id='archiveDataForm:endDatetimeInput']/button/span[@class='ui-button-icon-left ui-icon ui-icon-calendar']")
    private WebElement endDateTimePicker;
    @FindBy(xpath = "//tr/td/a[.='10']")
    private WebElement tenthDate;
    @FindBy(xpath = "//div/button[.='Close']")
    private WebElement closeDatePickerButton;
    @FindBy(xpath = "//td/input[@id='archiveDataForm:archiveDataCleanMainTables']")
    private WebElement cleanMainTablesCheckbox;
    @FindBy(xpath = "//button/span[.='Save']")
    private WebElement saveButton;
    // objects used to search archived data
    @FindBy(xpath = "//td/div[@id='archivingFilterForm:archiveEntityFilter']")
    private WebElement archiveEntityFilterDropdown;
    String archiveDataTypeFilterString = "//ul[@id='archivingFilterForm:archiveEntityFilter_items']/li[.='";
    @FindBy(xpath = "//span[@id='archivingFilterForm:dateFromFilter']/button/span[@class='ui-button-icon-left ui-icon ui-icon-calendar']")
    private WebElement creationDateFromDatePicker;
    @FindBy(xpath = "//span[@id='archivingFilterForm:dateToFilter']/button/span[@class='ui-button-icon-left ui-icon ui-icon-calendar']")
    private WebElement creationDateToDatePicker;
    String dateString = "//td/a[.='";
    @FindBy(xpath = "//button/span[.='Search']")
    private WebElement searchButton;
    @FindBy(xpath = "//tbody[@id='archivingForm:archivingTable_data']/tr[1]/td[2]")
    private WebElement returnedArchivingEntityField;
    // objects used to restore archived data
    @FindBy(xpath = "//button/span[.='Restore archived data']")
    private WebElement restoreArchivedDataButton;
    @FindBy(xpath = "//button/span[.='Yes']")
    private WebElement yesButtonToConfirmRestoration;
    @FindBy(xpath = "//tbody[@id='archivingForm:archivingTable_data']/tr[1]/td[6]")
    private WebElement returnedArchivedDataStatus;
    @FindBy(xpath = "//tbody[@id='archivingForm:archivingTable_data']/tr[1]")
    private WebElement returnedArchivedDataRow;
    // objects used to clean main tables data
    @FindBy(xpath = "//button/span[.='Clean main tables data']")
    private WebElement cleanMainTablesDataButton;
    @FindBy(xpath = "//button/span[.='Yes']")
    private WebElement yesButtonToConfirmCleaningOfMainTablesData;
    @FindBy(xpath = "//tbody[@id='archivingForm:archivingTable_data']/tr[1]/td[7]")
    private WebElement returnedArchivedDataLatestAction;
    // objects used to drop archived data
    @FindBy(xpath = "//button/span[.='Drop archived data']")
    private WebElement dropArchivedDataButton;
    @FindBy(xpath = "//button/span[.='Yes']")
    private WebElement yesButtonToConfirmDroppingOfArchivedData;
    // objects used to delete archive record and history
    @FindBy(xpath = "//button/span[.='Delete archive record & history']")
    private WebElement deleteArchiveRecordAndHistory;
    @FindBy(xpath = "//button/span[.='Yes']")
    private WebElement yesButtonToConfirmDeletion;
    @FindBy(xpath = "//tbody[@id='archivingForm:archivingTable_data']/tr/td")
    private WebElement returnNoRecordsFound;

    public ACSArchivingPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
        this.actions = new Actions(driver);
    }

    public void clickOnArchivingMenu() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", archivingMenu);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.archivingMenu.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnArchiveDataButton() {
        this.archiveDataButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setArchivedDataType(String archiveDataType) {
        this.archiveDataTypeDropdown.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(archiveDataTypeString + "" + archiveDataType + "']")).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setStartingDateTime() {
        this.startDateTimePicker.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 1 year back
        for(int i = 0; i < 12; i++) {
            this.previousIcon.click();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.tenthDate.click();
        this.closeDatePickerButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setEndingDateTime() {
        this.endDateTimePicker.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 1 year back
        for(int i = 0; i < 12; i++) {
            this.previousIcon.click();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.tenthDate.click();
        this.closeDatePickerButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void checkCleanMainTablesCheckbox() {
        this.cleanMainTablesCheckbox.click();
    }
    public void clickOnSaveButton() {
        this.saveButton.click();
    }

    public void selectArchivingEntityFilter(String archiveEntityFilter) {
        this.archiveEntityFilterDropdown.click();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(archiveDataTypeFilterString + "" + archiveEntityFilter + "']")).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void selectStartingDateTimeFilter(int startDate) {
        this.creationDateFromDatePicker.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(dateString + "" + startDate + "']")).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.closeDatePickerButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void selectEndingDateTimeFilter(int endDate) {
        this.creationDateToDatePicker.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(dateString + "" + endDate + "']")).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.closeDatePickerButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnSearchButton() {
        this.searchButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String getReturnedArchivingEntity() {
        return this.returnedArchivingEntityField.getText();
    }
    public void clickOnReturnedArchivedDataRow() {
        this.returnedArchivedDataRow.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnRestoreArchivedDataButton() {
        this.restoreArchivedDataButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnYesButtonToConfirmRestoration() {
        this.yesButtonToConfirmRestoration.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String getReturnedArchivedDataStatus() {
        return this.returnedArchivedDataStatus.getText();
    }
    public void clickOnCleanMainTablesDataButton() {
        this.cleanMainTablesDataButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnYesButtonToConfirmCleaningOfMainTablesData() {
        this.yesButtonToConfirmCleaningOfMainTablesData.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String getLatestActionOfArchivedData() {
        return this.returnedArchivedDataLatestAction.getText();
    }
    public void clickOnDropArchivedDataButton() {
        this.dropArchivedDataButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnYesButtonToConfirmDroppingOfArchivedData() {
        this.yesButtonToConfirmDroppingOfArchivedData.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnDeleteArchiveRecordAndHistoryButton() {
        this.deleteArchiveRecordAndHistory.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnYesButtonToConfirmDeletionOfArchivedRecordAndHistory() {
        this.yesButtonToConfirmDeletion.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String getNoRecordsFound() {
        return this.returnNoRecordsFound.getText();
    }
}
