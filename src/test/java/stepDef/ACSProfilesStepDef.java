package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.acs.ACSProfilesPage;

public class ACSProfilesStepDef extends AbstractPage {
    private WebDriver driver;
    private ACSProfilesPage acsProfilesPage;

    public ACSProfilesStepDef() {
        this.driver = super.driver;
    }

    @And("ACS user clicks on Menu Icon for Profiles")
    public void acsUserClicksOnMenuIconForProfiles() {
        acsProfilesPage = acsAdminDashboardPage.clickOnMenuIconForProfiles();
    }

    @And("ACS user clicks on Profiles menu")
    public void acsUserClicksOnProfilesMenu() {
        acsProfilesPage.clickOnProfilesMenu();
    }

    @And("ACS user clicks on the Add profiles button")
    public void acsUserClicksOnTheAddProfilesButton() {
        acsProfilesPage.clickOnAddButton();
    }

    @And("ACS user enters {string} into name text field")
    public void acsUserEntersIntoNameTextField(String name) {
        acsProfilesPage.setProfileName(name);
    }

    @And("ACS user clicks on the Add range button")
    public void acsUserClicksOnTheAddRangeButton() {
        acsProfilesPage.clickOnAddRangeButton();
    }

    @And("ACS user clicks on the edit icon")
    public void acsUserClicksOnTheEditIcon() {
        acsProfilesPage.clickOnEditIcon();
    }

    @And("ACS user enters {string} into from range text field")
    public void acsUserEntersIntoFromRangeTextField(String fromRange) {
        acsProfilesPage.setFromRange(fromRange);
    }

    @And("ACS user enters {string} into to range text field")
    public void acsUserEntersIntoToRangeTextField(String toRange) {
        acsProfilesPage.setToRange(toRange);
    }

    @And("ACS user checks the corporate checkbox")
    public void acsUserChecksTheCorporateCheckbox() {
        acsProfilesPage.clickOnCorporateCheckbox();
    }

    @And("ACS user clicks on the save range icon")
    public void acsUserClicksOnTheSaveRangeIcon() {
        acsProfilesPage.clickOnSaveRangeIcon();
    }

    @And("ACS user clicks on the Save profile button")
    public void acsUserClicksOnTheSaveProfileButton() {
        acsProfilesPage.clickOnSaveProfileButton();
    }

    @And("ACS user enters {string} into name filter text field")
    public void acsUserEntersIntoNameFilterTextField(String profileName) {
        acsProfilesPage.setProfileNameFilter(profileName);
    }

    @And("ACS user clicks on the Search profile button")
    public void acsUserClicksOnTheSearchProfileButton() {
        acsProfilesPage.clickOnSearchProfileButton();
    }

    @Then("ACS user would get {string} from the returned list of profiles")
    public void acsUserWouldGetFromTheReturnedListOfProfiles(String actualProfileName) {
        String expectedProfileName = acsProfilesPage.returnedProfileName();
        Assert.assertEquals(actualProfileName, expectedProfileName);
    }

    @And("ACS user clicks on the returned profile")
    public void acsUserClicksOnTheReturnedProfile() {
        acsProfilesPage.clickOnReturnedProfile();
    }

    @And("ACS user clicks on the Edit profile button")
    public void acsUserClicksOnTheEditProfileButton() {
        acsProfilesPage.clickOnEditProfileButton();
    }
}
