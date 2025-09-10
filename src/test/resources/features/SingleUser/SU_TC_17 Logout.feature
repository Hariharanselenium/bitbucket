@SingleUserFulltest @Fulltest
Feature: SU_TC_17_Logout

  @SU_TC_17_Logout
  Scenario: TC_17 Validate Single user logout
    Given User navigates to the Login Page for user "https://qa.learntastic.com/login"
    When User enters Username "johny20250902140849@thinktime.in" and clicks the continue button
    And User enters Password "Pass@1234" and clicks the login button
    Then User is redirected to the Dashboard page
    When User clicks on the profile
    And User able to see the dropdown
    When User clicks on the logout in dropdown
    Then User navigates to the homepage
