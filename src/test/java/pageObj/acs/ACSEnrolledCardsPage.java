package pageObj.acs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ACSEnrolledCardsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    @FindBy(xpath = "//span/a[.='Enrolled cards']")
    private WebElement enrolledCardsMenu;
    // search enrolled card
    @FindBy(xpath = "//td/input[@id='cardsFilterForm:cardNumberFilter']")
    private WebElement cardNumberFilter;
    @FindBy(xpath = "//button/span[.='Search']")
    private WebElement searchButton;
    @FindBy(xpath = "//tbody[@id='cardsForm:cardsTable_data']/tr/td[1]")
    private WebElement idField;
    @FindBy(xpath = "//tbody[@id='cardsForm:cardsTable_data']/tr/td[5]")
    private WebElement profileField;
    // edit enrolled card
    @FindBy(xpath = "//tbody[@id='cardsForm:cardsTable_data']/tr")
    private WebElement returnedEnrolledCardRow;
    @FindBy(xpath = "//li/a[@href='#authenticationMethodsTab']")
    private WebElement cardAuthenticationMethodsTab;
    @FindBy(xpath = "//tbody[@id='currentCardAuthMethodsForm:cardDetails_crudListTable_data']/tr")
    private WebElement smsRow;
    @FindBy(xpath = "//button[@id='currentCardAuthMethodsForm:cardDetails_crudListEditButton']/span[.='Edit']")
    private WebElement editSMSButton;
    @FindBy(xpath = "//td/input[@id='currentCardAuthMethodsForm:cardDetails_deliveryDestinationInput']")
    private WebElement destinationSMS;
    @FindBy(xpath = "//button[@id='currentCardAuthMethodsForm:cardDetails_crudAddEditDialogEditButton']/span[.='Edit']")
    private WebElement editOrSaveButton;
    @FindBy(xpath = "//tbody[@id='currentCardAuthMethodsForm:cardDetails_crudListTable_data']/tr/td[3]")
    private WebElement destinationSMSConfirmation;
    // block enrolled card
    @FindBy(xpath = "//button/span[.='Block']")
    private WebElement blockButton;
    @FindBy(xpath = "//button/span[.='Yes']")
    private WebElement yesButtonToConfirmDeletion;
    @FindBy(xpath = "//tbody[@id='cardsForm:cardsTable_data']/tr/td[3]")
    private WebElement cardStatusField;
    // activate enrolled card
    @FindBy(xpath = "//button/span[.='Activate']")
    private WebElement activateButton;
    @FindBy(xpath = "//button/span[.='Yes']")
    private WebElement yesButtonToConfirmActivation;

    public ACSEnrolledCardsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
        this.actions = new Actions(driver);
    }

    public void clickOnEnrolledCardsMenu() {
        this.enrolledCardsMenu.click();
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setCardNumberFilter(String cardNumber) {
        this.cardNumberFilter.clear();
        this.cardNumberFilter.sendKeys(cardNumber);
    }
    public void clickOnSearchButton() {
        this.searchButton.click();
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public int getCardID() {
        return Integer.parseInt(this.idField.getText());
    }
    public String getCardProfile() {
        return this.profileField.getText();
    }
    public void clickOnReturnedEnrolledCardsRow() {
        this.returnedEnrolledCardRow.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnCardholderAuthenticationMethodsTab() {
        this.cardAuthenticationMethodsTab.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnSMSRow() {
        this.smsRow.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnEditSMSButton() {
        this.editSMSButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setDestinationSMS(String smsNumber) {
        this.destinationSMS.clear();
        this.destinationSMS.sendKeys(smsNumber);
    }
    public void clickOnEditOrSaveButton() {
        this.editOrSaveButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String getDestinationSMSConfirmation() {
        return this.destinationSMSConfirmation.getText();
    }

    public void clickOnBlockButton() {
        this.blockButton.click();
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
    public String getCardStatus() {
        return this.cardStatusField.getText();
    }
    public void clickOnActivateButton() {
        this.activateButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnYesButtonToConfirmActivation() {
        this.yesButtonToConfirmActivation.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
