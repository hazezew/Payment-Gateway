#  Author: Belesti Yenegeta
#  Date: Jul 24, 2023
#  Project name: Directory Server (DS)
#  Module: tDS batch upload history
#  Activity: tDS batch upload history
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@tDSTwoTransaction

Feature: tDSBatchUploadHistory
  Background: user opened web browser and maximizes it
    When DS user has entered DS system URL
#    And DS user enters "Belesti" into DS Username text field
#    And DS user enters "Bel@3ds#$" into DS into password text field
    And DS user enters "Betty" into DS Username text field
    And DS user enters "Betty@123$" into DS into password text field
    And DS user clicks DS Login button
    Then system displays DS Admin dashboard
    And DS user clicks on Card Ranges menu

  Scenario: Search tdsListCardRanges
    And DS user clicks on Batch Upload History sub menu
    And DS user enters "2022-07-06 00:00:00" into start date field
    And DS user enters "2023-07-06 00:00:00" into end date field
    And DS user selects "SUCCESS" for processing result in batch upload history
    And DS user selects "TestBankOnly" for issuer in batch upload history
    And DS user clicks on the Search batch upload history button
    Then DS user would get "TestBankOnly" in issuer field and "SUCCESS" in result field