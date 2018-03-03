
@SmokeTest
Feature: positive login functionality

  #@login_user
  #Scenario: Login as a user
    #Given I am on the HomeDepot home page
    #When I login as a user
    #Then I should be able to verify that I logged in

@us2
	Scenario: Check all Shopping Link Hoverovers
    Given I am on the HomeDepot home page
    When I login as a user
    Then I should be able to verify that I logged in
    When I hover over Shopping links
    Then I should be able to see dropDowns
    When I hover over one Shopping link
    Then I should be able to click on room links
