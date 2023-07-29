package pageObj.threeds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TDSActionsAuditPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    @FindBy(xpath = "//app-date-time-picker[@id='startDate']/div/input")
    private WebElement startDate;
    @FindBy(xpath = "//app-date-time-picker[@id='endDate']/div/input")
    private WebElement endDate;
    @FindBy(id = "actionType")
    private WebElement actionTypeDropdown;
    @FindBy(xpath = "//div/button[.=' Search ']")
    private WebElement searchButton;
    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    private WebElement returnedActionType;


    public TDSActionsAuditPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
        this.actions = new Actions(driver);
    }


    public String returnedActionType() {
        return this.returnedActionType.getText();
    }
    public void clickOnSearchButton() {
        this.searchButton.click();
        smartWait(1000);
    }
    public void setActionType(String actionType) {
        this.actionTypeDropdown.click();
        Select sel = new Select(actionTypeDropdown);
        sel.selectByVisibleText(actionType);
    }
    public void setEndDate(String endD) {
        this.endDate.clear();
        this.endDate.sendKeys(endD);
    }
    public void setStartDate(String startD) {
        this.startDate.clear();
        this.startDate.sendKeys(startD);
    }

    public void smartWait(int milliSec) {
        try {
            Thread.sleep(milliSec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
