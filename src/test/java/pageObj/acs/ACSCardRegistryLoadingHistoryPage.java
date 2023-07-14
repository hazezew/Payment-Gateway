package pageObj.acs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ACSCardRegistryLoadingHistoryPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    @FindBy(xpath = "//span/a[.='Card registry loading history']")
    private WebElement cardRegistryLoadingHistoryMenu;
    // search card registry loading history
    @FindBy(xpath = "//td/input[@id='historyFilterForm:fileNameFilter']")
    private WebElement fileNameFilter;
    @FindBy(xpath = "//td/div[@id='historyFilterForm:profileFilter']")
    private WebElement profileDropdown;
    String profileString = "//ul/li[.='";
    @FindBy(xpath = "//button/span[.='Search']")
    private WebElement searchButton;
    @FindBy(xpath = "//tbody[@id='historyForm:historyTable_data']/tr/td[2]")
    private WebElement returendFileName;
    @FindBy(xpath = "//tbody[@id='historyForm:historyTable_data']/tr/td[5]")
    private WebElement returnedProfile;

    public ACSCardRegistryLoadingHistoryPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
        this.actions = new Actions(driver);
    }

    public void clickOnCardRegistryLoadingHistoryMenu() {
        this.cardRegistryLoadingHistoryMenu.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setFileNameFilter(String fileName) {
        this.fileNameFilter.clear();
        this.fileNameFilter.sendKeys(fileName);
    }
    public void selectProfile(String profile) {
        this.profileDropdown.click();
        driver.findElement(By.xpath(profileString+""+profile+"']")).click();
    }
    public void clickOnSearchButton() {
        this.searchButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String getReturnedFileName() {
        return this.returendFileName.getText();
    }
    public String getReturnedProfile() {
        return this.returnedProfile.getText();
    }

}
