Feature: Search and place order

  @SeleniumTest1
  Scenario: Search for items and validate results
    Given User is on GreenCart landing page
    When User search for Cucumber vegetable
    Then "Cucumber" results are displayed

  @SeleniumTest2
  Scenario Outline: Search for items and then move to checkout page
    Given User is on GreenCart landing page
    When User search for <name> vegetable
    And Add items to cart
    And User processed to Checkout page for purchase
    Then verify selected <name> items are displayed
    Examples:
      | name     |
      | Brinjal  |
      | Beetroot |
