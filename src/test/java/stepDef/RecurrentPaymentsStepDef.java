package stepDef;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pageObj.AbstractPage;
import pageObj.RecurrentPaymentsPage;

public class RecurrentPaymentsStepDef extends AbstractPage {
    private WebDriver driver;
    private RecurrentPaymentsPage recurrentPaymentsPage;

    public RecurrentPaymentsStepDef() {
        this.driver=super.driver;
    }

    @And("EPG user clicks on the Recurrent Payments menu")
    public void epgUserClicksOnTheRecurrentPaymentsMenu() {
        epgAdminDashboardPage.clickRecurrentPaymentsMenu();
    }

    @And("EPG user enters {string} into merchantOne text field in the Recurrent Payments page")
    public void epgUserEntersIntoMerchantOneTextFieldInTheRecurrentPaymentsPage(String merchantName) {
        recurrentPaymentsPage = epgAdminDashboardPage.sendMerchantToMerchantTextField(merchantName);
    }

    @And("EPG user selects merchantOne in the Recurrent Payments page")
    public void epgUserSelectsMerchantOneInTheRecurrentPaymentsPage() {
        recurrentPaymentsPage.selectMerchantOne();
    }

    @And("EPG user clicks on the Search button in the Recurrent Payments page")
    public void epgUserClicksOnTheSearchButtonInTheRecurrentPaymentsPage() {
        recurrentPaymentsPage.clickOnSearchButton();
    }

    @And("EPG user enters {string} into the pan text field")
    public void epgUserEntersIntoThePanTextField(String panNumber) {
        recurrentPaymentsPage.setPanNumber(panNumber);
    }
}
