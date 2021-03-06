@activity2_4
Feature: Data driven test without Example

Scenario: Testing with Data from Scenario
    Given UR is on Login page
    When UR enters "admin" and "password"
    Then Read the title page and successfull message
    And  Browser should close