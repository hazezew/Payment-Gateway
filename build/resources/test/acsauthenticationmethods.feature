#  Author: Belesti Yenegeta
#  Date: Jul 04, 2023
#  Project name: ACS Authentication Methods
#  Module: ACS Authentication Methods
#  Activity: ACS Authentication Methods
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@ACSAuthenticationMethods

Feature: ACS Authentication Methods
  Background: user opened web browser and maximizes it
    When user has entered ACS system URL
    When user enters "Belesti1" into ACS Username text field
    And user enters "Bel@Gsh#4" into ACS into password text field
#    When user enters "acsuserauto4" into ACS Username text field
#    And user enters "Acsuserauto@1235" into ACS into password text field
#    When user enters "acsuserauto5" into ACS Username text field
#    And user enters "Acsuserauto@1235" into ACS into password text field
#    When user enters "Betty" into ACS Username text field
#    And user enters "Betty@123$" into ACS into password text field
    And user clicks ACS Login button
    Then system displays ACS Admin dashboard
    And ACS user clicks on Menu Icon for Authentication Methods
    And ACS user clicks on Authentication Methods menu

  Scenario: Add Authentication Methods
    And ACS user clicks on the Add authentication methods button
    And ACS user enters "BelYen" into authentication method name text field
    And ACS user selects "Static passcode" for DEFAULT DS TYPE
    And ACS user clicks on the Save authentication methods button
    And ACS user enters "BelYen" into authentication method name filter text field
    And ACS user clicks on the Search authentication method button
    Then ACS user would get "BelYen" from the returned list of authentication methods
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Search Authentication Methods
    And ACS user enters "BelYen" into authentication method name filter text field
    And ACS user clicks on the Search authentication method button
    Then ACS user would get "BelYen" from the returned list of authentication methods
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Edit Authentication Methods
    And ACS user enters "BelYen" into authentication method name filter text field
    And ACS user clicks on the Search authentication method button
    And ACS user clicks on the returned authentication method row
    And ACS user clicks on the Edit authentication method button
    And ACS user enters "BelYen2" into authentication method name text field
    And ACS user selects "App OTP" for DEFAULT DS TYPE
    And ACS user clicks on the Save authentication methods button
    And ACS user enters "BelYen2" into authentication method name filter text field
    And ACS user clicks on the Search authentication method button
    Then ACS user would get "BelYen2" from the returned list of authentication methods
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Delete Authentication Methods
    And ACS user enters "BelYen2" into authentication method name filter text field
    And ACS user clicks on the Search authentication method button
    And ACS user clicks on the returned authentication method row
    And ACS user clicks on the Delete authentication method button
    And ACS user clicks on Yes button to confirm deletion of authentication method
    And ACS user enters "BelYen2" into authentication method name filter text field
    And ACS user clicks on the Search authentication method button
    Then ACS user would get "No records found." text rather than the authentication method
    And ACS user logs out
    Then ACS system displays login page
