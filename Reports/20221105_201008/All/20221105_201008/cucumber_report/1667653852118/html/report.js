$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/SEMESTER 7/MBKM/MiniProyek/CICD/Mini-Project-Web-UI/Include/features/Logout/Logout.feature");
formatter.feature({
  "name": "Log In invalid",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@logout"
    }
  ]
});
formatter.scenarioOutline({
  "name": "user want to login with unregistered account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@logout1"
    },
    {
      "name": "@positive"
    }
  ]
});
formatter.step({
  "name": "user input \u003cemail\u003e email and \u003cpassword\u003e password with valid",
  "keyword": "When "
});
formatter.step({
  "name": "user click login button to login",
  "keyword": "And "
});
formatter.step({
  "name": "User click icon logout",
  "keyword": "And "
});
formatter.step({
  "name": "Verify condition logout",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "frizzi12@gmail.com",
        "testing123"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user navigated login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LogoutSteps.nagivateToLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user want to login with unregistered account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@logout"
    },
    {
      "name": "@logout1"
    },
    {
      "name": "@positive"
    }
  ]
});
formatter.step({
  "name": "user input frizzi12@gmail.com email and testing123 password with valid",
  "keyword": "When "
});
formatter.match({
  "location": "LogoutSteps.EnterInputEmailPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login button to login",
  "keyword": "And "
});
formatter.match({
  "location": "LogoutSteps.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click icon logout",
  "keyword": "And "
});
formatter.match({
  "location": "LogoutSteps.UserClickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify condition logout",
  "keyword": "Then "
});
formatter.match({
  "location": "LogoutSteps.verifyHomePage()"
});
formatter.result({
  "status": "passed"
});
});