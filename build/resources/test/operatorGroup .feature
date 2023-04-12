#  Author: Habitamu Azezew
#  Date: April 10, 2022
#  Project name: Electronic Payment Gateway (EPG)
#  Module: Fraud Management
#  Activity: Operator Group
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@FraudManagement

Feature: Operator Group management
  Background: user opened web browser and maximizes it
    When user has entered FM system URL
    When user enters "Habtamu" into FM Username text field
    And user enters "Habtamu@1234" into FM into password text field
    And FM user clicks Login button
    Then system displays FM Admin dashboard
    And FM user clicks on Fraud Management main menu
    And FM user moves mouse over Case management submenu
    And FM user clicks on Operator Group child menu
    Then FM system displays Operator Group page

  Scenario: Add new Operator Group with valid and complete data
    And FM user clicks on Add new Operator Group button
    And FM user enters "Habtamu" into Name of Operator Group textfield
    And FM user selects "1000 - New bank" from Private Scheme of Operator Group page
    And FM user clicks on Save new Operator Group button
    And FM user clicks logout link

  Scenario: Add already existing Operator Group
#    When user enters "Habtamu" into FM Username text field
#    And user enters "Habtamu@1234" into FM into password text field
#    And FM user clicks Login button
#    Then system displays FM Admin dashboard
#    And FM user clicks on Fraud Management main menu
#    And FM user moves mouse over Case management submenu
#    And FM user clicks on Operator Group child menu
#    Then FM system displays Operator Group page

    And FM user clicks on Add new Operator Group button
    And FM user enters "Habtamu" into Name of Operator Group textfield
    And FM user selects "1000 - New bank" from Private Scheme of Operator Group page
    And FM user clicks on Save new Operator Group button
    Then FM add new Operator Group displays "Operator Group already registered" validation message
    And FM user clicks logout link

  Scenario: Add new Operator Group without complete data
#    When user enters "Habtamu" into FM Username text field
#    And user enters "Habtamu@1234" into FM into password text field
#    And FM user clicks Login button
#    Then system displays FM Admin dashboard
#    And FM user clicks on Fraud Management main menu
#    And FM user moves mouse over Case management submenu
#    And FM user clicks on Operator Group child menu
#    Then FM system displays Operator Group page

    And FM user clicks on Add new Operator Group button
    And FM user clicks on Save new Operator Group button
    Then FM new Operator Group displays an error message "Name of Operator Group: is a required field"
    And FM user clicks logout link

  Scenario: Successful Operator Group Search
#    When user enters "Habtamu" into FM Username text field
#    And user enters "Habtamu@1234" into FM into password text field
#    And FM user clicks Login button
#    Then system displays FM Admin dashboard
#    And FM user clicks on Fraud Management main menu
#    And FM user moves mouse over Case management submenu
#    And FM user clicks on Operator Group child menu
#    Then FM system displays Operator Group page

    And FM user enters "Habtamu" into Name of search Operator Group textfield
    And FM user clicks on search Operator Group button
    Then FM Search Operator Group shows matching search result for operator group

  Scenario: Unsuccessful Operator Group Search
#    When user enters "Habtamu" into FM Username text field
#    And user enters "Habtamu@1234" into FM into password text field
#    And FM user clicks Login button
#    Then system displays FM Admin dashboard
#    And FM user clicks on Fraud Management main menu
#    And FM user moves mouse over Case management submenu
#    And FM user clicks on Operator Group child menu
#    Then FM system displays Operator Group page

    And FM user enters "EEQEQEQEEEEQEQ" into Name of search Operator Group textfield
    And FM user clicks on search Operator Group button
    Then FM Search Operator Group shows message "No data found" for search result

  Scenario: Search and modify Operator Group
#    When user enters "Habtamu" into FM Username text field
#    And user enters "Habtamu@1234" into FM into password text field
#    And FM user clicks Login button
#    Then system displays FM Admin dashboard
#    And FM user clicks on Fraud Management main menu
#    And FM user moves mouse over Case management submenu
#    And FM user clicks on Operator Group child menu
#    Then FM system displays Operator Group page

    And FM user enters "Habtamu" into Name of search Operator Group textfield
    And FM user clicks on search Operator Group button
    Then FM Search Operator Group shows matching search result for operator group
    And FM user selects the Operator Group
    And FM user clicks on the Modify Operator Group button
    And FM user enters "Habtamu1234" into Name of Operator Group textfield
    And FM user clicks on Save new Operator Group button

  Scenario: Delete an existing Operator Group
#    When user enters "Habtamu" into FM Username text field
#    And user enters "Habtamu@1234" into FM into password text field
#    And FM user clicks Login button
#    Then system displays FM Admin dashboard
#    And FM user clicks on Fraud Management main menu
#    And FM user moves mouse over Case management submenu
#    And FM user clicks on Operator Group child menu
#    Then FM system displays Operator Group page

    And FM user enters "Habtamu1234" into Name of search Operator Group textfield
    And FM user clicks on search Operator Group button
    Then FM Search Operator Group shows matching search result for operator group
    And FM user selects the Operator Group
    And FM user clicks on delete Operator Group button
    And FM user clicks Yes for delete Operator Group confirmation


