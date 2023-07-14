#  Author: Belesti Yenegeta
#  Date: Jul 06, 2023
#  Project name: ACS Enrolled Cards
#  Module: ACS Enrolled Cards
#  Activity: ACS Enrolled Cards
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@ACSEnrolledCards

Feature: ACS Enrolled Cards
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
    And ACS user clicks on Menu Icon for Enrolled Cards
    And ACS user clicks on Enrolled Cards menu

  Scenario: Search ACS Enrolled Cards
    And ACS user enters "9231414154851384807" into card number text field
    And ACS user clicks on the Search enrolled cards button
    And ACS user would get 66 in the id field and "BUNNA" in the profile field
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Edit ACS Enrolled Cards
    And ACS user enters "9231414154851384807" into card number text field
    And ACS user clicks on the Search enrolled cards button
    And ACS user clicks on the returned enrolled cards row
    And ACS user clicks on the cardholder authentication methods tab
    And ACS user clicks on the SMS row
    And ACS user clicks on the Edit SMS button
    And ACS user enters "0912367900" into destination text field
    And ACS user clicks on the Edit or Save the change button
    And ACS user clicks on the cardholder authentication methods tab
    Then ACS user would get "0912367900" in the destination field
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Block ACS Enrolled Cards
    And ACS user enters "9231414154851384807" into card number text field
    And ACS user clicks on the Search enrolled cards button
    And ACS user clicks on the returned enrolled cards row
    And ACS user clicks on the Block enrolled cards button
    And ACS user clicks on the Yes button to confirm deletion of enrolled card
    Then ACS enrolled card status would be changed to "Blocked"
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Activate ACS Enrolled Cards
    And ACS user enters "9231414154851384807" into card number text field
    And ACS user clicks on the Search enrolled cards button
    And ACS user clicks on the returned enrolled cards row
    And ACS user clicks on the Activate enrolled card button
    And ACS user clicks on the Yes button to confirm activation of enrolled card
    Then ACS enrolled card status would be changed to "Active"
    And ACS user logs out
    Then ACS system displays login page



