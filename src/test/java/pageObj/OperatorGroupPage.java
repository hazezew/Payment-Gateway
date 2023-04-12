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

public class OperatorGroupPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;
    private String errorMessage;
    private Map<String,String> mapPrivateScheme;
    private String firstRowFirstColumnTextValue;

    @FindBy(xpath = "(//span[contains(text(),\"Add\")])[1]")
    private WebElement btnAdd;

    @FindBy(xpath = "(//input[contains(@id,\"groupEditor\")])[1]")
    private WebElement txtNameOfOperatorGroup;

    @FindBy(xpath = "/html/body/span[3]/div/div[2]/form/div[1]/div[2]/div[2]/div/div[3]")
    private WebElement ddlPrivateScheme;

    @FindBy(xpath = "(//span[text()=\"Save\"])[1]")
    private WebElement btnSave;

    @FindBy(xpath = "(//span[text()=\"Cancel\"])[2]")
    private WebElement btnSCancel;

    @FindBy(xpath = "//p[@class=\"ui-growl-details\"]")
    private WebElement errorMessageDisplay;

    @FindBy(xpath = "//label[contains(text(),\"Operator Group ID\")]/following::input[1]")
    private WebElement txtOperatorGroupId;

    @FindBy(xpath = "//label[contains(text(),\"Operator Group ID\")]/following::input[2]")
    private WebElement txtSearchNameOperatorGroup;

    @FindBy(xpath = "//button[contains(@id,\"search\")]")
    private WebElement btnSearch;

    @FindBy(xpath = "(//table[contains(@class,\"dataTable\")])[1]/tbody/tr")
    private List<WebElement> rowsSearchResults;

    @FindBy(xpath = "//span[contains(text(),\"Modify\")]")
    private WebElement btnModify;

    @FindBy(xpath = "(//span[contains(text(),\"Delete\")])[1]")
    private WebElement btnDelete;

    @FindBy(xpath = "(//table[contains(@class,\"dataTable\")])[1]/tbody/tr/td")
    private WebElement rowNoDataFound;

    @FindBy(xpath = "(//table[contains(@class,\"dataTable\")])[1]/tbody/tr/td[2]")
    private List<WebElement> rowOperatorNameFound;

    @FindBy(xpath = "(//span[contains(text(),\"Yes\")])[1]")
    private WebElement btnPopupYes;

    public OperatorGroupPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
        setMapPrivateScheme();
    }
    private void setMapPrivateScheme(){
        mapPrivateScheme=new HashMap<>();
        mapPrivateScheme.put("1","//li[contains(@id,\"groupEditor\")][1]");
        mapPrivateScheme.put("1000 - New bank","//li[contains(@id,\"groupEditor\")][1]");
        mapPrivateScheme.put("1002 - Bank2","//li[contains(@id,\"groupEditor\")][1]");
    }

    public void clickBtnAdd(){
        wait.until(ExpectedConditions.visibilityOf(btnAdd)).click();
    }
    public void setTxtNameOfOperatorGroup(String name){
        wait.until(ExpectedConditions.visibilityOf(txtNameOfOperatorGroup)).clear();
        wait.until(ExpectedConditions.visibilityOf(txtNameOfOperatorGroup)).sendKeys(name);
    }

    public void setDdlPrivateScheme(String scheme){
//        Check these lines of code only
        wait.until(ExpectedConditions.visibilityOf(ddlPrivateScheme)).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(mapPrivateScheme.get(scheme))))).click();
    }

    public void clickBtnSave(){
        wait.until(ExpectedConditions.visibilityOf(btnSave)).click();
        try {
            Thread.sleep(500);
            setErrorMessage();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickBtnSCancel(){
        wait.until(ExpectedConditions.visibilityOf(btnSCancel)).click();
    }

    private void setErrorMessage(){
        if(txtNameOfOperatorGroup.isDisplayed()) {
            errorMessage = wait.until(ExpectedConditions.visibilityOf(errorMessageDisplay)).getText();
        }
    }
    public void setTxtOperatorGroupId(String operatorGroupId){
        wait.until(ExpectedConditions.visibilityOf(txtOperatorGroupId)).sendKeys(operatorGroupId);
    }
    public void setTxtSearchNameOperatorGroup(String name){
        wait.until(ExpectedConditions.visibilityOf(txtSearchNameOperatorGroup)).sendKeys(name);
    }
    public void clickSearchButton(){
        wait.until(ExpectedConditions.visibilityOf(btnSearch)).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        firstRowFirstColumnTextValue=wait.until(ExpectedConditions.visibilityOf(rowNoDataFound)).getText();
    }
    public boolean getRowOperatorNameFound(){
        return rowOperatorNameFound.size()>0;
    }
    public void selectOperatorGroup(){
        wait.until(ExpectedConditions.visibilityOf(rowsSearchResults.get(rowsSearchResults.size()-1))).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickBtnModify(){
        wait.until(ExpectedConditions.visibilityOf(btnModify)).click();
    }
    public void clickBtnDelete(){
        wait.until(ExpectedConditions.visibilityOf(btnDelete)).click();
    }
    public void clickBtnPopupYesConfirmation(){
        wait.until(ExpectedConditions.visibilityOf(btnPopupYes)).click();
    }
    public String getRowNoDataFoundMsg(){
        System.out.println("Row text value: "+firstRowFirstColumnTextValue);
        return firstRowFirstColumnTextValue;
    }
    public String getErrorMessage(){
        return errorMessage;
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}
