#  Author: Habitamu Azezew
#  Date: April 12, 2022
#  Project name: Electronic Payment Gateway (EPG)
#  Module: Fraud Management
#  Activity: Case Management Settings
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@FraudManagement

Feature: Case Management Settings
  Background: user opened web browser and maximizes it
    When user has entered FM system URL

    Scenario: Case Management Settings page integrity
    When user enters "Habtamu" into FM Username text field
    And user enters "Habtamu@1234" into FM into password text field
    And FM user clicks Login button
    Then system displays FM Admin dashboard
    And FM user clicks on Fraud Management main menu
    And FM user moves mouse over Case management submenu
    And FM user clicks on Case Management Settings child menu
    Then FM system displays Case Management Settings page
    And FM user clicks on edit Case Management Settings button
    And FM user selects "MERCHANT_ID" from Default Investigation dropdown
    And FM user clicks Save Case Management Settings button
    And FM user clicks logout link