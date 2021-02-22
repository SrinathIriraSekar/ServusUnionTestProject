$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/testSU/features/testHomePage.feature");
formatter.feature({
  "line": 2,
  "name": "Test Home Page",
  "description": "",
  "id": "test-home-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@testSU"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "login and navigate to home page Test 1",
  "description": "",
  "id": "test-home-page;login-and-navigate-to-home-page-test-1",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Navigate to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Check whether username, password and login button is present",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Input email address \u003cEmailAddress\u003e and password \u003cpassword\u003e into the respective fields",
  "keyword": "And "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "test-home-page;login-and-navigate-to-home-page-test-1;",
  "rows": [
    {
      "cells": [
        "EmailAddress",
        "password"
      ],
      "line": 11,
      "id": "test-home-page;login-and-navigate-to-home-page-test-1;;1"
    },
    {
      "cells": [
        "sri@gmail.com",
        "password"
      ],
      "line": 12,
      "id": "test-home-page;login-and-navigate-to-home-page-test-1;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "login and navigate to home page Test 1",
  "description": "",
  "id": "test-home-page;login-and-navigate-to-home-page-test-1;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@testSU"
    },
    {
      "line": 4,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Navigate to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Check whether username, password and login button is present",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Input email address sri@gmail.com and password password into the respective fields",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.match({
  "location": "TestHomePage.navigate_to_home_page()"
});
formatter.result({
  "duration": 4452186600,
  "status": "passed"
});
formatter.match({
  "location": "TestHomePage.check_whether_username_password_and_login_button_is_present()"
});
formatter.result({
  "duration": 267804000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sri@gmail.com",
      "offset": 20
    },
    {
      "val": "password",
      "offset": 47
    }
  ],
  "location": "TestHomePage.input_email_address_and_password_into_the_respective_fields(String,String)"
});
formatter.result({
  "duration": 278335300,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Listgroup check Test 2",
  "description": "",
  "id": "test-home-page;listgroup-check-test-2",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "Navigate to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Check whether there are three values in the listgroup",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "check the second list item\u0027s value is set to \"List Item 2\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Check whether the second list item\u0027s badge value is 6",
  "keyword": "Then "
});
formatter.match({
  "location": "TestHomePage.navigate_to_home_page()"
});
formatter.result({
  "duration": 2380315300,
  "status": "passed"
});
formatter.match({
  "location": "TestHomePage.check_whther_there_are_three_values_in_the_listgroup()"
});
formatter.result({
  "duration": 43393900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "List Item 2",
      "offset": 46
    }
  ],
  "location": "TestHomePage.check_the_second_list_items_value_is_set_to_something(String)"
});
formatter.result({
  "duration": 50859800,
  "status": "passed"
});
formatter.match({
  "location": "TestHomePage.check_whether_the_second_list_items_badge_value_is_6()"
});
formatter.result({
  "duration": 33800,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Listgroup check Test 3",
  "description": "",
  "id": "test-home-page;listgroup-check-test-3",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "Navigate to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "Check Option 1 is the default selected value",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Select Option 3 from the select list",
  "keyword": "Then "
});
formatter.match({
  "location": "TestHomePage.navigate_to_home_page()"
});
formatter.result({
  "duration": 2501167600,
  "status": "passed"
});
formatter.match({
  "location": "TestHomePage.check_option_1_is_the_default_selected_value()"
});
formatter.result({
  "duration": 60526000,
  "status": "passed"
});
formatter.match({
  "location": "TestHomePage.select_option_3_from_the_select_list()"
});
formatter.result({
  "duration": 1179274600,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Listgroup check Test 4",
  "description": "",
  "id": "test-home-page;listgroup-check-test-4",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "Navigate to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "Check that the first button is enabled and that the second button is disabled",
  "keyword": "Then "
});
formatter.match({
  "location": "TestHomePage.navigate_to_home_page()"
});
formatter.result({
  "duration": 2575747400,
  "status": "passed"
});
formatter.match({
  "location": "TestHomePage.check_that_the_first_button_is_enabled_and_that_the_second_button_is_disabled()"
});
formatter.result({
  "duration": 95229000,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Listgroup check Test 5",
  "description": "",
  "id": "test-home-page;listgroup-check-test-5",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 32,
  "name": "Navigate to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "Click on the button once it\u0027s displayed",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "Once you\u0027ve clicked the button, check that a success message is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Check that the button is now disabled",
  "keyword": "Then "
});
formatter.match({
  "location": "TestHomePage.navigate_to_home_page()"
});
formatter.result({
  "duration": 2554862400,
  "status": "passed"
});
formatter.match({
  "location": "TestHomePage.click_on_the_button_once_its_displayed()"
});
formatter.result({
  "duration": 6275722900,
  "status": "passed"
});
formatter.match({
  "location": "TestHomePage.once_youve_clicked_the_button_check_that_a_success_message_is_displayed()"
});
formatter.result({
  "duration": 29448600,
  "status": "passed"
});
formatter.match({
  "location": "TestHomePage.check_that_the_button_is_now_disabled()"
});
formatter.result({
  "duration": 32640200,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Listgroup check Test 6",
  "description": "",
  "id": "test-home-page;listgroup-check-test-6",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 39,
  "name": "Navigate to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "Find the value of any cell on the grid",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "Find the value of the cell at coordinates 2, 2",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "Check whether the value of the cell is \"Ventosanzap\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TestHomePage.navigate_to_home_page()"
});
formatter.result({
  "duration": 2386372800,
  "status": "passed"
});
formatter.match({
  "location": "TestHomePage.find_the_value_of_any_cell_on_the_grid()"
});
formatter.result({
  "duration": 50238838900,
  "status": "passed"
});
formatter.match({
  "location": "TestHomePage.find_the_value_of_the_cell_at_coordinates_2_2()"
});
formatter.result({
  "duration": 21573300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ventosanzap",
      "offset": 40
    }
  ],
  "location": "TestHomePage.check_whether_the_value_of_the_cell_is_something(String)"
});
formatter.result({
  "duration": 26074300,
  "status": "passed"
});
});