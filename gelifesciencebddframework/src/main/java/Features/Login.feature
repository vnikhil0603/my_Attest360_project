Feature: GE Health Life Science Login

Scenario: User should validate the Login Page

Given user should open ge health life science home page
Then user should click on Log In/Register button
Then user should enter "vnikhil0603@gmail.com" and "Nikhil@1993"
Then user should click on Login button
Then user should be on login page
Then click on Applications tab
Then click on Bioprocessing
Then validate the page of Bioprocessing
Then user should logout and browser will closes