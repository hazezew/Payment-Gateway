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
import java.util.Random;

public class GroupsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(xpath = "//button/span[text()='New group']")
    private WebElement newGroupButton;

    @FindBy(xpath = "//tbody/tr/td/input[@data-qtip='Unique group name']")
    private WebElement groupNameTextField;

    @FindBy(xpath = "//div[@id='panel-1109-body']//ul/li")
    private WebElement users;

    String usersXpath = "//div[@id='panel-1109-body']//ul/li";

    @FindBy(id = "button-1115-btnIconEl")
    private WebElement addUserToGroupArrow;
    @FindBy(xpath = "//button/span[text()='Save']")
    private WebElement saveButton;

    @FindBy(id = "textfield-1098-inputEl")
    private WebElement searchTextField;
    @FindBy(xpath = "//button[@id='button-1099-btnEl']/span[@id='button-1099-btnIconEl']")
    private WebElement searchIcon;
    @FindBy(xpath = "//div[@class='x-grid-cell-inner ']")
    private WebElement returnedGroup;

    @FindBy(xpath = "//tr/td/div[text()='groupauto1']")
    private WebElement searchedGroup;

    @FindBy(xpath = "//button/span[text()='New permission']")
    private WebElement newPermissionButton;

    @FindBy(xpath = "//table[@id='combobox-1126-triggerWrap']//tbody/tr/td[@class='x-trigger-cell']")
    private WebElement permissionsDropDown;

    @FindBy(xpath = "//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default x-boundlist-above']/div[@class='x-boundlist-list-ct']/ul/li[2]")
    private WebElement onePermission;

    String permissionsXPath = "//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default x-boundlist-above']/div[@class='x-boundlist-list-ct']/ul/li";



    public GroupsPage(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void clickNewGroupButton() {
        this.newGroupButton.click();
    }
    public void setGroupNameToGroupTextField(String groupName) {
        this.groupNameTextField.clear();
        this.groupNameTextField.sendKeys(groupName);
    }

    public void addUsersToGroup(int numOfUsers) {
        for(int i = 0; i < numOfUsers; i++) {
            int numUsers = driver.findElements(By.xpath(usersXpath)).size();
            int randomIndex = new Random().nextInt(numUsers - 1 + 1) + 1;
            this.driver.findElement(By.xpath(usersXpath+"["+randomIndex+"]")).click();
            this.addUserToGroupArrow.click();
        }
    }

    public void addNewPermissionsToGroup() {
        this.permissionsDropDown.click();
        this.onePermission.click();
//        int numPermissions = driver.findElements(By.xpath(permissionsXPath)).size();
//        System.out.println(numPermissions);
//        int randomIndex = new Random().nextInt(numPermissions - 1 + 1) + 1;
////        System.out.println(randomIndex);
//        this.driver.findElement(By.xpath(numPermissions+"["+randomIndex+"]")).click();
    }

    public void clickSaveButton() {
        this.saveButton.click();
    }

    public void setGroupNameIntoSearchTextField(String groupName) {
        this.searchTextField.clear();
        this.searchTextField.sendKeys(groupName);
    }
    public void clickSearchIcon() {
        wait.until(ExpectedConditions.visibilityOf(searchIcon));
        this.searchIcon.click();
    }
    public String getReturnedGroupName() {
        String groupName = this.returnedGroup.getText();
        return groupName;
    }
    public void openReturnedGroupToViewItsDetail() {
        this.searchedGroup.click();
    }
    public void clickNewPermissionButton() {
        this.newPermissionButton.click();
    }
}
