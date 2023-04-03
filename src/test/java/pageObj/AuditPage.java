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

public class AuditPage {
    private WebDriver driver;
    private Actions action;
    private WebDriverWait wait;

    @FindBy(xpath = "(//div[contains(@class,'x-form-date-trigger')])[1]")
    private WebElement fromCal;

    @FindBy(xpath = "(//span[contains(@id,'splitbutton')])[1]")
    private WebElement fromMMYY;

    @FindBy(xpath = "//a[text()='Feb']")
    private WebElement fromFeb;

    @FindBy(xpath = "//a[text()='2023']")
    private WebElement from2023;

    @FindBy(xpath = "//span[contains(text(),'OK')]")
    private WebElement fromBtnOk;

    @FindBy(xpath = "(//span[text()=1])[1]")
    private WebElement fromFeb1;

    @FindBy(xpath = "(//div[contains(@class,'unselectable')])[5]")
    private WebElement ddUsers;

    @FindBy(xpath = "//span[text()='Find']")
    private WebElement btnFind;

    public AuditPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }
    private void clickFromCal(){
        wait.until(ExpectedConditions.visibilityOf(fromCal)).click();
    }
    private void clickFromMMYY(){
        wait.until(ExpectedConditions.visibilityOf(fromMMYY)).click();
    }
    private void clickFromFeb(){
        wait.until(ExpectedConditions.visibilityOf(fromFeb)).click();
    }
    private void clickFrom2023(){
        wait.until(ExpectedConditions.visibilityOf(from2023)).click();
    }
    private void clickFromBtnOk(){
        wait.until(ExpectedConditions.visibilityOf(fromBtnOk)).click();
    }
    private void clickFromFeb1(){
        wait.until(ExpectedConditions.visibilityOf(fromFeb1)).click();
    }

    public void selectFeb1(){
        clickFromCal();
        clickFromMMYY();
        clickFromFeb();
        clickFrom2023();
        clickFromBtnOk();
        clickFromFeb1();
    }

    public void clickDdUsers(){
        wait.until(ExpectedConditions.visibilityOf(ddUsers)).click();
    }
    public void selectUser(String userName){
        clickDdUsers();
        WebElement user=driver.findElement(By.xpath("//li[text()='"+ userName +"']"));
        wait.until(ExpectedConditions.visibilityOf(user)).click();
    }
    public void selectAction(String auditAction){
        WebElement a=driver.findElement(By.xpath("//div[text()='"+ auditAction +"']"));
        action.moveToElement(a).build().perform();
        wait.until(ExpectedConditions.visibilityOf(a)).click();
    }
    
    public void clickBtnFind(){
        wait.until(ExpectedConditions.visibilityOf(btnFind)).click();
    }
    public String getURL(){
        return driver.getCurrentUrl();
    }
}
