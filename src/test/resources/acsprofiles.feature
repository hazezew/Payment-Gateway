#  Author: Belesti Yenegeta
#  Date: Jul 03, 2023
#  Project name: ACS Profiles
#  Module: ACS Profiles
#  Activity: ACS Profiles
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@ACSProfilesManagement

Feature: ACS Profiles
  Background: user opened web browser and maximizes it
    When user has entered ACS system URL
    When user enters "Belesti1" into ACS Username text field
    And user enters "Bel@Gsh#4" into ACS into password text field
#    When user enters "acsuserauto4" into ACS Username text field
#    And user enters "Acsuserauto@1235" into ACS into password text field
#    When user enters "acsuserauto5" into ACS Username text field
#    And user enters "Acsuserauto@1235" into ACS into password text field
    And user clicks ACS Login button
    Then system displays ACS Admin dashboard
    And ACS user clicks on Menu Icon for Profiles
    And ACS user clicks on Profiles menu

  Scenario: Add Profile
    And ACS user clicks on the Add profiles button
    And ACS user enters "BelYen2" into name text field
    And ACS user clicks on the Add range button
    And ACS user clicks on the edit icon
    And ACS user enters "201" into from range text field
    And ACS user enters "250" into to range text field
    And ACS user checks the corporate checkbox
    And ACS user clicks on the save range icon
    And ACS user clicks on the Save profile button
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Search Profile
    And ACS user enters "BelYen2" into name filter text field
    And ACS user clicks on the Search profile button
    Then ACS user would get "BelYen2" from the returned list of profiles
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Edit Profile
    And ACS user enters "BelYen2" into name filter text field
    And ACS user clicks on the Search profile button
    And ACS user clicks on the returned profile
    And ACS user clicks on the Edit profile button
    And ACS user clicks on the edit icon
    And ACS user enters "210" into from range text field
    And ACS user enters "240" into to range text field
    And ACS user clicks on the save range icon
    And ACS user clicks on the Save profile button
    And ACS user logs out
    Then ACS system displays login page
