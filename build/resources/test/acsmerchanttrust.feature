#  Author: Belesti Yenegeta
#  Date: Jun 29, 2023
#  Project name: ACS Merchant Trust Management
#  Module: ACS Merchant Trust Management
#  Activity: ACS Merchant Trust Management
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@ACSMerchantTrustManagement

Feature: ACS Merchant Trust Management
  Background: user opened web browser and maximizes it
    When user has entered ACS system URL
#    When user enters "Belesti1" into ACS Username text field
#    And user enters "Bel@Gsh#4" into ACS into password text field
#    When user enters "acsuserauto4" into ACS Username text field
#    And user enters "Acsuserauto@1235" into ACS into password text field
    When user enters "acsuserauto5" into ACS Username text field
    And user enters "Acsuserauto@1235" into ACS into password text field
    And user clicks ACS Login button
    Then system displays ACS Admin dashboard
    And ACS user clicks on Menu Icon for Merchant Trust Management
    And ACS user clicks on Merchant trust menu

  Scenario: Add Merchant Trust
    And ACS user clicks on the Add merchant trust button
    And ACS user enters "12340003301234" into PAN text field
    And ACS user enters "BelYen3" into CARDHOLDER text field
    And ACS user enters "merchantone" into MERCHANT text field
    And ACS user clicks on the Save merchant trust button
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Search Merchant Trust
    And ACS user enters "BelYen3" into CARDHOLDER filter text field
    And ACS user clicks on the Search merchant trust button
    Then ACS user would get "BelYen3" from the returned merchant trust management page
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Edit Merchant Trust
    And ACS user enters "BelYen3" into CARDHOLDER filter text field
    And ACS user clicks on the Search merchant trust button
    And ACS user clicks on the returned merchant trust row
    And ACS user clicks on the Edit merchant trust button
    And ACS user clears CARDHOLDER field and enters "BelYen2" into it
    And ACS user clicks on the Save update button
    And ACS user enters "BelYen2" into CARDHOLDER filter text field
    And ACS user clicks on the Search merchant trust button
    Then ACS user would get "BelYen2" from the returned merchant trust management page
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Delete Merchant Trust
    And ACS user enters "BelYen2" into CARDHOLDER filter text field
    And ACS user clicks on the Search merchant trust button
    And ACS user clicks on the returned merchant trust row
    And ACS user clicks on the Delete merchant trust button
    And ACS user clicks on Yes button to confirm deletion
    And ACS user enters "BelYen2" into CARDHOLDER filter text field
    And ACS user clicks on the Search merchant trust button
    Then ACS user would get "No records found." text rather than the searched merchant trust
    And ACS user logs out
    Then ACS system displays login page
