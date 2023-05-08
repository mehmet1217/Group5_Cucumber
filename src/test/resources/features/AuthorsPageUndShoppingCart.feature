Feature: AuthorsPageUndShoppingCart

  @authorspage
  Scenario: As a user view the books by Authors and add them to the cart
    Given The user is on the main page
    When The user navigate to the Yazarlar and click
    Then The user viewed that Yazarlar page loaded
    Then The user navigate on any Author's name and click
    And The user added the author's book to the Cart.



