$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/SEMESTER 7/MBKM/MiniProyek/CICD/Mini-Project-Web-UI/Include/features/Transaction/Transaction.feature");
formatter.feature({
  "name": "Transaction Item",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Transaction"
    }
  ]
});
formatter.scenarioOutline({
  "name": "user want to view detail item",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Transaction1"
    },
    {
      "name": "@positive"
    }
  ]
});
formatter.step({
  "name": "user enter \u003cemail\u003e email and \u003cpassword\u003e password valid",
  "keyword": "When "
});
formatter.step({
  "name": "user click buttom to login",
  "keyword": "And "
});
formatter.step({
  "name": "User click buttom Beli",
  "keyword": "And "
});
formatter.step({
  "name": "User click icon card",
  "keyword": "And "
});
formatter.step({
  "name": "User click button Bayar",
  "keyword": "And "
});
formatter.step({
  "name": "User verify Transaction success",
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
  "name": "user navigate login page",
  "keyword": "Given "
});
formatter.match({
  "location": "TransactionSteps.I_want_to_write_a_step_with_name()"
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
      "name": "@Transaction"
    },
    {
      "name": "@Transaction1"
    },
    {
      "name": "@positive"
    }
  ]
});
formatter.step({
  "name": "user enter frizzi12@gmail.com email and testing123 password valid",
  "keyword": "When "
});
formatter.match({
  "location": "TransactionSteps.I_check_for_the_value_in_step(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click buttom to login",
  "keyword": "And "
});
formatter.match({
  "location": "TransactionSteps.UserClickButtomToLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click buttom Beli",
  "keyword": "And "
});
formatter.match({
  "location": "TransactionSteps.UserClickButtomBeli()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click icon card",
  "keyword": "And "
});
formatter.match({
  "location": "TransactionSteps.UserClickIconCard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click button Bayar",
  "keyword": "And "
});
formatter.match({
  "location": "TransactionSteps.UserClickButtonBayar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify Transaction success",
  "keyword": "Then "
});
formatter.match({
  "location": "TransactionSteps.UserVerifyTransactionSuccess()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "user want to view detail item but failed",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Transaction1"
    },
    {
      "name": "@negative"
    }
  ]
});
formatter.step({
  "name": "user enter \u003cemail\u003e email and \u003cpassword\u003e password with valid",
  "keyword": "When "
});
formatter.step({
  "name": "user click buttom login",
  "keyword": "And "
});
formatter.step({
  "name": "User click buttom Beli to buy",
  "keyword": "And "
});
formatter.step({
  "name": "User click icon card to add",
  "keyword": "And "
});
formatter.step({
  "name": "User click to icon to reduce item",
  "keyword": "And "
});
formatter.step({
  "name": "User verify Transaction failed",
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
  "name": "user navigate login page",
  "keyword": "Given "
});
formatter.match({
  "location": "TransactionSteps.I_want_to_write_a_step_with_name()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user want to view detail item but failed",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Transaction"
    },
    {
      "name": "@Transaction1"
    },
    {
      "name": "@negative"
    }
  ]
});
formatter.step({
  "name": "user enter frizzi12@gmail.com email and testing123 password with valid",
  "keyword": "When "
});
formatter.match({
  "location": "TransactionSteps.UserInputEmailPasswordWithValid(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click buttom login",
  "keyword": "And "
});
formatter.match({
  "location": "TransactionSteps.UserClickButtomLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click buttom Beli to buy",
  "keyword": "And "
});
formatter.match({
  "location": "TransactionSteps.UserClickButtomBeliToBuy()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click icon card to add",
  "keyword": "And "
});
formatter.match({
  "location": "TransactionSteps.UserClickIconCardToAdd()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click to icon to reduce item",
  "keyword": "And "
});
formatter.match({
  "location": "TransactionSteps.UserClickToreduceItem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify Transaction failed",
  "keyword": "Then "
});
formatter.match({
  "location": "TransactionSteps.UserVerifyTransactionFailed()"
});
formatter.result({
  "status": "passed"
});
});