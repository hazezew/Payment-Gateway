#  Author: Habitamu Azezew
#  Date: Dec 06, 2022
#  Project name: Electronic Payment Gateway (EPG)
#  Module: Merchant Management
#  Activity: Merchant Management
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test (SIT)

@Regression
@MerchantManagement

Feature: Merchant Management
  Background: user opened web browser and maximizes it
    When user has entered EPG system URL

  Scenario: Create new user with valid and complete mandatory data
    When user enters "testingteam1" into EPG Username text field
    And user enters "Abc@123456" into EPG into password text field
    And user clicks EPG Login button
    Then system displays EPG Admin dashboard
    And EPG user clicks Administration menu
    And EPG user clicks Merchants submenu
    Then EPG system displays Merchants management page
    And EPG user clicks on create link
    And EPG user click on Main Information tab
    And EPG user enters "manman" into EPG Merchant Login text field
    And EPG user enters "manman123" into Merchant Name text field
    And EPG user enters "1234" into MCC text field
    And EPG user enters "https://abenezer.com/" into Merchant Website Address text field
    And EPG user enters selects "EN" Payment Language dropdown
    And EPG user enters "EN" into List Of Locals text field
    And EPG user enters "6" into Pan Masked Digit Count text field
    And EPG user selects the Merchant Permissions
    Then EPG user clicks on Acquirer tab for new Merchant
    And EPG user clicks on add new Acquirer button
    And EPG user selects "BunnaBankAcquirer" from new Acquirer Name dropdown
    And EPG user enters "AB123456" into Processing Merchant ID text field
    And EPG user enters "12345678" into Terminal ID text field
    And EPG user enters "newusername" into User Login text field
    And EPG user enters "password" into User Password text field
    And EPG user clicks on Save Acquirer button
    And EPG user checks Default Acquirer checkbox
    Then EPG user clicks on Additional information tab
    And EPG user checks ETB under currency list
    And EPG user selects "ETB (230)" Default Currency dropdown
    And EPG user enters "1" into Number of payment attempts text field
    And EPG user selects "Version 1" from Version of getOrderStatusExtended text field
    And EPG user selects "Version 2" from Version of getPTwoPStatus text field
    And EPG user checks Use verification checkbox
    And EPG user checks External fraud control checkbox
    And EPG user enters "Fraud control name" into Name for fraud control text field
    And EPG user checks Use name for fraud control checkbox
    And EPG user enters "1" into Duration of displaying order information text field
    And EPG user selects "NO_PREFERENCE" ThreeDSTwo Requester Challenge Indicator dropdown
    Then EPG user clicks on Address tab
    And EPG user enters "Ethiopia" into into Country text field
    And EPG user clicks on Save merchant button
    And EPG user clicks logout link

  Scenario: Search and update registered merchant details
    When user enters "testingteam1" into EPG Username text field
    And user enters "Abc@123456" into EPG into password text field
    And user clicks EPG Login button
    Then system displays EPG Admin dashboard
    And EPG user clicks Administration menu
    And EPG user clicks Merchants submenu
    Then EPG system displays Merchants management page
    And EPG user enters "HabitamuAzezew" into search merchant text field
    And EPG user clicks on find button
    Then EPG system displays the merchant based on merchant name
    And EPG user clicks on the merchant "HabitamuAzezew" for update
    Then EPG user clicks on Send Payment Form tab
    And EPG user enters "https://habitamu.com/" into Return URL after payment text field
    And EPG user enters "https://habitamu.com/" into Return URL on error text field
    And EPG user clicks on Save merchant button
    Then EPG system updates merchant details
    And EPG user clicks logout link

  Scenario: Add merchant with an already existing merchant detail
    When user enters "testingteam1" into EPG Username text field
    And user enters "Abc@123456" into EPG into password text field
    And user clicks EPG Login button
    Then system displays EPG Admin dashboard
    And EPG user clicks Administration menu
    And EPG user clicks Merchants submenu
    Then EPG system displays Merchants management page
    And EPG user clicks on create link
    And EPG user click on Main Information tab
    And EPG user enters "habitamuazezew" into EPG Merchant Login text field
    And EPG user enters "HabitamuAzezew" into Merchant Name text field
    And EPG user enters "1234" into MCC text field
    And EPG user enters "https://habitamu.com/" into Merchant Website Address text field
    And EPG user enters selects "EN" Payment Language dropdown
    And EPG user enters "EN" into List Of Locals text field
    And EPG user enters "6" into Pan Masked Digit Count text field
    And EPG user selects the Merchant Permissions
    Then EPG user clicks on Acquirer tab for new Merchant
    And EPG user clicks on add new Acquirer button
    And EPG user selects "BunnaBankAcquirer" from new Acquirer Name dropdown
    And EPG user enters "HAB123" into Processing Merchant ID text field
    And EPG user enters "12345678" into Terminal ID text field
    And EPG user enters "username" into User Login text field
    And EPG user enters "password" into User Password text field
    And EPG user clicks on Save Acquirer button
    And EPG user checks Default Acquirer checkbox
    Then EPG user clicks on Additional information tab
    And EPG user checks ETB under currency list
    And EPG user selects "ETB (230)" Default Currency dropdown
    And EPG user enters "1" into Number of payment attempts text field
    And EPG user selects "Version 1" from Version of getOrderStatusExtended text field
    And EPG user selects "Version 2" from Version of getPTwoPStatus text field
    And EPG user checks Use verification checkbox
    And EPG user checks External fraud control checkbox
    And EPG user enters "Fraud control name" into Name for fraud control text field
    And EPG user checks Use name for fraud control checkbox
    And EPG user enters "1" into Duration of displaying order information text field
    And EPG user selects "NO_PREFERENCE" ThreeDSTwo Requester Challenge Indicator dropdown
    Then EPG user clicks on Address tab
    And EPG user enters "Ethiopia" into into Country text field
    And EPG user clicks on Save merchant button
    Then EPG add merchant page displays an alert message containing "Login already exists"
    And EPG user clicks on Close merchant button
    And EPG user clicks logout link

  Scenario: Add new merchant with all valid input value data
    When user enters "testingteam1" into EPG Username text field
    And user enters "Abc@123456" into EPG into password text field
    And user clicks EPG Login button
    Then system displays EPG Admin dashboard
    And EPG user clicks Administration menu
    And EPG user clicks Merchants submenu
    Then EPG system displays Merchants management page
    And EPG user clicks on create link
    And EPG user click on Main Information tab
    And EPG user enters "username" into EPG Merchant Login text field
    And EPG user enters "Habitamu Azezew" into Merchant Name text field
    And EPG user enters "1234" into MCC text field
    And EPG user enters "https://habitamu.com/" into Merchant Website Address text field
    And EPG user enters "hazezew@gmail.com" into Merchant email Address(s) text field
    And EPG user enters selects "EN" Payment Language dropdown
    And EPG user enters "EN" into List Of Locals text field
    And EPG user enters "6" into Pan Masked Digit Count text field
    And EPG user selects the Merchant Permissions
    Then EPG user clicks on Acquirer tab for new Merchant
    And EPG user clicks on add new Acquirer button
    And EPG user selects "BunnaBankAcquirer" from new Acquirer Name dropdown
    And EPG user enters "HAB123" into Processing Merchant ID text field
    And EPG user enters "123456789" into Terminal ID text field
    And EPG user enters "username" into User Login text field
    And EPG user enters "password" into User Password text field
    And EPG user clicks on Save Acquirer button
    And EPG user checks Default Acquirer checkbox
    Then EPG user clicks on Routing rules tab
    Then EPG user clicks on Additional information tab
    And EPG user checks ETB under currency list
    And EPG user selects "ETB (230)" Default Currency dropdown
    And EPG user enters "1" into Number of payment attempts text field
    And EPG user selects "Version 1" from Version of getOrderStatusExtended text field
    And EPG user selects "Version 2" from Version of getPTwoPStatus text field
    And EPG user checks Use verification checkbox
    And EPG user checks External fraud control checkbox
    And EPG user enters "Fraud control name" into Name for fraud control text field
    And EPG user checks Use name for fraud control checkbox
    And EPG user enters "1" into Duration of displaying order information text field
    And EPG user selects "NO_PREFERENCE" ThreeDSTwo Requester Challenge Indicator dropdown

    Then EPG user clicks on ThreeDS Configuration tab
    And EPG user selects "MasterCard Identity Check payments" from Permissions checkbox list
    And EPG user clicks on Add new ThreeDS Configuration button
    And EPG user selects "Mastercard" from Payment System dropdown
    And EPG user checks ThreeDSTwo Enabled checkbox
    And EPG user checks Try ssl if U in VeRes checkbox
    And EPG user checks Try ssl if U in PaRes checkbox
    And EPG user clicks on Save ThreeDS Configuration button

    Then EPG user clicks on Additional parameters tab
    And EPG user clicks on Add new parameters button
    And EPG user enters "Card Payment" into Name and payment method text field
    And EPG user enters "100" into value text field

    Then EPG user clicks on Notifications tab
    And EPG user checks on all customer EMail checkbox
    And EPG user checks on all Merchant EMail checkbox
    And EPG user enters "hazezew@gmail.com" into Email address for certificate expiration notifications text field
    And EPG user clicks on SMS Notification tab
    And EPG user checks all to Send SMS to customer checkbox
    And EPG user checks all to Send SMS to merchant checkbox

    Then EPG user clicks on Address tab
    And EPG user enters "Bole" into Address text field
    And EPG user enters "Addis Ababa" into into City text field
    And EPG user enters "Addis Ababa" into into Region text field
    And EPG user enters "Ethiopia" into into Country text field
    And EPG user enters "1234" into into Postal Code text field
    And EPG user enters "+251115557845" into into Phone Number text field
    And EPG user enters "Additional Information" into into Additional Information Code text field
    And EPG user clicks on Save merchant button
    And EPG user clicks logout link

  Scenario: Add new merchant without all mandatory field input data
    When user enters "testingteam1" into EPG Username text field
    And user enters "Abc@123456" into EPG into password text field
    And user clicks EPG Login button
    Then system displays EPG Admin dashboard
    And EPG user clicks Administration menu
    And EPG user clicks Merchants submenu
    Then EPG system displays Merchants management page
    And EPG user clicks on create link
    And EPG user clicks on Save merchant button
    Then EPG add merchant page displays an alert message containing "List of locales is empty"
    And EPG add merchant page displays an alert message containing "Full name is empty"
    And EPG add merchant page displays an alert message containing "Merchant website address is empty"
    And EPG add merchant page displays an alert message containing "DS Requestor Challenge Indicator is empty"
    And EPG add merchant page displays an alert message containing "Country is empty"
    And EPG add merchant page displays an alert message containing "Login is empty"
    And EPG add merchant page displays an alert message containing "Default acquirer not selected"
    And EPG add merchant page displays an alert message containing "MCC is empty"
    And EPG user clicks on Close merchant button
    And EPG user clicks logout link