#  Author: Belesti Yenegeta
#  Date: Apr 28, 2023
#  Project name: Electronic Payment Gateway Manual Payment (Batch Operations)
#  Module: EPG Batch Operations
#  Activity: EPG Batch Operations
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test (SIT)

@Regression
@ManualPayment


Feature: Batch Operations
  Background: user opened web browser and maximizes it
    When user has entered EPG system URL
    When user enters "belesti1" into EPG Username text field
    And user enters "Bel@Epg#4" into EPG into password text field
    And super user clicks EPG Login button
    Then system displays EPG Super Admin dashboard
    And EPG user clicks Batch Operations menu

  Scenario: batch processing of refunds
    And EPG user clicks on Batch Processing of Refunds submenu
    And EPG user clicks on select file button
    And EPG user uploads file using AutoIT
    And EPG user clicks on upload file button

  Scenario: batch processing of bindings
    And EPG user clicks on Batch Processing of Bindings submenu
    And EPG user selects "merchantone" on merchant textfield
    And EPG user clicks on select file button
    And EPG user uploads file using AutoIT
    And EPG user clicks on upload file button


  Scenario: batch sending of the payment form
    And EPG user clicks on Batch Sending of the Payment form submenu
    And EPG user clicks on select file button
    And EPG user uploads file using AutoIT
    And EPG user clicks on upload file button