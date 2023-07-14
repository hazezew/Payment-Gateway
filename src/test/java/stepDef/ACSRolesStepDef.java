package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObj.acs.ACSRolesPage;
import pageObj.AbstractPage;

public class ACSRolesStepDef extends AbstractPage {

    private WebDriver driver;
    private ACSRolesPage acsRolesPage;
    private boolean expected;

    public ACSRolesStepDef() {
        this.driver = super.driver;
    }

    @And("ACS user clicks on Menu Icon for Role")
    public void acsUserClicksOnMenuIconForRole() {
        acsRolesPage = acsAdminDashboardPage.clickOnMenuIconForRole();
    }

    @And("ACS user clicks on Roles menu")
    public void acsUserClicksOnRolesMenu() {
        acsRolesPage.clickOnRolesMenu();
    }


    @And("ACS user clicks on the Add role button")
    public void acsUserClicksOnTheAddRoleButton() {
        acsRolesPage.clickOnAddButton();
    }

    @And("ACS user enters {string} to name text field")
    public void acsUserEntersToNameTextField(String name) {
        acsRolesPage.setName(name);
    }

    @And("ACS user adds permissions to the role")
    public void acsUserAddsPermissionsToTheRole() {
        acsRolesPage.addPermissionsToARole();
    }

    @And("ACS user clicks on the Save role button")
    public void acsUserClicksOnTheSaveRoleButton() {
        acsRolesPage.clickOnSaveButton();
    }

    @Then("ACS user would get {string} from the list of roles page")
    public void acsUserWouldGetFromTheListOfRolesPage(String role) {
        boolean expected = acsRolesPage.searchForAddedRole(role);
        Assert.assertTrue(expected);
    }

    @And("ACS user searches for available role {string}")
    public void acsUserSearchesForAvailableRole(String role) {
        boolean expected = acsRolesPage.searchForARole(role);
        Assert.assertTrue(expected);
    }

    @And("ACS user searches for unavailable role {string}")
    public void acsUserSearchesForUnavailableRole(String role) {
        expected = acsRolesPage.searchForARole(role);
//        Assert.assertFalse(expected);
    }

    @And("ACS user searches for available role {string} and deletes it")
    public void acsUserSearchesForAvailableRoleAndDeletesIt(String role) {
        acsRolesPage.searchAndDeleteRole(role);
    }

    @And("ACS user searches for deleted role {string}")
    public void acsUserSearchesForDeletedRole(String role) {
        expected = acsRolesPage.searchForARole(role);
//        Assert.assertFalse(expected);
    }

    @Then("The system should return false which means no role is found")
    public void theSystemShouldReturnFalseWhichMeansNoRoleIsFound() {
        Assert.assertFalse(expected);
    }
}
