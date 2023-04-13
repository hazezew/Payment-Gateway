package pageObj;

import config.Config;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class CaseManagementSettingsPage {
    private WebDriver driver;
    private Actions action;
    private WebDriverWait wait;
    private Map<String,String> mapDefaultInvestigationEntity;

    @FindBy(xpath = "//span[contains(text(),'Edit')]")
    public WebElement btnEdit;

    @FindBy(xpath = "((//span[text()=\"Default Investigation Entity\"])[2]/following::div[contains(@class,'selectonemenu')])[1]")
    private WebElement ddDefaultInvestigationEntity;

    @FindBy(xpath = "(//span[contains(text(),\"Save\")])[1]")
    private WebElement btnSave;

    @FindBy(xpath = "(//form[contains(@id,\"editor\")])[2]")
    private WebElement form;

    public CaseManagementSettingsPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
        setMapDefaultInvestigationEntity();
    }
    private void setMapDefaultInvestigationEntity(){
        mapDefaultInvestigationEntity=new HashMap<>();
        mapDefaultInvestigationEntity.put("HPAN","//li[contains(@id,\"editor\")][1]");
        mapDefaultInvestigationEntity.put("MERCHANT_ID","//li[contains(@id,\"editor\")][2]");
        mapDefaultInvestigationEntity.put("ACCOUNT_NUMBER","//li[contains(@id,\"editor\")][3]");
        mapDefaultInvestigationEntity.put("CUSTOMER","//li[contains(@id,\"editor\")][4]");
    }

    public void clickBtnEdit(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        action.moveToElement(btnEdit).click().build().perform();
    }


    public void clickBtnSave(){
        if(Config.browser=="chrome"){
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("document.body.style.zoom = '0.75'");
        }
        if(Config.browser=="firefox"){
            Robot robot = null;
            try {
                robot = new Robot();
            } catch (AWTException e) {
                e.printStackTrace();
            }
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_MINUS);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_MINUS);

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_MINUS);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_MINUS);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//span[contains(text(),\"Save\")])[1]")))).click();
//        wait.until(ExpectedConditions.visibilityOf(btnSave)).click();
    }

    public void selectMapDefaultInvestigationEntity(String defaultInvestigationEntity){
        wait.until(ExpectedConditions.visibilityOf(ddDefaultInvestigationEntity)).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(mapDefaultInvestigationEntity.get(defaultInvestigationEntity))))).click();
    }

    public String getURL(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.getCurrentUrl();
    }
}
