package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.threeds.TDSBatchUploadHistoryPage;

public class TDSBatchUploadHistoryStepDef extends AbstractPage {
    private WebDriver driver;
    private TDSBatchUploadHistoryPage tdsBatchUploadHistoryPage;

    public TDSBatchUploadHistoryStepDef() {
        this.driver = super.driver;
    }

    @And("DS user clicks on Batch Upload History sub menu")
    public void dsUserClicksOnBatchUploadHistorySubMenu() {
        tdsBatchUploadHistoryPage = dsAdminDashboardPage.clickOnBatchUploadHistorySubMenu();
    }

    @And("DS user enters {string} into start date field")
    public void dsUserEntersIntoStartDateField(String startDate) {
        tdsBatchUploadHistoryPage.setStartDate(startDate);
    }

    @And("DS user enters {string} into end date field")
    public void dsUserEntersIntoEndDateField(String endDate) {
        tdsBatchUploadHistoryPage.setEndDate(endDate);
    }

    @And("DS user selects {string} for processing result in batch upload history")
    public void dsUserSelectsForProcessingResultInBatchUploadHistory(String processResult) {
        tdsBatchUploadHistoryPage.setProcessingResult(processResult);
    }

    @And("DS user selects {string} for issuer in batch upload history")
    public void dsUserSelectsForIssuerInBatchUploadHistory(String issuer) {
        tdsBatchUploadHistoryPage.setIssuer(issuer);
    }

    @And("DS user clicks on the Search batch upload history button")
    public void dsUserClicksOnTheSearchBatchUploadHistoryButton() {
        tdsBatchUploadHistoryPage.clickOnSearchButton();
    }

    @Then("DS user would get {string} in issuer field and {string} in result field")
    public void dsUserWouldGetInIssuerFieldAndInResultField(String actualIssuer, String actualResult) {
        String expectedIssuer = tdsBatchUploadHistoryPage.getReturnedIssuer();
        Assert.assertEquals(actualIssuer, expectedIssuer);
        String expectedResult = tdsBatchUploadHistoryPage.getReturnedResult();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
