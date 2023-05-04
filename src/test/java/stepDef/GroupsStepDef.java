package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.GroupsPage;

public class GroupsStepDef extends AbstractPage {
    private WebDriver driver;
    private GroupsPage groupsPage;

    public GroupsStepDef() {
        this.driver = super.driver;
    }

    @And("EPG user clicks Groups submenu")
    public void epgUserClicksGroupsSubmenu() {
        this.groupsPage = epgAdminDashboardPage.clickGroupsMenu();
    }

    @And("EPG user clicks on New Group button")
    public void epgUserClicksOnNewGroupButton() {
        groupsPage.clickNewGroupButton();
    }

    @And("EPG user enters {string} into Name text field")
    public void epgUserEntersIntoNameTextField(String groupName) {
        groupsPage.setGroupNameToGroupTextField(groupName);
    }

    @And("EPG user adds users to this group")
    public void epgUserAddsUsersToThisGroup() {
        groupsPage.addUsersToGroup(4);
    }

    @And("EPG user clicks on the Save New Group button")
    public void epgUserClicksOnTheSaveNewGroupButton() {
        groupsPage.clickSaveButton();
    }

    @And("EPG user enters {string} into group search text field")
    public void epgUserEntersIntoGroupSearchTextField(String groupName) {
        groupsPage.setGroupNameIntoSearchTextField(groupName);
    }

    @And("EPG user clicks on the search icon")
    public void epgUserClicksOnTheSearchIcon() {
        groupsPage.clickSearchIcon();
    }

    @Then("Assert group with groupname of {string} is returned")
    public void assertGroupWithGroupnameOfIsReturned(String groupName) {
        String expectedGroupName = groupsPage.getReturnedGroupName();
        Assert.assertEquals(expectedGroupName, groupName);
    }

    @And("EPG user clicks on the New Permission button")
    public void epgUserClicksOnTheNewPermissionButton() {
        groupsPage.clickNewPermissionButton();
    }

    @And("EPG user clicks on the returned group to view its detail")
    public void epgUserClicksOnTheReturnedGroupToViewItsDetail() {
        groupsPage.openReturnedGroupToViewItsDetail();
    }

    @And("EPG user adds new permissions")
    public void epgUserAddsNewPermissions() {
        groupsPage.addNewPermissionsToGroup();
    }
}
