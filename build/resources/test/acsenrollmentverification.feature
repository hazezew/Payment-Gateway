#  Author: Belesti Yenegeta
#  Date: Jul 07, 2023
#  Project name: ACS Enrollment Verification
#  Module: ACS Enrollment Verification
#  Activity: ACS Enrollment Verification
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@ACSEnrollmentVerification

Feature: ACS Card Registry Loading History
  Background: user opened web browser and maximizes it
    When user has entered ACS system URL
#    When user enters "Belesti1" into ACS Username text field
#    And user enters "Bel@Gsh#4" into ACS into password text field
#    When user enters "acsuserauto4" into ACS Username text field
#    And user enters "Acsuserauto@1235" into ACS into password text field
    When user enters "acsuserauto5" into ACS Username text field
    And user enters "Acsuserauto@1235" into ACS into password text field
#    When user enters "Betty" into ACS Username text field
#    And user enters "Betty@123$" into ACS into password text field
    And user clicks ACS Login button
    Then system displays ACS Admin dashboard
    And ACS user clicks on Menu Icon for Enrollment Verification
    And ACS user clicks on Enrollment Verification menu

  Scenario: Search Enrollment Verification
    And ACS user enters "9231414154851384807" into card number text field in enrollment verification page
    And ACS user enters "0912367900" into phone number text field
    And ACS user selects "BUNNA" for profile in enrollment verification page
    And ACS user clicks on the Search enrollment verification button
    Then ACS user would get "0912367900" in phone number field and "BUNNA" in profile field from the returned list of enrollment verification page
    And ACS user logs out
    Then ACS system displays login page
