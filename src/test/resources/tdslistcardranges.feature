#  Author: Belesti Yenegeta
#  Date: Jul 21, 2023
#  Project name: Directory Server (DS)
#  Module: tDS list card ranges
#  Activity: tDS list card ranges
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@tDSTwoTransaction

Feature: tDSListCardRanges
  Background: user opened web browser and maximizes it
    When DS user has entered DS system URL
#    And DS user enters "Belesti" into DS Username text field
#    And DS user enters "Bel@3ds#$" into DS into password text field
    And DS user enters "Betty" into DS Username text field
    And DS user enters "Betty@123$" into DS into password text field
    And DS user clicks DS Login button
    Then system displays DS Admin dashboard
    And DS user clicks on Card Ranges menu
    And DS user clicks on List Card Ranges sub menu

  Scenario: Search tdsListCardRanges
    And DS user enters "9231414154851384807" into pan filter text field
    And DS user clicks on the Search DS card ranges button
    Then DS user would get "9231414000000000000" in start range field and "9231414999999999999" in end range field and "BunnaBank" in Issuer field


  Scenario: Edit tdsListCardRanges
    And DS user enters "9231414154851384807" into pan filter text field
    And DS user clicks on the Search DS card ranges button
    And DS user clicks on the Edit tds list of card ranges icon
    And DS user selects "ENABLED" for attempts to tdsOne transactions
    And DS user selects "ENABLED" for attempts to tdsTwo transactions
    And DS user enters "http://threeDSMethodURLTwo" into threeDSMethod url text field
    And DS user clicks on the Update Card Range button
    And DS user enters "9231414154851384807" into pan filter text field
    And DS user clicks on the Search DS card ranges button
    And DS user clicks on the Edit tds list of card ranges icon
    Then DS user would get "ENABLED" in attempts for tdsOne transactions field and "ENABLED" in attempts for tdsTwo transactions field