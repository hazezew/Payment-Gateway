#  Author: Belesti Yenegeta
#  Date: Jul 12, 2023
#  Project name: ACS Transaction Status Settings
#  Module: ACS Transaction Status Settings
#  Activity: ACS Transaction Status Settings
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@ACSTransactionStatusSettings

Feature: ACS Transaction Status Settings
  Background: user opened web browser and maximizes it
    When user has entered ACS system URL
#    When user enters "Belesti1" into ACS Username text field
#    And user enters "Bel@Gsh#44" into ACS into password text field
    When user enters "acsuserauto4" into ACS Username text field
    And user enters "Acsuserauto@1235" into ACS into password text field
#    When user enters "acsuserauto5" into ACS Username text field
#    And user enters "Acsuserauto@1235" into ACS into password text field
#    When user enters "Betty" into ACS Username text field
#    And user enters "Betty@123$" into ACS into password text field
    And user clicks ACS Login button
    Then system displays ACS Admin dashboard
    And ACS user clicks on Menu Icon for Transaction Status Settings
    And ACS user clicks on Transaction Status Settings menu

  Scenario: Add Transaction Status Settings
    And ACS user clicks on the Add Transaction Status Settings button
    And ACS user selects "C_REQ_ERROR" for event type
    And ACS user enters "Bel" into modifier text field
    And ACS user selects "VISA" for network
    And ACS user selects "2.1.0" for protocol version
    And ACS user selects "UNKNOWN_DEVICE" for transaction status reason
    And ACS user clicks on the Add or Save transaction status settings button
    And ACS user selects "C_REQ_ERROR" for event type filter
    And ACS user clicks on the Search transaction status settings button
    Then ACS user would get "C_REQ_ERROR" in event type field
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Search Transaction Status Settings
    And ACS user selects "C_REQ_ERROR" for event type filter
    And ACS user clicks on the Search transaction status settings button
    Then ACS user would get "C_REQ_ERROR" in event type field
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Edit Transaction Status Settings
    And ACS user selects "C_REQ_ERROR" for event type filter
    And ACS user clicks on the Search transaction status settings button
    And ACS user clicks on the returned transaction status settings row
    And ACS user clicks on the Edit transaction status settings button
    And ACS user selects "EXPIRED_CARD" for transaction status reason
    And ACS user clicks on the Save update transaction status settings button
    Then ACS user would get "EXPIRED_CARD" in transaction status reason field
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Delete Transaction Status Settings
    And ACS user selects "C_REQ_ERROR" for event type filter
    And ACS user clicks on the Search transaction status settings button
    And ACS user clicks on the returned transaction status settings row
    And ACS user clicks on the Delete transaction status settings button
    And ACS user clicks on the Yes button to confirm deletion of transaction status settings
    Then ACS user would get "No records found." rather than the transaction status settings
    And ACS user logs out
    Then ACS system displays login page


