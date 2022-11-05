@Transaction
Feature: Transaction Item

  Background: 
    Given user navigate login page

  @Transaction1 @positive
  Scenario Outline: user want to view detail item
    When user enter <email> email and <password> password valid
    And user click buttom to login
    And User click buttom Beli
    And User click icon card
    And User click button Bayar
    Then User verify Transaction success

    Examples: 
      | email              | password   |
      | frizzi12@gmail.com | testing123 |
      
  @Transaction1 @negative
  Scenario Outline: user want to view detail item but failed
    When user enter <email> email and <password> password with valid
    And user click buttom login
    And User click buttom Beli to buy
    And User click icon card to add
    And User click to icon to reduce item
    Then User verify Transaction failed

    Examples: 
      | email              | password   |
      | frizzi12@gmail.com | testing123 |
   
