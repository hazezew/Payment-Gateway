#  Author: Belesti Yenegeta
#  Date: May 31, 2023
#  Project name: Electronic Payment Gateway (EPG) ACS Users Management
#  Module: ACS Users Management
#  Activity: Login EPG ACS Users Management
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@LoginEPGUser

Feature: ACS User Management
  Background: user opened web browser and maximizes it
    When user has entered ACS system URL
    When user enters "Belesti1" into ACS Username text field
    And user enters "Bel@Gsh#4" into ACS into password text field
    And user clicks ACS Login button
    Then system displays ACS Admin dashboard
    And ACS user clicks on Menu Icon
    And ACS user clicks on Users menu

  Scenario: Add or Create ACS user
    And ACS user clicks on the Add button
    And ACS user enters "acsuserauto5" in to the name text field
#    And ACS user clicks on the profile dropdown
#    And ACS user selects Bunna profile
    And Acs user enters "acsuserauto5" in to the login text field
    And ACS user enters "Acsuserauto@124" in to the password text field
    And ACS user enters "Acsuserauto@124" in to the confirmation text field
    And ACS user unchecks change password checkbox
    And ACS user adds roles for the user
    And ACS user clicks on the Add acs user button
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Search for an ACS User
    And ACS user enters "acsuserauto5" into login text field
    And ACS user clicks on the Search button
    Then The system should return "acsuserauto5"
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Edit ACS User
    And ACS user enters "acsuserauto5" into login text field
    And ACS user clicks on the Search button
    And ACS user selects the returned user
    And ACS user clicks on the Edit button
    And ACS user updates user profile
    And ACS user clicks on the Save button
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Change ACS User Password
    And ACS user enters "acsuserauto5" into login text field
    And ACS user clicks on the Search button
    And ACS user selects the returned user
    And ACS user clicks on the Change password button
    And ACS user enters "Acsuserauto@1235" in to the password text field
    And ACS user enters "Acsuserauto@1235" in to the confirmation text field
    And ACS user unchecks change password checkbox
    And ACS user clicks on the Save button
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Block ACS User
    And ACS user enters "acsuserauto5" into login text field
    And ACS user clicks on the Search button
    And ACS user selects the returned user
    And ACS user clicks on the Add Block button
    And ACS user enters "2023.06.22 00:00" in the start date time field
    And ACS user enters "2023.06.23 00:00" in the end date time field
    And ACS user enters "acsuserauto5 is blocked for testing purpose" in the comments text area
    And ACS user clicks on the Add or save block button
    And ACS user enters "acsuserauto5" into login text field
    And ACS user clicks on the Search button
    And ACS user selects the returned user
    Then ACS user would be blocked by the system and get "acsuserauto5 is blocked for testing purpose" in the comment column
    And ACS user logs out
    Then ACS system displays login page





