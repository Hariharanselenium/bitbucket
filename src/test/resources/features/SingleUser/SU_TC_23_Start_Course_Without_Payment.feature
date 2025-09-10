@SingleUserFulltest @Fulltest
Feature: SU_TC_23_Start Course Without Payment

  @SU_TC_23_Start_Course_Without_Payment
  Scenario: TC_23 Validate Single user Start Course Without Payment
    Given User navigates to the Login Page for user "https://qa.learntastic.com/login"
    When User enters Username "johny20250902140849@thinktime.in" and clicks the continue button
    And User enters Password "Pass@1234" and clicks the login button
    Then User is redirected to the Dashboard page
    Given User Clicks on the view detail
    And User navigated to the detail page
    Then User not able to view the start course button
    