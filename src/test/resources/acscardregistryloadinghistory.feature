#  Author: Belesti Yenegeta
#  Date: Jul 07, 2023
#  Project name: ACS Card Registry Loading History
#  Module: ACS Card Registry Loading History
#  Activity: ACS Card Registry Loading History
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@ACSCardRegistryLoadingHistory

Feature: ACS Card Registry Loading History
  Background: user opened web browser and maximizes it
    When user has entered ACS system URL
#    When user enters "Belesti1" into ACS Username text field
#    And user enters "Bel@Gsh#4" into ACS into password text field
    When user enters "acsuserauto4" into ACS Username text field
    And user enters "Acsuserauto@1235" into ACS into password text field
#    When user enters "acsuserauto5" into ACS Username text field
#    And user enters "Acsuserauto@1235" into ACS into password text field
#    When user enters "Betty" into ACS Username text field
#    And user enters "Betty@123$" into ACS into password text field
    And user clicks ACS Login button
    Then system displays ACS Admin dashboard
    And ACS user clicks on Menu Icon for Card Registry Loading History
    And ACS user clicks on Card Registry Loading History menu

  Scenario: Search ACS Card Registry Loading History
    And ACS user enters "/home/weblogic/acs_home/cards/input/Amhara/add3.xml" into file name text field
    And ACS user selects "Amhara" for profile
    And ACS user clicks on the Search card registry loading history button
    Then ACS user would get "/home/weblogic/acs_home/cards/input/Amhara/add3.xml" in filename field and "Amhara" in profile field from the returned list of card registry loading histories
    And ACS user logs out
    Then ACS system displays login page
