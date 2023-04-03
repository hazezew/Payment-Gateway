package pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderAndPaymentDetailed {
    private WebDriver driver;
    private Actions action;
    private WebDriverWait wait;

    @FindBy(xpath = "//*[text()='Merchant name:']")
    private WebElement lblMerchantName;

    public OrderAndPaymentDetailed(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public boolean isLblMerchantNameDisplayed(){
        return lblMerchantName.isDisplayed();
    }
    public boolean isOrderNumberDisplayed(String orderNum){
        return driver.findElement(By.xpath("//*[text()='"+ orderNum +"']")).isDisplayed();
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}
