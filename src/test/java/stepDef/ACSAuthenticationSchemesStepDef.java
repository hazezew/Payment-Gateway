package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.acs.ACSAuthenticationSchemesPage;

public class ACSAuthenticationSchemesStepDef extends AbstractPage {
    private WebDriver driver;
    private ACSAuthenticationSchemesPage acsAuthenticationSchemesPage;

    public ACSAuthenticationSchemesStepDef() {
        this.driver = super.driver;
    }

    @And("ACS user clicks on Menu Icon for Authentication Schemes")
    public void acsUserClicksOnMenuIconForAuthenticationSchemes() {
        acsAuthenticationSchemesPage = acsAdminDashboardPage.clickOnAuthenticationSchemes();
    }

    @And("ACS user clicks on Authentication Schemes menu")
    public void acsUserClicksOnAuthenticationSchemesMenu() {
        acsAuthenticationSchemesPage.clickOnAuthenticationSchemes();
    }

    @And("ACS user clicks on the Add authentication schemes button")
    public void acsUserClicksOnTheAddAuthenticationSchemesButton() {
        acsAuthenticationSchemesPage.clickOnAddButton();
    }

    @And("ACS user enters {string} into authentication scheme name text field")
    public void acsUserEntersIntoAuthenticationSchemeNameTextField(String name) {
        acsAuthenticationSchemesPage.setAuthenticationSchemeName(name);
    }

    @And("ACS user clicks on the Add primary button")
    public void acsUserClicksOnTheAddPrimaryButton() {
        acsAuthenticationSchemesPage.clickOnAddPrimaryButton();
    }



    @And("ACS user clicks on the edit primary icon")
    public void acsUserClicksOnTheEditPrimaryIcon() {
        acsAuthenticationSchemesPage.clickOnEditPrimaryIcon();
    }

    @And("ACS user clicks on the save primary icon")
    public void acsUserClicksOnTheSavePrimaryIcon() {
        acsAuthenticationSchemesPage.clickOnSavePrimaryIcon();
    }

    @And("ACS user clicks on the Add fallback button")
    public void acsUserClicksOnTheAddFallbackButton() {
        acsAuthenticationSchemesPage.clickOnAddFallbackButton();
    }

    @And("ACS user clicks on the edit fallback icon")
    public void acsUserClicksOnTheEditFallbackIcon() {
        acsAuthenticationSchemesPage.clickOnEditFallbackIcon();
    }

    @And("ACS user clicks on the fallback dropdown")
    public void acsUserClicksOnTheFallbackDropdown() {
        acsAuthenticationSchemesPage.clickOnFallbackDropdown();
    }

    @And("ACS user selects the second fallback")
    public void acsUserSelectsTheSecondFallback() {
        acsAuthenticationSchemesPage.selectTheSecondFallback();
    }

    @And("ACS user clicks on the save fallback icon")
    public void acsUserClicksOnTheSaveFallbackIcon() {
        acsAuthenticationSchemesPage.clickOnSaveFallbackIcon();
    }

    @And("ACS user clicks on the Save authentication scheme button")
    public void acsUserClicksOnTheSaveAuthenticationSchemeButton() {
        acsAuthenticationSchemesPage.clickOnSaveAuthenticationScheme();
    }

    @And("ACS user enters {string} into authentication scheme name filter text field")
    public void acsUserEntersIntoAuthenticationSchemeNameFilterTextField(String name) {
        acsAuthenticationSchemesPage.setAuthenticationSchemeNameFilter(name);
    }

    @And("ACS user clicks on the Search authentication scheme button")
    public void acsUserClicksOnTheSearchAuthenticationSchemeButton() {
        acsAuthenticationSchemesPage.clickOnSearchButton();
    }

    @Then("ACS user would get {string} from the returned list of authentication schemes")
    public void acsUserWouldGetFromTheReturnedListOfAuthenticationSchemes(String actualName) {
        String expectedName = acsAuthenticationSchemesPage.getAuthenticationSchemeName();
        Assert.assertEquals(actualName, expectedName);
    }

    @And("ACS user clicks on the returned authentication scheme row")
    public void acsUserClicksOnTheReturnedAuthenticationSchemeRow() {
        acsAuthenticationSchemesPage.clickOnReturnedAuthenticationScheme();
    }

    @And("ACS user clicks on the Edit authentication scheme button")
    public void acsUserClicksOnTheEditAuthenticationSchemeButton() {
        acsAuthenticationSchemesPage.clickOnEditButton();
    }

    @And("ACS user clicks on the primary dropdown")
    public void acsUserClicksOnThePrimaryDropdown() {
        acsAuthenticationSchemesPage.clickOnPrimaryDropdown();
    }

    @And("ACS user selects the fourth primary")
    public void acsUserSelectsTheFourthPrimary() {
        acsAuthenticationSchemesPage.selectTheFourthPrimary();
    }

    @And("ACS user clicks on the Delete authentication scheme button")
    public void acsUserClicksOnTheDeleteAuthenticationSchemeButton() {
        acsAuthenticationSchemesPage.clickOnDeleteButton();
    }

    @And("ACS user clicks on the Yes button to confirm deletion of the selected authentication scheme")
    public void acsUserClicksOnTheYesButtonToConfirmDeletionOfTheSelectedAuthenticationScheme() {
        acsAuthenticationSchemesPage.clickOnYesConfirmDeleteButton();
    }

    @Then("ACS user would get {string} text rather than the authentication scheme")
    public void acsUserWouldGetTextRatherThanTheAuthenticationScheme(String actualText) {
        String expectedText = acsAuthenticationSchemesPage.getNoResultsRow();
        Assert.assertEquals(actualText, expectedText);
    }
}
