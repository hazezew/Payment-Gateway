package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.acs.ACSEnrollmentVerificationPage;

public class ACSEnrollmentVerificationStepDef extends AbstractPage {
    private WebDriver driver;
    private ACSEnrollmentVerificationPage acsEnrollmentVerificationPage;

    public ACSEnrollmentVerificationStepDef() {
        this.driver = super.driver;
    }

    @And("ACS user clicks on Menu Icon for Enrollment Verification")
    public void acsUserClicksOnMenuIconForEnrollmentVerification() {
        acsEnrollmentVerificationPage = acsAdminDashboardPage.clickOnEnrollmentVerification();
    }

    @And("ACS user clicks on Enrollment Verification menu")
    public void acsUserClicksOnEnrollmentVerificationMenu() {
        acsEnrollmentVerificationPage.clickOnEnrollmentVerificationMenu();
    }

    @And("ACS user enters {string} into card number text field in enrollment verification page")
    public void acsUserEntersIntoCardNumberTextFieldInEnrollmentVerificationPage(String cardNumber) {
        acsEnrollmentVerificationPage.setCardNumberFilter(cardNumber);
    }

    @And("ACS user enters {string} into phone number text field")
    public void acsUserEntersIntoPhoneNumberTextField(String phoneNumber) {
        acsEnrollmentVerificationPage.setPhoneNumberFilter(phoneNumber);
    }

    @And("ACS user selects {string} for profile in enrollment verification page")
    public void acsUserSelectsForProfileInEnrollmentVerificationPage(String profile) {
        acsEnrollmentVerificationPage.selectProfile(profile);
    }

    @And("ACS user clicks on the Search enrollment verification button")
    public void acsUserClicksOnTheSearchEnrollmentVerificationButton() {
        acsEnrollmentVerificationPage.clickOnSearchButton();
    }

    @Then("ACS user would get {string} in phone number field and {string} in profile field from the returned list of enrollment verification page")
    public void acsUserWouldGetInPhoneNumberFieldAndInProfileFieldFromTheReturnedListOfEnrollmentVerificationPage(String actualPhoneNumber, String actualProfile) {
        String expectedPhoneNumber = acsEnrollmentVerificationPage.getReturnedPhoneNumber();
        Assert.assertEquals(actualPhoneNumber, expectedPhoneNumber);
        String expectedProfile = acsEnrollmentVerificationPage.getReturnedProfile();
        Assert.assertEquals(actualProfile, expectedProfile);
    }
}
