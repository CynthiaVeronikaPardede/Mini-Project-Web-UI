$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/SEMESTER 7/MBKM/MiniProyek/CICD/Mini-Project-Web-UI/Include/features/Login/Login.feature");
formatter.feature({
  "name": "Log In invalid",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "user want to login with unregistered account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login1"
    },
    {
      "name": "@positive"
    }
  ]
});
formatter.step({
  "name": "user input \u003cemail\u003e email and \u003cpassword\u003e password",
  "keyword": "When "
});
formatter.step({
  "name": "user click login button",
  "keyword": "And "
});
formatter.step({
  "name": "system verifying condition",
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
  "name": "user navigated to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.nagivateToLoginPage()"
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
      "name": "@login"
    },
    {
      "name": "@login1"
    },
    {
      "name": "@positive"
    }
  ]
});
formatter.step({
  "name": "user input frizzi12@gmail.com email and testing123 password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.EnterInputEmailPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "system verifying condition",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "user want to login with invalid password and valid email",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@negative"
    }
  ]
});
formatter.step({
  "name": "user enter \u003cemail\u003e email",
  "keyword": "When "
});
formatter.step({
  "name": "User enter \u003cpassword\u003e password",
  "keyword": "And "
});
formatter.step({
  "name": "user click login buttom",
  "keyword": "And "
});
formatter.step({
  "name": "User verify login",
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
        "frizzi12@gmail.com ",
        " samsudin "
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
  "name": "user navigated to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.nagivateToLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user want to login with invalid password and valid email",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@login"
    },
    {
      "name": "@negative"
    }
  ]
});
formatter.step({
  "name": "user enter frizzi12@gmail.com  email",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.UserEnterEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter  samsudin  password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.UserEnterPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login buttom",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.UserClickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.UserVerifyHomePage()"
});
formatter.result({
  "status": "passed"
});
});