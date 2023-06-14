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

Feature: Login EPG ACS User
  Background: user opened web browser and maximizes it
    When user has entered ACS system URL
    When user enters "Belesti1" into ACS Username text field
    And user enters "Bel@Gsh#4" into ACS into password text field
    And user clicks ACS Login button
    Then system displays ACS Admin dashboard
    And ACS user clicks on Menu Icon
    And ACS user clicks on Users menu

  Scenario: ACS User adds another ACS user
    And ACS user clicks on the Add button
    And ACS user enters "acsuserauto3" in to the name text field
#    And ACS user clicks on the profile dropdown
#    And ACS user selects Bunna profile
    And Acs user enters "acsuserauto3" in to the login text field
    And ACS user enters "Acsuserauto@123" in to the password text field
    And ACS user enters "Acsuserauto@123" in to the confirmation text field
    And ACS user unchecks change password checkbox
    And ACS user adds roles for the user
    And ACS user clicks on the Add acs user button

  Scenario: ACS User searches for an ACS User
    And ACS user enters "acsuserauto3" into login text field
    And ACS user clicks on the Search button
    Then The system should return "acsuserauto3"

  Scenario: Edit ACS User
    And ACS user enters "acsuserauto3" into login text field
    And ACS user clicks on the Search button
    And ACS user selects the returned user
    And ACS user clicks on the Edit button



