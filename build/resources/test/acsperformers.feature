#  Author: Belesti Yenegeta
#  Date: Jul 05, 2023
#  Project name: ACS Performers
#  Module: ACS Performers
#  Activity: ACS Performers
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@ACSPerformers

Feature: ACS Performers
  Background: user opened web browser and maximizes it
    When user has entered ACS system URL
#    When user enters "Belesti1" into ACS Username text field
#    And user enters "Bel@Gsh#4" into ACS into password text field
#    When user enters "acsuserauto4" into ACS Username text field
#    And user enters "Acsuserauto@1235" into ACS into password text field
    When user enters "acsuserauto5" into ACS Username text field
    And user enters "Acsuserauto@1235" into ACS into password text field
#    When user enters "Betty" into ACS Username text field
#    And user enters "Betty@123$" into ACS into password text field
    And user clicks ACS Login button
    Then system displays ACS Admin dashboard
    And ACS user clicks on Menu Icon for Performers
    And ACS user clicks on Performers menu

  Scenario: Add ACS Performers
    And ACS user clicks on the Add performers button
    And ACS user enters "BelYen" into performer name text field
    And ACS user enters "https://www.belesti.com" into url text field
    And ACS user enter 1000 seconds into timeout number field
    And ACS user clicks on the Save performers button
    And ACS user enters "BelYen" into performer name filter text field
    And ACS user clicks on the Search performers button
    Then ACS user would get "BelYen" from the returned list of performers
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Search ACS Performers
    And ACS user enters "BelYen" into performer name filter text field
    And ACS user clicks on the Search performers button
    Then ACS user would get "BelYen" from the returned list of performers
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Edit ACS Performers
    And ACS user enters "BelYen" into performer name filter text field
    And ACS user clicks on the Search performers button
    And ACS user clicks on the returned performers row
    And ACS user clicks on the Edit performers button
    And ACS user enters "BelYen2" into performer name text field
    And ACS user selects "BPC static password" for protocol type
    And ACS user clicks on the Save performers button
    And ACS user enters "BelYen2" into performer name filter text field
    And ACS user clicks on the Search performers button
    Then ACS user would get "BelYen2" from the returned list of performers
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Delete ACS Performers
    And ACS user enters "BelYen2" into performer name filter text field
    And ACS user clicks on the Search performers button
    And ACS user clicks on the returned performers row
    And ACS user clicks on the Delete performers button
    And ACS user clicks on the Yes button to confirm deletion of performers
    And ACS user enters "BelYen2" into performer name filter text field
    And ACS user clicks on the Search performers button
    Then ACS user would get "No records found." text rather than the performer
    And ACS user logs out
    Then ACS system displays login page



