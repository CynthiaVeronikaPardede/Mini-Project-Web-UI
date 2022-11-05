@register
Feature: Register With Valid

  Background: 
    Given user navigated to register page

  @register1 @postive
  Scenario Outline: User want to register with valid Credentials
    When user input <fullname> and <email> and also <password>
    And user click register button
    Then verifying condition for valid

    Examples: 
      | fullname | email               | password      |
      | nama1112 | nama1211@gmail.com  |  passworddd2  |

  @register1 @negative
  Scenario Outline: User want to register with failed
    When user enter <fullname> and <password> and also <email> with invalid
    And user click register button to register
    Then verify condition for valid

    Examples: 
      | fullname | email | password |
      | nama1112 | ()    |  45      |
