package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.threeds.TDSActionsAuditPage;

public class TDSActionsAuditStepDef extends AbstractPage {
    private WebDriver driver;
    private TDSActionsAuditPage tdsActionsAuditPage;

    public TDSActionsAuditStepDef() {
        this.driver = super.driver;
    }


    @And("DS user clicks on Audit menu for actions")
    public void dsUserClicksOnAuditMenuForActions() {
        dsAdminDashboardPage.clickOnAuditMenu();
    }
    @And("DS user clicks on Actions sub menu")
    public void dsUserClicksOnActionsSubMenu() {
        tdsActionsAuditPage = dsAdminDashboardPage.clickOnActionsSubMenu();
    }

    @And("DS user enters {string} into Start Date field of actions audit")
    public void dsUserEntersIntoStartDateFieldOfActionsAudit(String startD) {
        tdsActionsAuditPage.setStartDate(startD);
    }

    @And("DS user enters {string} into End Date field of actions audit")
    public void dsUserEntersIntoEndDateFieldOfActionsAudit(String endD) {
        tdsActionsAuditPage.setEndDate(endD);
    }

    @And("DS user selects {string} for action type")
    public void dsUserSelectsForActionType(String actionType) {
        tdsActionsAuditPage.setActionType(actionType);
    }

    @And("DS user clicks on the Search actions audit button")
    public void dsUserClicksOnTheSearchActionsAuditButton() {
        tdsActionsAuditPage.clickOnSearchButton();
    }

    @Then("DS user would get {string} in action type field")
    public void dsUserWouldGetInActionTypeField(String actualActionType) {
        String expectedActionType = tdsActionsAuditPage.returnedActionType();
        Assert.assertEquals(actualActionType, expectedActionType);
    }
}
