Feature: Add Remove Product


  Scenario: Add some product to the cart and then remove them
    Given The user is on the main page
    When The user navigate to the "Tüm Kitaplar" and click
    Then The user viewed that "Tüm Kitaplar" page loaded
    Then The user hovers the first product and click add to cart button
    And The user hovers the second product and click add to cart button
    Then The user hovers the cart and click Sepete Git button
    Then The user verifies both products are added to Cart
    And The user verifies total price
    Then The user removes the products from cart
    And The user verifies all products removed from the cart
