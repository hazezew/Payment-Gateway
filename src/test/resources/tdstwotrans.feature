#  Author: Belesti Yenegeta
#  Date: Jul 21, 2023
#  Project name: Directory Server (DS)
#  Module: tDS Two Transactions
#  Activity: Login DS User
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@tDSTwoTransaction

Feature: tDSTwoTransactions
  Background: user opened web browser and maximizes it
    When DS user has entered DS system URL
#    And DS user enters "Belesti" into DS Username text field
#    And DS user enters "Bel@3ds#$" into DS into password text field
    And DS user enters "Betty" into DS Username text field
    And DS user enters "Betty@123$" into DS into password text field
    And DS user clicks DS Login button
    Then system displays DS Admin dashboard
    And DS user clicks on tDSTwoTransactions menu

  Scenario: Search tdsTwoTransactions
    And DS user enters "2022-07-12 00:00:00" into start date text field
    And DS user enters "2023-07-12 00:00:00" into end date text field
    And DS user enters "231414" into DS acquirer bin text field
    And DS user enters "9231414154851384807" into pan text field
    And DS user selects "BunnaBank" for issuer
    And DS user enters "merchantone" into merchant name text field
    And DS user selects "Y : Authentication/Account Verification Successful" for ARes transaction status
    And DS user selects "01 : Payment" for message category
    And DS user selects "02 : Browser" for device channel
    And DS user selects "2.2.0" for protocol version
    And DS user clicks on the Search tdsTwoTransactions button
    Then DS user would get "BunnaBank" in Issuer field and "231414" in Acquirer field and "923141*********4807" in PAN field