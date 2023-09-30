@Feature
Feature: TO Validate the login functionality of facebook aplication


@Sanity
Scenario: To Create new account

Given To launch the browser and maximise window 
When  To launch the url of the facebook aplication 
And  To click create new account button

And  To pass firstname in firstname text box
|firstname1|kavi|
|firstname2|ravi|
|firstname3|john|
|firstname4|prem|
 
And To pass secondname in secondname text box

And  To pass moblino  email in email text box
|password1|password2|password3|
|234567878|wertyujk|tsdgxghj
|3456789990|awsdfghjkl|qwertyuio|
|23456756789|sdfghjkkl|qwertyuiolk|
|qwertuyui|qwertyui|aasdfghjkl|
|wertyuiop|dfghjkl;|cvbnmdfghj|

And To create new password using new password text box
Then To close the Chrome browser

