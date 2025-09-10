@SingleUserFulltest @Fulltest
Feature: SU_TC_06_Login_via_Email

  @SU_TC_06_Login_via_Email
  Scenario: TC_06 Validate Single user login
    Given User navigates to the Login Page for user "https://qa.learntastic.com/login"
    When User enters Username "johny20250902140849@thinktime.in" and clicks the continue button
    And User enters Password "Pass@1234" and clicks the login button
    Then User is redirected to the Dashboard page
