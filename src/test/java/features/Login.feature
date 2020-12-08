Feature: Application login

Scenario: Home page default login

Given User is on landing page
When User login into application with "Jil" and "password"
Then Home page is populated
And cards displayed "true"

Scenario: Home page default login
Given User is on landing page
When User login into application with "Jung" and "password1"
Then Home page is populated
And cards displayed "false"

Scenario: Home page default login
Given User is on landing page
When User login into application with "Juck" and "password2"
Then Home page is populated
And cards displayed "truefalse"