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
}
