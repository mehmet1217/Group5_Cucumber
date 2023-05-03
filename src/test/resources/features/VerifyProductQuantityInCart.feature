
Feature: Verify Product Quantity In Cart

  @wip
  Scenario: Add any product to the cart and then verify product quantity in cart
    Given The user is on the main page
    When Kitap Yurdu Add Products in Cart
    Then Verify that home page is visible successfully
    Then Click 'View Product' for any product on home page
    Then Click understand button and verify this product
    Then Increase quantity to 4
    And Click 'Add to cart' button



























