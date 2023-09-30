@Feature1
Feature: To validate the account creation of Faacebook Application

Background:
Given To launch the browser and maximise the window


@Regression
Scenario: To Validate the Valid username and invalid paaword 


When  To  launch url of  the Facebook application
And  To pass  Valid username in email filed
And  To pass invalid password in password filed
And  To clik the login button
And  To Check whether it navigate to the homepage or not
Then To close browser

