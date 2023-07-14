package pageObj.acs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ACSAuthenticationMethodsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(xpath = "//span/a[.='Authentication Methods']")
    private WebElement authenticationMethodsMenu;
    @FindBy(xpath = "//button/span[.='Add']")
    private WebElement addButton;
    @FindBy(xpath = "//td/input[@id='addMethodForm:nameInput']")
    private WebElement authenticationMethodName;
    @FindBy(xpath = "//button/span[.='Save']")
    private WebElement saveAuthenticationMethodButton;

    // used to select default 3ds2 type
    @FindBy(xpath = "//div/label[@id='addMethodForm:def3ds2TypeInput_label']")
    private WebElement default3ds2TypeDropdown;
    private String default3ds2TypeString = "//div/ul[@id='addMethodForm:def3ds2TypeInput_items']/li[.='";


    // used to search and edit authentication method
    @FindBy(xpath = "//td/input[@id='methodsFilterForm:methodNameFilter']")
    private WebElement authenticationMethodNameFilter;
    @FindBy(xpath = "//button/span[.='Search']")
    private WebElement searchButton;
    @FindBy(xpath = "//tbody[@id='methodsForm:methodsTable_data']/tr/td[2]")
    private WebElement returnedAuthenticationMethodName;
    @FindBy(xpath = "//tbody[@id='methodsForm:methodsTable_data']/tr")
    private WebElement returnedAuthenticationMethodRow;
    @FindBy(xpath = "//button/span[.='Edit']")
    private WebElement editButton;

    // used to delete authentication method
    @FindBy(xpath = "//button/span[.='Delete']")
    private WebElement deleteButton;
    @FindBy(xpath = "//button/span[.='Yes']")
    private WebElement yesButtonToConfirmDeletion;
    @FindBy(xpath = "//tbody[@id='methodsForm:methodsTable_data']/tr/td")
    private WebElement noRecordsRow;


    public ACSAuthenticationMethodsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
        this.action = new Actions(driver);
    }

    public void clickOnAuthenticationMethodsMenu() {
        this.authenticationMethodsMenu.click();
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
    public void setAuthenticationMethodName(String name) {
        this.authenticationMethodName.clear();
        this.authenticationMethodName.sendKeys(name);
    }
    public void clickOnSaveAuthenticationMethodButton() {
        this.saveAuthenticationMethodButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setDefault3ds2Type(String methodName) {
        this.default3ds2TypeDropdown.click();
        driver.findElement(By.xpath(default3ds2TypeString+""+methodName+"']")).click();
    }
    public void setAuthenticationMethodNameFilter(String nameFilter) {
        this.authenticationMethodNameFilter.clear();
        this.authenticationMethodNameFilter.sendKeys(nameFilter);
    }
    public void clickOnSearchButton() {
        this.searchButton.click();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String getReturnedAuthenticationMethodName() {
        return this.returnedAuthenticationMethodName.getText();
    }
    public void clickOnReturnedAuthenticationMethodRow() {
        this.returnedAuthenticationMethodRow.click();
        try {
            Thread.sleep(300);
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
    public void clickOnDeleteButton() {
        this.deleteButton.click();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnYesButtonToConfirmDeletion() {
        this.yesButtonToConfirmDeletion.click();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String getNoRecordsRow() {
        return noRecordsRow.getText();
    }
}
