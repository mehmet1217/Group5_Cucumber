Feature: Search Test

  Background:
    Given The user is on the main page


  Scenario: Positive Search Test

    When The user navigate to the "Tüm Kitaplar" and click
    Then The user viewed that "Tüm Kitaplar" page loaded
    When  The user search "Java" product in search input and click search button
    Then The user viewed that searched product is displayed
    And The user viewed that related searched products are displayed

  Scenario: Negative Search Test

    When  The user search "casper nirvana" product in search input and click search button
    Then The user viewed that searched product is NOT found displayed




