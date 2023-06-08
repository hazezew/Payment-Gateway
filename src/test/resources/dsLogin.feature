#  Author: Belesti Yenegeta
#  Date: May 02, 2023
#  Project name: Directory Server (DS)
#  Module: DS Login
#  Activity: Login DS User
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@LoginDSUser

Feature: Login DS User
  Background: user opened web browser and maximizes it
    When DS user has entered DS system URL

  Scenario: DS User Login with valid username and password
    When DS user enters "Belesti" into DS Username text field
    And DS user enters "Bel@3ds#" into DS into password text field
    And DS user clicks DS Login button
    Then system displays DS Admin dashboard
    And user clicks on DS profile button
    And user clicks on DS Sign-out menu
    Then DS system login page
