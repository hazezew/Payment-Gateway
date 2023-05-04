package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.APIUserPage;
import pageObj.AbstractPage;

public class APIUsersStepDef extends AbstractPage {
    private WebDriver driver;
    private APIUserPage apiUsersPage;

    public APIUsersStepDef() {
        this.driver = super.driver;
    }

//    @And("EPG user clicks Administration menu")
//    public void epgUserClicksAdministrationMenu() {
//        epgAdminDashboardPage.clickLinkAdministration();
//    }

    @And("EPG user clicks api Users submenu")
    public void epgUserClicksApiUsersSubmenu() {
        apiUsersPage = epgAdminDashboardPage.clickAPIUsersMenu();
    }

    @And("EPG user clicks on Create api button")
    public void epgUserClicksOnCreateApiButton() {
        apiUsersPage.clickCreateAPIUserButton();
    }

    @And("EPG user enters {string} into login text field")
    public void epgUserEntersIntoLoginTextField(String loginName) {
        apiUsersPage.setLoginIntoLoginTextField(loginName);
    }

    @And("EPG user clicks on default language dropdown")
    public void epgUserClicksOnDefaultLanguageDropdown() {
        apiUsersPage.clickDefaultLangDropDown();
    }

    @And("EPG user selects EN language")
    public void epgUserSelectsENLanguage() {
        apiUsersPage.selectEnglishLanguage();
    }

    @And("EPG user enters {string} into password text field")
    public void epgUserEntersIntoPasswordTextField(String password) {
        apiUsersPage.setPasswordIntoPasswordTextField(password);
    }

    @And("EPG user enters {string} into confirm password text field")
    public void epgUserEntersIntoConfirmPasswordTextField(String password) {
        apiUsersPage.setConfirmPasswordIntoConfirmPasswordTextField(password);
    }

    @And("EPG user clicks on the Save button")
    public void epgUserClicksOnTheSaveButton() {
        apiUsersPage.clickSaveButton();
    }

    @And("EPG user enters {string} into merchant text field")
    public void epgUserEntersIntoMerchantTextField(String merchantName) {
        apiUsersPage.setMerchantIntoMerchantTextField(merchantName);

    }

    @Then("The System displays {string} message")
    public void theSystemDisplaysMessage(String errorMessage) {
        String errMessage = apiUsersPage.getValidationErrorMessage();
        Assert.assertTrue(errMessage.contains(errorMessage));
    }

    @And("EPG user enters {string} into search text field")
    public void epgUserEntersIntoSearchTextField(String loginName) {
        apiUsersPage.setLoginNameToSearchTextField(loginName);
    }

    @And("EPG user clicks on the Find button")
    public void epgUserClicksOnTheFindButton() {
        apiUsersPage.clickFindButton();
    }

    @Then("Assert API user with {string} is returned")
    public void assertAPIUserWithIsReturned(String loginName) {
        String returnedAPIUserLoginName = apiUsersPage.getSearchedAPIUserLoginName();
        Assert.assertEquals(returnedAPIUserLoginName, loginName);
    }

    @Then("EPG user opens the returned user to view its detail")
    public void epgUserOpensTheReturnedUserToViewItsDetail() {
        apiUsersPage.openReturedUserToViewItsDetail();
    }

    @And("EPG user adds permissions to this user")
    public void epgUserAddsPermissionsToThisUser() {
        apiUsersPage.addPermissionsToAPIUser();
    }

    @And("EPG user clicks on the Save api user button")
    public void epgUserClicksOnTheSaveApiUserButton() {
        apiUsersPage.clickSaveButton();
    }

    @And("EPG user searches for the updated user {string}")
    public void epgUserSearchesForTheUpdatedUser(String loginName) {
        apiUsersPage.setLoginIntoLoginTextField(loginName);
        apiUsersPage.clickFindButton();
    }

    @Then("Assert the updated api user is having the assigned priviledges")
    public void assertTheUpdatedApiUserIsHavingTheAssignedPriviledges() {

    }
}
