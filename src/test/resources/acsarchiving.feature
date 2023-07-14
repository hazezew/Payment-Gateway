#  Author: Belesti Yenegeta
#  Date: Jul 10, 2023
#  Project name: ACS Archiving
#  Module: ACS Archiving
#  Activity: ACS Archiving
#  Project owner: EthSwitch
#  Vendor: BPC (Banking Product Context)
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@ACSArchiving

Feature: ACS Archiving
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
    And ACS user clicks on Menu Icon for Archiving
    And ACS user clicks on Archiving menu

  Scenario: Add Archiving Data
    And ACS user clicks on the Archiving data button
    And ACS user selects "AUTHENTICATION" for data type to be archived
    And ACS user selects a starting date time
    And ACS user selects an end date time
    And ACS user checks the clean main tables checkbox
    And ACS user clicks on the Save archiving data button
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Search Archived Data
    And ACS user selects "AUTHENTICATION" for archiving entity filter
    And ACS user selects day 1 as a starting date time filter
    And ACS user selects day 30 as an end date time filter
    And ACS user clicks on the Search archived data button
    Then ACS user would get "AUTHENTICATION" in the archiving entity field
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Restore Archived Data
    And ACS user selects "AUTHENTICATION" for archiving entity filter
    And ACS user selects day 1 as a starting date time filter
    And ACS user selects day 30 as an end date time filter
    And ACS user clicks on the Search archived data button
    And ACS user clicks on the returned archived data row
    And ACS user clicks on the Restore archived data button
    And ACS user clicks on Yes button to confirm restoration of archived data
    Then ACS user would get "RESTORE" in the latest action field of archived data row
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Clean Main Tables Data
    And ACS user selects "AUTHENTICATION" for archiving entity filter
    And ACS user selects day 1 as a starting date time filter
    And ACS user selects day 30 as an end date time filter
    And ACS user clicks on the Search archived data button
    And ACS user clicks on the returned archived data row
    And ACS user clicks on the Clean main tables data button
    And ACS user clicks on the Yes button to confirm cleaning of main tables
    Then ACS user would get "CLEAN" in the latest action field of archived data row
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Drop Archived Data
    And ACS user selects "AUTHENTICATION" for archiving entity filter
    And ACS user selects day 1 as a starting date time filter
    And ACS user selects day 30 as an end date time filter
    And ACS user clicks on the Search archived data button
    And ACS user clicks on the returned archived data row
    And ACS user clicks on the Drop archived data button
    And ACS user clicks on Yes button to confirm dropping of archived data
    Then ACS user would get "DROP" in the latest action field of archived data row
    And ACS user logs out
    Then ACS system displays login page

  Scenario: Delete Archive Record and History
    And ACS user selects "AUTHENTICATION" for archiving entity filter
    And ACS user selects day 1 as a starting date time filter
    And ACS user selects day 30 as an end date time filter
    And ACS user clicks on the Search archived data button
    And ACS user clicks on the returned archived data row
    And ACS user clicks on the Delete archive record and history button
    And ACS user clicks on Yes button to confirm deletion of archived record and history data
    Then ACS user would get "No records found." rather than the archived data
    And ACS user logs out
    Then ACS system displays login page

