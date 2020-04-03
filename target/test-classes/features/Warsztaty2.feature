Feature: Shopping in store

  Scenario Outline: Shopping and payment are done on the website
    Given User is on the store website
    When User is logged on website
    And User is searching product Humningbird Printed Sweater in input and click him
    And Chooses <size>
    And Enter the <quantity>
    And Add to cart and go to checkout
    And Gives the address
    And Select delivery method
    And Select payment method
    And Agree terms of service
    And Confirm order
    And Make a screenshot


    Examples:
      | size | quantity |
      | M    | 5        |