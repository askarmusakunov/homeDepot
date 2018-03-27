$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("positive_login.feature");
formatter.feature({
  "line": 2,
  "name": "positive login functionality",
  "description": "",
  "id": "positive-login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "#@login_user"
    },
    {
      "line": 5,
      "value": "#Scenario: Login as a user"
    },
    {
      "line": 6,
      "value": "#Given I am on the HomeDepot home page"
    },
    {
      "line": 7,
      "value": "#When I login as a user"
    },
    {
      "line": 8,
      "value": "#Then I should be able to verify that I logged in"
    }
  ],
  "line": 10,
  "name": "Check all Shopping Link Hoverovers",
  "description": "",
  "id": "positive-login-functionality;check-all-shopping-link-hoverovers",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I am on the HomeDepot home page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I login as a user with \"\u003cemail\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should be able to verify that I logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I hover over Shopping links",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I should be able to see dropDowns",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "positive-login-functionality;check-all-shopping-link-hoverovers;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 17,
      "id": "positive-login-functionality;check-all-shopping-link-hoverovers;;1"
    },
    {
      "cells": [
        "heartless_oskar@mail.ru",
        "oscar94."
      ],
      "line": 18,
      "id": "positive-login-functionality;check-all-shopping-link-hoverovers;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "Check all Shopping Link Hoverovers",
  "description": "",
  "id": "positive-login-functionality;check-all-shopping-link-hoverovers;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I am on the HomeDepot home page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I login as a user with \"heartless_oskar@mail.ru\" and \"oscar94.\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should be able to verify that I logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I hover over Shopping links",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I should be able to see dropDowns",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInStep_Def.i_am_on_the_HomeDepot_home_page()"
});
formatter.result({
  "duration": 32327366311,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "heartless_oskar@mail.ru",
      "offset": 24
    },
    {
      "val": "oscar94.",
      "offset": 54
    }
  ],
  "location": "SignInStep_Def.i_login_as_a_user_with_and(String,String)"
});
formatter.result({
  "duration": 21815348459,
  "status": "passed"
});
formatter.match({
  "location": "SignInStep_Def.i_should_be_able_to_verify_that_I_logged_in()"
});
formatter.result({
  "duration": 4356033424,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[Welcome]\u003e but was:\u003c[My Account]\u003e\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\n\tat stepdefinitions.SignInStep_Def.i_should_be_able_to_verify_that_I_logged_in(SignInStep_Def.java:38)\n\tat ✽.Then I should be able to verify that I logged in(positive_login.feature:13)\n",
  "status": "failed"
});
formatter.match({
  "location": "SignInStep_Def.i_hover_over_Shopping_links()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignInStep_Def.i_should_be_able_to_see_dropDowns()"
});
formatter.result({
  "status": "skipped"
});
});