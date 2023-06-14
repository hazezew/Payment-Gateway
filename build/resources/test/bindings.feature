#  Author: Belesti Yenegeta
#  Date: May 26, 2023
#  Project name: Electronic Payment Gateway Manual Payment (Bindings)
#  Module: EPG Bindings
#  Activity: EPG Bindings
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test (SIT)

@Regression
@Bindings


Feature: Bindings
  Background: user opened web browser and maximizes it
    When user has entered EPG system URL
    When user enters "belesti1" into EPG Username text field
    And user enters "Bel@Gsh#4" into EPG into password text field
    And super user clicks EPG Login button
    Then system displays EPG Super Admin dashboard

  Scenario: user searches for bindings
    And EPG user clicks on the Bindings menu
    And EPG user enters "merchantone" into merchantOne text field
    And EPG user selects merchantOne
    And EPG user clicks on the Search button