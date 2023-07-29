package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.threeds.TDSListCardRangesPage;

public class TDSListCardRangesStepDef extends AbstractPage {
    private WebDriver driver;
    private TDSListCardRangesPage tdsListCardRangesPage;

    public TDSListCardRangesStepDef() {
        this.driver = super.driver;
    }


    @And("DS user clicks on Card Ranges menu")
    public void dsUserClicksOnCardRangesMenu() {
        dsAdminDashboardPage.clickOnCardRangesMenu();
    }

    @And("DS user clicks on List Card Ranges sub menu")
    public void dsUserClicksOnListCardRangesSubMenu() {
        tdsListCardRangesPage = dsAdminDashboardPage.clickOnListCardRangesSubMenu();
    }

    @And("DS user enters {string} into pan filter text field")
    public void dsUserEntersIntoPanFilterTextField(String panNum) {
        tdsListCardRangesPage.setPanFilter(panNum);
    }

    @And("DS user clicks on the Search DS card ranges button")
    public void dsUserClicksOnTheSearchDSCardRangesButton() {
        tdsListCardRangesPage.clickOnSearchButton();
    }

    @Then("DS user would get {string} in start range field and {string} in end range field and {string} in Issuer field")
    public void dsUserWouldGetInStartRangeFieldAndInEndRangeFieldAndInIssuerField(String actualStartRange, String actualEndRange, String actualIssuer) {
        String expectedStartRange = tdsListCardRangesPage.getReturnedStartRange();
        Assert.assertEquals(actualStartRange, expectedStartRange);
        String expectedEndRange = tdsListCardRangesPage.getReturnedEndRange();
        Assert.assertEquals(actualEndRange, expectedEndRange);
        String expectedIssuer = tdsListCardRangesPage.getReturnedIssuer();
        Assert.assertEquals(actualIssuer, expectedIssuer);
    }

    @And("DS user clicks on the Edit tds list of card ranges icon")
    public void dsUserClicksOnTheEditTdsListOfCardRangesIcon() {
        tdsListCardRangesPage.clickOnEditIcon();
    }

    @And("DS user selects {string} for attempts to tdsOne transactions")
    public void dsUserSelectsForAttemptsToTdsOneTransactions(String status) {
        tdsListCardRangesPage.setTdsOneAttemptsStatus(status);
    }

    @And("DS user selects {string} for attempts to tdsTwo transactions")
    public void dsUserSelectsForAttemptsToTdsTwoTransactions(String status) {
        tdsListCardRangesPage.setTdsTwoAttemptStatus(status);
    }

    @And("DS user clicks on the Update Card Range button")
    public void dsUserClicksOnTheUpdateCardRangeButton() {
        tdsListCardRangesPage.clickOnUpdateCardRangeButton();
    }

    @Then("DS user would get {string} in attempts for tdsOne transactions field and {string} in attempts for tdsTwo transactions field")
    public void dsUserWouldGetInAttemptsForTdsOneTransactionsFieldAndInAttemptsForTdsTwoTransactionsField(String actualStatusOne, String actualStatusTwo) {
        String expectedStatusOne = tdsListCardRangesPage.getReturnedTdsOneAttemptsStatus();
        Assert.assertEquals(actualStatusOne, expectedStatusOne);
        String expectedStatusTwo = tdsListCardRangesPage.getReturnedTdsTwoAttemptsStatus();
        Assert.assertEquals(actualStatusTwo, expectedStatusTwo);
    }

    @And("DS user enters {string} into threeDSMethod url text field")
    public void dsUserEntersIntoThreeDSMethodUrlTextField(String tdsUrl) {
        tdsListCardRangesPage.setTdsMethodUrl(tdsUrl);
    }

}
