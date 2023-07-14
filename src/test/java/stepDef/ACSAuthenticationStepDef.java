package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.acs.ACSAuthenticationPage;

public class ACSAuthenticationStepDef extends AbstractPage {
    private WebDriver driver;
    private ACSAuthenticationPage acsAuthenticationPage;

    public ACSAuthenticationStepDef() {
        this.driver = super.driver;
    }

    @And("ACS user clicks on Menu Icon for Authentication")
    public void acsUserClicksOnMenuIconForAuthentication() {
        acsAuthenticationPage = acsAdminDashboardPage.clickOnAuthentication();
    }

    @And("ACS user clicks on Authentication menu")
    public void acsUserClicksOnAuthenticationMenu() {
        acsAuthenticationPage.clickOnAuthenticationMenu();
    }

    @And("ACS user enters {string} into card number text field in authentication page")
    public void acsUserEntersIntoCardNumberTextFieldInAuthenticationPage(String cardNumber) {
        acsAuthenticationPage.setCardNumberFilter(cardNumber);
    }

    @And("ACS user selects {string} for profile in authentication page")
    public void acsUserSelectsForProfileInAuthenticationPage(String profile) {
        acsAuthenticationPage.selectProfile(profile);
    }

    @And("ACS user clicks on the Search authentication button")
    public void acsUserClicksOnTheSearchAuthenticationButton() {
        acsAuthenticationPage.clickOnSearchButton();
    }

    @Then("ACS user would get {string} in profile field in authentication page")
    public void acsUserWouldGetInProfileFieldInAuthenticationPage(String actualProfile) {
        String expectedProfile = acsAuthenticationPage.getReturnedProfileName();
        Assert.assertEquals(actualProfile, expectedProfile);
    }
}
