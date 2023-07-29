package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.threeds.TDSTwoTransactionsPage;

public class TDSTwoTransactionsStepDef extends AbstractPage {
    private WebDriver driver;
    private TDSTwoTransactionsPage tdsTwoTransactionsPage;

    public TDSTwoTransactionsStepDef() {
        this.driver = super.driver;
    }

    @And("DS user clicks on tDSTwoTransactions menu")
    public void dsUserClicksOnTDSTwoTransactionsMenu() {
        tdsTwoTransactionsPage = dsAdminDashboardPage.clickOnTDSTwoTransactions();
    }

    @And("DS user enters {string} into start date text field")
    public void dsUserEntersIntoStartDateTextField(String startDate) {
        tdsTwoTransactionsPage.setStartDate(startDate);
    }

    @And("DS user enters {string} into end date text field")
    public void dsUserEntersIntoEndDateTextField(String endDate) {
        tdsTwoTransactionsPage.setEndDate(endDate);
    }

    @And("DS user enters {string} into DS acquirer bin text field")
    public void dsUserEntersIntoDSAcquirerBinTextField(String arg0) {

    }

    @And("DS user clicks on the Search tdsTwoTransactions button")
    public void dsUserClicksOnTheSearchTdsTwoTransactionsButton() {
        tdsTwoTransactionsPage.clickOnSearchButton();
    }

    @And("DS user enters {string} into pan text field")
    public void dsUserEntersIntoPanTextField(String pan) {
        tdsTwoTransactionsPage.setPanNum(pan);
    }

    @And("DS user selects {string} for issuer")
    public void dsUserSelectsForIssuer(String issuerName) {
        tdsTwoTransactionsPage.setIssuer(issuerName);
    }

    @And("DS user enters {string} into merchant name text field")
    public void dsUserEntersIntoMerchantNameTextField(String merchantName) {
        tdsTwoTransactionsPage.setMerchant(merchantName);
    }

    @And("DS user selects {string} for ARes transaction status")
    public void dsUserSelectsForAResTransactionStatus(String aresTransactionStatus) {
        tdsTwoTransactionsPage.setAResTransStatus(aresTransactionStatus);
    }

    @And("DS user selects {string} for message category")
    public void dsUserSelectsForMessageCategory(String messageCategory) {
        tdsTwoTransactionsPage.setMessageCategory(messageCategory);
    }

    @And("DS user selects {string} for device channel")
    public void dsUserSelectsForDeviceChannel(String deviceChannel) {
        tdsTwoTransactionsPage.setDeviceChannel(deviceChannel);
    }

    @And("DS user selects {string} for protocol version")
    public void dsUserSelectsForProtocolVersion(String protocolVersion) {
        tdsTwoTransactionsPage.setProtocolVersion(protocolVersion);
    }

    @Then("DS user would get {string} in Issuer field and {string} in Acquirer field and {string} in PAN field")
    public void dsUserWouldGetInIssuerFieldAndInAcquirerFieldAndInPANField(String actualIssuer, String actualAcquirerBin, String actualPan) {
        String expectedIssuer = tdsTwoTransactionsPage.getReturnedIssuer();
        Assert.assertEquals(actualIssuer, expectedIssuer);
        String expectedAcquirerBin = tdsTwoTransactionsPage.getReturnedAcquirerBin();
        Assert.assertEquals(actualAcquirerBin, expectedAcquirerBin);
        String expectedPan = tdsTwoTransactionsPage.getReturnedPan();
        Assert.assertEquals(actualPan, expectedPan);
    }

}
