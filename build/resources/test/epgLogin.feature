#  Author: Habitamu Azezew
#  Date: Dec 06, 2022
#  Project name: Electronic Payment Gateway (EPG)
#  Module: EPG Login
#  Activity: Login EPG User
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@LoginEPGUser

Feature: Login EPG User
  Background: user opened web browser and maximizes it
    When user has entered EPG system URL

    Scenario: Login into EPG with valid username and password
      When user enters "testingteam1" into EPG Username text field
      And user enters "Abc@123456" into EPG into password text field
      And user clicks EPG Login button
      Then system displays EPG Admin dashboard
      And EPG user clicks logout link
      Then EPG system logs out and displays login page

  Scenario: Login into EPG with valid username but invalid password
    When user enters "testingteam1" into EPG Username text field
    And user enters "Abc@testingteam1" into EPG into password text field
    And user clicks EPG Login button
    Then EPG system displays an error message "Login or password is wrong, please try again"

  Scenario: Login into EPG with invalid username and password
    When user enters "testingteam" into EPG Username text field
    And user enters "testingteam" into EPG into password text field
    And user clicks EPG Login button
    Then EPG system displays an error message "Login or password is wrong, please try again"

  Scenario: Login into EPG with invalid username but password
    When user enters "testingteam" into EPG Username text field
    And user enters "Abc@123456" into EPG into password text field
    And user clicks EPG Login button
    Then EPG system displays an error message "Login or password is wrong, please try again"