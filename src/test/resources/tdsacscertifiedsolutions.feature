#  Author: Belesti Yenegeta
#  Date: Jul 27, 2023
#  Project name: Directory Server (DS)
#  Module: tDS ACS Certified Solutions
#  Activity: tDS ACS Certified Solutions
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@tDSACSCertifiedSolutions

Feature: tDSACSCertified Solutions
  Background: user opened web browser and maximizes it
    When DS user has entered DS system URL
#    And DS user enters "Belesti" into DS Username text field
#    And DS user enters "Bel@3ds#$" into DS into password text field
    And DS user enters "Betty" into DS Username text field
    And DS user enters "Betty@123$" into DS into password text field
    And DS user clicks DS Login button
    Then system displays DS Admin dashboard
    And DS user clicks on Administration menu for tds acs certified solutions
    And DS user clicks on tds acs certified solutions sub menu

  Scenario: Search tdsACSCertifiedSolutions
    And DS user enters "3DS_LOA_ACS_BPBT_020200_00389" into tds acs reference number
    And DS user selects "2.1.0" for supported protocol version in tds acs certified solutions
    And DS user checks valid only checkbox in tds acs certified solutions
    And DS user clicks on the Search tds acs certified solutions button
    Then DS user would get "3DS_LOA_ACS_BPBT_020200_00389" in ref num field and "2.1.0" in protocol version field

  Scenario: Add tdsACSCertifiedSolutions
    And DS user clicks on the Add tds acs certified solution button
    And DS user enters "2023-07-04" into approval date field in tds acs certified solution
    And DS user enters "2023-11-04" into approval expiration date field in tds acs certified solution
    And DS user enters "Bel_101" into acs reference number text field
    And DS user enters "2.1.0" into start protocol version
    And DS user enters "2.2.0" into end protocol version
    And DS user clicks on the Save tds acs certified solution button
    And DS user enters "Bel_101" into tds acs reference number
    And DS user clicks on the Search tds acs certified solutions button
    Then DS user would get "Bel_101" in ref num field and "2.1.0" in protocol version field

  Scenario: Delete tdsACSCertifiedSolutions
    And DS user enters "Bel_101" into tds acs reference number
    And DS user clicks on the Search tds acs certified solutions button
    And DS user clicks on the delete tds acs certified solution icon
    And DS user clicks on the Yes button to confirm deletion of tds acs certified solution
    Then DS user would get "3DS Server Solution with Reference Number : Bel_101 was deleted" alert message in tds acs certified solutions page


