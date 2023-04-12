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

public class LastReviewedCasesPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;
    private Map<String,String> mapEntityType;


    @FindBy(xpath = "/html/body/div[5]/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div[1]/div/div[2]/div/label")
    private WebElement ddlEntityType;

    @FindBy(xpath = "/html/body/div[5]/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div[1]/div/div[1]/button/span[1]")
    private WebElement btnSearch;

    public LastReviewedCasesPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
        setMapEntityType();

    }
    private void setMapEntityType(){
        mapEntityType=new HashMap<>();
        mapEntityType.put("All","//li[@id=\"dropdown-options_0\"]");
        mapEntityType.put("HPAN","//li[@id=\"dropdown-options_1\"]");
        mapEntityType.put("MERCHANT_ID","//li[@id=\"dropdown-options_2\"]");
        mapEntityType.put("ACCOUNT_NUMBER","//li[@id=\"dropdown-options_3\"]");
        mapEntityType.put("CUSTOMER","//li[@id=\"dropdown-options_4\"]");
    }
    public void setDdlEntityType(String entityType){
        wait.until(ExpectedConditions.visibilityOf(ddlEntityType)).click();
        driver.findElement(By.xpath(mapEntityType.get(entityType))).click();
    }
    public void clickBtnSearch(){
        wait.until(ExpectedConditions.visibilityOf(btnSearch)).click();
    }
    public String getURL(){
        return driver.getCurrentUrl();
    }
}
