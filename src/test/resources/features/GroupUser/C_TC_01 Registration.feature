@GroupUserFulltest @Fulltest
Feature: C_TC_01_Register_with_valid_credentials

  @C_TC_01_Register_with_valid_credentials
  Scenario: TC_01 Validate new user registration process for Group User
    Given Groupuser navigates to the "https://qa.learntastic.com/register"
    Then Groupuser should be on the Register page
    
    When Groupuser enters the following details for group user:
      | Field            | Value                 |
      |------------------|-----------------------|
      | FirstName        | John1                 |
      | LastName         | Doe                   |
      | Email            | johndoe@thinktime.in  |
      | Password         | Pass@1234             |
      | Phone Number     | 121234567890          |
      | Invite code      | RASHM                 |
      | Agree to Terms   | Yes                   |
    
    When Groupuser clicks the signup button
    Then Groupuser should be logged in automatically
