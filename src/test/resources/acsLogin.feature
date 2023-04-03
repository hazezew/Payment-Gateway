#  Author: Habitamu Azezew
#  Date: Dec 06, 2022
#  Project name: Electronic Payment Gateway (EPG)
#  Module: EPG Login
#  Activity: Login EPG ACS User
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@LoginEPGUser

Feature: Login EPG ACS User
  Background: user opened web browser and maximizes it
    When user has entered ACS system URL

  Scenario: ACS User Login with valid username and password
    When user enters "Habtamu" into ACS Username text field
    And user enters "Habtamu@123" into ACS into password text field
    And user clicks ACS Login button
    Then system displays ACS Admin dashboard
    And ACS user logs out
    Then ACS system displays login page