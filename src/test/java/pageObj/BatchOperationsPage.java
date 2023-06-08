package pageObj;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class BatchOperationsPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(xpath = "//input[@readonly='readonly']")
    private WebElement fileUploadInput;

    @FindBy(xpath = "//td[@style='width: 64px;']")
    private WebElement selectFileButton;

    @FindBy(xpath = "//button/span[text()='Upload']")
    private WebElement uploadFileButton;
    @FindBy(xpath = "//input[@name='merchantId']")
    private WebElement merchantTextfield;
    @FindBy(xpath = "//div[text()='merchantone (merchantone)']")
    private WebElement selectMerchantOne;

    public BatchOperationsPage(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void clickSelectFileButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(fileUploadInput));
        fileUploadInput.sendKeys("C:\\Users\\user\\Desktop\\eths\\blacklist.csv");
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOf(selectFileButton));
//        action.moveToElement(selectFileButton).build().perform();
        selectFileButton.click();
        Thread.sleep(5000);

    }
    public void selectAndUploadFile() {
        try {
            Runtime.getRuntime().exec("C:\\Users\\user\\Documents\\FileUpload.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnUploadFileButton() {
        wait.until(ExpectedConditions.visibilityOf(uploadFileButton));
        uploadFileButton.click();
    }

    public void setMerchant(String merchantName) {
        this.merchantTextfield.clear();
        this.merchantTextfield.sendKeys(merchantName);
        this.merchantTextfield.sendKeys(Keys.RETURN);
        this.selectMerchantOne.click();
    }
}
