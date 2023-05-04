package pageObj;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ManualPaymentMOTOPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(xpath = "//input[@name='orderNumber']")
    private WebElement orderNumberTextField;
    @FindBy(xpath = "//input[@name='merchantId']")
    private WebElement merchantTextField;
    @FindBy(xpath = "//div[text()='merchantone (merchantone)']")
    private WebElement selectMerchantOne;
    @FindBy(xpath = "//input[@name='amount']")
    private WebElement amountTextField;
    @FindBy(xpath = "//input[@name='name']")
    private WebElement customerNameTextField;
    @FindBy(xpath = "//input[@name='phone']")
    private WebElement customerPhoneTextField;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailTextField;
    @FindBy(xpath = "//textarea[@name='description']")
    private WebElement descriptionTextArea;
    @FindBy(xpath = "//label[text()='One-phase payment']")
    private WebElement onePhasePayment;
    @FindBy(xpath = "//label[text()='Two-phase payment']")
    private WebElement twoPhasePayment;
    @FindBy(xpath = "//input[@name='pan']")
    private WebElement pan;
    @FindBy(xpath = "//input[@name='month']")
    private WebElement cardExpiryMonth;
    @FindBy(xpath = "//div/ul/li[12]")
    private WebElement twelveMonth;
    @FindBy(xpath = "//input[@name='year']")
    private WebElement cardExpiryYear;
    @FindBy(xpath = "//div/ul/li[text()='2023']")
    private WebElement twentyTwentyThree;
    @FindBy(xpath = "//input[@name='cardholder']")
    private WebElement cardholderName;


    @FindBy(xpath = "//button/span[text()='Submit']")
    private WebElement submitButton;


    public ManualPaymentMOTOPage(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void setOrderNumberTextField(String orderNumber) {
        this.orderNumberTextField.clear();
        this.orderNumberTextField.sendKeys(orderNumber);
    }
    public void setMerchantTextField(String merchant) {
        this.merchantTextField.clear();
        this.merchantTextField.sendKeys(merchant);
        this.merchantTextField.sendKeys(Keys.RETURN);
        this.selectMerchantOne.click();
    }
    public void setAmountTextField(int amount) {
        this.amountTextField.clear();
        this.amountTextField.sendKeys(""+amount+"");
    }
    public void setCustomerNameTextField(String name) {
        this.customerNameTextField.clear();
        this.customerNameTextField.sendKeys(name);
    }
    public void setCustomerPhoneTextField(int phoneNumber) {
        this.customerPhoneTextField.clear();
        this.customerPhoneTextField.sendKeys(""+phoneNumber+"");
    }
    public void setEmailTextField(String email) {
        this.emailTextField.clear();
        this.emailTextField.sendKeys(email);
    }
    public void setDescriptionTextArea(String description) {
        this.descriptionTextArea.clear();
        this.descriptionTextArea.sendKeys(description);
    }
    public void selectAuthorizationType() {
        this.onePhasePayment.click();
    }

    public void setPAN(String PAN) {
        this.pan.clear();
        this.pan.sendKeys(PAN);
    }
    public void setCardExpiryMonth(int expiryMonth) {
        this.cardExpiryMonth.click();
        this.twelveMonth.click();
    }
    public void setCardExpiryYear(int expiryYear) {
        this.cardExpiryYear.click();
        this.twentyTwentyThree.click();
    }
    public void setCardholderName(String cardholderName) {
        this.cardholderName.clear();
        this.cardholderName.sendKeys(cardholderName);
    }

    public void clickOnSubmitButton() {
        this.submitButton.click();
    }

}
