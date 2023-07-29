package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.threeds.TDSACSCertifiedSolutionsPage;

public class TDSACSCertifiedSolutionsStepDef extends AbstractPage {
    private WebDriver driver;
    private TDSACSCertifiedSolutionsPage tdsacsCertifiedSolutionsPage;

    public TDSACSCertifiedSolutionsStepDef() {
        this.driver = super.driver;
    }


    @And("DS user clicks on Administration menu for tds acs certified solutions")
    public void dsUserClicksOnAdministrationMenuForTdsAcsCertifiedSolutions() {
        dsAdminDashboardPage.clickOnAdministrationMenu();
    }


    @And("DS user clicks on tds acs certified solutions sub menu")
    public void dsUserClicksOnTdsAcsCertifiedSolutionsSubMenu() {
        tdsacsCertifiedSolutionsPage = dsAdminDashboardPage.clickOnTDSACSCertifiedSolutionsSubMenu();
    }

    @And("DS user enters {string} into tds acs reference number")
    public void dsUserEntersIntoTdsAcsReferenceNumber(String refNum) {
        tdsacsCertifiedSolutionsPage.setAcsRefNum(refNum);
    }

    @And("DS user selects {string} for supported protocol version in tds acs certified solutions")
    public void dsUserSelectsForSupportedProtocolVersionInTdsAcsCertifiedSolutions(String pv) {
        tdsacsCertifiedSolutionsPage.selectACSProtocolVersion(pv);
    }

    @And("DS user checks valid only checkbox in tds acs certified solutions")
    public void dsUserChecksValidOnlyCheckboxInTdsAcsCertifiedSolutions() {
        tdsacsCertifiedSolutionsPage.checkValidOnlyCheckbox();
    }

    @And("DS user clicks on the Search tds acs certified solutions button")
    public void dsUserClicksOnTheSearchTdsAcsCertifiedSolutionsButton() {
        tdsacsCertifiedSolutionsPage.clickOnSearchButton();
    }

    @Then("DS user would get {string} in ref num field and {string} in protocol version field")
    public void dsUserWouldGetInRefNumFieldAndInProtocolVersionField(String actualRefNum, String actualProtocolVersion) {
        String expectedRefNum = tdsacsCertifiedSolutionsPage.getReturnedRefNum();
        Assert.assertEquals(actualRefNum, expectedRefNum);
        String expectedPV = tdsacsCertifiedSolutionsPage.getReturnedPV();
        Assert.assertEquals(actualProtocolVersion, expectedPV);
    }

    @And("DS user clicks on the Add tds acs certified solution button")
    public void dsUserClicksOnTheAddTdsAcsCertifiedSolutionButton() {
        tdsacsCertifiedSolutionsPage.clickOnAddTDSCertSolutionButton();
    }

    @And("DS user enters {string} into approval date field in tds acs certified solution")
    public void dsUserEntersIntoApprovalDateFieldInTdsAcsCertifiedSolution(String approvalDT) {
        tdsacsCertifiedSolutionsPage.setApprovalDateTime(approvalDT);
    }

    @And("DS user enters {string} into approval expiration date field in tds acs certified solution")
    public void dsUserEntersIntoApprovalExpirationDateFieldInTdsAcsCertifiedSolution(String approvalExpiryDT) {
        tdsacsCertifiedSolutionsPage.setApprovalExpiryDateTime(approvalExpiryDT);
    }

    @And("DS user enters {string} into acs reference number text field")
    public void dsUserEntersIntoAcsReferenceNumberTextField(String refNum) {
        tdsacsCertifiedSolutionsPage.setReferenceNumber(refNum);
    }

    @And("DS user enters {string} into start protocol version")
    public void dsUserEntersIntoStartProtocolVersion(String startPV) {
        tdsacsCertifiedSolutionsPage.selectStartingProtocolVersion(startPV);
    }

    @And("DS user enters {string} into end protocol version")
    public void dsUserEntersIntoEndProtocolVersion(String endPV) {
        tdsacsCertifiedSolutionsPage.selectEndingProtocolVersion(endPV);
    }

    @And("DS user clicks on the Save tds acs certified solution button")
    public void dsUserClicksOnTheSaveTdsAcsCertifiedSolutionButton() {
        tdsacsCertifiedSolutionsPage.clickOnSaveACSCertSolutionButton();
    }

    @And("DS user clicks on the delete tds acs certified solution icon")
    public void dsUserClicksOnTheDeleteTdsAcsCertifiedSolutionIcon() {
        tdsacsCertifiedSolutionsPage.clickOnDeleteIcon();
    }

    @And("DS user clicks on the Yes button to confirm deletion of tds acs certified solution")
    public void dsUserClicksOnTheYesButtonToConfirmDeletionOfTdsAcsCertifiedSolution() {
        tdsacsCertifiedSolutionsPage.clickOnYesButtonToConfirmDeletion();
    }

    @Then("DS user would get {string} alert message in tds acs certified solutions page")
    public void dsUserWouldGetAlertMessageInTdsAcsCertifiedSolutionsPage(String actualAlertMessage) {
        String expectedAlertMessage = tdsacsCertifiedSolutionsPage.getReturnedAlertMessageAfterDeletion();
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage);
    }

}
