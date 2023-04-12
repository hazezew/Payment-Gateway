#  Author: Habitamu Azezew
#  Date: April 10, 2022
#  Project name: Electronic Payment Gateway (EPG)
#  Module: Fraud Management
#  Activity: last Reviewed Cases
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@FraudManagement

Feature: last Reviewed Cases Page Integrity
  Background: user opened web browser and maximizes it
    When user has entered FM system URL

  Scenario: last Reviewed Cases Integrity check
    When user enters "Habtamu" into FM Username text field
    And user enters "Habtamu@1234" into FM into password text field
    And FM user clicks Login button
    Then system displays FM Admin dashboard
    And FM user clicks on Fraud Management main menu
    And FM user moves mouse over Case management submenu
    And FM clicks on last Reviewed Cases child menu
    Then FM system displays last Reviewed Cases page
    And on last Reviewed Cases page FM user selects "ACCOUNT_NUMBER" from Entity Type dropdown
    And on last Reviewed Cases page FM user clicks search icon
    And FM user clicks logout link