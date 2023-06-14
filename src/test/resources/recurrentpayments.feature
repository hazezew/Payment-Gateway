#  Author: Belesti Yenegeta
#  Date: May 26, 2023
#  Project name: Electronic Payment Gateway Manual Payment (Recurrent Payments)
#  Module: EPG Recurrent Payments
#  Activity: EPG Recurrent Payments
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test (SIT)

@Regression
@Recurrent Payments


Feature: Recurrent Payments
  Background: user opened web browser and maximizes it
    When user has entered EPG system URL
    When user enters "belesti1" into EPG Username text field
    And user enters "Bel@Gsh#4" into EPG into password text field
    And super user clicks EPG Login button
    Then system displays EPG Super Admin dashboard

  Scenario: user searches for recurrent payments
    And EPG user clicks on the Recurrent Payments menu
    And EPG user enters "merchantone" into merchantOne text field in the Recurrent Payments page
    And EPG user selects merchantOne in the Recurrent Payments page
    And EPG user enters "9231414154851384807" into the pan text field
    And EPG user clicks on the Search button in the Recurrent Payments page