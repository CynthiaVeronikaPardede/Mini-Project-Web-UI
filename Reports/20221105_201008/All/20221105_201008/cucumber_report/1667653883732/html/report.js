$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/SEMESTER 7/MBKM/MiniProyek/CICD/Mini-Project-Web-UI/Include/features/Register/Register.feature");
formatter.feature({
  "name": "Register With Valid",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User want to register with valid Credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@register1"
    },
    {
      "name": "@postive"
    }
  ]
});
formatter.step({
  "name": "user input \u003cfullname\u003e and \u003cemail\u003e and also \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "user click register button",
  "keyword": "And "
});
formatter.step({
  "name": "verifying condition for valid",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "fullname",
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "nama1112",
        "nama1211@gmail.com ",
        " passworddd2 "
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
  "name": "user navigated to register page",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterSteps.nagivateToRegisterPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User want to register with valid Credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@register"
    },
    {
      "name": "@register1"
    },
    {
      "name": "@postive"
    }
  ]
});
formatter.step({
  "name": "user input nama1112 and nama1211@gmail.com  and also  passworddd2 ",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterSteps.enterEmptyFullnameCredentials(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click register button",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifying condition for valid",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterSteps.verifyHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User want to register with failed",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@register1"
    },
    {
      "name": "@negative"
    }
  ]
});
formatter.step({
  "name": "user enter \u003cfullname\u003e and \u003cpassword\u003e and also \u003cemail\u003e with invalid",
  "keyword": "When "
});
formatter.step({
  "name": "user click register button to register",
  "keyword": "And "
});
formatter.step({
  "name": "verify condition for valid",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "fullname",
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "nama1112",
        "() ",
        " 45 "
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
  "name": "user navigated to register page",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterSteps.nagivateToRegisterPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User want to register with failed",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@register"
    },
    {
      "name": "@register1"
    },
    {
      "name": "@negative"
    }
  ]
});
formatter.step({
  "name": "user enter nama1112 and  45  and also ()  with invalid",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterSteps.UserEnterFullnameEmailPassword(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click register button to register",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.UserClickRegisterButtom()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify condition for valid",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterSteps.VerifyConditionForValid()"
});
formatter.result({
  "status": "passed"
});
});