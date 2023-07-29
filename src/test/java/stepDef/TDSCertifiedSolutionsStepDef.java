package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.threeds.TDSCertifiedSolutionsPage;

public class TDSCertifiedSolutionsStepDef extends AbstractPage {
    private WebDriver driver;
    private TDSCertifiedSolutionsPage tdsCertifiedSolutionsPage;

    public TDSCertifiedSolutionsStepDef() {
        this.driver = super.driver;
    }

    @And("DS user clicks on Administration menu for tds certified solutions")
    public void dsUserClicksOnAdministrationMenuForTdsCertifiedSolutions() {
        dsAdminDashboardPage.clickOnAdministrationMenu();
    }

    @And("DS user clicks on tds certified solutions sub menu")
    public void dsUserClicksOnTdsCertifiedSolutionsSubMenu() {
        tdsCertifiedSolutionsPage = dsAdminDashboardPage.clickOnTDSServCertSolutionSubMenu();
    }

    @And("DS user enters {string} into tds server reference number")
    public void dsUserEntersIntoTdsServerReferenceNumber(String tdsServRefNum) {
        tdsCertifiedSolutionsPage.setTdsServCertSolRefNum(tdsServRefNum);
    }

    @And("DS user selects {string} for supported protocol version")
    public void dsUserSelectsForSupportedProtocolVersion(String protocolVer) {
        tdsCertifiedSolutionsPage.selectSupportedProtocolVersion(protocolVer);
    }

    @And("DS user checks valid only checkbox")
    public void dsUserChecksValidOnlyCheckbox() {
        tdsCertifiedSolutionsPage.checkValidOnlyCheckbox();
    }

    @And("DS user clicks on the Search tds certified solutions button")
    public void dsUserClicksOnTheSearchTdsCertifiedSolutionsButton() {
        tdsCertifiedSolutionsPage.clickOnSearchButton();
    }

    @Then("DS user would get {string} in tds server ref num field and {string} in protocol version field")
    public void dsUserWouldGetInTdsServerRefNumFieldAndInProtocolVersionField(String actualRefNum, String actualProtocolVersion) {
        String expectedRefNum = tdsCertifiedSolutionsPage.getReturnedRefNum();
        Assert.assertEquals(actualRefNum, expectedRefNum);
        String expectedProtocolVersion = tdsCertifiedSolutionsPage.getReturnedProtocolVersion();
        Assert.assertEquals(actualProtocolVersion, expectedProtocolVersion);
    }

    @And("DS user clicks on the Add tds server certified solution")
    public void dsUserClicksOnTheAddTdsServerCertifiedSolution() {
        tdsCertifiedSolutionsPage.clickOnAddTDSServerCertSolutionButton();
    }

    @And("DS user enters {string} into approval date field")
    public void dsUserEntersIntoApprovalDateField(String appDate) {
        tdsCertifiedSolutionsPage.setApprovalDate(appDate);
    }

    @And("DS user enters {string} into approval expiration date field")
    public void dsUserEntersIntoApprovalExpirationDateField(String approvalExpDate) {
        tdsCertifiedSolutionsPage.setApprovalExpiredDate(approvalExpDate);
    }

    @And("Ds user enters {string} into tds server reference number text field")
    public void dsUserEntersIntoTdsServerReferenceNumberTextField(String tdsServRefNum) {
        tdsCertifiedSolutionsPage.setRefNumber(tdsServRefNum);
    }

    @And("DS user selects {string} for start protocol version")
    public void dsUserSelectsForStartProtocolVersion(String startProtocolVersion) {
        tdsCertifiedSolutionsPage.selectStartingProtocolVersion(startProtocolVersion);
    }

    @And("DS user selects {string} for end protocol version")
    public void dsUserSelectsForEndProtocolVersion(String endProtocolVersion) {
        tdsCertifiedSolutionsPage.selectEndingProtocolVersion(endProtocolVersion);
    }

    @And("DS user clicks on the Save tds server solution button")
    public void dsUserClicksOnTheSaveTdsServerSolutionButton() {
        tdsCertifiedSolutionsPage.clickOnSaveTDSServSolutionButton();
    }

    @And("DS user clicks on the delete tds certified solution icon")
    public void dsUserClicksOnTheDeleteTdsCertifiedSolutionIcon() {
        tdsCertifiedSolutionsPage.clickOnDeleteIcon();
    }

    @And("DS user clicks on the Yes button to confirm deletion of tds certified solution")
    public void dsUserClicksOnTheYesButtonToConfirmDeletionOfTdsCertifiedSolution() {
        tdsCertifiedSolutionsPage.clickOnYesButtonToConfirmDeletion();
    }

    @Then("DS user would get {string} confirmation message")
    public void dsUserWouldGetConfirmationMessage(String actualAlertMessage) {
        String expectedAlertMessage = tdsCertifiedSolutionsPage.getTDSServCertSolDeletionAlertMessage();
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage);
    }

}
