$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/SEMESTER 7/MBKM/MiniProyek/CICD/Mini-Project-Web-UI/Include/features/Products/Products.feature");
formatter.feature({
  "name": "View Detail Item",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ViewItem"
    }
  ]
});
formatter.scenarioOutline({
  "name": "user want to view detail item",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ViewItem1"
    },
    {
      "name": "@positive"
    }
  ]
});
formatter.step({
  "name": "user enter \u003cemail\u003e email valid and \u003cpassword\u003e password valid",
  "keyword": "When "
});
formatter.step({
  "name": "user click button to login",
  "keyword": "And "
});
formatter.step({
  "name": "User click buttom detail",
  "keyword": "And "
});
formatter.step({
  "name": "User verify detail item",
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
  "name": "user navigate to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProductSteps.UserNavigateToLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user want to view detail item",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ViewItem"
    },
    {
      "name": "@ViewItem1"
    },
    {
      "name": "@positive"
    }
  ]
});
formatter.step({
  "name": "user enter frizzi12@gmail.com email valid and testing123 password valid",
  "keyword": "When "
});
formatter.match({
  "location": "ProductSteps.UserEnterValidData(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click button to login",
  "keyword": "And "
});
formatter.match({
  "location": "ProductSteps.UserClickButtomToLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click buttom detail",
  "keyword": "And "
});
formatter.match({
  "location": "ProductSteps.UserClickButtomDetail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify detail item",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductSteps.UserVerifyDetailItem()"
});
formatter.result({
  "status": "passed"
});
});