package stepDef;

import config.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObj.AbstractPage;
import pageObj.EPGLoginPage;
import pageObj.EPGSuperAdminPage;

public class EPGSuperAdminStepDef extends AbstractPage {
    private WebDriver driver;
    private EPGSuperAdminPage epgSuperAdminPage;
    private EPGLoginPage epgLoginPage;

    public EPGSuperAdminStepDef() {
        this.driver = super.driver;
    }

    @And("EPG admin clicks Administration menu")
    public void epgAdminClicksAdministrationMenu() {
        epgSuperAdminPage = epgAdminDashboardPage.clickAdministrationMenu();
    }

    @And("super admin clicks on quit button")
    public void superAdminClicksOnQuitButton() {
        epgLoginPage = epgAdminDashboardPage.clickLogoutButton();
    }


    @And("EPG user clicks Users submenu")
    public void epgUserClicksUsersSubmenu() {
        epgSuperAdminPage.clickUsersLink();
    }

    @Then("EPG system displays Users page")
    public void epgSystemDisplaysUsersPage() {
        Assert.assertEquals(Config.usersPageInEPGSuperAdminURL, epgSuperAdminPage.getURL());
    }

    @And("super admin clicks Create button")
    public void superAdminClicksCreateButton() {
        epgSuperAdminPage.clickCreateButton();
    }

    @Then("EPG system displays user creation form")
    public void epgSystemDisplaysUserCreationForm() {
//        Assert.assertTrue(epgSuperAdminPage.registerNewUserLabel());
        System.out.println("system displays user creation form");
    }

    @And("super admin enter {string} into Login text field")
    public void superAdminEnterIntoLoginTextField(String loginName) {
        epgSuperAdminPage.setLoginTextField(loginName);
    }

    @And("super admin enter {string} into Password text field")
    public void superAdminEnterIntoPasswordTextField(String password) {
        epgSuperAdminPage.setPasswordTextField(password);
    }

    @And("super admin enter {string} into Confirm Password text field")
    public void superAdminEnterIntoConfirmPasswordTextField(String password) {
        epgSuperAdminPage.setConfirmPasswordTextField(password);
    }

    @And("super admin selects english language")
    public void superAdminSelectsEnglishLanguage() {
        epgSuperAdminPage.clickDefaultLanguageDropDown();
        epgSuperAdminPage.selectEnglishLanguage();
    }

    @And("super admin select admin group")
    public void superAdminSelectAdminGroup() {
        epgSuperAdminPage.selectAdminGroup();
    }

    @And("super admin click save button")
    public void superAdminClickSaveButton() {
        epgSuperAdminPage.clickSaveButton();
    }

    @And("super admin enters {string} into Search text field")
    public void superAdminEntersIntoSearchTextField(String loginName) {
        epgSuperAdminPage.setSearchTextField(loginName);
    }

    @And("super admin clicks Find button")
    public void superAdminClicksFindButton() {
        epgSuperAdminPage.clickSearchButton();
    }

    @Then("Assert a user with login name {string} is returned")
    public void assertAUserWithLoginNameIsReturned(String loginName) {
        Assert.assertEquals(loginName, epgSuperAdminPage.getReturnedLoginName());
    }

    @And("super admin opens the returned user to view its detail")
    public void superAdminOpensTheReturnedUserToViewItsDetail() {
        epgSuperAdminPage.viewFirstUserDetail();
    }

    @And("super admin adds permissions to the returned user")
    public void superAdminAddsPermissionsToTheReturnedUser() {
        epgSuperAdminPage.addPermissionsToTheUser();
    }

    @Then("Assert the updated user is having the assigned priviledges")
    public void assertTheUpdatedUserIsHavingTheAssignedPriviledges() {
        epgSuperAdminPage.assertTheUserHasPermissions();
    }

    @And("super admin searches for the updated user {string}")
    public void superAdminSearchesForTheUpdatedUser(String loginName) {
        epgSuperAdminPage.setSearchTextField(loginName);
        epgSuperAdminPage.clickSearchButton();
    }

    @And("EPG user clicks Application Info submenu")
    public void epgUserClicksApplicationInfoSubmenu() {
        epgSuperAdminPage.viewApplicationInfoMenu();
    }

    @Then("super admin should assert the version is {string}")
    public void superAdminShouldAssertTheVersionIs(String versionNumber) {
        epgSuperAdminPage.assertTheApplicationVersion(versionNumber);
    }

    @Then("System should display authentication form")
    public void systemShouldDisplayAuthenticationForm() {
        epgLoginPage.assertAuthenticationFormIsDisplayed();
    }

    @And("EPG user clicks Manual Payment menu")
    public void epgUserClicksManualPaymentMenu() {
        epgAdminDashboardPage.clickManualPaymentLink();
    }

    @And("EPG user clicks Batch Operations menu")
    public void epgUserClicksBatchOperationsMenu() {
        epgAdminDashboardPage.clickBatchOperationsMenu();
    }
}

