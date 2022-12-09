Feature: Login
Scenario: Successfull Login with Valid Credentails
Given Launch Chrome browser
When User opens URL "https://xlogist.pisystindia.com/admin/login"
And User enters Emails as "admin@gmail.com" and password as "Charlie123" and click on Login
Then page title should be "Locations"
And click in the locations with the name "Country"
When user click on the button "Add Country" and enter as "India"
And click on the button "Add"
When User wants to click on "Main Admin"
Then finaly click on "Logout"
And close browser.
