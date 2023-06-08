#  Author: Belesti Yenegeta
#  Date: Apr 08, 2023
#  Project name: Electronic Payment Gateway Super Admin (Groups)
#  Module: EPG Groups
#  Activity: EPG Groups
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test (SIT)

@Regression
@Groups

  Feature: EPG Groups To Do
    Background: user opened web browser and maximizes it
      When user has entered EPG system URL
      When user enters "belesti1" into EPG Username text field
      And user enters "Bel@Epg#4" into EPG into password text field
      And super user clicks EPG Login button
      Then system displays EPG Super Admin dashboard
      And EPG user clicks Administration menu
      And EPG user clicks Groups submenu

    Scenario: Create new Groups with valid and complete mandatory data
      And EPG user enters "groupauto1" into Name text field
      And EPG user adds users to this group
      And EPG user clicks on the Save New Group button

    Scenario: Search Group using Group Name
      And EPG user enters "groupauto1" into group search text field
      And EPG user clicks on the search icon
      Then Assert group with groupname of "groupauto1" is returned

    Scenario: Update An Existing Group
      And EPG user enters "groupauto1" into group search text field
      And EPG user clicks on the search icon
      And EPG user clicks on the returned group to view its detail
      And EPG user clicks on the New Permission button
      And EPG user adds new permissions
