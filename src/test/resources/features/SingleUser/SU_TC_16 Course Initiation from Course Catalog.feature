@SingleUserFulltest @Fulltest
Feature: SU_TC_16_Course_Initiation_from_store_purchase

  @SU_TC_16_Course_Initiation_from_store_purchase
  Scenario: TC_16 Course Initiation from store purchase for User
    Given User hits the "https://qa.learntastic.com/register"
    Then User is on the Register page
    When User enters the following details:
      | Field            | Value               |
      |------------------|---------------------|
      | FirstName        | Johny               |
      | LastName         | Doe                 |
      | Email            | johny@thinktime.in  |
      | Password         | Pass@1234           |
      | Phone Number     | 12345678912         |
    And User clicks the Register button
    Then User should land on the dashboard page and Professional Information page appears
    When User selects "Healthcare" from the Category dropdown
    And User selects "Physicians" from the sub Category dropdown
    And User taps on the save button
    Then The selected "Healthcare" category and sub Category "Physicians" should be displayed correctly for User
    When User searches the "Healthcare, First Aid & Bloodborne Pathogens Combo" course in the search bar
    And User adds the course to the cart
    And User taps on the Proceed To Checkout button
    And User enters the Discount code as null
    When User enters all the checkout details:
      | Field            | Value                    |
      |------------------|--------------------------|
      | CardNumber       | 4242 4242 4242 4242      |
      | ExpirationDate   | 12/27                     |
      | SecurityCode     | 123                       |
    And User selects the Country name as "India"
    And User taps on the Pay Now button
    Then User should see the Thank You message
    And User should be navigated to the Dashboard page
    When User clicks on Store Purchases in the dashboard
    And User clicks on the purchase toggle button
    Then User should be able to see the purchased course
    When User clicks on the Go to Learning button
    Then User is navigated to the Course section page
    And User clicks on the start button
    Then User should be able to see the course material in the new tab
