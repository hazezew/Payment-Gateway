#  Author: Belesti Yenegeta
#  Date: Jul 04, 2023
#  Project name: ACS Authentication Schemes
#  Module: ACS Authentication Schemes
#  Activity: ACS Authentication Schemes
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@ACSAuthenticationSchemes

Feature: ACS Authentication Schemes
  Background: user opened web browser and maximizes it
    When user has entered ACS system URL
#    When user enters "Belesti1" into ACS Username text field
#    And user enters "Bel@Gsh#4" into ACS into password text field
    When user enters "acsuserauto4" into ACS Username text field
    And user enters "Acsuserauto@1235" into ACS into password text field
#    When user enters "acsuserauto5" into ACS Username text field
#    And user enters "Acsuserauto@1235" into ACS into password text field
    And user clicks ACS Login button
    Then system displays ACS Admin dashboard
    And ACS user clicks on Menu Icon for Authentication Schemes
    And ACS user clicks on Authentication Schemes menu

  Scenario: Add Authentication Schemes
    And ACS user clicks on the Add authentication schemes button
    And ACS user enters "BelYen" into authentication scheme name text field
    And ACS user clicks on the Add primary button
    And ACS user clicks on the edit primary icon
    And ACS user clicks on the save primary icon
    And ACS user clicks on the Add fallback button
    And ACS user clicks on the edit fallback icon
    And ACS user clicks on the fallback dropdown
    And ACS user selects the second fallback
    And ACS user clicks on the save fallback icon
    And ACS user clicks on the Save authentication scheme button
    And ACS user enters "BelYen" into authentication scheme name filter text field
    And ACS user clicks on the Search authentication scheme button
    Then ACS user would get "BelYen" from the returned list of authentication schemes
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Search Authentication Schemes
    And ACS user enters "BelYen" into authentication scheme name filter text field
    And ACS user clicks on the Search authentication scheme button
    Then ACS user would get "BelYen" from the returned list of authentication schemes
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Edit Authentication Schemes
    And ACS user enters "BelYen" into authentication scheme name filter text field
    And ACS user clicks on the Search authentication scheme button
    And ACS user clicks on the returned authentication scheme row
    And ACS user clicks on the Edit authentication scheme button
    And ACS user enters "BelYen2" into authentication scheme name text field
    And ACS user clicks on the edit primary icon
    And ACS user clicks on the primary dropdown
    And ACS user selects the fourth primary
    And ACS user clicks on the save primary icon
    And ACS user clicks on the Save authentication scheme button
    And ACS user enters "BelYen2" into authentication scheme name filter text field
    And ACS user clicks on the Search authentication scheme button
    Then ACS user would get "BelYen2" from the returned list of authentication schemes
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Delete Authentication Scheme
    And ACS user enters "BelYen2" into authentication scheme name filter text field
    And ACS user clicks on the Search authentication scheme button
    And ACS user clicks on the returned authentication scheme row
    And ACS user clicks on the Delete authentication scheme button
    And ACS user clicks on the Yes button to confirm deletion of the selected authentication scheme
    And ACS user enters "BelYen2" into authentication scheme name filter text field
    And ACS user clicks on the Search authentication scheme button
    Then ACS user would get "No results found" text rather than the authentication scheme
    And ACS user logs out
    Then ACS system displays login page
