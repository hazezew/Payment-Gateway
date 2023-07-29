#  Author: Belesti Yenegeta
#  Date: Jul 18, 2023
#  Project name: Directory Server (DS)
#  Module: tDS Acquirer
#  Activity: Login DS User
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@tDSAcquirer

Feature: tDS Acquirer
  Background: user opened web browser and maximizes it
    When DS user has entered DS system URL
#    And DS user enters "Belesti" into DS Username text field
#    And DS user enters "Bel@3ds#$" into DS into password text field
    And DS user enters "Betty" into DS Username text field
    And DS user enters "Betty@123$" into DS into password text field
    And DS user clicks DS Login button
    Then system displays DS Admin dashboard
    And DS user clicks on Acquirers menu

  Scenario: Add tDS Acquirer
    And DS user clicks on the Add acquirers button
    And DS user enters "10001" into acquirer bin text field
    And DS user enters "Bel 10001" into acquirer name text field
    And DS user selects "Test3DSServerReferenceNumber101" for DS Server Certified Solution type
    And DS user enters "Bel101" into ds server operator id field
    And DS user clicks on the Add Acquirer button
    And DS user enters "10001" into search by bin text field
    And DS user clicks on the Search tDS acquirer button
    Then DS user would get "10001" in the acquirer bin field and "Bel 10001" in the acquirer name field in the first row of list of acquirers

  Scenario: Search tDS Acquirer
    And DS user enters "10001" into search by bin text field
    And DS user clicks on the Search tDS acquirer button
    Then DS user would get "10001" in the acquirer bin field and "Bel 10001" in the acquirer name field in the first row of list of acquirers


  Scenario: Edit tDS Acquirer
    And DS user enters "10001" into search by bin text field
    And DS user clicks on the edit tDS acquirer icon
    And DS user enters "Bel 10001" into acquirer name text field
    And DS user selects "Test3DSServerReferenceNumber201" for DS Server Certified Solution type
    And DS user enters "Bel10001" into ds server operator id field
    And DS user clicks on the update acquirer button
    Then DS user would get "Acquirer was updated" alert success message

  Scenario: Delete tDS Acquirer
    And DS user enters "10001" into search by bin text field
    And DS user clicks on the delete tDS acquirer icon
    And DS user clicks on the Yes button to confirm deletion of tDS acquirer
    Then DS user would get "Acquirer with BIN " 10001 " was deleted" alert success message while deleting