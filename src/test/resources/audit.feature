#  Author: Habitamu Azezew
#  Date: Feb 23, 2023
#  Project name: Electronic Payment Gateway (EPG)
#  Module: Audit Management
#  Activity: Refund Management
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test (SIT)

@Regression
@OrderManagement

Feature: Audit Management
  Background: user opened web browser and maximizes it
    When user has entered EPG system URL

  Scenario: View All Today Audits
    When user enters "testingteam1" into EPG Username text field
    And user enters "Abc@123456" into EPG into password text field
    And user clicks EPG Login button
    Then system displays EPG Admin dashboard
    And EPG user clicks Audit menu
    Then EPG system displays Audit management page
    And EPG user clicks Audit Search button
    And EPG user clicks logout link

  Scenario: View All Today Audits of a User
    When user enters "testingteam1" into EPG Username text field
    And user enters "Abc@123456" into EPG into password text field
    And user clicks EPG Login button
    Then system displays EPG Admin dashboard
    And EPG user clicks Audit menu
    Then EPG system displays Audit management page
    And EPG user selects "EngdaTravelTechnolgy" from audit users dropdown list
    And EPG user selects "Acquirer created" from audit Actions checklist
    And EPG user clicks Audit Search button
    And EPG user clicks logout link

  Scenario: View Audits of a User between dates
    When user enters "testingteam1" into EPG Username text field
    And user enters "Abc@123456" into EPG into password text field
    And user clicks EPG Login button
    Then system displays EPG Admin dashboard
    And EPG user clicks Audit menu
    Then EPG system displays Audit management page
    And EPG user selects Feb first from Audit from date
    And EPG user selects "EngdaTravelTechnolgy" from audit users dropdown list
    And EPG user selects "Acquirer created" from audit Actions checklist
    And EPG user clicks Audit Search button
    And EPG user clicks logout link