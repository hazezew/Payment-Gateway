#  Author: Belesti Yenegeta
#  Date: Jul 28, 2023
#  Project name: Directory Server (DS)
#  Module: tDS ACS Operator Roles
#  Activity: tDS ACS Operator Roles
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@tDSOperatorRoles

Feature: tDSOperator Roles
  Background: user opened web browser and maximizes it
    When DS user has entered DS system URL
#    And DS user enters "Belesti" into DS Username text field
#    And DS user enters "Bel@3ds#$" into DS into password text field
    And DS user enters "Betty" into DS Username text field
    And DS user enters "Betty@123$" into DS into password text field
    And DS user clicks DS Login button
    Then system displays DS Admin dashboard

  Scenario: Search tDSOperatorRoles
    And DS user clicks on Administration menu for tds list operator roles
    And DS user clicks on list operator roles sub menu