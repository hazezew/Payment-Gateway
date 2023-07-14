package pageObj.acs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ACSAuthenticationPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    @FindBy(xpath = "//span/a[.='Authentication']")
    private WebElement authenticationMenu;
    @FindBy(xpath = "//td/input[@id='historyFilterForm:cardNumberFilter']")
    private WebElement cardNumberFilter;
    @FindBy(xpath = "//td/div[@id='historyFilterForm:profileFilter']")
    private WebElement profileDropdown;
    private String profileString = "//ul/li[.='";
    @FindBy(xpath = "//button/span[.='Search']")
    private WebElement searchButton;
    // for confirmation
    @FindBy(xpath = "//tbody[@id='historyForm:historyTable_data']/tr[1]/td[11]")
    private WebElement returnedProfileName;

    public ACSAuthenticationPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
        this.actions = new Actions(driver);
    }

    public void clickOnAuthenticationMenu() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", authenticationMenu);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.authenticationMenu.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setCardNumberFilter(String carNumber) {
        this.cardNumberFilter.clear();
        this.cardNumberFilter.sendKeys(carNumber);
    }
    public void selectProfile(String profile) {
        this.profileDropdown.click();
        driver.findElement(By.xpath(profileString + "" + profile + "']")).click();
    }
    public void clickOnSearchButton() {
        this.searchButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String getReturnedProfileName() {
        return this.returnedProfileName.getText();
    }
}
