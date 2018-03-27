@SmokeTest
Feature: positive login functionality

  #@login_user
  #Scenario: Login as a user
  #Given I am on the HomeDepot home page
  #When I login as a user
  #Then I should be able to verify that I logged in
  @smoke
  Scenario Outline: Check all Shopping Link Hoverovers
    Given I am on the HomeDepot home page
    When I login as a user with "<email>" and "<password>"
    Then I should be able to verify that I logged in
    When I hover over Shopping links
    Then I should be able to see dropDowns
Examples: 
      | email                   | password     |
      | heartless_oskar@mail.ru | oscar94.     |

      
  @regression
  Scenario Outline: Heder Search Functionality Test
    Given I am on the HomeDepot home page
    When I login as a user with "<email>" and "<password>"
    Then I should be able to verify that I logged in
    When I search for "<item>"
    Then I verify results for message

    Examples: 
      | email                   | password     | item          |
      | heartless_oskar@mail.ru | oscar94.     | lamp          |
      | karakol1994@gmail.com   | ochenslojniy | computer desk |
