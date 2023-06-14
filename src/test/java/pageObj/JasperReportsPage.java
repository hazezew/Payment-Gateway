package pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class JasperReportsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(xpath = "//div[text()='Orders']")
    private WebElement ordersReport;
    @FindBy(xpath = "//div[text()='Payments']")
    private WebElement paymentsReport;
    @FindBy(xpath = "//td/div[text()='Transaction statistics']")
    private WebElement transactionStatisticsReport;
    @FindBy(xpath = "//td/div[text()='Directory server requests']")
    private WebElement directoryServerRequests;

    @FindBy(xpath = "//td/input[@name='format']")
    private WebElement formatDropdown;
    @FindBy(xpath = "//ul/li[4]")
    private WebElement pdfFormat;

    @FindBy(xpath = "//td/input[@name='REPORT_START_DATE']")
    private WebElement startDateLabel;
    @FindBy(xpath = "//td/input[@name='REPORT_END_DATE']")
    private WebElement endDateLabel;
    @FindBy(xpath = "//button/span[text()='Export Report']")
    private WebElement exportReportButton;
    @FindBy(xpath = "//button/span[text()='Find']")
    private WebElement findButton;
    @FindBy(xpath = "//button/span[text()='Download report']")
    private WebElement downloadReportButton;

    @FindBy(xpath = "//tbody/tr[2]")
    private WebElement generatedReportRow;

    @FindBy(xpath = "//td/input[@name='PAN']")
    private WebElement panNumber;

    @FindBy(xpath = "//td/input[@name='DATE_MODE']")
    private WebElement dateModeDropdown;
    @FindBy(xpath = "//ul/li[.='TRANS_DATE']")
    private WebElement transDate;
    @FindBy(xpath = "//ul/li[.='PAYMENT_DATE']")
    private WebElement paymentDate;
    @FindBy(xpath = "//ul/li[.='DEPOSITED_DATE']")
    private WebElement depositedDate;

    @FindBy(xpath = "//td/input[@name='MERCHANT_LIST']")
    private WebElement merchantListDropdown;
    @FindBy(xpath = "//ul/li[.='merchantone']")
    private WebElement merchantOne;
    String selectedMerchant = "//ul/li[.='";


    public JasperReportsPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
        action = new Actions(driver);
    }
    public void clickOnOrdersReport() {
        this.ordersReport.click();
    }
    public void clickOnPaymentsReport() {
        this.paymentsReport.click();
    }
    public void clickOnTransactionStatisticsReport() {
        this.transactionStatisticsReport.click();
    }
    public void clickOnDirectoryServerRequestsReport() {
        this.directoryServerRequests.click();
    }
    public void clickOnFormatDropdown() {
        this.formatDropdown.click();
    }
    public void selectPDFFormat() {
        this.pdfFormat.click();
    }

    public void setStartDate() {
        this.startDateLabel.click();
        driver.findElement(By.linkText("1")).click();
    }
    public void setEndDate() {
        this.endDateLabel.click();
        driver.findElement(By.linkText("19")).click();
    }
    public void setDateMode() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.dateModeDropdown.click();
        this.paymentDate.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void selectMerchant(String merchantName) {
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        this.merchantListDropdown.click();
//        driver.findElement(By.xpath(selectedMerchant+""+merchantName+"']"));
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        this.merchantListDropdown.click();
        this.merchantOne.click();
    }
    public void clickOnExportReportButton() {
        this.exportReportButton.click();
    }
    public void clickOnViewTheResultLink() {
        driver.findElement(By.linkText("View the result")).click();
    }
    public void clickOnTheGeneratedReportRow() {
        this.generatedReportRow.click();
    }
    public void clickOnTheFindButton() {
        this.findButton.click();
    }

    public void clickOnTheDownloadReportButton() {
        this.downloadReportButton.click();
    }
    public void setPanNumber(String panNumber) {
        this.panNumber.sendKeys(panNumber);
    }

}
