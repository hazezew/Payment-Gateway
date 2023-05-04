#  Author: Belesti Yenegeta
#  Date: Apr 05, 2023
#  Project name: Electronic Payment Gateway Super Admin (EPG Super Admin)
#  Module: EPG Super Admin
#  Activity: EPG Super Admin
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test (SIT)

@Regression
@EPGSuperAdmin

Feature: EPG Super Admin
  Background: user opened web browser and maximizes it
    When user has entered EPG system URL

  Scenario: Create new user with valid and complete mandatory data
    When user enters "admin" into EPG Username text field
    And user enters "admin1" into EPG into password text field
    And super user clicks EPG Login button
    Then system displays EPG Super Admin dashboard
    And EPG admin clicks Administration menu
    And EPG user clicks Users submenu
    Then EPG system displays Users page
    And super admin clicks Create button
    Then EPG system displays user creation form
    And super admin enter "belauto2" into Login text field
    And super admin enter "bel#aut2" into Password text field
    And super admin enter "bel#aut2" into Confirm Password text field
    And super admin selects english language
    And super admin select admin group
    And super admin click save button

  Scenario: search user using login Name
    When user enters "admin" into EPG Username text field
    And user enters "admin1" into EPG into password text field
    And super user clicks EPG Login button
    Then system displays EPG Super Admin dashboard
    And EPG admin clicks Administration menu
    And EPG user clicks Users submenu
    And super admin enters "belauto1" into Search text field
    And super admin clicks Find button
    Then Assert a user with login name "belauto1" is returned

  Scenario: update an existing user
    When user enters "admin" into EPG Username text field
    And user enters "admin1" into EPG into password text field
    And super user clicks EPG Login button
    Then system displays EPG Super Admin dashboard
    And EPG admin clicks Administration menu
    And EPG user clicks Users submenu
    And super admin enters "belauto1" into Search text field
    And super admin clicks Find button
    And super admin opens the returned user to view its detail
    And super admin adds permissions to the returned user
    And super admin click save button
    And super admin searches for the updated user "belauto1"
    Then Assert the updated user is having the assigned priviledges

  Scenario: View Application Info and Assert the Version
    When user enters "admin" into EPG Username text field
    And user enters "admin1" into EPG into password text field
    And super user clicks EPG Login button
    Then system displays EPG Super Admin dashboard
    And EPG admin clicks Administration menu
    And EPG user clicks Application Info submenu
    Then super admin should assert the version is "2.2.22.R-EPG1.33-cb-20230403-d8ee5575"

  Scenario: super admin logs out from the system
    When user enters "admin" into EPG Username text field
    And user enters "admin1" into EPG into password text field
    And super user clicks EPG Login button
    Then system displays EPG Super Admin dashboard
    And super admin clicks on quit button
    Then System should display authentication form



