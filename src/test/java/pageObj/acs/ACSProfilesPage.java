package pageObj.acs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ACSProfilesPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(xpath = "//span/a[.='Profiles']")
    private WebElement profilesMenu;
    @FindBy(xpath = "//button/span[.='Add']")
    private WebElement addButton;
    @FindBy(xpath = "//td/input[@name='addProfileForm:nameInput']")
    private WebElement profileName;
    @FindBy(xpath = "//button[@id='addProfileForm:j_idt156']/span[.='Add']")
    private WebElement addRangeButton;
    @FindBy(xpath = "//div[@id='addProfileForm:profileRangesTable:0:j_idt152']/a/span[@class='ui-icon ui-icon-pencil']")
    private WebElement editIcon;
    @FindBy(xpath = "//div/input[@name='addProfileForm:profileRangesTable:0:j_idt140']")
    private WebElement fromRange;
    @FindBy(xpath = "//div/input[@name='addProfileForm:profileRangesTable:0:j_idt144']")
    private WebElement toRange;
    @FindBy(xpath = "//div[@id='addProfileForm:profileRangesTable:0:j_idt149']//span[@class='ui-chkbox-icon ui-icon ui-icon-blank ui-c']")
    private WebElement corporateCheckbox;
    @FindBy(xpath = "//div[@id='addProfileForm:profileRangesTable:0:j_idt152']/a/span[@class='ui-icon ui-icon-check ui-c']")
    private WebElement saveRangeIcon;
    @FindBy(xpath = "//button/span[.='Save']")
    private WebElement saveProfileButton;

    @FindBy(xpath = "//td/input[@id='profilesFilterForm:profileNameFilter']")
    private WebElement profileNameFilter;
    @FindBy(xpath = "//button/span[.='Search']")
    private WebElement searchProfileButton;
    @FindBy(xpath = "//tbody[@id='profilesForm:profilesTable_data']/tr/td[1]")
    private WebElement returnedProfileName;
    @FindBy(xpath = "//tbody[@id='profilesForm:profilesTable_data']/tr[1]")
    private WebElement returnedProfileRow;
    @FindBy(xpath = "//button/span[.='Edit']")
    private WebElement editProfileButton;

    public ACSProfilesPage(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }
    public void clickOnProfilesMenu() {
        this.profilesMenu.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnAddButton() {
        this.addButton.click();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setProfileName(String name) {
        this.profileName.sendKeys(name);
    }
    public void clickOnAddRangeButton() {
        this.addRangeButton.click();
    }
    public void clickOnEditIcon() {
        this.editIcon.click();
    }
    public void setFromRange(String fromRange) {
        this.fromRange.clear();
        this.fromRange.sendKeys(fromRange);
    }
    public void setToRange(String toRange) {
        this.toRange.clear();
        this.toRange.sendKeys(toRange);
    }
    public void clickOnCorporateCheckbox() {
        this.corporateCheckbox.click();
    }
    public void clickOnSaveRangeIcon() {
        this.saveRangeIcon.click();
    }
    public void clickOnSaveProfileButton() {
        this.saveProfileButton.click();
    }
    public void setProfileNameFilter(String name) {
        this.profileNameFilter.sendKeys(name);
    }
    public void clickOnSearchProfileButton() {
        this.searchProfileButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String returnedProfileName() {
        return returnedProfileName.getText();
    }
    public void clickOnReturnedProfile() {
        this.returnedProfileRow.click();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnEditProfileButton() {
        this.editProfileButton.click();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
