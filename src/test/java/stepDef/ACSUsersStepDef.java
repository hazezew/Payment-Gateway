package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.ACSUsersPage;
import pageObj.APIUserPage;
import pageObj.AbstractPage;

public class ACSUsersStepDef extends AbstractPage {
    private WebDriver driver;
    private ACSUsersPage acsUsersPage;

    public ACSUsersStepDef() {
        this.driver = super.driver;
    }

//    @And("EPG user clicks Administration menu")
//    public void epgUserClicksAdministrationMenu() {
//        epgAdminDashboardPage.clickLinkAdministration();
//    }
//

    @And("ACS user clicks on Menu Icon")
    public void acsUserClicksOnMenuIcon() {
        acsUsersPage = acsAdminDashboardPage.clickOnMenuIcon();
    }


    @And("ACS user clicks on Users menu")
    public void acsUserClicksOnUsersMenu() {
        acsUsersPage.clickOnUsersMenu();
    }

    @And("ACS user clicks on the Add button")
    public void acsUserClicksOnTheAddButton() {
        acsUsersPage.clickOnAddButton();
    }

    @And("ACS user enters {string} in to the name text field")
    public void acsUserEntersInToTheNameTextField(String name) {
        acsUsersPage.setNameTextField(name);
    }

    @And("ACS user clicks on the profile dropdown")
    public void acsUserClicksOnTheProfileDropdown() {
        acsUsersPage.clickOnProfileDropdown();
    }

    @And("ACS user selects Bunna profile")
    public void acsUserSelectsBunnaProfile() {
        acsUsersPage.selectBunnaProfile();
    }

    @And("Acs user enters {string} in to the login text field")
    public void acsUserEntersInToTheLoginTextField(String login) {
        acsUsersPage.setLoginTextField(login);
    }

    @And("ACS user enters {string} in to the password text field")
    public void acsUserEntersInToThePasswordTextField(String password) {
        acsUsersPage.setPasswordTextField(password);
    }

    @And("ACS user enters {string} in to the confirmation text field")
    public void acsUserEntersInToTheConfirmationTextField(String password) {
        acsUsersPage.setPasswordConfirmationTextField(password);
    }

    @And("ACS user unchecks change password checkbox")
    public void acsUserUnchecksChangePasswordCheckbox() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        acsUsersPage.uncheckChangePasswordCheckbox();
    }

    @And("ACS user adds roles for the user")
    public void acsUserAddsRolesForTheUser() {
        acsUsersPage.addRoleAdminRole();
    }

    @And("ACS user clicks on the Add acs user button")
    public void acsUserClicksOnTheAddAcsUserButton() {
        acsUsersPage.addACSUserButton();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @And("ACS user enters {string} into login text field")
    public void acsUserEntersIntoLoginTextField(String loginName) {
        acsUsersPage.setLoginFilterTextField(loginName);
    }

    @And("ACS user clicks on the Search button")
    public void acsUserClicksOnTheSearchButton() {
        acsUsersPage.clickOnSearchButton();
    }

    @Then("The system should return {string}")
    public void theSystemShouldReturn(String loginName) {
        String returnedUserName = acsUsersPage.searchedUserName();
        System.out.println(returnedUserName);
        Assert.assertEquals(returnedUserName, loginName);
    }

    @And("ACS user selects the returned user")
    public void acsUserSelectsTheReturnedUser() {
        acsUsersPage.clickOnTheReturnedUser();
    }

    @And("ACS user clicks on the Edit button")
    public void acsUserClicksOnTheEditButton() {
        acsUsersPage.clickOnTheEditButton();
    }
}
