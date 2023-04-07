#  Author: Habitamu Azezew
#  Date: April 06, 2022
#  Project name: Electronic Payment Gateway (EPG)
#  Module: FM Login
#  Activity: Login FM User
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@LoginEPGUser

Feature: Login FM User
  Background: user opened web browser and maximizes it
    When user has entered FM system URL

  Scenario: Login into FM with valid username and password
    When user enters "Habtamu" into FM Username text field
    And user enters "Habtamu@1234" into FM into password text field
    And FM user clicks Login button
    Then system displays FM Admin dashboard
    And FM user clicks logout link
    Then FM system logs out and displays FM login page

  Scenario: Login into FM with invalid username and password
    When user enters "Habtamu1" into FM Username text field
    And user enters "Habtamu@123411" into FM into password text field
    And FM user clicks Login button
    Then FM system displays error message "Incorrect Login and/or Password"

  Scenario: Login into FM with empty username and password
    And FM user clicks Login button
    Then FM login page displays error message "Login is a required field" about user
    And  FM login page displays error message "Password is a required field" about password
    
  Scenario: Login into FM with username but empty password
    When user enters "Habtamu1" into FM Username text field
    And FM user clicks Login button
    And  FM login page displays error message "Password is a required field" about password

  Scenario: Login into FM with empty username but password
    And user enters "Habtamu@123411" into FM into password text field
    When FM user clicks Login button
    Then FM login page displays error message "Login is a required field" about user