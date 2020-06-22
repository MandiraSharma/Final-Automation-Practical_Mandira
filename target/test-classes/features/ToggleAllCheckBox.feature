Feature: Validation
Scenario: Validate when the toggle all check box is CHECKED, all check boxes for list items are also CHECKED ON.
Given User is already in techfios test page
When User click on toggle all check box
Then all check boxes for list items are also CHECKED ON
Then close the browser