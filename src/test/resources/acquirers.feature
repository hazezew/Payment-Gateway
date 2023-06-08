#  Author: Belesti Yenegeta
#  Date: Apr 12, 2023
#  Project name: Electronic Payment Gateway Super Admin (Acquirers)
#  Module: EPG Acquirers
#  Activity: EPG Acquirers
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test (SIT)

@Regression
@Acquirers


  Feature: EPG Acquirers
    Background: user opened web browser and maximizes it
      When user has entered EPG system URL
      When user enters "belesti1" into EPG Username text field
      And user enters "Bel@Epg#4" into EPG into password text field
      And super user clicks EPG Login button
      Then system displays EPG Super Admin dashboard
      And EPG user clicks Administration menu
      And EPG user clicks Acquirers submenu

    Scenario: Create new Acquirers with valid and complete mandatory data
      And EPG user clicks on the Create Acquirers button
#      And EPG user enters "acquirerauto5" into name text field
      And EPG user enters acquirerName into name text field
      And EPG user enters "acquirerauto6desc" into description text field
      And EPG user enters "192.168.20.5:90907" into url text field
      And EPG user enters "30000" into timeout text field
      And EPG user enters "0" into fixed fee text field
      And EPG user enters "232328" into internal identifier text field
      And EPG user clicks on protocol drop down
      And EPG user selects protocol
      And EPG user clicks on the Add payment system button
      And EPG user clicks on the Add Payment system label
      And EPG user clicks on the Add Payment system combobox
      And EPG user selects payment system option
      And EPG user clicks on the Save payment system button
      And EPG user selects payment method
      And EPG user clicks on the Save Acquirer button

    Scenario: search acquirer via name
      And EPG user enters "acquirerauto5" into search acquirer text field
      And EPG user clicks on the Find Acquirer button
      Then Assert Acquirer with name "acquirerauto5" is returned

    Scenario: update acquirer info
      And EPG user enters "acquirerauto5" into search acquirer text field
      And EPG user clicks on the Find Acquirer button
      And EPG user opens the returned acquirer to view its detail
      And EPG user updates acquirer's description with "updated acquirerauto5desc"
      And EPG user adds additional permissions
      And EPG user clicks on the Save Acquirer button
      And EPG user enters "acquirerauto5" into search acquirer text field
      And EPG user clicks on the Find Acquirer button
      Then Assert Acquirer with description "updated acquirerauto5desc" is returned

    Scenario: delete acquirer
      And EPG user enters "acquirerauto5" into search acquirer text field
      And EPG user clicks on the Find Acquirer button
      And EPG user opens the returned acquirer to view its detail
      And EPG user clicks the Delete Acquirer button
      And EPG user confirms deletion of the acquirer
      And EPG user enters "acquirerauto5" into search acquirer text field
      And EPG user clicks on the Find Acquirer button
      Then Assert 0 acquirer is returned



