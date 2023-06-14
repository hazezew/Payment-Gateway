#  Author: Belesti Yenegeta
#  Date: May 13, 2023
#  Project name: Electronic Payment Gateway Manual Payment (Jasper Reports)
#  Module: EPG Jasper Reports
#  Activity: EPG Jasper Reports
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test (SIT)

@Regression
@JasperReports


Feature: Jasper Reports
  Background: user opened web browser and maximizes it
    When user has entered EPG system URL
    When user enters "belesti1" into EPG Username text field
    And user enters "Bel@Gsh#4" into EPG into password text field
    And super user clicks EPG Login button
    Then system displays EPG Super Admin dashboard
#    And user clicks on the No option
    And EPG user clicks on the Jasper Reports menu
    And EPG user clicks on the Reports submenu

    Scenario: user downloads orders report
      And EPG user clicks on the Orders report
      And EPG user clicks on the Format dropdown
      And EPG user selects a file format
      And EPG user sets Start Date
      And EPG user sets End Date
      And EPG user selects "merchantone" from the merchant list
      And EPG user sets Date mode
      And EPG user clicks on the Export Report button
      And EPG user clicks on the view the result link
      And EPG user clicks on the Find (report) button
      And EPG user selects the generated report
      And EPG user clicks on the Download the report button


    Scenario: user downloads payments report
      And EPG user clicks on the Payments report
      And EPG user clicks on the Format dropdown
      And EPG user selects a file format
      And EPG user sets Start Date
      And EPG user sets End Date
      And EPG user clicks on the Export Report button
      And EPG user clicks on the view the result link
      And EPG user clicks on the Find (report) button
      And EPG user selects the generated report
      And EPG user clicks on the Download the report button

    Scenario: user downloads transaction statistics report
      And EPG user clicks on the Transaction statistics report
      And EPG user clicks on the Format dropdown
      And EPG user selects a file format
      And EPG user sets Start Date
      And EPG user sets End Date
      And EPG user enters "9231414157851453845" into PAN number text field
      And EPG user clicks on the Export Report button
      And EPG user clicks on the view the result link
      And EPG user clicks on the Find (report) button
      And EPG user selects the generated report
      And EPG user clicks on the Download the report button

  Scenario: user downloads directory server requests report
    And EPG user clicks on the Directory server requests report
    And EPG user clicks on the Format dropdown
    And EPG user selects a file format
    And EPG user sets Start Date
    And EPG user sets End Date
    And EPG user clicks on the Export Report button
    And EPG user clicks on the view the result link
    And EPG user clicks on the Find (report) button
    And EPG user selects the generated report
    And EPG user clicks on the Download the report button