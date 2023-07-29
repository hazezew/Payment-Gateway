#  Author: Belesti Yenegeta
#  Date: Jul 25, 2023
#  Project name: Directory Server (DS)
#  Module: tDS actions audit
#  Activity: tDS actions audit
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@tDSActionsAudit

Feature: tDSActionsAudit
  Background: user opened web browser and maximizes it
    When DS user has entered DS system URL
#    And DS user enters "Belesti" into DS Username text field
#    And DS user enters "Bel@3ds#$" into DS into password text field
    And DS user enters "Betty" into DS Username text field
    And DS user enters "Betty@123$" into DS into password text field
    And DS user clicks DS Login button
    Then system displays DS Admin dashboard
    And DS user clicks on Audit menu for actions
    And DS user clicks on Actions sub menu

  Scenario: Search tdsActionsAudit
    And DS user enters "2022-07-05 00:00:00" into Start Date field of actions audit
    And DS user enters "2023-07-05 00:00:00" into End Date field of actions audit
    And DS user selects "Add Issuer" for action type
    And DS user clicks on the Search actions audit button
    Then DS user would get "Add Issuer" in action type field