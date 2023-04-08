package stepDef;

import config.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.CasesQueuePage;

public class FraudManagementStepDef extends AbstractPage {
    private WebDriver driver;
    private CasesQueuePage casesQueuePage;

    public  FraudManagementStepDef(){
        this.driver=super.driver;
    }

    @And("FM user clicks on Fraud Management main menu")
    public void fmUserClicksOnFraudManagementMainMenu() {
        fmAdminDashboardPage.clickLnkFraudManagement();
    }

    @And("FM user moves mouse over Case management submenu")
    public void fmUserMovesMouseOverCaseManagementSubmenu() {
        fmAdminDashboardPage.hoverLnkCaseManagement();
    }

    @And("FM clicks on Cases queue child menu")
    public void fmClicksOnCasesQueueChildMenu() {
        casesQueuePage=fmAdminDashboardPage.clickLnkCasesQueue();
    }

    @Then("FM system displays Cases queue page")
    public void fmSystemDisplaysCasesQueuePage() {
        Assert.assertTrue(casesQueuePage.getURL().contains(Config.fmCasesQueuePageURL));
    }

    @And("FM user selects {string} from Entity Type dropdown")
    public void fmUserSelectsFromEntityTypeDropdown(String entityType) {
        casesQueuePage.setDDEntityType(entityType);
    }

    @And("FM user selects {string} from Locked by user dropdown")
    public void fmUserSelectsFromLockedByUserDropdown(String lockedBy) {
        casesQueuePage.setDDLockedBy(lockedBy);
    }

    @And("FM user selects {string} from Classification type dropdown")
    public void fmUserSelectsFromClassificationTypeDropdown(String classificationType) {
        casesQueuePage.setClassificationType(classificationType);
    }

    @And("FM user selects {string} from Forwarded dropdown")
    public void fmUserSelectsFromForwardedDropdown(String forwarded) {
        casesQueuePage.setForwarded(forwarded);
    }

    @And("FM user clicks on search button")
    public void fmUserClicksOnSearchButton() {
        casesQueuePage.clickIconSearch();
    }
}
