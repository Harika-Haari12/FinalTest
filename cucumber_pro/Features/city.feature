Feature: Add City
Scenario: Successfully logged in to the url
Given open chrome browser
When you open url with "https://products.pisystindia.com/Ecommerce/admin/"
And enter email as "admin@gmail.com" and password as "123456" click on login
Then the title contains as "Locations"
And click on "City"
When you click on "Add City"
Then you can enter city as "Hyderabad"
And user click on "Add"
