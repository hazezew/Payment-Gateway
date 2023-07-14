package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.acs.ACSCardRegistryLoadingHistoryPage;

public class ACSCardRegistryLoadingHistoryStepDef extends AbstractPage {
    private WebDriver driver;
    private ACSCardRegistryLoadingHistoryPage acsCardRegistryLoadingHistoryPage;

    public ACSCardRegistryLoadingHistoryStepDef() {
        this.driver = super.driver;
    }

    @And("ACS user clicks on Menu Icon for Card Registry Loading History")
    public void acsUserClicksOnMenuIconForCardRegistryLoadingHistory() {
        acsCardRegistryLoadingHistoryPage = acsAdminDashboardPage.clickOnCardRegistryLoadingHistory();
    }

    @And("ACS user clicks on Card Registry Loading History menu")
    public void acsUserClicksOnCardRegistryLoadingHistoryMenu() {
        acsCardRegistryLoadingHistoryPage.clickOnCardRegistryLoadingHistoryMenu();
    }

    @And("ACS user enters {string} into file name text field")
    public void acsUserEntersIntoFileNameTextField(String fileName) {
        acsCardRegistryLoadingHistoryPage.setFileNameFilter(fileName);
    }

    @And("ACS user selects {string} for profile")
    public void acsUserSelectsForProfile(String profile) {
        acsCardRegistryLoadingHistoryPage.selectProfile(profile);
    }

    @And("ACS user clicks on the Search card registry loading history button")
    public void acsUserClicksOnTheSearchCardRegistryLoadingHistoryButton() {
        acsCardRegistryLoadingHistoryPage.clickOnSearchButton();
    }

    @Then("ACS user would get {string} in filename field and {string} in profile field from the returned list of card registry loading histories")
    public void acsUserWouldGetInFilenameFieldAndInProfileFieldFromTheReturnedListOfCardRegistryLoadingHistories(String actualFileName, String actualProfile) {
        String expectedFileName = acsCardRegistryLoadingHistoryPage.getReturnedFileName();
        Assert.assertEquals(actualFileName, expectedFileName);
        String expectedProfile = acsCardRegistryLoadingHistoryPage.getReturnedProfile();
        Assert.assertEquals(actualProfile, expectedProfile);
    }
}
