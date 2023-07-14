package stepDef;

import config.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pageObj.acs.ACSLoginPage;
import pageObj.AbstractPage;
import pageObj.EPGLoginPage;

import pageObj.EPGSuperAdminPage;

import pageObj.FMLoginPage;



public class LoginStepDef extends AbstractPage {
    private WebDriver driver;
    Actions action;
    private EPGLoginPage epgLoginPage;
    private ACSLoginPage acsLoginPage;

    private EPGSuperAdminPage epgSuperAdminPage;

    private FMLoginPage fmLoginPage;


    public LoginStepDef(){
        this.driver=super.driver;
    }

    @When("user has entered EPG system URL")
    public void user_has_entered_EPG_system_URL() {
        driver.get(Config.epgURL);
        if(Config.browser=="chrome"){
            try{
                driver.findElement(By.id("details-button")).click();
                action=new Actions(driver);
                action.scrollToElement(driver.findElement(By.id("proceed-link")));
                driver.findElement(By.id("proceed-link")).click();
            }catch (Exception e){}

        }
        epgLoginPage=new EPGLoginPage(driver);
        super.epgLoginPage=epgLoginPage;
    }

    @When("user enters {string} into EPG Username text field")
    public void userEntersIntoEPGUsernameTextField(String username) {
        epgLoginPage.setTxtUsername(username);
    }

    @And("user enters {string} into EPG into password text field")
    public void userEntersIntoEPGIntoPasswordTextField(String password) {
        epgLoginPage.setTxtPassword(password);
    }

    @And("user clicks EPG Login button")
    public void userClicksEPGLoginButton() {
        epgAdminDashboardPage=epgLoginPage.clickBtnLogin();
    }

    @And("super user clicks EPG Login button")
    public void superUserClicksEPGLoginButton() {
        epgAdminDashboardPage=epgLoginPage.clickBtnLogin();
    }

    @Then("system displays EPG Super Admin dashboard")
    public void systemDisplaysEPGSuperAdminDashboard() {
        Assert.assertEquals(epgAdminDashboardPage.getURL(),Config.epgAdminDashboard);
    }

    @Then("system displays EPG Admin dashboard")
    public void systemDisplaysEPGAdminDashboard() {
        Assert.assertEquals(epgAdminDashboardPage.getURL(),Config.epgAdminDashboard);
    }
    @And("EPG user clicks logout link")
    public void epgUserLogsOut() {
        epgLoginPage=null;
        epgLoginPage=epgAdminDashboardPage.clickLogout();
    }

    @Then("EPG system logs out and displays login page")
    public void epgSystemLogsOutAndDisplaysLoginPage() {
        Assert.assertEquals(epgLoginPage.getURL(),Config.epgURL);
    }

    @When("user has entered ACS system URL")
    public void userHasEnteredACSSystemURL() {
        driver.get(Config.acsURL);

        if(Config.browser=="chrome"){
            try{
                driver.findElement(By.id("details-button")).click();
                action=new Actions(driver);
                action.scrollToElement(driver.findElement(By.id("proceed-link")));
                driver.findElement(By.id("proceed-link")).click();
            }catch (Exception e){}

        }

        acsLoginPage=new ACSLoginPage(driver);
        super.acsLoginPage=acsLoginPage;
    }

    @When("user enters {string} into ACS Username text field")
    public void userEntersIntoACSUsernameTextField(String username) {
        acsLoginPage.setTxtUsername(username);
    }

    @And("user enters {string} into ACS into password text field")
    public void userEntersIntoACSIntoPasswordTextField(String password) {
        acsLoginPage.setTxtPassword(password);
    }

    @And("user clicks ACS Login button")
    public void userClicksACSLoginButton() {
        acsAdminDashboardPage=acsLoginPage.clickBtnLogin();
    }

    @Then("system displays ACS Admin dashboard")
    public void systemDisplaysACSAdminDashboard() {
        Assert.assertEquals(Config.acsAdminDashboard, acsAdminDashboardPage.getURL());
    }

    @And("ACS user logs out")
    public void acsUserLogsOut() {
        acsAdminDashboardPage.logout();
    }

    @Then("EPG system displays an error message {string}")
    public void epgSystemDisplaysAnErrorMessage(String errorMsg) {
        Assert.assertEquals(epgLoginPage.getErrorDisplayed(),errorMsg);
    }
    @Then("ACS system displays login page")
    public void acsSystemDisplaysLoginPage() {
        Assert.assertEquals(acsLoginPage.getURL(),Config.acsURL);
    }


    @When("user has entered FM system URL")
    public void userHasEnteredFMSystemURL() {
        driver.get(Config.fMURL);
//        if(Config.browser=="chrome"){
//            try{
//                driver.findElement(By.id("details-button")).click();
//                action=new Actions(driver);
//                action.scrollToElement(driver.findElement(By.id("proceed-link")));
//                driver.findElement(By.id("proceed-link")).click();
//            }catch (Exception e){}
//        }
        fmLoginPage=new FMLoginPage(driver);
        super.fmLoginPage=fmLoginPage;
    }

    @When("user enters {string} into FM Username text field")
    public void userEntersIntoFMUsernameTextField(String userName) {
        fmLoginPage.setTxtUserName(userName);
    }

    @And("user enters {string} into FM into password text field")
    public void userEntersIntoFMIntoPasswordTextField(String password) {
        fmLoginPage.setTxtPassword(password);
    }

    @And("FM user clicks Login button")
    public void userFMClicksLoginButton() {
        fmAdminDashboardPage=fmLoginPage.clickLoginButton();
    }

    @Then("system displays FM Admin dashboard")
    public void systemDisplaysFMAdminDashboard() {
        Assert.assertEquals(fmAdminDashboardPage.getURL(),Config.fmAdminDashboardPageURL);
    }

    @And("FM user clicks logout link")
    public void fmUserClicksLogoutLink() {
        fmLoginPage=null;
        fmLoginPage=fmAdminDashboardPage.clickLinkLogout();
    }

    @Then("FM system logs out and displays FM login page")
    public void fmSystemLogsOutAndDisplaysFMLoginPage() {
        Assert.assertEquals(Config.fmLogoutPageUrl,fmLoginPage.getURL());
    }

    @Then("FM system displays error message {string}")
    public void fmSystemDisplaysErrorMessage(String errorMessage) {
        Assert.assertEquals(fmLoginPage.getErrorMessage(),errorMessage);
    }

    @Then("FM login page displays error message {string} about user")
    public void fmLoginPageDisplaysErrorMessageAboutUser(String emptyUserValidationMessage) {
        Assert.assertEquals(fmLoginPage.getEmptyUserMessage(),emptyUserValidationMessage);
    }

    @And("FM login page displays error message {string} about password")
    public void fmLoginPageDisplaysErrorMessageAboutPassword(String emptyPasswordValidationMessage) {
        Assert.assertEquals(fmLoginPage.getEmptyPasswordMessage(),emptyPasswordValidationMessage);
    }

}
