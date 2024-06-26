Feature: CheckOut

  @Successful-Checkout
  Scenario: Checkout successfull
    Given User login with valid username and password
    And User add two item to the chart
    When User proceed checkout
    And User input firstname"Yusgar"
    And User input lastname "Risaldi"
    And User input post code "ABC123"
    And User click Continue dan finish
    Then user able to see thankyou massage "Thank you for your order!"

    @Unsuccessful-Checkout
  Scenario: Checkout unsuccessfull cause user not fill first name input
    Given User login with valid username and password
    And User add two item to the chart
    When User proceed checkout
    And User not input firstname""
    And User input lastname "Risaldi"
    And User input post code "ABC123"
    And User click Continue
    Then user able to see error massage "Error: First Name is required"

      @Boundary-Checkout
    Scenario: Checkout all item
      Given User login with valid username and password
      And User add all item to the chart
      When User proceed checkout
      And User input firstname"Yusgar"
      And User input lastname "Risaldi"
      And User input post code "ABC123"
      And User click Continue dan finish
      Then user able to see thankyou massage "Thank you for your order!"


