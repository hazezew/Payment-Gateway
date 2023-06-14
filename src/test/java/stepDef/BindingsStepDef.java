package stepDef;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pageObj.AbstractPage;
import pageObj.BindingsPage;
import pageObj.JasperReportsPage;

public class BindingsStepDef extends AbstractPage {
    private WebDriver driver;
    private BindingsPage bindingsPage;

    public  BindingsStepDef() {
        this.driver = super.driver;
    }


    @And("EPG user clicks on the Bindings menu")
    public void epgUserClicksOnTheBindingsMenu() {
        epgAdminDashboardPage.clickBindingsMenu();
    }

    @And("EPG user enters {string} into merchantOne text field")
    public void epgUserEntersIntoMerchantOneTextField(String merchantName) {
        bindingsPage = epgAdminDashboardPage.sendKeysToMerchantTextField(merchantName);
    }

    @And("EPG user selects merchantOne")
    public void epgUserSelectsMerchantOne() {
        bindingsPage.selectMerchantOne();
    }


    @And("EPG user clicks on the Search button")
    public void epgUserClicksOnTheSearchButton() {
        bindingsPage.clickOnSearchButton();

    }

}
