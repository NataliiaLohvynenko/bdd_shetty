Feature: Application Login



@RegTest
Scenario: Home page default login
Given User is on landing page
When User is login into application with username "jin" and password "123"
Then Home page is populated
And Cards are displayed "true"

@SmokeTest
Scenario: Home page default login
Given User is on landing page
When User is login into application with username "john" and password "231"
Then Home page is populated
And Cards are displayed "false"

@MibileTest
Scenario: Home page default login
Given User is on landing page
When User sign up with following details
| jenny | abs | @jmail | country |

Then Home page is populated
And Cards are displayed "false"


Scenario Outline: Home page default login
Given User is on landing page
When user is login into application with username <Username> and password <password>
Then Home page is populated
And Cards are displayed "false"

Examples:
|Username|password|
|user|pass|
|user2|pass2|
|user3|pass|

