package stepDef;

import config.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.ACSLoginPage;
import pageObj.AbstractPage;
import pageObj.DSAdminDashboardPage;
import pageObj.DSLoginPage;

public class DSLoginStepDef extends AbstractPage {
    private WebDriver driver;

    private DSLoginPage dsLoginPage;

    public DSLoginStepDef() {
        this.driver = super.driver;
    }

    @When("DS user has entered DS system URL")
    public void dsUserHasEnteredDSSystemURL() {
        driver.get(Config.dsURL);
        dsLoginPage = new DSLoginPage(driver);
        super.dsLoginPage = dsLoginPage;
    }

    @When("DS user enters {string} into DS Username text field")
    public void dsUserEntersIntoDSUsernameTextField(String username) {
        dsLoginPage.setUsernameTextField(username);
    }

    @And("DS user enters {string} into DS into password text field")
    public void dsUserEntersIntoDSIntoPasswordTextField(String password) {
        dsLoginPage.setPasswordTextField(password);
    }

    @And("DS user clicks DS Login button")
    public void dsUserClicksDSLoginButton() {
        dsAdminDashboardPage = dsLoginPage.clickLoginButton();

    }

    @Then("system displays DS Admin dashboard")
    public void systemDisplaysDSAdminDashboard() {
        Assert.assertEquals(Config.dsAdminDashboard, dsAdminDashboardPage.getURL());

    }
}
