#  Author: Belesti Yenegeta
#  Date: Jul 10, 2023
#  Project name: ACS Keys for CVV Calculation
#  Module: ACS Keys for CVV Calculation
#  Activity: ACS Keys for CVV Calculation
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@ACSKeysForCVVCalculation

Feature: ACS Keys for CVV Calculation
  Background: user opened web browser and maximizes it
    When user has entered ACS system URL
#    When user enters "Belesti1" into ACS Username text field
#    And user enters "Bel@Gsh#4" into ACS into password text field
#    When user enters "acsuserauto4" into ACS Username text field
#    And user enters "Acsuserauto@1235" into ACS into password text field
#    When user enters "acsuserauto5" into ACS Username text field
#    And user enters "Acsuserauto@1235" into ACS into password text field
    When user enters "Betty" into ACS Username text field
    And user enters "Betty@123$" into ACS into password text field
    And user clicks ACS Login button
    Then system displays ACS Admin dashboard
    And ACS user clicks on Menu Icon for Keys for CVV Calculation
    And ACS user clicks on Keys for CVV Calculation menu

  Scenario: Add Keys for CVV Calculation
    And ACS user clicks on the Add Keys for CVV Calculation button
    And ACS user selects "LOCAL" for network of Keys for CVV Calculation
    And ACS user selects "BUNNA" for profile of Keys for CVV Calculation
    And ACS user enters 1 into key index text field
    And ACS user enters "Bel" into key check value text field
    And ACS user selects "THALES" for type of Keys for CVV Calculation
    And ACS user enters "U1234567890AAAAAAAAAABBBBBBBBBCCC" into key text field
    And ACS user clicks on the Save Keys for CVV Calculation button
    Then ACS user would get "LOCAL" in network field and "BUNNA" in profile field and "Bel" in key check value field
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Search Keys for CVV Calculation
    And ACS user selects "LOCAL" for network filter of Keys for CVV Calculation
    And ACS user selects "BUNNA" for profile filter of Keys for CVV Calculation
    And ACS user clicks on the Search keys for cvv calculation button
    Then ACS user would get "LOCAL" in network field and "BUNNA" in profile field and "Bel" in key check value field
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Edit Keys for CVV Calculation
    And ACS user selects "LOCAL" for network filter of Keys for CVV Calculation
    And ACS user selects "BUNNA" for profile filter of Keys for CVV Calculation
    And ACS user clicks on the Search keys for cvv calculation button
    And ACS user clicks on the returned keys for cvv calculation row
    And ACS user clicks on the Edit keys for cvv calculation button
    And ACS user enters "BelYen" into key check value text field
    And ACS user clicks on the Save Editing Keys for CVV Calculation button
    Then ACS user would get "LOCAL" in network field and "BUNNA" in profile field and "BelYen" in key check value field
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Delete Keys for CVV Calculation
    And ACS user selects "LOCAL" for network filter of Keys for CVV Calculation
    And ACS user selects "BUNNA" for profile filter of Keys for CVV Calculation
    And ACS user clicks on the Search keys for cvv calculation button
    And ACS user clicks on the returned keys for cvv calculation row
    And ACS user clicks on the Delete keys for cvv calculation button
    And ACS user clicks on the Yes button to confirm deletion of keys for cvv calculation
    Then ACS user would get "No records found." rather than keys for cvv calculation
    And ACS user logs out
    Then ACS system displays login page