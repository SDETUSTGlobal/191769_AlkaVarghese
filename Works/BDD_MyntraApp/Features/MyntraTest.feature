Feature: Myntra search
  Scenario: Search for Matte Lipstick in Myntra
    Given  chrome is launched
    When user navigate to Myntra webpage
    And user enter product in search bar
    And user press the search icon
    And user successfully navigate to the product list page
    Then user added the item to cart