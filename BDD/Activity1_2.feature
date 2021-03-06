@activity1_2
Feature: Login Test

Scenario: Testing Login
    Given  Login page
    When Type username and password
    Then page title and confirmation message
    And Browser should be closed