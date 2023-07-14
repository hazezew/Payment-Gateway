package stepDef;

import config.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.AuditPage;

public class AuditStepDef extends AbstractPage {
    private WebDriver driver;
    private AuditPage auditPage;

    public AuditStepDef(){
        this.driver=super.driver;
    }
    
    @And("EPG user clicks Audit menu")
    public void epgUserClicksAuditMenu() {
        auditPage=epgAdminDashboardPage.clickLinkAudit();
    }

    @Then("EPG system displays Audit management page")
    public void epgSystemDisplaysAuditManagementPage() {
        Assert.assertEquals(Config.auditPageURL,auditPage.getURL());
    }

    @And("EPG user clicks Audit Search button")
    public void epgUserClicksAuditSearchButton() {
        auditPage.clickBtnFind();
    }

    @And("EPG user selects {string} from audit users dropdown list")
    public void epgUserSelectsFromAuditUsersDropdownList(String user) {
        auditPage.selectUser(user);
    }

    @And("EPG user selects {string} from audit Actions checklist")
    public void epgUserSelectsFromAuditActionsChecklist(String action) {
        auditPage.selectAction(action);
    }

    @And("EPG user selects Feb first from Audit from date")
    public void epgUserSelectsFebFirstFromAuditFromDate() {
        auditPage.selectFeb1();
    }

}
