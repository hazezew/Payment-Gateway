package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.acs.ACSAuditPage;

public class ACSAuditStepDef extends AbstractPage {
    private WebDriver driver;
    private ACSAuditPage acsAuditPage;

    public ACSAuditStepDef() {
        this.driver = super.driver;
    }

    @And("ACS user clicks on Menu Icon for Audit")
    public void acsUserClicksOnMenuIconForAudit() {
        acsAuditPage = acsAdminDashboardPage.clickOnAudit();
    }

    @And("ACS user clicks on Audit menu")
    public void acsUserClicksOnAuditMenu() {
        acsAuditPage.clickOnAuditMenu();
    }

    @And("ACS user selects a starting date time for start date from filter")
    public void acsUserSelectsAStartingDateTimeForStartDateFromFilter() {
        acsAuditPage.selectStartDate();
    }

    @And("ACS user selects an ending date time for end date to filter")
    public void acsUserSelectsAnEndingDateTimeForEndDateToFilter() {
        acsAuditPage.selectEndDate();
    }

    @And("ACS user selects {string} for event type filter of audit")
    public void acsUserSelectsForEventTypeFilterOfAudit(String eventType) {
        acsAuditPage.setEventType(eventType);
    }

    @And("ACS user selects {string} for object type filter")
    public void acsUserSelectsForObjectTypeFilter(String objectType) {
        acsAuditPage.setObjectType(objectType);
    }

    @And("ACS user clicks on the Search audit button")
    public void acsUserClicksOnTheSearchAuditButton() {
        acsAuditPage.clickOnSearchButton();
    }

    @Then("ACS user would get {string} in event type field of audit page")
    public void acsUserWouldGetInEventTypeFieldOfAuditPage(String actualEventType) {
        String expectedEventType = acsAuditPage.getReturnedEventType();
        Assert.assertEquals(actualEventType, expectedEventType);
    }
}
