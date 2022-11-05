@ViewItem
Feature: View Detail Item

  Background: 
    Given user navigate to login page

  @ViewItem1 @positive
  Scenario Outline: user want to view detail item
    When user enter <email> email valid and <password> password valid
    And user click button to login
    And User click buttom detail
    Then User verify detail item

    Examples: 
      | email              | password   |
      | frizzi12@gmail.com | testing123 |
