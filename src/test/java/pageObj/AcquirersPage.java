package pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class AcquirersPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(xpath = "//button/span[text()='Create']")
    private WebElement createAcquirerButton;
    @FindBy(xpath = "//td/input[@data-qtip='Name of the Acquirer entity']")
    private WebElement nameTextField;
    @FindBy(xpath = "//td/input[@data-qtip='Description of the Acquirer entity']")
    private WebElement descriptionTextField;
    @FindBy(xpath = "//td/input[@name='host']")
    private WebElement urlTextField;
    @FindBy(xpath = "//td/input[@name='timeout']")
    private WebElement timeoutTextField;
    @FindBy(xpath = "//td/input[@name='fixedFee']")
    private WebElement fixedFeeTextField;
    @FindBy(xpath = "//td/input[@name='internalId']")
    private WebElement internalIdentifierTextField;
    @FindBy(xpath = "//td/input[@name='protocolId']")
    private WebElement protocolDropdown;

    private String protocolOptions = "//div[@class='x-boundlist-list-ct']/div";

    @FindBy(xpath = "//button/span[text()='Add']")
    private WebElement addButton;
    @FindBy(xpath = "(//div/span[text()=\"BIN\"]/following::div[contains(@class,\"x-grid-cell-inner\")])[1]")
    private WebElement paymentSystemLabel;
    @FindBy(xpath = "//input[@name='paymentSystem']")
    private WebElement paymentSystemComboBox;

    @FindBy(xpath = "//div[@class='x-fieldset-body']//button/span[text()='Save']")
    private WebElement savePaymentSystemButton;
    @FindBy(xpath = "//span[@class='x-btn-icon icon-save']")
    private WebElement saveAcquirerButton;

    @FindBy(xpath = "//tbody/tr[2]")
    private WebElement returnedAcquirer;

    private String numberAcquirers = "//div[@id='acquirerview-body']//table/tbody/tr";


    private String paymentSystemOptions = "//div[@class='x-boundlist-list-ct']/ul/li";

    // payment methods
    @FindBy(xpath = "//td//div[text()='P2P']")
    private WebElement p2p;
    @FindBy(xpath = "//td//div[text()='Apple Pay']")
    private WebElement applePay;
    @FindBy(xpath = "//td//div[text()='Batch binding payment']")
    private WebElement batchBindingPayment;
    @FindBy(xpath = "//td//div[text()='CUP UPOP SecurePay']")
    private WebElement cupUPOPSecurePay;
    @FindBy(xpath = "//td//div[text()='Binding']")
    private WebElement binding;
    @FindBy(xpath = "//td//div[text()='Masterpass']")
    private WebElement masterpass;
    @FindBy(xpath = "//td//div[text()='Google Pay']")
    private WebElement googlePay;
    @FindBy(xpath = "//td//div[text()='Samsung Pay']")
    private WebElement samsungPay;
    @FindBy(xpath = "//td//div[text()='Alternative']")
    private WebElement alternative;
    @FindBy(xpath = "//td//div[text()='Card']")
    private WebElement card;
    @FindBy(xpath = "//div[text()='CUP UPOP MOTO']")
    private WebElement cupUPOPMoto;
    // end of payment methods
    @FindBy(xpath = "//td/input[contains(@data-qtip,'Serach by Name, Description, User name, Url, Payment way, Payment system, Protocol name')]")
    private WebElement searchTextField;
    @FindBy(xpath = "//button/span[text()='Find']")
    private WebElement findButton;
    @FindBy(xpath = "//tbody/tr[2]/td[2]")
    private WebElement acquirerName;
    @FindBy(xpath = "//tbody/tr[2]/td[3]")
    private WebElement acquirerDescription;

    @FindBy(xpath = "//button/span[@class='x-btn-icon icon-cancel']")
    private WebElement deleteAcquirerButton;
    @FindBy(xpath = "//button/span[text()='Yes']")
    private WebElement confirmDeletion;
    @FindBy(xpath = "//button/span[text()='No']")
    private WebElement cancelDeletion;

    public AcquirersPage(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void clickOnCreateAcquirerButton() {
        this.createAcquirerButton.click();
    }

    public void setNameTextField(String name) {
        this.nameTextField.sendKeys(name);
    }
    public void setDescriptionTextField(String description) {
        this.descriptionTextField.sendKeys(description);
    }
    public void setUrlTextField(String url) {
        this.urlTextField.clear();
        this.urlTextField.sendKeys(url);
    }
    public void setTimeoutTextField(String timeout) {
        this.timeoutTextField.sendKeys(timeout);
    }
    public void setFixedFeeTextField(String fixedFee) {
        this.fixedFeeTextField.sendKeys(fixedFee);
    }
    public void setInternalIdentifierTextField(String internalIdentifier) {
        this.internalIdentifierTextField.sendKeys(internalIdentifier);
    }
    public void clickOnProtocolDropdown() {
        this.protocolDropdown.click();
    }

    public void selectProtocol() {
        int numProtocols = driver.findElements(By.xpath(protocolOptions)).size();
        int randomOption = new Random().nextInt(numProtocols - 1 + 1) + 1;
        driver.findElement(By.xpath(protocolOptions+"["+randomOption+"]")).click();
    }

    public void clickOnSaveAcquirerButton() {
        wait.until(ExpectedConditions.visibilityOf(saveAcquirerButton));
        this.saveAcquirerButton.click();
    }
    public void clickOnSavePaymentSystemButton() {
        this.savePaymentSystemButton.click();
    }
    public void clickOnAddButton() {
        this.addButton.click();
    }
    public void clickOnPaymentSystemLabel() {
        wait.until(ExpectedConditions.visibilityOf(paymentSystemLabel));
        this.paymentSystemLabel.click();
    }
    public void clickOnPaymentSystemComboBox() {
        this.paymentSystemComboBox.click();
    }

    public void selectPaymentOption() {
        int numPaymentOptions = driver.findElements(By.xpath(paymentSystemOptions)).size();
        int randomOption = new Random().nextInt(numPaymentOptions - 1 + 1) + 1;
        driver.findElement(By.xpath(paymentSystemOptions+"["+randomOption+"]")).click();
    }

    public void selectPaymentMethod() {
        this.p2p.click();
        this.applePay.click();
        this.batchBindingPayment.click();
    }

    public void setAcquirerNameIntoSearchTextField(String acquirerName) {
        this.searchTextField.clear();
        this.searchTextField.sendKeys(acquirerName);
    }
    public void clickOnFindAcquirerButton() {
        this.findButton.click();
    }

    public String getSearchedAcquirerName() {
        return this.acquirerName.getText();
    }

    public String getAcquirerDescription() {
        return this.acquirerDescription.getText();
    }

    public void openReturnedAcquirer() {
        this.returnedAcquirer.click();
    }

    public void setUpdatedDescription(String updatedDescription) {
        this.descriptionTextField.clear();
        this.descriptionTextField.sendKeys(updatedDescription);
    }

    public void updatePermission() {
        this.binding.click();
        this.masterpass.click();
        this.googlePay.click();
        this.samsungPay.click();
        this.card.click();
    }

    public void clickOnDeleteAcquirerButton() {
        this.deleteAcquirerButton.click();
    }
    public void confirmDeletionOfAcquirer() {
        this.confirmDeletion.click();
    }

    public int returnedAcquirers() {
        int numberOfAcquirers = driver.findElements(By.xpath(numberAcquirers)).size();
        // subtract 1 from number of acquirers as the first returned element is not an acquirer
        numberOfAcquirers -= 1;
        return numberOfAcquirers;
    }


}
