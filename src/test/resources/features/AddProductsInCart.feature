Feature: Kitap Yurdu Add Products in Cart

  @wip
  Scenario: Add some product to the cart and then verify them
    Given The user is on the main page
    When The user navigate to the "Çocuk Kitapları" and click
    Then The user viewed that "Çocuk Kitapları" page loaded
    Then Hover the first product and click add to cart button
    And Hover the second product and click add to cart button
    Then Hover the cart and click 'Sepete Git' button
    Then Verify their prices, quantity and total price





