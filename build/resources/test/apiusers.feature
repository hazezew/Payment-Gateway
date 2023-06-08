#  Author: Belesti Yenegeta
#  Date: Apr 08, 2023
#  Project name: Electronic Payment Gateway Super Admin (EPG API Users)
#  Module: EPG API Users
#  Activity: EPG API Users
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test (SIT)

@Regression
@APIUsers

  Feature: EPG API Users to do
    Background: user opened web browser and maximizes it
      When user has entered EPG system URL

    Scenario: Create new API user with valid and complete mandatory data
      When user enters "belesti1" into EPG Username text field
      And user enters "Bel@Epg#4" into EPG into password text field
      And super user clicks EPG Login button
      Then system displays EPG Super Admin dashboard
      And EPG user clicks Administration menu
      And EPG user clicks api Users submenu
      And EPG user clicks on Create api button
      And EPG user enters "merchantauto1" into login text field
      And EPG user enters "Merchant" into merchant text field
      And EPG user clicks on default language dropdown
      And EPG user selects EN language
      And EPG user enters "merchantauto1" into password text field
      And EPG user enters "merchantauto1" into confirm password text field
      And EPG user clicks on the Save button

    Scenario: Search API user via login name
      When user enters "belesti1" into EPG Username text field
      And user enters "Bel@Epg#4" into EPG into password text field
      And super user clicks EPG Login button
      Then system displays EPG Super Admin dashboard
      And EPG user clicks Administration menu
      And EPG user clicks api Users submenu
      And EPG user enters "merchantauto1" into search text field
      And EPG user clicks on the Find button
      Then Assert API user with "merchantauto1" is returned

    Scenario: Trying to create a duplicated user
      When user enters "belesti1" into EPG Username text field
      And user enters "Bel@Epg#4" into EPG into password text field
      And super user clicks EPG Login button
      Then system displays EPG Super Admin dashboard
      And EPG user clicks Administration menu
      And EPG user clicks api Users submenu
      And EPG user clicks on Create api button
      And EPG user enters "merchantauto1" into login text field
      And EPG user enters "Merchant" into merchant text field
      And EPG user clicks on default language dropdown
      And EPG user selects EN language
      And EPG user enters "merchantauto1" into password text field
      And EPG user enters "merchantauto1" into confirm password text field
      And EPG user clicks on the Save button
      Then The System displays "User with same login already exists" message

    Scenario: update API User account
      When user enters "belesti1" into EPG Username text field
      And user enters "Bel@Epg#4" into EPG into password text field
      And super user clicks EPG Login button
      Then system displays EPG Super Admin dashboard
      And EPG user clicks Administration menu
      And EPG user clicks api Users submenu
      And EPG user enters "merchantauto1" into search text field
      And EPG user clicks on the Find button
      Then EPG user opens the returned user to view its detail
      And EPG user adds permissions to this user
      And EPG user clicks on the Save api user button
      And EPG user searches for the updated user "merchantauto1"
      Then Assert the updated api user is having the assigned priviledges




