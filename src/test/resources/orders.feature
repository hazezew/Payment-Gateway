#  Author: Habitamu Azezew
#  Date: Feb 16, 2023
#  Project name: Electronic Payment Gateway (EPG)
#  Module: Order Management
#  Activity: Order Management
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test (SIT)

@Regression
@OrderManagement

Feature: Order Management
  Background: user opened web browser and maximizes it
    When user has entered EPG system URL

  Scenario: View All Merchant Today Orders
    When user enters "testingteam1" into EPG Username text field
    And user enters "Abc@123456" into EPG into password text field
    And user clicks EPG Login button
    Then system displays EPG Admin dashboard
    And EPG user clicks Orders menu
    Then EPG system displays Order management page
    And EPG user clicks Order Search button
    And EPG user clicks logout link

  Scenario: View Today Orders of a Merchant
    When user enters "testingteam1" into EPG Username text field
    And user enters "Abc@123456" into EPG into password text field
    And user clicks EPG Login button
    Then system displays EPG Admin dashboard
    And EPG user clicks Orders menu
    Then EPG system displays Order management page
    And user selects merchant "HabitamuAzezew" from merchant list
    And EPG user clicks Order Search button
#    And EPG user clicks logout link

  Scenario: View an Order of a merchant
    When user enters "testingteam1" into EPG Username text field
    And user enters "Abc@123456" into EPG into password text field
    And user clicks EPG Login button
    Then system displays EPG Admin dashboard
    And EPG user clicks Orders menu
    Then EPG system displays Order management page
    And EPG user enters Feb first from From Calendar selection
    And EPG user enters Feb last from To Calendar selection
    And EPG user enters "148489483275" into Order Number text field
    And user selects merchant "HabitamuAzezew" from merchant list
    And EPG user clicks Order Search button
#    And EPG user clicks logout link

  Scenario: View an Order detail of a merchant
    When user enters "testingteam1" into EPG Username text field
    And user enters "Abc@123456" into EPG into password text field
    And user clicks EPG Login button
    Then system displays EPG Admin dashboard
    And EPG user clicks Orders menu
    Then EPG system displays Order management page
    And EPG user enters Feb first from From Calendar selection
    And EPG user enters Feb last from To Calendar selection
    And EPG user enters "148489483275" into Order Number text field
    And user selects merchant "HabitamuAzezew" from merchant list
    And EPG user clicks Order Search button
    Then EPG user clicks Order number "148489483275"
    And EPG system displays Order and Payment Detailed Information
    And EPG system also displays Order number "148489483275"