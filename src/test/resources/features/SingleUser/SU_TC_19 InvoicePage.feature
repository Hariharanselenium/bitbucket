@SingleUserFulltest @Fulltest
Feature: SU_TC_19_Invoice_Page

  @SU_TC_19_Invoice_Page
  Scenario: TC_19 Validate Invoice for Single user 
    Given User navigates to the Login Page for user "https://qa.learntastic.com/login"
    When User enters Username "johny20250902140849@thinktime.in" and clicks the continue button
    And User enters Password "Pass@1234" and clicks the login button
    Then User is redirected to the Dashboard page
    When User clicks on the profile
    And User able to see the dropdown
    When User clicks on the invoice in dropdown
    Then User navigates to the invoice page
     And User enters the coursename "Healthcare, First Aid & Bloodborne Pathogens Combo" in the search bar
    
    And User clicks the search button
    Then User should see the course with the related name
    When User clicks on the ViewInvoice under Action
    Then User able to see the Invoice popup displayed
    When User clicks on the Download PDF button
    Then User clicks on the close button