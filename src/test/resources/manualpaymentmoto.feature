#  Author: Belesti Yenegeta
#  Date: Apr 28, 2023
#  Project name: Electronic Payment Gateway Manual Payment (MOTO)
#  Module: EPG Manual Payment
#  Activity: EPG Manual Payment
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test (SIT)

@Regression
@ManualPayment


Feature: EPG Manual Payment
  Background: user opened web browser and maximizes it
    When user has entered EPG system URL
    When user enters "belesti1" into EPG Username text field
    And user enters "Bel@Epg#4" into EPG into password text field
    And super user clicks EPG Login button
    Then system displays EPG Super Admin dashboard
    And EPG user clicks Manual Payment menu

  Scenario: Create order for payment by the link
    And EPG user clicks create order for payment by link submenu
    And EPG user enters "abcde1234abcd" into order number text field
    And EPG user enters "merchantone" inot merchant text field
    And EPG user enters 335 into amount text field
    And EPG user enters "belesti" into customer name text field
#    And EPG user enters 912367900 into customer phone text field
    And EPG user enters "belestibdu@gmail.com" into email text field
    And EPG user enters "create order for payment by the link in advance" into description text field
    And EPG user selects authorization type
    And EPG user clicks on the Submit button

  Scenario: Create order and render the payment
    And EPG user clicks Create order and render the payment submenu
    And EPG user enters "abcd12abcd" into order number text field
    And EPG user enters "merchantone" inot merchant text field
    And EPG user enters 335 into amount text field
    And EPG user enters "Bel Yen" into customer name text field
#    And EPG user enters 912367900 into customer phone text field
    And EPG user enters "belestibdu@gmail.com" into email text field
    And EPG user enters "Create order and render the payment description" into description text field
    And EPG user selects authorization type
    And EPG user enters "9231414157851453845" into PAN text field
    And EPG user enters 12 into expiry month text field
    And EPG user enters 2023 into expiry year text field
    And EPG user enters "DENEKEW EMBIALE" into cardholder name text field
    And EPG user clicks on the Submit button