$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/features/Assignment1.feature");
formatter.feature({
  "name": "Assignment1",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Testfeature"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Verifying Registration scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Page for navigation is \"\u003curl\u003e\" for \"\u003cbrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "clicked on registration",
  "keyword": "When "
});
formatter.step({
  "name": "Enter the details for registration like \"\u003cFIRSTNAME\u003e\" \"\u003cLAST NAME\u003e\" \"\u003cEMAIL\u003e\" \"\u003cPASSWORD\u003e\" \"\u003cCONFIRM PASSWORD\u003e\" \"\u003cBIRTHDATE-month\u003e\" \"\u003cBIRTHDATE-year\u003e\" \"\u003cZIP CODE\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "url",
        "browser",
        "FIRSTNAME",
        "LAST NAME",
        "EMAIL",
        "PASSWORD",
        "CONFIRM PASSWORD",
        "BIRTHDATE-month",
        "BIRTHDATE-year",
        "ZIP CODE"
      ]
    },
    {
      "cells": [
        "https://www.gillette.co.in/en-in",
        "chrome",
        "manasa",
        "g",
        "manasagp@gmail.com",
        "Spark123",
        "Spark123",
        "10",
        "1997",
        "500010"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying Registration scenario",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Testfeature"
    }
  ]
});
formatter.step({
  "name": "Page for navigation is \"https://www.gillette.co.in/en-in\" for \"chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.StepDefinitions.pageForNavigationIsFor(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicked on registration",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.StepDefinitions.clicked_on_registration()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the details for registration like \"manasa\" \"g\" \"manasagp@gmail.com\" \"Spark123\" \"Spark123\" \"10\" \"1997\" \"500010\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.StepDefinitions.enter_the_details_for_registration_like(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verifying Login scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Page for navigation",
  "keyword": "Given "
});
formatter.step({
  "name": "clicked on login",
  "keyword": "When "
});
formatter.step({
  "name": "Enter the details for login like  \"\u003cEMAIL\u003e\" \"\u003cPASSWORD\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "EMAIL",
        "PASSWORD"
      ]
    },
    {
      "cells": [
        "manasagp@gmail.com",
        "Spark123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying Login scenario",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Testfeature"
    }
  ]
});
formatter.step({
  "name": "Page for navigation",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.StepDefinitions.page_for_navigation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicked on login",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.StepDefinitions.clicked_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the details for login like  \"manasagp@gmail.com\" \"Spark123\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.StepDefinitions.enter_the_details_for_login_like(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verifying Forgot Password scenario and Password Reset",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Page for navigation",
  "keyword": "Given "
});
formatter.step({
  "name": "clicked on Forgot password",
  "keyword": "When "
});
formatter.step({
  "name": "Enter the details for password reset like  \"\u003cEMAIL\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "clicked on password reset",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "EMAIL"
      ]
    },
    {
      "cells": [
        "manasagp@gmail.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying Forgot Password scenario and Password Reset",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Testfeature"
    }
  ]
});
formatter.step({
  "name": "Page for navigation",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.StepDefinitions.page_for_navigation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicked on Forgot password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.StepDefinitions.clicked_on_Forgot_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the details for password reset like  \"manasagp@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.StepDefinitions.enter_the_details_for_password_reset_like(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicked on password reset",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.StepDefinitions.clicked_on_password_reset()"
});
formatter.result({
  "status": "passed"
});
});