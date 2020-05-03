$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 1,
  "name": "Search and place order",
  "description": "",
  "id": "search-and-place-order",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Search for items and validate results",
  "description": "",
  "id": "search-and-place-order;search-for-items-and-validate-results",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SeleniumTest1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on GreenCart landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User search for Cucumber vegetable",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "\"Cucumber\" results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefinitions.user_is_on_GreenCart_landing_page()"
});
formatter.result({
  "duration": 15607459400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 16
    }
  ],
  "location": "MyStepDefinitions.user_search_for_vegetable(String)"
});
formatter.result({
  "duration": 9592580601,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 1
    }
  ],
  "location": "MyStepDefinitions.results_are_desplate(String)"
});
formatter.result({
  "duration": 4523454500,
  "status": "passed"
});
formatter.after({
  "duration": 715273899,
  "status": "passed"
});
});