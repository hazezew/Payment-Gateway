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
import java.util.List;
import java.util.Map;

public class CasesQueuePage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;
    Map<String, String> mapEntityType;
    Map<String, String> mapLockedBy;
    Map<String, String> mapClassificationType;
    Map<String, String> setMapForwarded;

    private String xpath="//label[contains(@class,\"p-inputtext p-placeholder\")]";


    @FindBy(xpath = "(// *[@class='p-dropdown-label p-inputtext'])[1]")
    private WebElement ddEntityType;

    @FindBy(xpath = "//label[contains(@class,\"p-inputtext p-placeholder\")]")
    private List<WebElement> ddWithAllOption;

    @FindBy(xpath = "/html/body/div[5]/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/button/span[1]")
    private WebElement iconSearch;

    public CasesQueuePage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
        mapEntityType=new HashMap<>();
        mapLockedBy=new HashMap<>();
        mapClassificationType=new HashMap<>();
        setMapForwarded=new HashMap<>();
        setEntityTypes();
        setMapLockedBy();
        setMapClassificatioType();
        setMapForwarded();
    }
    private void setEntityTypes(){
        mapEntityType.put("HPAN","//li[@id=\"dropdown-options_0\"]");
        mapEntityType.put("MERCHANT_ID","//li[@id=\"dropdown-options_1\"]");
        mapEntityType.put("ACCOUNT_NUMBER","//li[@id=\"dropdown-options_2\"]");
        mapEntityType.put("CUSTOMER","//li[@id=\"dropdown-options_3\"]");
    }

    private void setMapLockedBy(){
        mapLockedBy.put("All","//li[@id=\"dropdown-options_0\"]");
        mapLockedBy.put("1 - admin","//li[@id=\"dropdown-options_1\"]");
        mapLockedBy.put("1000 - administrator","//li[@id=\"dropdown-options_2\"]");
        mapLockedBy.put("1001 - supervisor","//li[@id=\"dropdown-options_3\"]");
        mapLockedBy.put("1002 - analyst","//li[@id=\"dropdown-options_4\"]");
        mapLockedBy.put("2000 - testinguser","//li[@id=\"dropdown-options_5\"]");
        mapLockedBy.put("2001 - trainer","//li[@id=\"dropdown-options_6\"]");
        mapLockedBy.put("2002 - Test","//li[@id=\"dropdown-options_7\"]");
        mapLockedBy.put("2003 - Kass","//li[@id=\"dropdown-options_8\"]");
        mapLockedBy.put("2004 - hamza123","//li[@id=\"dropdown-options_9\"]");
        mapLockedBy.put("2005 - testing123","//li[@id=\"dropdown-options_10\"]");
        mapLockedBy.put("2006 - testingteam1","//li[@id=\"dropdown-options_11\"]");
        mapLockedBy.put("2007 - Habtamu","//li[@id=\"dropdown-options_12\"]");
        mapLockedBy.put("2008 - Belesti","//li[@id=\"dropdown-options_13\"]");
        mapLockedBy.put("2009 - testinguser123","//li[@id=\"dropdown-options_14\"]");
        mapLockedBy.put("2010 - testuser","//li[@id=\"dropdown-options_15\"]");
        mapLockedBy.put("2011 - mekonnend","//li[@id=\"dropdown-options_17\"]");
        mapLockedBy.put("2012 - Hana","//li[@id=\"dropdown-options_18\"]");
        mapLockedBy.put("2013 - testuser1","//li[@id=\"dropdown-options_19\"]");
        mapLockedBy.put("2014 - AutoTest","//li[@id=\"dropdown-options_19\"]");
    }
    private void setMapClassificatioType(){
        mapClassificationType.put("All","//li[@id=\"dropdown-options_0\"]");
        mapClassificationType.put("Not classified","//li[@id=\"dropdown-options_1\"]");
        mapClassificationType.put("Classified ","//li[@id=\"dropdown-options_2\"]");
        mapClassificationType.put("Classified positive","//li[@id=\"dropdown-options_3\"]");
        mapClassificationType.put("Classified negative","//li[@id=\"dropdown-options_4\"]");
        mapClassificationType.put("Classified suspicious","//li[@id=\"dropdown-options_5\"]");
    }

    public void setMapForwarded(){
        setMapForwarded.put("All","//li[@id=\"dropdown-options_0\"]");
        setMapForwarded.put("Forwarded","//li[@id=\"dropdown-options_1\"]");
        setMapForwarded.put("Not forwarded","//li[@id=\"dropdown-options_2\"]");
    }

    public void setDDEntityType(String entity){
        wait.until(ExpectedConditions.visibilityOf(ddEntityType)).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(mapEntityType.get(entity))))).click();
    }

    public void setDDLockedBy(String lockedBy){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOf(ddWithAllOption.get(0))).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(mapLockedBy.get(lockedBy))))).click();
    }
    public void setClassificationType(String classificationType){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOf(ddWithAllOption.get(0))).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(mapClassificationType.get(classificationType))))).click();
    }
    public void setForwarded(String forwarded){
        wait.until(ExpectedConditions.visibilityOf(ddWithAllOption.get(0))).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(setMapForwarded.get(forwarded))))).click();
    }
    public void clickIconSearch(){
        wait.until(ExpectedConditions.visibilityOf(iconSearch)).click();
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}
