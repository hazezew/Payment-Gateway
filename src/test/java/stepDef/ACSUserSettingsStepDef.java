package stepDef;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pageObj.AbstractPage;
import pageObj.acs.ACSUserSettingsPage;

public class ACSUserSettingsStepDef extends AbstractPage {
    private WebDriver driver;
    private ACSUserSettingsPage acsUserSettingsPage;

    public ACSUserSettingsStepDef() {
        this.driver = super.driver;
    }

    @And("ACS user clicks on Menu Icon for User Settings")
    public void acsUserClicksOnMenuIconForUserSettings() {
        acsUserSettingsPage = acsAdminDashboardPage.clickOnUserSettings();
    }

    @And("ACS user clicks on User Settings menu")
    public void acsUserClicksOnUserSettingsMenu() {
        acsUserSettingsPage.clickOnUserSettingsMenu();
    }

    @And("ACS user enters {string} into current password text field")
    public void acsUserEntersIntoCurrentPasswordTextField(String currentPassword) {
        acsUserSettingsPage.setCurrentPassword(currentPassword);
    }

    @And("ACS user enters {string} into new password text field")
    public void acsUserEntersIntoNewPasswordTextField(String newPassword) {
        acsUserSettingsPage.setNewPassword(newPassword);
    }

    @And("ACS user enters {string} into confirmation text field")
    public void acsUserEntersIntoConfirmationTextField(String confirmationPassword) {
        acsUserSettingsPage.setConfirmationPassword(confirmationPassword);
    }

    @And("ACS user clicks on the Save user settings button")
    public void acsUserClicksOnTheSaveUserSettingsButton() {
        acsUserSettingsPage.clickOnSaveButton();
    }
}
