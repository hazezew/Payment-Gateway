#  Author: Belesti Yenegeta
#  Date: May 31, 2023
#  Project name: ACS Role Management
#  Module: ACS Role Management
#  Activity: ACS Role Management
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@ACSRoleManagement

Feature: ACS Role Management
  Background: user opened web browser and maximizes it
    When user has entered ACS system URL
#    When user enters "Belesti1" into ACS Username text field
#    And user enters "Bel@Gsh#4" into ACS into password text field
#    When user enters "acsuserauto4" into ACS Username text field
#    And user enters "Acsuserauto@1235" into ACS into password text field
    When user enters "acsuserauto5" into ACS Username text field
    And user enters "Acsuserauto@1235" into ACS into password text field
    And user clicks ACS Login button
    Then system displays ACS Admin dashboard
    And ACS user clicks on Menu Icon for Role
    And ACS user clicks on Roles menu

  Scenario: Add and Search Role
    And ACS user clicks on the Add role button
    And ACS user enters "BelYen3" to name text field
    And ACS user adds permissions to the role
    And ACS user clicks on the Save role button
    Then ACS user would get "BelYen3" from the list of roles page
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Search a Role which is available
    And ACS user searches for available role "BelYen"
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Search a Role which is not available
    And ACS user searches for unavailable role "Yelele"
    Then The system should return false which means no role is found
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Delete Role
    And ACS user searches for available role "BelYen3" and deletes it
    And ACS user searches for deleted role "BelYen3"
    Then The system should return false which means no role is found
    And ACS user logs out
    Then ACS system displays login page