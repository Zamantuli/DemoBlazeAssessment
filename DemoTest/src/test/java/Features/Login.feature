@Regression,@Login
Feature: Login


  Scenario Outline: As a user i want to login and verify that i am logged in successfully
    Given I am on Login page
    And I enter the username <user_name>
    And I enter password <pass>
    When I click login button
    Then The home page is displayed
    Examples:
      | user_name     | pass         |
      | standard_user | secret_sauce |


