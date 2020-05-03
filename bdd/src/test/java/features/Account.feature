Feature: Application Login

Background:
Given validate the browser
When  browser is triggered 
Then check if browser is started

@RegTests
Scenario: Home page default login
Given User is on landing page
When User is login into application with username "jin" and password "123"
Then Home page is populated
And Cards are displayed "true"

