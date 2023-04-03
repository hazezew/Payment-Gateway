package pageObj;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MerchantPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    private  String alertMessage=null;

//    Create new Merchant
    @FindBy(xpath = "//*[text()='Create']")
    private WebElement linkCreateMerchant;

//    Search and update an existing merchant
    @FindBy(xpath = "//*[text()='Search']//following::input[@type='text']")
    private WebElement txtSearch;

    @FindBy(xpath = "//*[text()='Find']")
    private WebElement btnFind;

    @FindBy(xpath = "/html/body/div[2]/div/div[3]/div/div[2]/div/table/tbody/tr[2]")
    private WebElement tblRowMerchant;

//    Tab elements
    @FindBy(xpath = "//*[text()='Main information']")
    private WebElement tabMainInformation;

    @FindBy(xpath = "//*[text()='Acquirer']")
    private WebElement tabAcquirer;

    @FindBy(xpath = "(//*[text()='Routing rules'])[2]")
    private WebElement tabRouting;

    @FindBy(xpath = "//*[text()='Additional information']")
    private WebElement tabAdditionalInfo;

    @FindBy(xpath = "//*[text()='3DS Configuration']")
    private WebElement tab3DSConfiguration;

    @FindBy(xpath = "//*[text()='Additional parameters']")
    private WebElement tabAdditionalParameters ;

    @FindBy(xpath = "//*[text()='Notifications']")
    private WebElement tabNotifications;

    @FindBy(xpath = "//*[text()='Address']")
    private WebElement tabAddress;

//    Elements under Address tab


//    Elements under Acquirer tab
    @FindBy(xpath="(//*[text()='Add'])[1]")
    private WebElement btnAddNewAcquirer;

    @FindBy(xpath = "/html/body/div[8]/div[2]/div/div/div/div[2]/div[2]/div/div/div/fieldset[1]/div/div/div[2]/div/table/tbody/tr[2]/td[1]/div")
    private WebElement divToStart;

    @FindBy(xpath = "//input[@name='acquirerId']")
    private WebElement ddAcquirerName;

    @FindBy(name = "acquirerId")
    private WebElement ddAcquirerId;

    @FindBy(xpath = "//*[text()='BunnaBankAcquirer']")
    private WebElement lstAcquirerName;

    @FindBy(xpath = "/html/body/div[8]/div[2]/div/div/div/div[2]/div[2]/div/fieldset/div/div[1]/div[2]/div/table/tbody/tr[2]/td[2]/div")
    private WebElement divOfTxtProcessingMerchantID;

    @FindBy(xpath = "//input[@name='acqMerchantId']")
    private WebElement txtProcessingMerchantID;

    @FindBy(xpath = "//input[@name='acqTerminalId']")
    private WebElement txtTerminalID;

    @FindBy(xpath = "//input[@name='acqLogin']")
    private WebElement txtUserLogin;

    @FindBy(xpath = "//input[@name='acqPassword']")
    private WebElement txtUserPassword;

    @FindBy(xpath = "(//*[text()='Save'])[1]")
    private WebElement btnSaveAcquirer;

    @FindBy(xpath = "//*[contains(@class,'checkheader')]")
    private WebElement chkDefaultAcquirer;

//    Elements under Additional information tab
    @FindBy(xpath = "//div[text()='ETB (230)']")
    private WebElement chkETB;

    @FindBy(xpath = "//input[@name='defaultCurrency']")
    private WebElement ddlDefaultCurrency;

    @FindBy(xpath = "//*[contains(@class,'x-boundlist-item')]")
    private List<WebElement> lstETBDefaultCurrency;

    @FindBy(xpath = "//input[@name='paymentAttempts']")
    private WebElement txtNoOfAttempts;

    @FindBy(xpath = "//input[@name='orderStatusExtendedVersion']")
    private WebElement ddlVersion;

    @FindBy(xpath = "//li[text()='Version 2']")
    private List<WebElement> lstVersion;

    @FindBy(xpath = "//input[@name='p2PStatusVersion']")
    private WebElement ddlVersionOfGetP2PStatus;

    @FindBy(xpath = "//div[@id='boundlist-1496-listEl']/ul/li[2]")
    private WebElement lstVersion2;

    @FindBy(xpath = "(//input[@name='p2PStatusVersion']//following::input[@type='button'])[1]")
    private WebElement chkUseVerification;

    @FindBy(xpath = "(//input[@name='p2PStatusVersion']//following::input[@type='button'])[2]")
    private WebElement chkExternalFraudControl;

    @FindBy(xpath = "//input[@name='overridedFraudControlLogin']")
    private WebElement txtNameForFraudControl;

    @FindBy(xpath = "(//input[@name='p2PStatusVersion']//following::input[@type='button'])[3]")
    private WebElement chkUseNameForFraudControl;

    @FindBy(xpath = "//input[@name='orderStatusPeriodDays']")
    private WebElement txtDurationOfDisplayingOrderInfoDays;

    @FindBy(xpath = "//input[@name='threeDSRequestorChallengeInd']")
    private WebElement ddl3DS2RequestOrChallengeIndicator;

    @FindBy(xpath = "//li[text()='NO_PREFERENCE']")
    private WebElement lst3DS2RequestOrChallengeIndicator;

//    Web elements under 3DS Configuration tab

    @FindBy(xpath = "(//*[text()='Add'])[4]")
    private WebElement btnAddNew3DSConfiguration ;

    @FindBy(xpath = "/html/body/div[8]/div[2]/div/div/div/div[2]/div[5]/div/div/div/div[2]/fieldset/div/div[1]/div[2]/div/table/tbody/tr[2]/td[1]/div")
    private WebElement divPaymentSystem;

    @FindBy(xpath = "(//*[contains(@id,'checkboxfield')]//input[@type='button'])[10]")
    private WebElement chk3DS2Enabled;

    @FindBy(xpath = "(//*[contains(@id,'checkboxfield')]//input[@type='button'])[11]")
    private WebElement chkTrySslIfUInVeRes;

    @FindBy(xpath = "(//*[contains(@id,'checkboxfield')]//input[@type='button'])[12]")
    private WebElement chkTrysslIfUInPaRes;

    @FindBy(xpath = "(//*[text()='Save'])[2]")
    private WebElement btnSave3DSConfiguration;

//    Elements under Additional Parameters
    @FindBy(xpath = "(//span[text()='Add'])[5]")
    private WebElement btnAddNewAdditionalParameter;

    @FindBy(xpath = "//*[text()='Enter name']")
    private WebElement divEnterName;

    @FindBy(xpath = "//input[@name='title']")
    private WebElement txtPaymentNameAndValue;

    @FindBy(xpath = "//*[text()='Enter value']")
    private WebElement divEnterValue;

    @FindBy(xpath = "//input[@name='value']")
    private WebElement txtValue;

//    Elements under Send payment form tab
    @FindBy(xpath = "//*[text()='Send payment form']")
    private WebElement tabSendPaymentForm;

    @FindBy(xpath = "//*[@name='backUrl']")
    private WebElement txtReturnURLAfterPayment;

    @FindBy(xpath = "//*[@name='failUrl']")
    private WebElement txtReturnURLOnError;

//    Elements under Notifications tab
    @FindBy(xpath = "(//*[contains(@class,'checkbox ')])[1]")
    private WebElement chkSendEmailToCustomer;

    @FindBy(xpath = "(//*[contains(@class,'checkbox ')])[2]")
    private WebElement chkSendEmailToMerchant;

    @FindBy(xpath = "//input[@name='certificateExpirationNotificationEmails']")
    private WebElement txtMerchantEmail;

    @FindBy(xpath = "//*[text()='SMS']")
    private WebElement notificationTabSMS;

    @FindBy(xpath = "(//*[text()='Send sms to customer for the following events:']//following::span)[1]")
    private WebElement allCustomerSMS;

    @FindBy(xpath = "(//*[text()='Send sms to merchant for the following events:']//following::span)[1]")
    private WebElement allMerchantSMS;

//    Elements under Address tab
    @FindBy(xpath = "//input[@name='address']")
    private WebElement txtAddress;

    @FindBy(xpath = "//input[@name='city']")
    private WebElement txtCity;

    @FindBy(xpath = "//input[@name='region']")
    private WebElement txtRegionState;

    @FindBy(xpath = "//input[@name='country']")
    private WebElement txtCountry;

    @FindBy(xpath = "//input[@name='postalCode']")
    private WebElement txtPostalZipCode;

    @FindBy(xpath = "//input[@name='phone']")
    private WebElement txtPhoneNumber;

    @FindBy(xpath = "//input[@name='additionalInfo']")
    private WebElement txtAdditionalInfo;

//    Web elements under main
    @FindBy(xpath = "(//*[text()='EPG Merchant Login']//following::input[@type='text'])[1]")
    private WebElement txtEPGMerchantLogin;

    @FindBy(xpath = "(//*[text()='Merchant Name:']//following::input[@type='text'])[1]")
    private WebElement txtMerchantName;

    @FindBy(xpath = "//*[@id=\"checkboxfield-1125-inputEl\"]")
    private WebElement chkActive;

    @FindBy(xpath = "(//*[text()='MCC']//following::input[@type='text'])[1]")
    private WebElement txtMCC;

    @FindBy(xpath = "(//*[text()='Merchant website address']//following::input[@type='text'])[1]")
    private WebElement txtMerchantWebsiteAddress;

    @FindBy(xpath = "//input[@name='merchantEmails']")
    private WebElement txtMerchantEmailMain;

    @FindBy(xpath = "(//*[text()='Merchant email address(es)']//following::input[@type='text'])[1]")
    private WebElement txtMerchantEmailAddress;

    @FindBy(xpath = "(//*[text()='Merchant phone number:']//following::input[@type='text'])[1]")
    private WebElement txtMerchantPhoneNumber;

    @FindBy(xpath = "(//*[text()='Multilanguage:']//following::input[@type='button'])[1]")
    private WebElement chkMultilanguage;

    @FindBy(xpath = "(//*[text()='Payment language']//following::input[@type='text'])[1]")
    private WebElement ddlPaymentLanguage;

    @FindBy(xpath = "(//*[text()='List of locales']//following::input[@type='text'])[1]")
    private WebElement txtListOfLocals;

    @FindBy(xpath = "(//*[text()='Pan masked digit count:']//following::input[@type='text'])[1]")
    private WebElement txtPanMaskedDigitCount;

    @FindBy(xpath = "//*[@id=\"smartcombo-1144-inputEl\"]")
    private WebElement txtChooseParent;

//    Create new Merchant permissions under main
    @FindBy(xpath = "//div[@class='x-grid-row-checker']")
    private List<WebElement> permissions;

    @FindBy(xpath = "//*[text()='Copy']//following::span[text()='Save']")
    private WebElement btnSave;

    @FindBy(xpath = "//*[text()='Close']")
    private WebElement btnCancel;

    @FindBy(xpath = "//*[@id=\"messagebox-1001-displayfield-inputEl\"]")
    private WebElement alertDisplay;

    @FindBy(xpath = "//*[@id=\"button-1005-btnInnerEl\"]")
    private WebElement btnAlertOk;

    public MerchantPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }
    public void clickLinkCreateMerchant(){
        wait.until(ExpectedConditions.visibilityOf(linkCreateMerchant));
        linkCreateMerchant.click();
    }
    public void clickTabMainInformation(){
        scrollInToView(tabMainInformation);
        wait.until(ExpectedConditions.visibilityOf(tabMainInformation));
        tabMainInformation.click();
    }
    public void setTxtSearch(String search){
        wait.until(ExpectedConditions.visibilityOf(txtSearch)).sendKeys(search);
    }
    public void clickBtnFind(){
        wait.until(ExpectedConditions.visibilityOf(btnFind)).click();
    }
    public boolean merchantDisplayed(){
        wait.until(ExpectedConditions.visibilityOf(tblRowMerchant));
        return tblRowMerchant.isDisplayed();
    }
    public void clickMerchant(String merchantName){
        WebElement merchantDetail=driver.findElement(By.xpath("//*[text()='"+ merchantName +"']"));
        wait.until(ExpectedConditions.visibilityOf(merchantDetail)).click();
    }

//    Actions for web elements under Acquirer tab
    public void clickTabAcquirer(){
        scrollInToView(tabAcquirer);
        wait.until(ExpectedConditions.visibilityOf(tabAcquirer));
        tabAcquirer.click();
    }
//    Actions for web elements under Under Acquirer tab
    public void  clickBtnAddNewAcquirer(){
        wait.until(ExpectedConditions.visibilityOf(btnAddNewAcquirer));
        btnAddNewAcquirer.click();
    }
    public void setDDAcquirerName(String acquirerName){
        wait.until(ExpectedConditions.visibilityOf(divToStart));
        action.doubleClick(divToStart).build().perform();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOf(ddAcquirerId)).click();
        WebElement ele=driver.findElement(By.xpath("//*[text()='"+acquirerName+"']"));
        wait.until(ExpectedConditions.visibilityOf(ele)).click();
    }
    public void setTxtProcessingMerchantID(String merchantID){
//        wait.until(ExpectedConditions.visibilityOf(divOfTxtProcessingMerchantID));
//        action.doubleClick(divOfTxtProcessingMerchantID).build().perform();

        wait.until(ExpectedConditions.visibilityOf(txtProcessingMerchantID));
        txtProcessingMerchantID.sendKeys(merchantID);
    }
    public void setTxtTerminalID(String terminalID){
        wait.until(ExpectedConditions.visibilityOf(txtTerminalID));
        txtTerminalID.sendKeys(terminalID);
    }
    public void setTxtUserLogin(String userLogin){
        wait.until(ExpectedConditions.visibilityOf(txtUserLogin));
        txtUserLogin.sendKeys(userLogin);
    }
    public void setTxtUserPassword(String userPassword){
        wait.until(ExpectedConditions.visibilityOf(txtUserPassword));
        txtUserPassword.sendKeys(userPassword);
    }
//    public void setTxtMasterCard3DSID(String masterCard3DSID){
//        wait.until(ExpectedConditions.visibilityOf(txtMasterCard3DSID));
//        txtMasterCard3DSID.sendKeys(masterCard3DSID);
//    }
//    public void setTxtVisa3DSID(String visa3DSID){
//        wait.until(ExpectedConditions.visibilityOf(txtVisa3DSID));
//        txtVisa3DSID.sendKeys(visa3DSID);
//    }
//    public void setTxtMir3DSID(String mir3DSID){
//        wait.until(ExpectedConditions.visibilityOf(txtMir3DSID));
//        txtMir3DSID.sendKeys(mir3DSID);
//    }
//    public void setTxtJCB3DSID(String jCB3DSID){
//        wait.until(ExpectedConditions.visibilityOf(txtJCB3DSID));
//        txtJCB3DSID.sendKeys(jCB3DSID);
//    }
//    public void setTxtDCI3DSID(String dCI3DSID){
//        wait.until(ExpectedConditions.visibilityOf(txtDCI3DSID));
//        txtDCI3DSID.sendKeys(dCI3DSID);
//    }
//    public void setTxtCUP3DSID(String cUP3DSID){
//        wait.until(ExpectedConditions.visibilityOf(txtCUP3DSID));
//        txtCUP3DSID.sendKeys(cUP3DSID);
//    }
//    public void setTxtAMEX3DSID(String aMEX3DSID){
//        wait.until(ExpectedConditions.visibilityOf(txtAMEX3DSID));
//        txtAMEX3DSID.sendKeys(aMEX3DSID);
//    }
    public void clickBtnSaveAcquirer(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOf(btnSaveAcquirer));
        btnSaveAcquirer.click();
    }
    public void checkChkDefaultAcquirer(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOf(chkDefaultAcquirer));
        chkDefaultAcquirer.click();
    }
//    Actions for web elements under Routing tab
    public void clickTabRouting(){
        scrollInToView(tabRouting);
        wait.until(ExpectedConditions.visibilityOf(tabRouting));
        tabRouting.click();
    }

//    Actions for web elements under Additional Information tab
    public void clickTabAdditionalInfo(){
        scrollInToView(tabAdditionalInfo);
        wait.until(ExpectedConditions.visibilityOf(tabAdditionalInfo));
        tabAdditionalInfo.click();
    }
    public void checkChkETB(){
        WebElement uncheck=driver.findElement(By.xpath("//div[text()='RON (946)']"));
        uncheck.click();
        wait.until(ExpectedConditions.visibilityOf(chkETB)).click();
    }
    public void selectDdlDefaultCurrency(String defaultCurrency){
        wait.until(ExpectedConditions.visibilityOf(ddlDefaultCurrency));
        ddlDefaultCurrency.click();
        WebElement element=driver.findElement(By.xpath("//li[text()='"+defaultCurrency+"']"));
        wait.until(ExpectedConditions.visibilityOf(element)).click();
    }
    public void setTxtNoOfAttempts(String noOfAttempts){
        wait.until(ExpectedConditions.visibilityOf(txtNoOfAttempts));
        txtNoOfAttempts.clear();
        txtNoOfAttempts.sendKeys(noOfAttempts);
    }
    public void selectDdlVersion(String version){
        wait.until(ExpectedConditions.visibilityOf(ddlVersion));
        ddlVersion.click();
        List<WebElement> ele=driver.findElements(By.xpath("//li[text()='"+ version+"']"));
        wait.until(ExpectedConditions.visibilityOf(ele.get(0))).click();
    }

    public void selectDdlVersionOfGetP2PStatus(String version){
        wait.until(ExpectedConditions.visibilityOf(ddlVersionOfGetP2PStatus)).click();
        List<WebElement> ele=driver.findElements(By.xpath("//li[text()='"+ version+"']"));
        wait.until(ExpectedConditions.visibilityOf(ele.get(1))).click();
    }
    public void checkChkUseVerification(){
        wait.until(ExpectedConditions.visibilityOf(chkUseVerification));
        chkUseVerification.click();
    }
    public void checkChkExternalFraudControl(){
        wait.until(ExpectedConditions.visibilityOf(chkExternalFraudControl));
        chkExternalFraudControl.click();
    }
    public void setTxtNameForFraudControl(String noForFraudControl){
        wait.until(ExpectedConditions.visibilityOf(txtNameForFraudControl));
        txtNameForFraudControl.clear();
        txtNameForFraudControl.sendKeys(noForFraudControl);
    }
    public void checkChkUseNameForFraudControl(){
        wait.until(ExpectedConditions.visibilityOf(chkUseNameForFraudControl));
        chkUseNameForFraudControl.click();
    }
    public void setTxtDurationOfDisplayingOrderInfoDays(String durationOfDisplayingOrderInfoDays){
        wait.until(ExpectedConditions.visibilityOf(txtDurationOfDisplayingOrderInfoDays));
        txtDurationOfDisplayingOrderInfoDays.clear();
        txtDurationOfDisplayingOrderInfoDays.sendKeys(durationOfDisplayingOrderInfoDays);
    }
    public void setDdlVersion(String requestOrChallengeIndicator){
        wait.until(ExpectedConditions.visibilityOf(ddl3DS2RequestOrChallengeIndicator)).click();
        WebElement element=driver.findElement(By.xpath("//li[text()='"+requestOrChallengeIndicator+"']"));
        wait.until(ExpectedConditions.visibilityOf(element)).click();
    }

//    Actions for web elements under 3DS Configuration tab
    public void clickTab3DSConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(tab3DSConfiguration)).click();
    }
    public void checkPermissions(String permission){
        WebElement per=driver.findElement(By.xpath("//*[text()='"+permission+"']"));
        wait.until(ExpectedConditions.visibilityOf(per)).click();
    }

    public void clickBtnAddNew3DSConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(btnAddNew3DSConfiguration)).click();
    }

    public void selectDdlPaymentSystem(String paymentSystem){
        action.doubleClick(divPaymentSystem).build().perform();
        WebElement pay=driver.findElement(By.xpath("//*[text()='" + paymentSystem + "']"));
        wait.until(ExpectedConditions.visibilityOf(pay)).click();
    }
    public void checkChk3DS2Enabled(){
        wait.until(ExpectedConditions.visibilityOf(chk3DS2Enabled)).click();
    }
    public void checkChkTrySslIfUInVeRes(){
        wait.until(ExpectedConditions.visibilityOf(chkTrySslIfUInVeRes)).click();
    }
    public void checkChkTrysslIfUInPaRes(){
        wait.until(ExpectedConditions.visibilityOf(chkTrysslIfUInPaRes)).click();
    }
    public void clickBtnSave3DSConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(btnSave3DSConfiguration)).click();
    }


    //    Actions for web elements under Additional Parameters tab
    public void clickTabAdditionalParameters(){
        scrollInToView(tabAdditionalParameters);
        wait.until(ExpectedConditions.visibilityOf(tabAdditionalParameters));
        tabAdditionalParameters.click();
    }
    public void clickBtnAddNewAdditionalParameter(){
        wait.until(ExpectedConditions.visibilityOf(btnAddNewAdditionalParameter));
        btnAddNewAdditionalParameter.click();
    }
    public void setTxtPaymentMethod(String paymentMethod){
        wait.until(ExpectedConditions.visibilityOf(divEnterName));
        action.doubleClick(divEnterName).build().perform();
        wait.until(ExpectedConditions.visibilityOf(txtPaymentNameAndValue)).sendKeys(paymentMethod);
    }
    public void setTxtValue(String value){
        wait.until(ExpectedConditions.visibilityOf(divEnterValue));
        action.doubleClick(divEnterValue).build().perform();
        wait.until(ExpectedConditions.visibilityOf(txtValue)).sendKeys(value);
    }

//    Action for web elements under Send Payment Form tab
    public void clickTabSendPaymentForm(){
        wait.until(ExpectedConditions.visibilityOf(tabSendPaymentForm)).click();
    }

    public void setTxtReturnURLAfterPayment(String  url){
        wait.until(ExpectedConditions.visibilityOf(txtReturnURLAfterPayment)).clear();
        wait.until(ExpectedConditions.visibilityOf(txtReturnURLAfterPayment)).sendKeys(url);
    }

    public void setTxtReturnURLOnError(String  url){
        wait.until(ExpectedConditions.visibilityOf(txtReturnURLOnError)).clear();
        wait.until(ExpectedConditions.visibilityOf(txtReturnURLOnError)).sendKeys(url);
    }

//    Actions for web elements under Notifications tab
    public void clickTabNotifications(){
        scrollInToView(tabNotifications);
        wait.until(ExpectedConditions.visibilityOf(tabNotifications));
        tabNotifications.click();
    }
    public void checkChkSendEmailToCustomer(){
        wait.until(ExpectedConditions.visibilityOf(chkSendEmailToCustomer));
        chkSendEmailToCustomer.click();
    }
    public void checkChkSendEmailToMerchant(){
        wait.until(ExpectedConditions.visibilityOf(chkSendEmailToMerchant));
        chkSendEmailToMerchant.click();
    }
    public void setTxtMerchantEmail(String email){
        wait.until(ExpectedConditions.visibilityOf(txtMerchantEmail));
        txtMerchantEmail.sendKeys(email);
    }

    public void checkNotificationTabSMS(){
        wait.until(ExpectedConditions.visibilityOf(notificationTabSMS)).click();
    }
    public void checkAllCustomerSMS(){
        wait.until(ExpectedConditions.visibilityOf(allCustomerSMS)).click();
    }
    public void checkAllMerchantSMS(){
        wait.until(ExpectedConditions.visibilityOf(allMerchantSMS)).click();
    }

//    Actions for web elements under Address tab
    public void clickTabAddress(){
        scrollInToView(tabAddress);
        wait.until(ExpectedConditions.visibilityOf(tabAddress));
        tabAddress.click();
    }
    public void setTxtAddress(String address){
        wait.until(ExpectedConditions.visibilityOf(txtAddress));
        txtAddress.sendKeys(address);
    }
    public void setTxtCity(String city){
        wait.until(ExpectedConditions.visibilityOf(txtCity));
        txtCity.sendKeys(city);
    }
    public void setTxtRegionState(String region){
        wait.until(ExpectedConditions.visibilityOf(txtRegionState));
        txtRegionState.sendKeys(region);
    }
    public void setTxtCountry(String country){
        wait.until(ExpectedConditions.visibilityOf(txtCountry));
        String firstCharacters = country.substring(0, 3);
        txtCountry.sendKeys(firstCharacters);
        txtCountry.sendKeys(Keys.RETURN);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()='Ethiopia (231)']")))).click();

//        driver.findElement(By.xpath("//*[text()='Ethiopia (231)']")).click();
    }
    public void setTxtPostalZipCode(String postal){
        wait.until(ExpectedConditions.visibilityOf(txtPostalZipCode));
        txtPostalZipCode.sendKeys(postal);
    }
    public void setTxtPhoneNumber(String phone){
        wait.until(ExpectedConditions.visibilityOf(txtPhoneNumber));
        txtPhoneNumber.sendKeys(phone);
    }
    public void setTxtAdditionalInfo(String additionalInfo){
        wait.until(ExpectedConditions.visibilityOf(txtAdditionalInfo));
        txtAdditionalInfo.sendKeys(additionalInfo);
    }
//    Actions of web elements under Additional Info tab

// Actions of web elements under main tab

    public void setTxtEPGMerchantLogin(String loginID){
        wait.until(ExpectedConditions.visibilityOf(txtEPGMerchantLogin));
        txtEPGMerchantLogin.sendKeys(loginID);
    }
    public void setTxtMerchantName(String name){
        wait.until(ExpectedConditions.visibilityOf(txtMerchantName));
        txtMerchantName.sendKeys(name);
    }
    public void checkChkActive(boolean status){
        wait.until(ExpectedConditions.visibilityOf(chkActive));
        if(status==true)
            chkActive.click();
    }
    public void setTxtMCC(String mmc){
        wait.until(ExpectedConditions.visibilityOf(txtMCC));
        txtMCC.sendKeys(mmc);
    }
    public void setTxtMerchantWebsiteAddress(String website){
        wait.until(ExpectedConditions.visibilityOf(txtMerchantWebsiteAddress));
        txtMerchantWebsiteAddress.sendKeys(website);
    }
    public void setTxtMerchantEmailMain(String email){
        wait.until(ExpectedConditions.visibilityOf(txtMerchantEmailMain)).sendKeys(email);
    }
    public void setTxtMerchantEmailAddress(String email){
        wait.until(ExpectedConditions.visibilityOf(txtMerchantEmailAddress));
        txtMerchantEmailAddress.sendKeys(email);
    }
    public void setTxtMerchantPhoneNumber(String phone){
        wait.until(ExpectedConditions.visibilityOf(txtMerchantPhoneNumber));
        txtMerchantPhoneNumber.sendKeys(phone);
    }
    public void checkChkMultilanguage(boolean status){
        wait.until(ExpectedConditions.visibilityOf(chkMultilanguage));
        if(status==true)
            chkMultilanguage.click();
    }
    public void setDdlPaymentLanguage(String language){
        String defaultLan="EN";
        if(!language.equalsIgnoreCase(defaultLan)) {
            wait.until(ExpectedConditions.visibilityOf(ddlPaymentLanguage));
            Select dd = new Select(ddlPaymentLanguage);
            dd.selectByVisibleText(language);
        }
    }
    public void setTxtListOfLocals(String locals){
        wait.until(ExpectedConditions.visibilityOf(txtListOfLocals));
        txtListOfLocals.sendKeys(locals);
    }
    public void setTxtPanMaskedDigitCount(String count){
        wait.until(ExpectedConditions.visibilityOf(txtPanMaskedDigitCount));
        txtPanMaskedDigitCount.clear();
        txtPanMaskedDigitCount.sendKeys(count);
    }
    public void setTxtChooseParent(String parent){
        wait.until(ExpectedConditions.visibilityOf(txtChooseParent));
        txtChooseParent.sendKeys(parent);
    }

    public void doubleClickElement(WebElement ele){
//        action.doubleClick(ele).build().perform();
        action.moveToElement(ele).doubleClick().build().perform();
    }

    private void scrollInToView(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    private void clickPermission(WebElement permissionElement){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", permissionElement);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOf(permissionElement));
        permissionElement.click();
    }

    public void selectNewMerchantPermissions(){
        clickPermission(permissions.get(2));
        clickPermission(permissions.get(3));
        clickPermission(permissions.get(4));
        clickPermission(permissions.get(5));
        clickPermission(permissions.get(6));
        clickPermission(permissions.get(35));
        clickPermission(permissions.get(36));
        clickPermission(permissions.get(37));
        clickPermission(permissions.get(57));
        clickPermission(permissions.get(61));
//        clickPermission(permissions.get(65));
    }

    public String getAlertMessage(){
        return alertMessage;
    }

    public void clickBtnSave(){
        wait.until(ExpectedConditions.visibilityOf(btnSave));
        btnSave.click();
        try {
            wait.until(ExpectedConditions.visibilityOf(alertDisplay));
            alertMessage=alertDisplay.getText();
            wait.until(ExpectedConditions.visibilityOf(btnAlertOk));
            btnAlertOk.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Alert message: "+alertMessage);
    }
    public void clickBtnClose(){
        wait.until(ExpectedConditions.visibilityOf(btnCancel)).click();
    }
    public String getURL(){
        return driver.getCurrentUrl();
    }
}