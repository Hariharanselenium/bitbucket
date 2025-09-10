@SingleUserFulltest @Fulltest
Feature: SU_TC_09_Language_Selection

  @SU_TC_09_Language_Selection
  Scenario: TC_09 Verify Language selection for Single User
    Given User navigates to the Login Page for user "https://qa.learntastic.com/login"
    When User enters Username " johny20250902140849@thinktime.in" and clicks the continue button
    And User enters Password "Pass@1234" and clicks the login button
    Then User is redirected to the Dashboard page
    And User selects the language from the dropdown
    Then User is able to see the content in the selected language
