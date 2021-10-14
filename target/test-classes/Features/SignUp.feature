Feature: sign up feature

  Background: Verify login Page
    Given User is on the elearning application page
    When User enters the login credentials like username and password.
    Then User clicks on the login button
    And User is navigated to the welcome page

  Scenario: Personal Agenda Functionality.
    When User Click on personal agenda option
    Then User navigates the personal agenda option.
    Then User clicks on Calendar option
    Then User navigates the calendar option.

  Scenario Outline: Calendar by month Functionality
    When User Click on personal agenda option 1.
    Then User clicks on Date present.
    Then User enter the "<title>"
    And User clicks on add button.
    And User navigates the agenda

    Examples: 
      | title           |
      | Personal Agenda |

  #Scenario: Edit the Saved Personal Agenda.
  # When User Click on personal agenda option again
  #Then User Clicks on saved Agenda
  #Then User clicks on Edit button
  #And User navigates the edit agenda tab.
  Scenario Outline: Save the Edited Personal Agenda.
    When User Click on personal agenda option again
    Then User Clicks on saved Agenda
    Then User clicks on Edit button
    And User navigates the edit agenda tab.
    And User enter the "<title>" and Date range
    And user clicks on Edit Event.

    Examples: 
      | title |
      | Day 1 |

  Scenario: Delete the saved agenda.
    When User Click on personal agenda option again
    Then User Clicks on saved Agenda again.
    Then User clicks on Delete option.

  Scenario: Calendar by Week Functionality.
    When User Click on personal agenda option again
    Then User Click on Calendar by week option.
    And User navigates to change the week.
    And User navigates to previous week.

  Scenario: Calendar by Day Functionality.
    When User Click on personal agenda option again
    Then User Click on Calendar by Day option.
    Then User click on Today Btn.
    And User Click on Forward btn

  Scenario: Agenda List Functionality.
    When User Click on personal agenda option again
    Then User Click on Agenda List btn.
    Then User Clicks on agenda list option.
    And User Navigates the agenda list option.

  Scenario: Sessions Plan Calendar functionality.
    When User Click on personal agenda option again
    Then User click on Sessions plan calendar
    Then User navigates the Sessions plan calendar.
    And User click on previous year.

  Scenario: Bug while creating a personal agenda
    When User Click on personal agenda option again
    Then User clicks on Date present again.
    And User clicks on add button again.
    Then User clicks on saved agenda again
    Then user clicks on edit button
    And User clicks on edit agenda button to save the edited agenda.
    And User navigate the personal agenda.
