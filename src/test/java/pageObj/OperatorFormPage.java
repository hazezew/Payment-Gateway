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
import java.util.HashMap;
import java.util.Map;

public class OperatorFormPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;
    private Map<String,String> mapEntityType;


    @FindBy(xpath = "//span[contains(@class,'p-clickable')]")
    private WebElement ddlEntityType;

    public OperatorFormPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
        setMapEntityType();

    }
    private void setMapEntityType(){
        mapEntityType=new HashMap<>();
        mapEntityType.put("HPAN","//li[@id=\"dropdown-options_0\"]");
        mapEntityType.put("MERCHANT_ID","//li[@id=\"dropdown-options_1\"]");
        mapEntityType.put("ACCOUNT_NUMBER","//li[@id=\"dropdown-options_2\"]");
        mapEntityType.put("CUSTOMER","//li[@id=\"dropdown-options_3\"]");
    }
    public void setDdlEntityType(String entityType){
        wait.until(ExpectedConditions.visibilityOf(ddlEntityType)).click();
        driver.findElement(By.xpath(mapEntityType.get(entityType))).click();
    }
    public String getURL(){
        return driver.getCurrentUrl();
    }
}
