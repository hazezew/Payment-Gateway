package pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RefundsPage {
    private WebDriver driver;
    private Actions action;
    private WebDriverWait wait;
    private String alertMessage;

    @FindBy(xpath = "(//div[contains(@class,'trigger')])[1]")
    private WebElement fromCal;

    @FindBy(xpath = "(//span[contains(@id,'splitbutton')])[1]")
    private WebElement fromMMYY;

    @FindBy(xpath = "(//*[text()='Feb'])[1]")
    private WebElement fromFeb;

    @FindBy(xpath = "(//*[text()='2023'])[1]")
    private WebElement from2023;

    @FindBy(xpath = "//span[contains(text(),'OK')]")
    private WebElement fromBtnOk;

    @FindBy(xpath = "(//*[text()='1'])[1]")
    private WebElement fromFeb1;

    @FindBy(xpath = "(//span[text()='Search'])[3]")
    private WebElement btnSearch;

    @FindBy(xpath = "(//td[contains(@id,'messagebox')]//following::div[contains(@id,'messagebox')])[1]")
    private WebElement alertMessageDisplay;

    @FindBy(xpath = "//span[contains(text(),'OK')]")
    private WebElement btnAlertOk;

    public RefundsPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void clickFromCal(){
        wait.until(ExpectedConditions.visibilityOf(fromCal)).click();
    }
    public void clickFromMMYY(){
        wait.until(ExpectedConditions.visibilityOf(fromMMYY)).click();
    }
    public void clickFromFeb(){
        wait.until(ExpectedConditions.visibilityOf(fromFeb)).click();
    }
    public void clickFrom2023(){
        wait.until(ExpectedConditions.visibilityOf(from2023)).click();
    }
    public void clickFromBtnOk(){
        wait.until(ExpectedConditions.visibilityOf(fromBtnOk)).click();
    }
    public void clickFromFeb1(){
        wait.until(ExpectedConditions.visibilityOf(fromFeb1)).click();
    }
    public void selectMerchant(String merchantName){
        WebElement merchant=driver.findElement(By.xpath("(//div[text()='"+ merchantName +"'])[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", merchant);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("(//div[text()='"+ merchantName +"'])[1]")).click();
    }
    public void clickBtnSearch(){
        wait.until(ExpectedConditions.visibilityOf(btnSearch)).click();
        try{
            alertMessage=wait.until(ExpectedConditions.visibilityOf(alertMessageDisplay)).getText();
            wait.until(ExpectedConditions.visibilityOf(btnAlertOk)).click();
        }catch (Exception e){}
    }
    public void selectFeb1(){
        clickFromCal();
        clickFromMMYY();
        clickFromFeb();
        clickFrom2023();
        clickFromBtnOk();
        clickFromFeb1();
    }
    public String getURL(){
        return driver.getCurrentUrl();
    }
}
