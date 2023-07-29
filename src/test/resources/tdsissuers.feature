#  Author: Belesti Yenegeta
#  Date: Jul 18, 2023
#  Project name: Directory Server (DS)
#  Module: tDS Issuer
#  Activity: Login DS User
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@tDSIssuer

Feature: tDS Issuer
  Background: user opened web browser and maximizes it
    When DS user has entered DS system URL
#    And DS user enters "Belesti" into DS Username text field
#    And DS user enters "Bel@3ds#$" into DS into password text field
    And DS user enters "Betty" into DS Username text field
    And DS user enters "Betty@123$" into DS into password text field
    And DS user clicks DS Login button
    Then system displays DS Admin dashboard
    And DS user clicks on Issuers menu

  Scenario: Add tDS Issuer
    And DS user clicks on the Add DS issuers button
    And DS user enters "Bel Bank" into issuer name text field
    And DS user enters "Bel Contact" into contact text field
    And DS user selects "ENABLED" for tDSOne status
    And DS user selects "DISABLED" for tDSTwo status
    And DS user selects "TestACSReferenceNumber123" for acs certified solution
    And DS user clicks on the Add or Save DS issuers button
    And DS user enters "Bel Bank" into issuer name filter text field
    And DS user clicks on the Search DS issuers button
    Then DS user would get "Bel Bank" in the name field
    Then DS user would get "Bel Bank" in Name field and "ENABLED" in tDSOne field "DISABLED" in tDSTwo field and "TestACSReferenceNumber123" in acs reference number field

  Scenario: Search tDS Issuer
    And DS user enters "Bel Bank" into issuer name filter text field
    And DS user clicks on the Search DS issuers button
    Then DS user would get "Bel Bank" in the name field

  Scenario: Edit tDS Issuer
    And DS user enters "Bel Bank" into issuer name filter text field
    And DS user clicks on the Search DS issuers button
    And DS user clicks on the edit tDS issuers icon
    And DS user enters "Bel Bank U" into issuer name text field
    And DS user enters "Bel Contact U" into contact text field
    And DS user selects "DISABLED" for tDSOne status
    And DS user selects "ENABLED" for tDSTwo status update
    And DS user selects "3DS_LOA_SER_BPBT_023100_00779" for acs certified solution
    And DS user clicks on the Update DS Issuer button
    Then DS user would get "Issuer was updated" alert message
    And DS user clicks on Back to Issuers button
    And DS user enters "Bel Bank U" into issuer name filter text field
    And DS user clicks on the Search DS issuers button
    Then DS user would get "Bel Bank U" in Name field and "DISABLED" in tDSOne field "ENABLED" in tDSTwo field and "3DS_LOA_SER_BPBT_023100_00779" in acs reference number field

