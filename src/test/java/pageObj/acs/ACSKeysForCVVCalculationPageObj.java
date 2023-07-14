package pageObj.acs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ACSKeysForCVVCalculationPageObj {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    @FindBy(xpath = "//span/a[.='Keys for CVV/CVC calculation']")
    private WebElement keysForCVVCalculationMenu;

    // objects for adding keys for cvv calculation
    @FindBy(xpath = "//button/span[.='Add']")
    private WebElement addButton;
    @FindBy(xpath = "//td/div[@id='addKeyForm:keyNetworkInput']")
    private WebElement networkDropdown;
    String networkString = "//ul[@id='addKeyForm:keyNetworkInput_items']/li[.='";
    @FindBy(xpath = "//td/div[@id='addKeyForm:keyProfileInput']")
    private WebElement profileDropdown;
    String profileString = "//ul[@id='addKeyForm:keyProfileInput_items']/li[.='";
    @FindBy(xpath = "//td/input[@id='addKeyForm:keyIndexInput']")
    private WebElement keyIndex;
    @FindBy(xpath = "//td/input[@id='addKeyForm:keyCheckValueInput']")
    private WebElement keyCheckValue;
    @FindBy(xpath = "//td/div[@id='addKeyForm:keyTypeInput']")
    private WebElement typeDropdown;
    String typeString = "//ul[@id='addKeyForm:keyTypeInput_items']/li[.='";
    @FindBy(xpath = "//td/input[@id='addKeyForm:keyInput']")
    private WebElement key;
    @FindBy(xpath = "//button[@id='addKeyForm:addKeyAddButton']/span[.='Add']")
    private WebElement addOrSaveButton;
    // objects used to search cvv keys for authentication
    @FindBy(xpath = "//td/div[@id='keysFilterForm:networkFilter']")
    private WebElement networkFilterDropdown;
    String networkFilterString = "//ul[@id='keysFilterForm:networkFilter_items']/li[.='";
    @FindBy(xpath = "//td/div[@id='keysFilterForm:profileFilter']")
    private WebElement profileFilterDropdown;
    String profileFilterString = "//ul[@id='keysFilterForm:profileFilter_items']/li[.='";
    @FindBy(xpath = "//button/span[.='Search']")
    private WebElement searchButton;
    @FindBy(xpath = "//tbody[@id='keysForm:keysTable_data']/tr/td[1]")
    private WebElement returnedNetworkName;
    @FindBy(xpath = "//tbody[@id='keysForm:keysTable_data']/tr/td[2]")
    private WebElement returnedProfileName;
    @FindBy(xpath = "//tbody[@id='keysForm:keysTable_data']/tr/td[4]")
    private WebElement returnedKeyCheckValueName;
    // objects for editing keys for cvv calculation
    @FindBy(xpath = "//tbody[@id='keysForm:keysTable_data']/tr[1]")
    private WebElement returnedKeysForCVVCalculationRow;
    @FindBy(xpath = "//button/span[.='Edit']")
    private WebElement editButton;
    @FindBy(xpath = "//button[@id='addKeyForm:addKeyEditButton']/span[.='Save']")
    private WebElement saveEditButton;
    // objects for delete keys for cvv calculation
    @FindBy(xpath = "//button/span[.='Delete']")
    private WebElement deleteButton;
    @FindBy(xpath = "//button/span[.='Yes']")
    private WebElement yesButtonToConfirmDeletion;
    @FindBy(xpath = "//tbody[@id='keysForm:keysTable_data']/tr/td")
    private WebElement noRecordsFoundRow;

    public ACSKeysForCVVCalculationPageObj(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
        this.actions = new Actions(driver);
    }

    public void clickOnKeyForCVVCalculationMenu() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", keysForCVVCalculationMenu);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.keysForCVVCalculationMenu.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnAddButton() {
        this.addButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void selectNetwork(String networkType) {
        this.networkDropdown.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(networkString + "" + networkType + "']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void selectProfile(String profileType) {
        this.profileDropdown.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(profileString + "" + profileType + "']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setKeyIndex(int indexN) {
        this.keyIndex.clear();
        this.keyIndex.sendKeys(Integer.toString(indexN));
    }
    public void setKeyCheckValue(String keyCheckValueN) {
        this.keyCheckValue.clear();
        this.keyCheckValue.sendKeys(keyCheckValueN);
    }
    public void setType(String typeType) {
        this.typeDropdown.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(typeString + "" + typeType + "']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setKey(String keyN) {
        this.key.clear();
        this.key.sendKeys(keyN);
    }
    public void clickOnAddOrSaveButton() {
        this.addOrSaveButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setNetworkFilter(String networkFilterType) {
        this.networkFilterDropdown.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(networkFilterString + "" + networkFilterType + "']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setProfileFilter(String profileFilterType) {
        this.profileFilterDropdown.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(profileFilterString + "" + profileFilterType + "']")).click();
        try {
            Thread.sleep(2000);
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
    public String getReturnedNetworkName() {
        return this.returnedNetworkName.getText();
    }
    public String getReturnedProfileName() {
        return this.returnedProfileName.getText();
    }
    public String getReturnedKeyCheckValueName() {
        return this.returnedKeyCheckValueName.getText();
    }
    public void clickOnTheReturnedKeysForCVVCalculationRow() {
        this.returnedKeysForCVVCalculationRow.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnEditButton() {
        this.editButton.click();
    }
    public void clickOnSaveEditButton() {
        this.saveEditButton.click();
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
    public void clickOnYesButtonToConfirmDeletion() {
        this.yesButtonToConfirmDeletion.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String getNoRecordsFoundRow() {
        return this.noRecordsFoundRow.getText();
    }

}
