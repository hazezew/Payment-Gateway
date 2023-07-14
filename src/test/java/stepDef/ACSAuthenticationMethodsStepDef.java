package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.acs.ACSAuthenticationMethodsPage;
import pageObj.acs.ACSAuthenticationSchemesPage;

public class ACSAuthenticationMethodsStepDef extends AbstractPage {
    private WebDriver driver;
    private ACSAuthenticationMethodsPage acsAuthenticationMethodsPage;

    public ACSAuthenticationMethodsStepDef() {
        this.driver = super.driver;
    }

    @And("ACS user clicks on Menu Icon for Authentication Methods")
    public void acsUserClicksOnMenuIconForAuthenticationMethods() {
        acsAuthenticationMethodsPage = acsAdminDashboardPage.clickOnAuthenticationMethods();
    }

    @And("ACS user clicks on Authentication Methods menu")
    public void acsUserClicksOnAuthenticationMethodsMenu() {
        acsAuthenticationMethodsPage.clickOnAuthenticationMethodsMenu();
    }

    @And("ACS user clicks on the Add authentication methods button")
    public void acsUserClicksOnTheAddAuthenticationMethodsButton() {
        acsAuthenticationMethodsPage.clickOnAddButton();
    }

    @And("ACS user enters {string} into authentication method name text field")
    public void acsUserEntersIntoAuthenticationMethodNameTextField(String name) {
        acsAuthenticationMethodsPage.setAuthenticationMethodName(name);
    }


    @And("ACS user selects {string} for DEFAULT DS TYPE")
    public void acsUserSelectsForDEFAULTDSTYPE(String methodName) {
        acsAuthenticationMethodsPage.setDefault3ds2Type(methodName);
    }

    @And("ACS user clicks on the Save authentication methods button")
    public void acsUserClicksOnTheSaveAuthenticationMethodsButton() {
        acsAuthenticationMethodsPage.clickOnSaveAuthenticationMethodButton();
    }

    @And("ACS user enters {string} into authentication method name filter text field")
    public void acsUserEntersIntoAuthenticationMethodNameFilterTextField(String nameFilter) {
        acsAuthenticationMethodsPage.setAuthenticationMethodNameFilter(nameFilter);
    }

    @And("ACS user clicks on the Search authentication method button")
    public void acsUserClicksOnTheSearchAuthenticationMethodButton() {
        acsAuthenticationMethodsPage.clickOnSearchButton();
    }

    @Then("ACS user would get {string} from the returned list of authentication methods")
    public void acsUserWouldGetFromTheReturnedListOfAuthenticationMethods(String actualName) {
        String expectedName = acsAuthenticationMethodsPage.getReturnedAuthenticationMethodName();
        Assert.assertEquals(actualName, expectedName);
    }
    @And("ACS user clicks on the returned authentication method row")
    public void acsUserClicksOnTheReturnedAuthenticationMethodRow() {
        acsAuthenticationMethodsPage.clickOnReturnedAuthenticationMethodRow();
    }

    @And("ACS user clicks on the Edit authentication method button")
    public void acsUserClicksOnTheEditAuthenticationMethodButton() {
        acsAuthenticationMethodsPage.clickOnEditButton();
    }

    @And("ACS user clicks on the Delete authentication method button")
    public void acsUserClicksOnTheDeleteAuthenticationMethodButton() {
        acsAuthenticationMethodsPage.clickOnDeleteButton();
    }

    @And("ACS user clicks on Yes button to confirm deletion of authentication method")
    public void acsUserClicksOnYesButtonToConfirmDeletionOfAuthenticationMethod() {
        acsAuthenticationMethodsPage.clickOnYesButtonToConfirmDeletion();
    }

    @Then("ACS user would get {string} text rather than the authentication method")
    public void acsUserWouldGetTextRatherThanTheAuthenticationMethod(String actualText) {
        String expectedText = acsAuthenticationMethodsPage.getNoRecordsRow();
        Assert.assertEquals(actualText, expectedText);
    }

}
