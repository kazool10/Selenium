$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Warsztaty2.feature");
formatter.feature({
  "name": "Shopping in store",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Shopping and payment are done on the website",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the store website",
  "keyword": "Given "
});
formatter.step({
  "name": "User is logged on website",
  "keyword": "When "
});
formatter.step({
  "name": "User is searching product Humningbird Printed Sweater in input and click him",
  "keyword": "And "
});
formatter.step({
  "name": "Chooses \u003csize\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the \u003cquantity\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Add to cart and go to checkout",
  "keyword": "And "
});
formatter.step({
  "name": "Gives the address",
  "keyword": "And "
});
formatter.step({
  "name": "Select delivery method",
  "keyword": "And "
});
formatter.step({
  "name": "Select payment method",
  "keyword": "And "
});
formatter.step({
  "name": "Agree terms of service",
  "keyword": "And "
});
formatter.step({
  "name": "Confirm order",
  "keyword": "And "
});
formatter.step({
  "name": "Make a screenshot",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "size",
        "quantity"
      ]
    },
    {
      "cells": [
        "M",
        "5"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Shopping and payment are done on the website",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the store website",
  "keyword": "Given "
});
formatter.match({
  "location": "warszataty_steps2.userIsOnTheStoreWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is logged on website",
  "keyword": "When "
});
formatter.match({
  "location": "warszataty_steps2.userIsLoggedOnWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is searching product Humningbird Printed Sweater in input and click him",
  "keyword": "And "
});
formatter.match({
  "location": "warszataty_steps2.userIsSearchingProductHumningbirdPrintedSweaterInInputAndClickHim()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Chooses M",
  "keyword": "And "
});
formatter.match({
  "location": "warszataty_steps2.choosesSize(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the 5",
  "keyword": "And "
});
formatter.match({
  "location": "warszataty_steps2.enterTheQuantity(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add to cart and go to checkout",
  "keyword": "And "
});
formatter.match({
  "location": "warszataty_steps2.addToCartAndGoToCheckout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Gives the address",
  "keyword": "And "
});
formatter.match({
  "location": "warszataty_steps2.givesTheAddress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select delivery method",
  "keyword": "And "
});
formatter.match({
  "location": "warszataty_steps2.selectDeliveryMethod()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select payment method",
  "keyword": "And "
});
formatter.match({
  "location": "warszataty_steps2.selectPaymentMethod()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Agree terms of service",
  "keyword": "And "
});
formatter.match({
  "location": "warszataty_steps2.agreeTermsOfService()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Confirm order",
  "keyword": "And "
});
formatter.match({
  "location": "warszataty_steps2.confirmOrder()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Make a screenshot",
  "keyword": "And "
});
formatter.match({
  "location": "warszataty_steps2.makeAScreenshot()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/features/changeProfile.feature");
formatter.feature({
  "name": "Change user information after login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
});