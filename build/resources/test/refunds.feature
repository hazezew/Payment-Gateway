#  Author: Habitamu Azezew
#  Date: Feb 23, 2023
#  Project name: Electronic Payment Gateway (EPG)
#  Module: Order Management
#  Activity: Refund Management
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test (SIT)

@Regression
@OrderManagement

Feature: Refund Management
  Background: user opened web browser and maximizes it
    When user has entered EPG system URL

  Scenario: View All Merchant Today Refunds
    When user enters "testingteam1" into EPG Username text field
    And user enters "Abc@123456" into EPG into password text field
    And user clicks EPG Login button
    Then system displays EPG Admin dashboard
    And EPG user clicks Refunds menu
    Then EPG system displays Refunds management page
    And EPG user clicks Refunds Search button
    And EPG user clicks logout link

  Scenario: View Today Refunds of a Merchant
    When user enters "testingteam1" into EPG Username text field
    And user enters "Abc@123456" into EPG into password text field
    And user clicks EPG Login button
    Then system displays EPG Admin dashboard
    And EPG user clicks Refunds menu
    Then EPG system displays Refunds management page
    And user selects merchant "HabitamuAzezew" from Refunds merchant list
    And EPG user clicks Refunds Search button

  Scenario: View Refunds of a Merchant between dates
    When user enters "testingteam1" into EPG Username text field
    And user enters "Abc@123456" into EPG into password text field
    And user clicks EPG Login button
    Then system displays EPG Admin dashboard
    And EPG user clicks Refunds menu
    Then EPG system displays Refunds management page
    And EPG user selects Feb first from Refunds from date calender
    And user selects merchant "HabitamuAzezew" from Refunds merchant list
    And EPG user clicks Refunds Search button