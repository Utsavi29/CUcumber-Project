$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TechfiosLogin.feature");
formatter.feature({
  "line": 1,
  "name": "User should be able to change the dashboard page color",
  "description": "",
  "id": "user-should-be-able-to-change-the-dashboard-page-color",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Sky blue background",
  "description": "",
  "id": "user-should-be-able-to-change-the-dashboard-page-color;sky-blue-background",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "set skyblue background button exist",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "i click on the button on \"sky blue\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "colorChangeStepDefinition.set_skyblue_background_button_exist()"
});
formatter.result({
  "duration": 89616600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sky blue",
      "offset": 26
    }
  ],
  "location": "colorChangeStepDefinition.i_click_on_the_button_on(String)"
});
formatter.result({
  "duration": 1592000,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});