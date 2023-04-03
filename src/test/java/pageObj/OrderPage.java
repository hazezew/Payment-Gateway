package pageObj;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class OrderPage {
    private WebDriver driver;
    private Actions action;
    private WebDriverWait wait;

    private String alertMessage="";
    private String parent;

//    Calender fields
    @FindBy(xpath = "(//div[contains(@id,'ext')])[2]")
    private WebElement calFrom;

    @FindBy(xpath = "(//*[contains(@id,'splitbutton')])[1]")
    private WebElement calFromMMYY;

    @FindBy(xpath = "(//*[text()='Feb'])[1]")
    private WebElement fromFeb;

    @FindBy(xpath = "(//*[text()='2023'])[1]")
    private WebElement fromYear2023;

    @FindBy(xpath = "(//span[contains(text(),'OK')])[1]")
    private WebElement fromOkButton;

    @FindBy(xpath = "(//*[text()='1'])[1]")
    private WebElement fromFeb1;

    @FindBy(xpath = "(//div[contains(@id,'ext')])[3]")
    private WebElement calTo;

    @FindBy(xpath = "(//*[contains(@id,'splitbutton')])[6]")
    private WebElement calToMMYY;

    @FindBy(xpath = "(//*[text()='Feb'])[2]")
    private WebElement toFeb;

    @FindBy(xpath = "(//*[text()='2023'])[2]")
    private WebElement toYear2023;

    @FindBy(xpath = "(//span[contains(text(),'OK')])[2]")
    private WebElement toOkButton;

    @FindBy(xpath = "(//*[text()='28'])[2]")
    private WebElement toFeb28;

    //

    @FindBy(xpath = "//*[@name='orderNum']")
    private WebElement txtOrderNumber;

    @FindBy(xpath = "(//div[contains(@id,'messagebox')]//td[contains(@id,'messagebox')])[2]")
    private WebElement alertMessageDisplay;

    @FindBy(xpath = "//*[text()='OK']")
    private WebElement alertBtnOk;

    @FindBy(xpath = "(//span[text()='Search'])[4]")
    private WebElement btnSearch;

    public OrderPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }
//    Calendar Actions
    public void clickCalFrom(){
        wait.until(ExpectedConditions.visibilityOf(calFrom)).click();
    }
    public void clickCalFromMMYY(){
        wait.until(ExpectedConditions.visibilityOf(calFromMMYY)).click();
    }
    public void clickFromFeb(){
        wait.until(ExpectedConditions.visibilityOf(fromFeb)).click();
    }
    public void clickFromYear2023(){
        wait.until(ExpectedConditions.visibilityOf(fromYear2023)).click();
    }
    public void clickFromOkButton(){
        wait.until(ExpectedConditions.visibilityOf(fromOkButton)).click();
    }
    public void clickFromFeb1(){
        wait.until(ExpectedConditions.visibilityOf(fromFeb1)).click();
    }

    public void clickCalTo(){
        wait.until(ExpectedConditions.visibilityOf(calTo)).click();
    }
    public void clickCalToMMYY(){
        wait.until(ExpectedConditions.visibilityOf(calToMMYY)).click();
    }
    public void clickToFeb(){
        wait.until(ExpectedConditions.visibilityOf(toFeb)).click();
    }
    public void clickToYear2023(){
        wait.until(ExpectedConditions.visibilityOf(toYear2023)).click();
    }
    public void clickToOkButton(){
        wait.until(ExpectedConditions.visibilityOf(toOkButton)).click();
    }
    public void clickToFeb28(){
        wait.until(ExpectedConditions.visibilityOf(toFeb28)).click();
    }

    public void selectFromDate() {
        clickCalFrom();
        clickCalFromMMYY();
        clickFromFeb();
        clickFromYear2023();
        clickFromOkButton();
        clickFromFeb1();
    }
    public void selectToDate(){
        clickCalTo();
        clickCalToMMYY();
        clickToFeb();
        clickToYear2023();
        clickToOkButton();
        clickToFeb28();
    }
    public void enterTxtOrderNumber(String orderNumber){
        wait.until(ExpectedConditions.visibilityOf(txtOrderNumber)).sendKeys(orderNumber);
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

//    Uncomment all in this method once completing order test
    public void clickBtnSearch(){
        wait.until(ExpectedConditions.visibilityOf(btnSearch)).click();
        try{
            alertMessage=wait.until(ExpectedConditions.visibilityOf(alertMessageDisplay)).getText();
            wait.until(ExpectedConditions.visibilityOf(alertBtnOk)).click();
            System.out.println("Alert message: "+ alertMessage);
        }catch (Exception e){}
    }
    public OrderAndPaymentDetailed clickOrderNumber(String orderNum){
        AbstractPage.setParentWindow(driver.getWindowHandle());
        WebElement order=driver.findElement(By.xpath("//a[text()='"+ orderNum +"']"));
        wait.until(ExpectedConditions.visibilityOf(order)).click();

        Set<String> windows=driver.getWindowHandles();
        Iterator<String> iterator= windows.iterator();
        iterator.next();
        String child=iterator.next();
        driver.switchTo().window(child);
        return new OrderAndPaymentDetailed(driver);
    }

    public String getAlertMessage(){
        return alertMessage;
    }
    public String getURL(){
        return driver.getCurrentUrl();
    }
}
