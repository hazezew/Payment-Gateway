$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/merchant.feature");
formatter.feature({
  "name": "Merchant Management",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@MerchantManagement"
    }
  ]
});
formatter.background({
  "name": "user opened web browser and maximizes it",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has entered EPG system URL",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.user_has_entered_EPG_system_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add new merchant with valid and complete mandatory data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@MerchantManagement"
    }
  ]
});
formatter.step({
  "name": "user enters \"testingteam1\" into EPG Username text field",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.userEntersIntoEPGUsernameTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"Abc@123456\" into EPG into password text field",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.userEntersIntoEPGIntoPasswordTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks EPG Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.userClicksEPGLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "system displays EPG Admin dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.systemDisplaysEPGAdminDashboard()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [https://192.168.20.45:7045/epg_gui/] but found [https://192.168.20.45:7045/epg_gui/#login]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:137)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:453)\r\n\tat org.testng.Assert.assertEquals(Assert.java:463)\r\n\tat stepDef.LoginStepDef.systemDisplaysEPGAdminDashboard(LoginStepDef.java:58)\r\n\tat ✽.system displays EPG Admin dashboard(file:src/test/resources/merchant.feature:22)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "EPG user clicks Administration menu",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksAdministrationMenu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user clicks Merchants submenu",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksMerchantsSubmenu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG system displays Merchants management page",
  "keyword": "Then "
});
formatter.match({
  "location": "MerchantStepDef.epgSystemDisplaysMerchantsManagementPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user clicks on create link",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnCreateLink()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user click on Main Information tab",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClickOnMainInformationTab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user enters \"newusername11\" into EPG Merchant Login text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoEPGMerchantLoginTextField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user enters \"Abenezerwondemu\" into Merchant Name text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoMerchantNameTextField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user enters \"1234\" into MCC text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoMCCTextField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user enters \"https://abenezer.com/\" into Merchant Website Address text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoMerchantWebsiteAddressTextField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user enters selects \"EN\" Payment Language dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersSelectsPaymentLanguageDropdown(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user enters \"EN\" into List Of Locals text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoListOfLocalsTextField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user enters \"6\" into Pan Masked Digit Count text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoPanMaskedDigitCountTextField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user selects the Merchant Permissions",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserSelectsTheMerchantPermissions()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user clicks on Acquirer tab for new Merchant",
  "keyword": "Then "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnAcquirerTabForNewMerchant()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user clicks on add new Acquirer button",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnAddNewAcquirerButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user selects \"BunnaBankAcquirer\" from new Acquirer Name dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserSelectsFromNewAcquirerNameDropdown(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user enters \"AB123456\" into Processing Merchant ID text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoProcessingMerchantIDTextField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user enters \"12345678\" into Terminal ID text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoTerminalIDTextField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user enters \"newusername\" into User Login text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoUserLoginTextField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user enters \"password\" into User Password text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoUserPasswordTextField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user clicks on Save Acquirer button",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnSaveAcquirerButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user checks Default Acquirer checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserChecksDefaultAcquirerCheckbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user clicks on Additional information tab",
  "keyword": "Then "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_clicks_on_Additional_information_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user checks ETB under currency list",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_checks_ETB_under_currency_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user selects \"ETB (230)\" Default Currency dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserSelectsDefaultCurrencyDropdown(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user enters \"1\" into Number of payment attempts text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_enters_into_Number_of_payment_attempts_text_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user selects \"Version 1\" from Version of getOrderStatusExtended text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_selects_from_Version_of_getOrderStatusExtended_text_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user selects \"Version 2\" from Version of getPTwoPStatus text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_selects_from_Version_of_getP_PStatus_text_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user checks Use verification checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_checks_Use_verification_checkbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user checks External fraud control checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_checks_External_fraud_control_checkbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user enters \"Fraud control name\" into Name for fraud control text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_enters_into_Name_for_fraud_control_text_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user checks Use name for fraud control checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_checks_Use_name_for_fraud_control_checkbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user enters \"1\" into Duration of displaying order information text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoDurationOfDisplayingOrderInformationTextField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user selects \"NO_PREFERENCE\" ThreeDSTwo Requester Challenge Indicator dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_selects_ThreeDS_Requester_Challenge_Indicator_dropdown(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user clicks on Address tab",
  "keyword": "Then "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_clicks_on_Address_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user enters \"Ethiopia\" into into Country text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_enters_into_into_Country_text_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user clicks on Save merchant button",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnSaveMerchantButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user clicks logout link",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.epgUserLogsOut()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "user opened web browser and maximizes it",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has entered EPG system URL",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.user_has_entered_EPG_system_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search and update registered merchant details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@MerchantManagement"
    }
  ]
});
formatter.step({
  "name": "user enters \"testingteam1\" into EPG Username text field",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.userEntersIntoEPGUsernameTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"Abc@123456\" into EPG into password text field",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.userEntersIntoEPGIntoPasswordTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks EPG Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.userClicksEPGLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "system displays EPG Admin dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.systemDisplaysEPGAdminDashboard()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [https://192.168.20.45:7045/epg_gui/] but found [https://192.168.20.45:7045/epg_gui/#login]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:137)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:453)\r\n\tat org.testng.Assert.assertEquals(Assert.java:463)\r\n\tat stepDef.LoginStepDef.systemDisplaysEPGAdminDashboard(LoginStepDef.java:58)\r\n\tat ✽.system displays EPG Admin dashboard(file:src/test/resources/merchant.feature:66)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "EPG user clicks Administration menu",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksAdministrationMenu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user clicks Merchants submenu",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksMerchantsSubmenu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG system displays Merchants management page",
  "keyword": "Then "
});
formatter.match({
  "location": "MerchantStepDef.epgSystemDisplaysMerchantsManagementPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user enters \"HabitamuAzezew\" into search merchant text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoSearchMerchantTextField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user clicks on find button",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnFindButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG system displays the merchant based on merchant name",
  "keyword": "Then "
});
formatter.match({
  "location": "MerchantStepDef.epgSystemDisplaysTheMerchantBasedOnMerchantName()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user clicks on the merchant \"HabitamuAzezew\" for update",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnTheMerchantForUpdate(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user clicks on Send Payment Form tab",
  "keyword": "Then "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnSendPaymentFormTab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user enters \"https://habitamu.com/\" into Return URL after payment text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoReturnURLAfterPaymentTextField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user enters \"https://habitamu.com/\" into Return URL on error text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoReturnURLOnErrorTextField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user clicks on Save merchant button",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnSaveMerchantButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG system updates merchant details",
  "keyword": "Then "
});
formatter.match({
  "location": "MerchantStepDef.epgSystemUpdatesMerchantDetails()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user clicks logout link",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.epgUserLogsOut()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "user opened web browser and maximizes it",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has entered EPG system URL",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.user_has_entered_EPG_system_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add merchant with an already existing merchant detail",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@MerchantManagement"
    }
  ]
});
formatter.step({
  "name": "user enters \"testingteam1\" into EPG Username text field",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.userEntersIntoEPGUsernameTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"Abc@123456\" into EPG into password text field",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.userEntersIntoEPGIntoPasswordTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks EPG Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.userClicksEPGLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "system displays EPG Admin dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.systemDisplaysEPGAdminDashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks Administration menu",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksAdministrationMenu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks Merchants submenu",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksMerchantsSubmenu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG system displays Merchants management page",
  "keyword": "Then "
});
formatter.match({
  "location": "MerchantStepDef.epgSystemDisplaysMerchantsManagementPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks on create link",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnCreateLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user click on Main Information tab",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClickOnMainInformationTab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"habitamuazezew\" into EPG Merchant Login text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoEPGMerchantLoginTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"HabitamuAzezew\" into Merchant Name text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoMerchantNameTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"1234\" into MCC text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoMCCTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"https://habitamu.com/\" into Merchant Website Address text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoMerchantWebsiteAddressTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters selects \"EN\" Payment Language dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersSelectsPaymentLanguageDropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"EN\" into List Of Locals text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoListOfLocalsTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"6\" into Pan Masked Digit Count text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoPanMaskedDigitCountTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user selects the Merchant Permissions",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserSelectsTheMerchantPermissions()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks on Acquirer tab for new Merchant",
  "keyword": "Then "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnAcquirerTabForNewMerchant()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks on add new Acquirer button",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnAddNewAcquirerButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user selects \"BunnaBankAcquirer\" from new Acquirer Name dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserSelectsFromNewAcquirerNameDropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"HAB123\" into Processing Merchant ID text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoProcessingMerchantIDTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"12345678\" into Terminal ID text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoTerminalIDTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"username\" into User Login text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoUserLoginTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"password\" into User Password text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoUserPasswordTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks on Save Acquirer button",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnSaveAcquirerButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user checks Default Acquirer checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserChecksDefaultAcquirerCheckbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks on Additional information tab",
  "keyword": "Then "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_clicks_on_Additional_information_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user checks ETB under currency list",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_checks_ETB_under_currency_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user selects \"ETB (230)\" Default Currency dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserSelectsDefaultCurrencyDropdown(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d111.0.5563.147)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#stale_element_reference\nBuild info: version: \u00274.5.0\u0027, revision: \u0027fe167b119a\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [e7ff6c50308692af6aa0c840a9e8a678, isElementDisplayed {id\u003df402f896-d652-4d77-ba3b-14f34bd96251}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 111.0.5563.147, chrome: {chromedriverVersion: 111.0.5563.64 (c710e93d5b63..., userDataDir: C:\\Users\\user1\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:59897}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:59897/devtoo..., se:cdpVersion: 111.0.5563.147, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nElement: [[ChromeDriver: chrome on WINDOWS (e7ff6c50308692af6aa0c840a9e8a678)] -\u003e xpath: //li[text()\u003d\u0027ETB (230)\u0027]]\nSession ID: e7ff6c50308692af6aa0c840a9e8a678\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:547)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:257)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.isDisplayed(RemoteWebElement.java:313)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.elementIfVisible(ExpectedConditions.java:307)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:40)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:293)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:290)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:208)\r\n\tat pageObj.MerchantPage.selectDdlDefaultCurrency(MerchantPage.java:429)\r\n\tat stepDef.MerchantStepDef.epgUserSelectsDefaultCurrencyDropdown(MerchantStepDef.java:142)\r\n\tat ✽.EPG user selects \"ETB (230)\" Default Currency dropdown(file:src/test/resources/merchant.feature:110)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "EPG user enters \"1\" into Number of payment attempts text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_enters_into_Number_of_payment_attempts_text_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user selects \"Version 1\" from Version of getOrderStatusExtended text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_selects_from_Version_of_getOrderStatusExtended_text_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user selects \"Version 2\" from Version of getPTwoPStatus text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_selects_from_Version_of_getP_PStatus_text_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user checks Use verification checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_checks_Use_verification_checkbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user checks External fraud control checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_checks_External_fraud_control_checkbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user enters \"Fraud control name\" into Name for fraud control text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_enters_into_Name_for_fraud_control_text_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user checks Use name for fraud control checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_checks_Use_name_for_fraud_control_checkbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user enters \"1\" into Duration of displaying order information text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoDurationOfDisplayingOrderInformationTextField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user selects \"NO_PREFERENCE\" ThreeDSTwo Requester Challenge Indicator dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_selects_ThreeDS_Requester_Challenge_Indicator_dropdown(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user clicks on Address tab",
  "keyword": "Then "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_clicks_on_Address_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user enters \"Ethiopia\" into into Country text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_enters_into_into_Country_text_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user clicks on Save merchant button",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnSaveMerchantButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG add merchant page displays an alert message containing \"Login already exists\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MerchantStepDef.epgAddMerchantPageDisplaysAnAlertMessageContaining(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user clicks on Close merchant button",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnCloseMerchantButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "EPG user clicks logout link",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.epgUserLogsOut()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "user opened web browser and maximizes it",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has entered EPG system URL",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.user_has_entered_EPG_system_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add new merchant with all valid input value data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@MerchantManagement"
    }
  ]
});
formatter.step({
  "name": "user enters \"testingteam1\" into EPG Username text field",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.userEntersIntoEPGUsernameTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"Abc@123456\" into EPG into password text field",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.userEntersIntoEPGIntoPasswordTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks EPG Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.userClicksEPGLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "system displays EPG Admin dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.systemDisplaysEPGAdminDashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks Administration menu",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksAdministrationMenu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks Merchants submenu",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksMerchantsSubmenu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG system displays Merchants management page",
  "keyword": "Then "
});
formatter.match({
  "location": "MerchantStepDef.epgSystemDisplaysMerchantsManagementPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks on create link",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnCreateLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user click on Main Information tab",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClickOnMainInformationTab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"username\" into EPG Merchant Login text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoEPGMerchantLoginTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"Habitamu Azezew\" into Merchant Name text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoMerchantNameTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"1234\" into MCC text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoMCCTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"https://habitamu.com/\" into Merchant Website Address text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoMerchantWebsiteAddressTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"hazezew@gmail.com\" into Merchant email Address(s) text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoMerchantEmailAddressSTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters selects \"EN\" Payment Language dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersSelectsPaymentLanguageDropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"EN\" into List Of Locals text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoListOfLocalsTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"6\" into Pan Masked Digit Count text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoPanMaskedDigitCountTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user selects the Merchant Permissions",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserSelectsTheMerchantPermissions()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks on Acquirer tab for new Merchant",
  "keyword": "Then "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnAcquirerTabForNewMerchant()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks on add new Acquirer button",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnAddNewAcquirerButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user selects \"BunnaBankAcquirer\" from new Acquirer Name dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserSelectsFromNewAcquirerNameDropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"HAB123\" into Processing Merchant ID text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoProcessingMerchantIDTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"123456789\" into Terminal ID text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoTerminalIDTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"username\" into User Login text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoUserLoginTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"password\" into User Password text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoUserPasswordTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks on Save Acquirer button",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnSaveAcquirerButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user checks Default Acquirer checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserChecksDefaultAcquirerCheckbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks on Routing rules tab",
  "keyword": "Then "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnRoutingRulesTab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks on Additional information tab",
  "keyword": "Then "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_clicks_on_Additional_information_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user checks ETB under currency list",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_checks_ETB_under_currency_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user selects \"ETB (230)\" Default Currency dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserSelectsDefaultCurrencyDropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"1\" into Number of payment attempts text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_enters_into_Number_of_payment_attempts_text_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user selects \"Version 1\" from Version of getOrderStatusExtended text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_selects_from_Version_of_getOrderStatusExtended_text_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user selects \"Version 2\" from Version of getPTwoPStatus text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_selects_from_Version_of_getP_PStatus_text_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user checks Use verification checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_checks_Use_verification_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user checks External fraud control checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_checks_External_fraud_control_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"Fraud control name\" into Name for fraud control text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_enters_into_Name_for_fraud_control_text_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user checks Use name for fraud control checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_checks_Use_name_for_fraud_control_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"1\" into Duration of displaying order information text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoDurationOfDisplayingOrderInformationTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user selects \"NO_PREFERENCE\" ThreeDSTwo Requester Challenge Indicator dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_selects_ThreeDS_Requester_Challenge_Indicator_dropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks on ThreeDS Configuration tab",
  "keyword": "Then "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnThreeDSConfigurationTab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user selects \"MasterCard Identity Check payments\" from Permissions checkbox list",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserSelectsFromPermissionsCheckboxList(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks on Add new ThreeDS Configuration button",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnAddNewThreeDSConfigurationButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user selects \"Mastercard\" from Payment System dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserSelectsFromPaymentSystemDropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user checks ThreeDSTwo Enabled checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserChecksThreeDSTwoEnabledCheckbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user checks Try ssl if U in VeRes checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserChecksTrySslIfUInVeResCheckbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user checks Try ssl if U in PaRes checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserChecksTrySslIfUInPaResCheckbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks on Save ThreeDS Configuration button",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnSaveThreeDSConfigurationButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks on Additional parameters tab",
  "keyword": "Then "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_clicks_on_Additional_parameters_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks on Add new parameters button",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_clicks_on_Add_new_parameters_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"Card Payment\" into Name and payment method text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_enters_into_Name_and_payment_method_text_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"100\" into value text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_enters_into_value_text_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks on Notifications tab",
  "keyword": "Then "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_clicks_on_Notifications_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user checks on all customer EMail checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_checks_on_all_customer_EMail_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user checks on all Merchant EMail checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_checks_on_all_Merchant_EMail_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"hazezew@gmail.com\" into Email address for certificate expiration notifications text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserEntersIntoEmailAddressForCertificateExpirationNotificationsTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks on SMS Notification tab",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnSMSNotificationTab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user checks all to Send SMS to customer checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserChecksAllToSendSMSToCustomerCheckbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user checks all to Send SMS to merchant checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserChecksAllToSendSMSToMerchantCheckbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks on Address tab",
  "keyword": "Then "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_clicks_on_Address_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"Bole\" into Address text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_enters_into_Address_text_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"Addis Ababa\" into into City text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_enters_into_into_City_text_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"Addis Ababa\" into into Region text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_enters_into_into_Region_text_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"Ethiopia\" into into Country text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_enters_into_into_Country_text_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"1234\" into into Postal Code text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_enters_into_into_Postal_Code_text_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"+251115557845\" into into Phone Number text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_enters_into_into_Phone_Number_text_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user enters \"Additional Information\" into into Additional Information Code text field",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epg_user_enters_into_into_Additional_Information_Code_text_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks on Save merchant button",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnSaveMerchantButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks logout link",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.epgUserLogsOut()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "user opened web browser and maximizes it",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has entered EPG system URL",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.user_has_entered_EPG_system_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add new merchant without all mandatory field input data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@MerchantManagement"
    }
  ]
});
formatter.step({
  "name": "user enters \"testingteam1\" into EPG Username text field",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.userEntersIntoEPGUsernameTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"Abc@123456\" into EPG into password text field",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.userEntersIntoEPGIntoPasswordTextField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks EPG Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.userClicksEPGLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "system displays EPG Admin dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.systemDisplaysEPGAdminDashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks Administration menu",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksAdministrationMenu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks Merchants submenu",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksMerchantsSubmenu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG system displays Merchants management page",
  "keyword": "Then "
});
formatter.match({
  "location": "MerchantStepDef.epgSystemDisplaysMerchantsManagementPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks on create link",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnCreateLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks on Save merchant button",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnSaveMerchantButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG add merchant page displays an alert message containing \"List of locales is empty\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MerchantStepDef.epgAddMerchantPageDisplaysAnAlertMessageContaining(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG add merchant page displays an alert message containing \"Full name is empty\"",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgAddMerchantPageDisplaysAnAlertMessageContaining(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG add merchant page displays an alert message containing \"Merchant website address is empty\"",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgAddMerchantPageDisplaysAnAlertMessageContaining(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG add merchant page displays an alert message containing \"DS Requestor Challenge Indicator is empty\"",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgAddMerchantPageDisplaysAnAlertMessageContaining(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG add merchant page displays an alert message containing \"Country is empty\"",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgAddMerchantPageDisplaysAnAlertMessageContaining(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG add merchant page displays an alert message containing \"Login is empty\"",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgAddMerchantPageDisplaysAnAlertMessageContaining(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG add merchant page displays an alert message containing \"Default acquirer not selected\"",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgAddMerchantPageDisplaysAnAlertMessageContaining(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG add merchant page displays an alert message containing \"MCC is empty\"",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgAddMerchantPageDisplaysAnAlertMessageContaining(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks on Close merchant button",
  "keyword": "And "
});
formatter.match({
  "location": "MerchantStepDef.epgUserClicksOnCloseMerchantButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EPG user clicks logout link",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.epgUserLogsOut()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});