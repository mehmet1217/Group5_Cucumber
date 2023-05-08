

Feature: Kitapyurdu Existing

@existing
  Scenario:The user should be not able to Register with existing credentials
    Given As a user I am  on the Website
    When  As a user I click on the UyeolBtn
    Then  As a user I verfied Hesap Olustur
    Then  As a user I fill "Yusuf" and "Karadas" and "ysfkrds.63@gmail.com" and "Mirsad.63" and "Mirsad.63"
    And   As a user I should be see message
