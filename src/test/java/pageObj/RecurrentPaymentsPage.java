package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RecurrentPaymentsPage {
    private WebDriver driver;
    private Actions action;
    private WebDriverWait wait;
    private String alertMessage;

    @FindBy(xpath = "//input[@data-qtip='Enter part of name and press Enter']")
    private WebElement merchantTextField;
    @FindBy(xpath = "//div[.='merchantone'][1]")
    private WebElement merchantOne;
    @FindBy(xpath = "//button/span[.='Search']")
    private WebElement searchButton;

    @FindBy(xpath = "//td/input[@name='pan']")
    private WebElement panTextField;

    public RecurrentPaymentsPage(WebDriver driver) {
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void selectMerchantOne() {
        this.merchantOne.click();
    }

    public void setPanNumber(String panNumber) {
        this.panTextField.sendKeys(panNumber);
    }
    public void clickOnSearchButton() {
        this.searchButton.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
