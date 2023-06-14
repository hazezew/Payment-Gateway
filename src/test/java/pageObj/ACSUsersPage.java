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

public class ACSUsersPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(xpath = "//span/a[.='Users']")
    private WebElement usersMenu;

    @FindBy(xpath = "//button/span[.='Add']")
    private WebElement addButton;
    @FindBy(xpath = "//td/input[@name='addOperatorForm:operatorNameInput']")
    private WebElement nameTextField;

    @FindBy(xpath = "//div/label[@id='addOperatorForm:operatorProfileInput_label']")
    private WebElement profileDropdown;
    @FindBy(xpath = "//ul/li[.='Test']")
    private WebElement testProfile;
    @FindBy(xpath = "//ul/li[.='Test Insitution']")
    private WebElement testInstitutionProfile;
    @FindBy(xpath = "//ul/li[.='BUNNA']")
    private WebElement bunnaProfile;
    @FindBy(xpath = "//ul/li[.='UAT_TEST']")
    private WebElement uatTestProfile;
    @FindBy(xpath = "//ul/li[.='Wegagen']")
    private WebElement wegagenProfile;
    @FindBy(xpath = "//ul/li[.='Test Profile']")
    private WebElement testProfileProfile;
    @FindBy(xpath = "//ul/li[.='TESTINGPROFILE']")
    private WebElement testingProfileProfile;
    @FindBy(xpath = "//ul/li[.='DEFAULT']")
    private WebElement defaultProfile;
    @FindBy(xpath = "//ul/li[.='Arifpay']")
    private WebElement arifPayProfile;

    @FindBy(xpath = "//td/input[@name='addOperatorForm:operatorLoginInput']")
    private WebElement loginTextField;
    @FindBy(xpath = "//td/input[@name='addOperatorForm:operatorPasswordInput']")
    private WebElement passwordTextField;
    @FindBy(xpath = "//td/input[@name='addOperatorForm:operatorPasswordConfirmationInput']")
    private WebElement passwordConfirmationTextField;
    @FindBy(xpath = "//td/input[@name='addOperatorForm:operatorNeedChangePassword']")
    private WebElement needChangePasswordCheckbox;

    @FindBy(xpath = "//ul/li[.='role_admin']")
    private WebElement roleAdmin;
    @FindBy(xpath = "//ul/li[.='trainer']")
    private WebElement roleTrainer;
    @FindBy(xpath = "//ul/li[.='Kassahun']")
    private WebElement roleKassahun;
    @FindBy(xpath = "//button/span[@class='ui-button-icon-left ui-icon ui-c ui-icon ui-icon-arrow-1-e']")
    private WebElement addSingleRoleIcon;

    @FindBy(xpath = "//button[@id='addOperatorForm:addOperatorAddButton']/span[@class='ui-button-text ui-c']")
    private WebElement addAcsUserButton;

    @FindBy(xpath = "//td/input[@name='operatorsFilterForm:operatorLoginFilter']")
    private WebElement loginFilterTextField;
    @FindBy(xpath = "//button/span[.='Search']")
    private WebElement searchButton;
    @FindBy(xpath = "//*[@id=\"operatorsForm:operatorsTable_data\"]/tr/td[3]")
    private WebElement returnedUserName;
    @FindBy(xpath = "//*[@id=\"operatorsForm:operatorsTable_data\"]/tr")
    private WebElement returnedUser;
    @FindBy(xpath = "//button/span[.='Edit']")
    private WebElement editButton;

    public ACSUsersPage(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void clickOnUsersMenu() {
        this.usersMenu.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickOnAddButton() {
        this.addButton.click();
    }

    public void setNameTextField(String name) {
        this.nameTextField.sendKeys(name);
    }
    public void clickOnProfileDropdown() {
        this.profileDropdown.click();
    }
    public void selectBunnaProfile() {
        this.bunnaProfile.click();
    }
    public void setLoginTextField(String login) {
        this.loginTextField.sendKeys(login);
    }
    public void setPasswordTextField(String password) {
        this.passwordTextField.sendKeys(password);
    }
    public void setPasswordConfirmationTextField(String password) {
        this.passwordConfirmationTextField.sendKeys(password);
    }
    public void uncheckChangePasswordCheckbox() {
        this.needChangePasswordCheckbox.click();
    }
    public void addRoleAdminRole() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.roleAdmin.click();
        this.addSingleRoleIcon.click();
        this.roleTrainer.click();
        this.addSingleRoleIcon.click();
        this.roleKassahun.click();
        this.addSingleRoleIcon.click();

    }
    public void addACSUserButton() {
        this.addAcsUserButton.click();
    }

    public void setLoginFilterTextField(String loginName) {
        this.loginFilterTextField.sendKeys(loginName);
    }
    public void clickOnSearchButton() {
        this.searchButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String searchedUserName() {
        return this.returnedUserName.getText();
    }
    public void clickOnTheReturnedUser() {
        wait.until(ExpectedConditions.visibilityOf(returnedUser));
        this.returnedUser.click();

    }
    public void clickOnTheEditButton() {
        this.editButton.click();
    }

}
