package stepDef;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pageObj.AbstractPage;
import pageObj.threeds.TDSOperatorRolesPage;

public class TDSOperatorRolesStepDef extends AbstractPage {
    private WebDriver driver;
    private TDSOperatorRolesPage operatorRolesPage;

    public TDSOperatorRolesStepDef() {
        this.driver = super.driver;
    }


    @And("DS user clicks on Administration menu for tds list operator roles")
    public void dsUserClicksOnAdministrationMenuForTdsListOperatorRoles() {
        dsAdminDashboardPage.clickOnAdministrationMenu();
    }

    @And("DS user clicks on list operator roles sub menu")
    public void dsUserClicksOnListOperatorRolesSubMenu() {
        operatorRolesPage = dsAdminDashboardPage.clickOnTDSListOperatorRolesSubMenu();
    }
}
