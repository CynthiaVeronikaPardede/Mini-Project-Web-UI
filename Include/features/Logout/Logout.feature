@logout
Feature: Log In invalid

  Background: 
    Given user navigated login page

  @logout1 @positive
  Scenario Outline: user want to login with unregistered account
    When user input <email> email and <password> password with valid
    And user click login button to login
    And User click icon logout
    Then Verify condition logout

    Examples: 
      | email              | password   |
      | frizzi12@gmail.com | testing123 |