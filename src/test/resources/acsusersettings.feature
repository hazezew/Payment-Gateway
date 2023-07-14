#  Author: Belesti Yenegeta
#  Date: Jul 13, 2023
#  Project name: ACS User Settings
#  Module: ACS User Settings
#  Activity: ACS User Settings
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@ACSUserSettings

Feature: ACS User Settings
  Background: user opened web browser and maximizes it
    When user has entered ACS system URL
#    When user enters "Belesti1" into ACS Username text field
#    And user enters "Bel@Gsh#44" into ACS into password text field
#    When user enters "acsuserauto4" into ACS Username text field
#    And user enters "Acsuserauto@1235" into ACS into password text field
    When user enters "acsuserauto5" into ACS Username text field
    And user enters "Acsuserauto@1236" into ACS into password text field
#    When user enters "Betty" into ACS Username text field
#    And user enters "Betty@123$" into ACS into password text field
    And user clicks ACS Login button
    Then system displays ACS Admin dashboard
    And ACS user clicks on Menu Icon for User Settings
    And ACS user clicks on User Settings menu

  Scenario: Change User Settings
    And ACS user enters "Acsuserauto@1236" into current password text field
    And ACS user enters "Acsuserauto@1237" into new password text field
    And ACS user enters "Acsuserauto@1237" into confirmation text field
    And ACS user clicks on the Save user settings button
    And ACS user logs out
    Then ACS system displays login page
    And user enters "acsuserauto5" into ACS Username text field
    And user enters "Acsuserauto@1237" into ACS into password text field
    And user clicks ACS Login button
    Then system displays ACS Admin dashboard
    And ACS user logs out
    Then ACS system displays login page
