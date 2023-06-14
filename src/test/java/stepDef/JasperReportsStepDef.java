package stepDef;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pageObj.AbstractPage;
import pageObj.JasperReportsPage;

public class JasperReportsStepDef extends AbstractPage {
    private WebDriver driver;
    private JasperReportsPage jasperReportsPage;

    public  JasperReportsStepDef() {
        this.driver = super.driver;
    }

    @And("user clicks on the No option")
    public void userClicksOnTheNoOption() {
        epgAdminDashboardPage.clickOnNotUpdatePasswordButton();
    }

    @And("EPG user clicks on the Jasper Reports menu")
    public void epgUserClicksOnTheJasperReportsMenu() {
        epgAdminDashboardPage.clickJasperReportsMenu();
    }

    @And("EPG user clicks on the Reports submenu")
    public void epgUserClicksOnTheReportsSubmenu() {
        jasperReportsPage = epgAdminDashboardPage.clickReportsSubMenu();
    }

    @And("EPG user clicks on the Orders report")
    public void epgUserClicksOnTheOrdersReport() {
        jasperReportsPage.clickOnOrdersReport();
    }

    @And("EPG user clicks on the Payments report")
    public void epgUserClicksOnThePaymentsReport() {
        jasperReportsPage.clickOnPaymentsReport();
    }


    @And("EPG user clicks on the Transaction statistics report")
    public void epgUserClicksOnTheTransactionStatisticsReport() {
        jasperReportsPage.clickOnTransactionStatisticsReport();
    }

    @And("EPG user clicks on the Directory server requests report")
    public void epgUserClicksOnTheDirectoryServerRequestsReport() {
        jasperReportsPage.clickOnDirectoryServerRequestsReport();
    }

    @And("EPG user clicks on the Format dropdown")
    public void epgUserClicksOnTheFormatDropdown() {
        jasperReportsPage.clickOnFormatDropdown();
    }

    @And("EPG user selects a file format")
    public void epgUserSelectsAFileFormat() {
        jasperReportsPage.selectPDFFormat();
    }

    @And("EPG user sets Start Date")
    public void epgUserSetsStartDate() {
        jasperReportsPage.setStartDate();
    }

    @And("EPG user sets End Date")
    public void epgUserSetsEndDate() {
        jasperReportsPage.setEndDate();
    }

    @And("EPG user clicks on the Export Report button")
    public void epgUserClicksOnTheExportReportButton() {
        jasperReportsPage.clickOnExportReportButton();
    }

    @And("EPG user clicks on the view the result link")
    public void epgUserClicksOnTheViewTheResultLink() {

        jasperReportsPage.clickOnViewTheResultLink();

    }


    @And("EPG user clicks on the Find \\(report) button")
    public void epgUserClicksOnTheFindReportButton() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        jasperReportsPage.clickOnTheFindButton();

    }

    @And("EPG user selects the generated report")
    public void epgUserSelectsTheGeneratedReport() {
        jasperReportsPage.clickOnTheGeneratedReportRow();

    }

    @And("EPG user clicks on the Download the report button")
    public void epgUserClicksOnTheDownloadTheReportButton() {
        jasperReportsPage.clickOnTheDownloadReportButton();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("EPG user enters {string} into PAN number text field")
    public void epgUserEntersIntoPANNumberTextField(String panNumber) {
        jasperReportsPage.setPanNumber(panNumber);
    }

    @And("EPG user sets Date mode")
    public void epgUserSetsDateMode() {
        jasperReportsPage.setDateMode();
    }

    @And("EPG user selects {string} from the merchant list")
    public void epgUserSelectsFromTheMerchantList(String merchantName) {
        jasperReportsPage.selectMerchant(merchantName);
    }

}
