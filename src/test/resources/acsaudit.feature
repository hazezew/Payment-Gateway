#  Author: Belesti Yenegeta
#  Date: Jul 13, 2023
#  Project name: ACS Audit
#  Module: ACS Audit
#  Activity: ACS Audit
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@ACSAudit

Feature: ACS Audit
  Background: user opened web browser and maximizes it
    When user has entered ACS system URL
    When user enters "Belesti1" into ACS Username text field
    And user enters "Bel@Gsh#44" into ACS into password text field
#    When user enters "acsuserauto4" into ACS Username text field
#    And user enters "Acsuserauto@1236" into ACS into password text field
#    When user enters "acsuserauto5" into ACS Username text field
#    And user enters "Acsuserauto@1236" into ACS into password text field
#    When user enters "Betty" into ACS Username text field
#    And user enters "Betty@123$" into ACS into password text field
    And user clicks ACS Login button
    Then system displays ACS Admin dashboard
    And ACS user clicks on Menu Icon for Audit
    And ACS user clicks on Audit menu

  Scenario: Search Audit Log
    And ACS user selects a starting date time for start date from filter
    And ACS user selects an ending date time for end date to filter
    And ACS user selects "USER_LOGIN" for event type filter of audit
    And ACS user selects "USER" for object type filter
    And ACS user clicks on the Search audit button
    Then ACS user would get "USER_LOGIN" in event type field of audit page
    And ACS user logs out
    Then ACS system displays login page