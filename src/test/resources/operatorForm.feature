#  Author: Habitamu Azezew
#  Date: April 10, 2022
#  Project name: Electronic Payment Gateway (EPG)
#  Module: Fraud Management
#  Activity: Operator Form
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@FraudManagement

Feature: Operator Form Page Integrity
  Background: user opened web browser and maximizes it
    When user has entered FM system URL

  Scenario: Operator Form Page Integrity check
    When user enters "Habtamu" into FM Username text field
    And user enters "Habtamu@1234" into FM into password text field
    And FM user clicks Login button
    Then system displays FM Admin dashboard
    And FM user clicks on Fraud Management main menu
    And FM user moves mouse over Case management submenu
    And FM clicks on Operator form child menu
    Then FM system displays Operator form page
    And on Operator Form page FM user selects "ACCOUNT_NUMBER" from Entity Type dropdown
    And FM user clicks logout link