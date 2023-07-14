package stepDef;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pageObj.AbstractPage;
import pageObj.BatchOperationsPage;

public class BatchOperationsStepDef extends AbstractPage {
    private WebDriver driver;
    private BatchOperationsPage batchOperationsPage;

    public BatchOperationsStepDef() {
        this.driver = super.driver;
    }

    @And("EPG user clicks on Batch Processing of Refunds submenu")
    public void epgUserClicksOnBatchProcessingOfRefundsSubmenu() {
        this.batchOperationsPage = epgAdminDashboardPage.clickBatchProcessingOfRefundsSubMenu();
    }

    @And("EPG user clicks on Batch Processing of Bindings submenu")
    public void epgUserClicksOnBatchProcessingOfBindingsSubmenu() {
        this.batchOperationsPage = epgAdminDashboardPage.clickBatchProcessingOfBindingsSubMenu();
    }

    @And("EPG user clicks on Batch Sending of the Payment form submenu")
    public void epgUserClicksOnBatchSendingOfThePaymentFormSubmenu() {
        this.batchOperationsPage = epgAdminDashboardPage.clickBatchSendingOfThePaymentForm();
    }

    @And("EPG user clicks on select file button")
    public void epgUserClicksOnSelectFileButton() throws InterruptedException {
        batchOperationsPage.clickSelectFileButton();
    }

    @And("EPG user uploads file using AutoIT")
    public void epgUserUploadsFileUsingAutoIT() {
        batchOperationsPage.selectAndUploadFile();
    }

    @And("EPG user clicks on upload file button")
    public void epgUserClicksOnUploadFileButton() {
        batchOperationsPage.clickOnUploadFileButton();
    }

    @And("EPG user selects {string} on merchant textfield")
    public void epgUserSelectsOnMerchantTextfield(String merchantName) {
        batchOperationsPage.setMerchant(merchantName);
    }

}
