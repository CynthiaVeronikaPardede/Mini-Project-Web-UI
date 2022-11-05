@login
Feature: Log In invalid

  Background: 
    Given user navigated to login page

  @login1 @positive
  Scenario Outline: user want to login with unregistered account
    When user input <email> email and <password> password
    And user click login button
    Then system verifying condition

    Examples: 
      | email              | password   |
      | frizzi12@gmail.com | testing123 |

  @login @negative
  Scenario Outline: user want to login with invalid password and valid email
    When user enter <email> email
    And User enter <password> password
    And user click login buttom
    Then User verify login

    Examples: 
      | email               | password   |
      | frizzi12@gmail.com  |  samsudin  |
