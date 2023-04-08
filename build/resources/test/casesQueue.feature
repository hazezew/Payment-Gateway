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

Feature: Login FM User
  Background: user opened web browser and maximizes it
    When user has entered FM system URL

  Scenario: Login into FM with valid username and password
    When user enters "Habtamu" into FM Username text field
    And user enters "Habtamu@1234" into FM into password text field
    And FM user clicks Login button
    Then system displays FM Admin dashboard
    And FM user clicks on Fraud Management main menu
    And FM user moves mouse over Case management submenu
    And FM clicks on Cases queue child menu
    Then FM system displays Cases queue page
#    steps to be executed after Cases queue page is displayed
    And FM user clicks logout link