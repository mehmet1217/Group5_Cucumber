Feature: CategoriPage

  @categorie
  Scenario: As a user view all categories page
    Given The user is on the main page
    When The user navigate to "all categories" and click
    Then The user viewed that ‘all categories' page loaded
    Then The user click on ‘Computer' (’Bilgisayar') category
    Then The user viewed that ‘Computer' (’Bilgisayar') page loaded