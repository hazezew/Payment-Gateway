package stepDef;

import config.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.OrderAndPaymentDetailed;
import pageObj.OrderPage;

public class OrderStepDef extends AbstractPage {
    private WebDriver driver;
    private OrderPage orderPage;
    private OrderAndPaymentDetailed orderAndPaymentDetailed;

    public OrderStepDef(){
        this.driver=super.driver;
    }

    @And("EPG user clicks Orders menu")
    public void epgUserClicksOrdersMenu() {
        orderPage=epgAdminDashboardPage.clickLinkOrder();
    }

    @Then("EPG system displays Order management page")
    public void epgSystemDisplaysOrderManagementPage() {
        Assert.assertEquals(Config.orderPageURL,orderPage.getURL());
    }

    @And("EPG user clicks Order Search button")
    public void epgUserClicksOrderSearchButton() {
        orderPage.clickBtnSearch();
    }

    @And("user selects merchant {string} from merchant list")
    public void userSelectsMerchantFromMerchantList(String merchantName) {
        orderPage.selectMerchant(merchantName);
    }

    @And("EPG user enters Feb first from From Calendar selection")
    public void epgUserEntersFebFirstFromFromCalendarSelection() {
        orderPage.selectFromDate();
    }

    @And("EPG user enters Feb last from To Calendar selection")
    public void epgUserEntersFebLastFromToCalendarSelection() {
        orderPage.selectToDate();
    }

    @And("EPG user enters {string} into Order Number text field")
    public void epgUserEntersIntoOrderNumberTextfield(String orderNumber) {
        orderPage.enterTxtOrderNumber(orderNumber);
    }

    @Then("EPG user clicks Order number {string}")
    public void epgUserClicksOrderNumber(String orderNumber) {
        orderAndPaymentDetailed=orderPage.clickOrderNumber(orderNumber);
    }

    @And("EPG system displays Order and Payment Detailed Information")
    public void epgSystemDisplaysOrderAndPaymentDetailedInformation() {
        orderAndPaymentDetailed.isLblMerchantNameDisplayed();
    }

    @And("EPG system also displays Order number {string}")
    public void epgSystemAlsoDisplaysOrderNumber(String orderNumber) {
        Assert.assertTrue(orderAndPaymentDetailed.isOrderNumberDisplayed(orderNumber));
    }

//    public void closeParentWindow(){
//        driver.switchTo().window(AbstractPage.getParentWindow());
//        driver.close();
//    }
}