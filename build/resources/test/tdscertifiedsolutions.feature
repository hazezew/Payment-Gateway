#  Author: Belesti Yenegeta
#  Date: Jul 25, 2023
#  Project name: Directory Server (DS)
#  Module: tDS Certified Solutions
#  Activity: tDS Certified Solutions
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@tDSCertifiedSolutions

Feature: tDSCertified Solutions
  Background: user opened web browser and maximizes it
    When DS user has entered DS system URL
#    And DS user enters "Belesti" into DS Username text field
#    And DS user enters "Bel@3ds#$" into DS into password text field
    And DS user enters "Betty" into DS Username text field
    And DS user enters "Betty@123$" into DS into password text field
    And DS user clicks DS Login button
    Then system displays DS Admin dashboard
    And DS user clicks on Administration menu for tds certified solutions
    And DS user clicks on tds certified solutions sub menu

  Scenario: Search tdsCertifiedSolutions
    And DS user enters "3DS_LOA_SER_BPBT_020200_00388" into tds server reference number
    And DS user selects "2.1.0" for supported protocol version
    And DS user checks valid only checkbox
    And DS user clicks on the Search tds certified solutions button
    Then DS user would get "3DS_LOA_SER_BPBT_020200_00388" in tds server ref num field and "2.1.0" in protocol version field

  Scenario: Add tdsCertifiedSolutions
    And DS user clicks on the Add tds server certified solution
    And DS user enters "2023-07-04" into approval date field
    And DS user enters "2023-12-04" into approval expiration date field
    And Ds user enters "23232323232323232323" into tds server reference number text field
    And DS user selects "2.1.0" for start protocol version
    And DS user selects "2.2.0" for end protocol version
    And DS user clicks on the Save tds server solution button
    And DS user enters "23232323232323232323" into tds server reference number
    And DS user clicks on the Search tds certified solutions button
    Then DS user would get "23232323232323232323" in tds server ref num field and "2.1.0" in protocol version field

  Scenario: Delete tdsCertifiedSolutions
    And DS user enters "23232323232323232323" into tds server reference number
    And DS user clicks on the Search tds certified solutions button
    And DS user clicks on the delete tds certified solution icon
    And DS user clicks on the Yes button to confirm deletion of tds certified solution
    Then DS user would get "3DS Server Solution with Reference Number : 23232323232323232323 was deleted" confirmation message

