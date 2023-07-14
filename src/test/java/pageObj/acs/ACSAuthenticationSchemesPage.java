package pageObj.acs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ACSAuthenticationSchemesPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(xpath = "//span/a[.='Authentication Schemes']")
    private WebElement authenticationSchemesMenu;
    @FindBy(xpath = "//button/span[.='Add']")
    private WebElement addButton;
    @FindBy(xpath = "//td/input[@id='addSchemeForm:nameInput']")
    private WebElement authenticationSchemeName;
    @FindBy(xpath = "//button[@id='addSchemeForm:j_idt152']/span[.='Add']")
    private WebElement addPrimaryButton;
    @FindBy(xpath = "//div[@id='addSchemeForm:schemeAuthMethodsTable_primary:0:j_idt165']/a/span[@class='ui-icon ui-icon-pencil ui-sortable-handle']")
    private WebElement editPrimaryIcon;
    @FindBy(xpath = "//div[@id='addSchemeForm:schemeAuthMethodsTable_primary:0:j_idt165']/a/span[@class='ui-icon ui-icon-check ui-c']")
    private WebElement savePrimaryIcon;
    @FindBy(xpath = "//button[@id='addSchemeForm:j_idt170']/span[.='Add']")
    private WebElement addFallbackButton;
    @FindBy(xpath = "//div[@id='addSchemeForm:schemeAuthMethodsTable_fallback:0:j_idt183']/a/span[@class='ui-icon ui-icon-pencil ui-sortable-handle']")
    private WebElement editFallbackIcon;
    @FindBy(xpath = "//div[@id='addSchemeForm:schemeAuthMethodsTable_fallback:0:j_idt176']")
    private WebElement fallbackDropdown;
    @FindBy(xpath = "//div[@id='addSchemeForm:schemeAuthMethodsTable_primary:0:j_idt158']")
    private WebElement primaryDropdown;
    @FindBy(xpath = "//div/ul[@id='addSchemeForm:schemeAuthMethodsTable_fallback:0:j_idt176_items']/li[2]")
    private WebElement secondFallback;
    @FindBy(xpath = "//div/ul[@id='addSchemeForm:schemeAuthMethodsTable_primary:0:j_idt158_items']/li[4]")
    private WebElement fourthPrimary;
    @FindBy(xpath = "//div[@id='addSchemeForm:schemeAuthMethodsTable_fallback:0:j_idt183']/a/span[@class='ui-icon ui-icon-check ui-c']")
    private WebElement saveFallbackIcon;
    @FindBy(xpath = "//button[@id='addSchemeForm:saveSchemeButton']/span[.='Save']")
    private WebElement saveAuthenticationSchemeButton;

    @FindBy(xpath = "//td/input[@id='schemesFilterForm:schemeNameFilter']")
    private WebElement authenticationSchemeNameFilter;
    @FindBy(xpath = "//button/span[.='Search']")
    private WebElement searchButton;
    @FindBy(xpath = "//tbody[@id='schemesForm:schemesTable_data']/tr/td[2]")
    private WebElement returnedAuthenticationSchemeName;
    @FindBy(xpath = "//tbody[@id='schemesForm:schemesTable_data']/tr")
    private WebElement returnedAuthenticationScheme;
    @FindBy(xpath = "//button/span[.='Edit']")
    private WebElement editButton;
    @FindBy(xpath = "//button[@id='schemesForm:deleteSchemeButton']/span[.='Delete']")
    private WebElement deleteButton;
    @FindBy(xpath = "//button/span[.='Yes']")
    private WebElement yesConfirmDeleteButton;
    @FindBy(xpath = "//tbody[@id='schemesForm:schemesTable_data']/tr/td")
    private WebElement noResultsRow;


    public ACSAuthenticationSchemesPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
        action = new Actions(driver);
    }

    public void clickOnAuthenticationSchemes() {
        this.authenticationSchemesMenu.click();
    }
    public void clickOnAddButton() {
        this.addButton.click();
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setAuthenticationSchemeName(String name) {
        this.authenticationSchemeName.clear();
        this.authenticationSchemeName.sendKeys(name);
    }
    public void clickOnAddPrimaryButton() {
        this.addPrimaryButton.click();
    }
    public void clickOnEditPrimaryIcon() {
        this.editPrimaryIcon.click();
    }
    public void clickOnSavePrimaryIcon() {
        this.savePrimaryIcon.click();
    }
    public void clickOnAddFallbackButton() {
        this.addFallbackButton.click();
    }
    public void clickOnEditFallbackIcon() {
        this.editFallbackIcon.click();
    }
    public void clickOnFallbackDropdown() {
        this.fallbackDropdown.click();
    }
    public void selectTheSecondFallback() {
        this.secondFallback.click();
    }
    public void clickOnSaveFallbackIcon() {
        this.saveFallbackIcon.click();
    }
    public void clickOnSaveAuthenticationScheme() {
        this.saveAuthenticationSchemeButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setAuthenticationSchemeNameFilter(String name) {
        this.authenticationSchemeNameFilter.clear();
        this.authenticationSchemeNameFilter.sendKeys(name);
    }
    public void clickOnSearchButton() {
        this.searchButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String getAuthenticationSchemeName() {
        return this.returnedAuthenticationSchemeName.getText();
    }

    public void clickOnReturnedAuthenticationScheme() {
        this.returnedAuthenticationScheme.click();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnEditButton() {
        this.editButton.click();
    }
    public void clickOnPrimaryDropdown() {
        this.primaryDropdown.click();
    }
    public void selectTheFourthPrimary() {
        this.fourthPrimary.click();
    }
    public void clickOnDeleteButton() {
        this.deleteButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnYesConfirmDeleteButton() {
        this.yesConfirmDeleteButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String getNoResultsRow() {
        return this.noResultsRow.getText();
    }
}
