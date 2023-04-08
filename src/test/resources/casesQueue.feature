#  Author: Habitamu Azezew
#  Date: April 06, 2022
#  Project name: Electronic Payment Gateway (EPG)
#  Module: Fraud Management
#  Activity: Cases Queue
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@FraudManagement

Feature: Cases Queue management
  Background: user opened web browser and maximizes it
    When user has entered FM system URL

  Scenario: Search Cases Queue
    When user enters "Habtamu" into FM Username text field
    And user enters "Habtamu@1234" into FM into password text field
    And FM user clicks Login button
    Then system displays FM Admin dashboard
    And FM user clicks on Fraud Management main menu
    And FM user moves mouse over Case management submenu
    And FM clicks on Cases queue child menu
    Then FM system displays Cases queue page
    And FM user selects "ACCOUNT_NUMBER" from Entity Type dropdown
    And FM user selects "1000 - administrator" from Locked by user dropdown
    And FM user selects "Classified positive" from Classification type dropdown
    And FM user selects "Forwarded" from Forwarded dropdown
    And FM user clicks on search button
    And FM user clicks logout link