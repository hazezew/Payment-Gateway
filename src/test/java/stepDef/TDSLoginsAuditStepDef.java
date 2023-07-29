package stepDef;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pageObj.AbstractPage;
import pageObj.threeds.TDSLoginsAuditPage;

public class TDSLoginsAuditStepDef extends AbstractPage {
    private WebDriver driver;
    private TDSLoginsAuditPage tdsLoginsAuditPage;

    public TDSLoginsAuditStepDef() {
        this.driver = super.driver;
    }

    @And("DS user clicks on Audit menu")
    public void dsUserClicksOnAuditMenu() {
        dsAdminDashboardPage.clickOnAuditMenu();
    }


    @And("DS user clicks on Logins sub menu")
    public void dsUserClicksOnLoginsSubMenu() {
        tdsLoginsAuditPage = dsAdminDashboardPage.clickOnLoginsSubMenu();
    }

    @And("DS user enters {string} into Start Date field")
    public void dsUserEntersIntoStartDateField(String startD) {
        tdsLoginsAuditPage.setStartDate(startD);
    }

    @And("DS user enters {string} into End Date field")
    public void dsUserEntersIntoEndDateField(String endD) {
        tdsLoginsAuditPage.setEndDate(endD);
    }

    @And("DS user clicks on the Search logins audit button")
    public void dsUserClicksOnTheSearchLoginsAuditButton() {
        tdsLoginsAuditPage.clickOnSearchButton();
    }
}
