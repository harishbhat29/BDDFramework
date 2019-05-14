$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Informatica IDD Login feature",
  "description": "",
  "id": "informatica-idd-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "IDD Login Test scenario",
  "description": "",
  "id": "informatica-idd-login-feature;idd-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of the page is Informatica MDM Data Director",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_Login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_the_page_is_Informatica_MDM_Data_Director()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.enter_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_homepage()"
});
formatter.result({
  "status": "skipped"
});
});