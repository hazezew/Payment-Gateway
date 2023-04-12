package stepDef;

import config.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.*;

public class CaseManagementStepDef extends AbstractPage {
    private WebDriver driver;
    private CasesQueuePage casesQueuePage;
    private OperatorFormPage operatorFormPage;
    private LastReviewedCasesPage lastReviewedCasesPage;
    private OperatorGroupPage operatorGroupPage;

    public CaseManagementStepDef(){
        this.driver=super.driver;
    }

    @And("FM user clicks on Fraud Management main menu")
    public void fmUserClicksOnFraudManagementMainMenu() {
        fmAdminDashboardPage.clickLnkFraudManagement();
    }

    @And("FM user moves mouse over Case management submenu")
    public void fmUserMovesMouseOverCaseManagementSubmenu() {
        fmAdminDashboardPage.hoverLnkCaseManagement();
    }

    @And("FM clicks on Cases queue child menu")
    public void fmClicksOnCasesQueueChildMenu() {
        casesQueuePage=fmAdminDashboardPage.clickLnkCasesQueue();
    }

    @Then("FM system displays Cases queue page")
    public void fmSystemDisplaysCasesQueuePage() {
        Assert.assertTrue(casesQueuePage.getURL().contains(Config.fmCasesQueuePageURL));
    }

    @And("FM user selects {string} from Entity Type dropdown")
    public void fmUserSelectsFromEntityTypeDropdown(String entityType) {
        casesQueuePage.setDDEntityType(entityType);
    }

    @And("FM user selects {string} from Locked by user dropdown")
    public void fmUserSelectsFromLockedByUserDropdown(String lockedBy) {
        casesQueuePage.setDDLockedBy(lockedBy);
    }

    @And("FM user selects {string} from Classification type dropdown")
    public void fmUserSelectsFromClassificationTypeDropdown(String classificationType) {
        casesQueuePage.setClassificationType(classificationType);
    }

    @And("FM user selects {string} from Forwarded dropdown")
    public void fmUserSelectsFromForwardedDropdown(String forwarded) {
        casesQueuePage.setForwarded(forwarded);
    }

    @And("FM user clicks on search button")
    public void fmUserClicksOnSearchButton() {
        casesQueuePage.clickIconSearch();
    }

    @And("FM clicks on Operator form child menu")
    public void fmClicksOnOperatorFormChildMenu() {
        operatorFormPage=fmAdminDashboardPage.clickLnkOperatorForm();
    }

    @Then("FM system displays Operator form page")
    public void fmSystemDisplaysOperatorFormPage() {
        Assert.assertTrue(operatorFormPage.getURL().contains(Config.operatorFormPageURL));
    }

    @And("on Operator Form page FM user selects {string} from Entity Type dropdown")
    public void onOperatorFormPageFMUserSelectsFromEntityTypeDropdown(String entityType) {
        operatorFormPage.setDdlEntityType(entityType);
    }

    @And("FM clicks on last Reviewed Cases child menu")
    public void fmClicksOnLastReviewedCasesChildMenu() {
        lastReviewedCasesPage=fmAdminDashboardPage.clickLnkLastReviewedCases();
    }

    @Then("FM system displays last Reviewed Cases page")
    public void fmSystemDisplaysLastReviewedCasesPage() {
        Assert.assertTrue(lastReviewedCasesPage.getURL().contains(Config.lastReviewedCasesPageURL));
    }

    @And("on last Reviewed Cases page FM user selects {string} from Entity Type dropdown")
    public void onLastReviewedCasesPageFMUserSelectsFromEntityTypeDropdown(String entityType) {
        lastReviewedCasesPage.setDdlEntityType(entityType);
    }

    @And("on last Reviewed Cases page FM user clicks search icon")
    public void onLastReviewedCasesPageFMUserClicksSearchIcon() {
        lastReviewedCasesPage.clickBtnSearch();
    }

    @And("FM user clicks on Operator Group child menu")
    public void fmUserClicksOnOperatorGroupChildMenu() {
        operatorGroupPage=fmAdminDashboardPage.clickLnkOperatorGroup();
    }

    @Then("FM system displays Operator Group page")
    public void fmSystemDisplaysOperatorGroupPage() {
        Assert.assertTrue(operatorGroupPage.getURL().contains(Config.operatorGroupPageURL));
    }

    @And("FM user clicks on Add new Operator Group button")
    public void fmUserClicksOnAddNewOperatorGroupButton() {
        operatorGroupPage.clickBtnAdd();
    }

    @And("FM user enters {string} into Name of Operator Group textfield")
    public void fmUserEntersIntoNameOfOperatorGroupTextfield(String name) {
        operatorGroupPage.setTxtNameOfOperatorGroup(name);
    }

    @And("FM user selects {string} from Private Scheme of Operator Group page")
    public void fmUserSelectsFromPrivateSchemeOfOperatorGroupPage(String scheme) {
        operatorGroupPage.setDdlPrivateScheme(scheme);
    }

    @And("FM user clicks on Save new Operator Group button")
    public void fmUserClicksOnSaveNewOperatorGroupButton() {
        operatorGroupPage.clickBtnSave();
    }
    @Then("FM add new Operator Group displays {string} validation message")
    public void fmAddNewOperatorGroupDisplaysValidationMessage(String errorMsg) {
        Assert.assertEquals(operatorGroupPage.getErrorMessage(),errorMsg);
        driver.navigate().refresh();
    }

    @Then("FM new Operator Group displays an error message {string}")
    public void fmNewOperatorGroupDisplaysAnErrorMessage(String errorMsg) {
        Assert.assertEquals(operatorGroupPage.getErrorMessage(),errorMsg);
        driver.navigate().refresh();
    }

    @And("FM user enters {string} into Name of search Operator Group textfield")
    public void fmUserEntersIntoNameOfSearchOperatorGroupTextfield(String operatorGroup) {
        operatorGroupPage.setTxtSearchNameOperatorGroup(operatorGroup);
    }

    @And("FM user clicks on search Operator Group button")
    public void fmUserClicksOnSearchOperatorGroupButton() {
        operatorGroupPage.clickSearchButton();
    }

    @Then("FM Search Operator Group shows matching search result for operator group")
    public void fmSearchOperatorGroupShowsMatchingSearchResultForOperatorGroup() {
        Assert.assertTrue(operatorGroupPage.getRowOperatorNameFound());
//        Assert.assertTrue(operatorGroupPage.getNumberOfSearchResultRows()>0);
    }

    @Then("FM Search Operator Group shows message {string} for search result")
    public void fmSearchOperatorGroupShowsMessageForSearchResult(String noDataMsg) {
        Assert.assertEquals(operatorGroupPage.getRowNoDataFoundMsg(),noDataMsg);
    }

    @And("FM user selects the Operator Group")
    public void fmUserSelectsTheOperatorGroup() {
        operatorGroupPage.selectOperatorGroup();
    }

    @And("FM user clicks on the Modify Operator Group button")
    public void fmUserClicksOnTheModifyOperatorGroupButton() {
        operatorGroupPage.clickBtnModify();
    }

    @And("FM user clicks on delete Operator Group button")
    public void fmUserClicksOnDeleteOperatorGroupButton() {
        operatorGroupPage.clickBtnDelete();
    }

    @And("FM user clicks Yes for delete Operator Group confirmation")
    public void fmUserClicksYesForDeleteOperatorGroupConfirmation() {
        operatorGroupPage.clickBtnPopupYesConfirmation();
    }
}
