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
formatter.scenario({
  "line": 15,
  "name": "Listgroup check Test 2",
  "description": "",
  "id": "test-home-page;listgroup-check-test-2",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@test222"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "Navigate to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Check whether there are three values in the listgroup",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "check the second list item\u0027s value is set to \"List Item 2\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Check whether the second list item\u0027s badge value is 6",
  "keyword": "Then "
});
formatter.match({
  "location": "TestHomePage.navigate_to_home_page()"
});
formatter.result({
  "duration": 4744262200,
  "status": "passed"
});
formatter.match({
  "location": "TestHomePage.check_whther_there_are_three_values_in_the_listgroup()"
});
formatter.result({
  "duration": 99712900,
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
  "duration": 158423300,
  "status": "passed"
});
formatter.match({
  "location": "TestHomePage.check_whether_the_second_list_items_badge_value_is_6()"
});
formatter.result({
  "duration": 38100,
  "status": "passed"
});
});