package stepDef;

import config.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.RefundsPage;

public class RefundsStepDef extends AbstractPage {
    private WebDriver driver;
    private RefundsPage refundsPage;

    public RefundsStepDef(){
        this.driver=super.driver;
    }

    @And("EPG user clicks Refunds menu")
    public void epgUserClicksRefundsMenu() {
        refundsPage= epgAdminDashboardPage.clickLinkRefunds();
    }

    @Then("EPG system displays Refunds management page")
    public void epgSystemDisplaysRefundsManagementPage() {
        Assert.assertEquals(Config.refundPageURL,refundsPage.getURL());
    }

    @And("EPG user clicks Refunds Search button")
    public void epgUserClicksRefundsSearchButton() {
        refundsPage.clickBtnSearch();
    }

    @And("user selects merchant {string} from Refunds merchant list")
    public void userSelectsMerchantFromRefundsMerchantList(String merchant) {
        refundsPage.selectMerchant(merchant);
    }

    @And("EPG user selects Feb first from Refunds from date calender")
    public void epgUserSelectsFebFirstFromRefundsFromDateCalender() {
        refundsPage.selectFeb1();
    }
}
