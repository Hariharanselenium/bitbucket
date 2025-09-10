@SingleUserFulltest @Fulltest
Feature: SU_TC_20_Certificate Download

  @SU_TC_20_Certificate_Download
  Scenario: TC_20 Validate Single user Certificate Download
    Given User navigates to the Login Page for user "https://qa.learntastic.com/login"
    When User enters Username "johny20250902140849@thinktime.in" and clicks the continue button
    And User enters Password "Pass@1234" and clicks the login button
    Then User is redirected to the Dashboard page
    When User clicks on the more options
    And User clicks on the clicks on download certificate
    Then User able to see the downloaded certificate
