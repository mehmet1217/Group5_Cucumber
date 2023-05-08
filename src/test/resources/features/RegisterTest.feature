@Register

Feature: Kitap Yurdu Register


  Scenario: Positive secenario user should be able to Register
    Given The user is on the Website
    When  The user click on the UyeolBtn
    Then  The user verfied Hesap Olustur
    Then  The user fill "Jon" and "Snow" and "jon0406snow@gmail.com" and "jonsnow0406" and "jonsnow0406"
    And  The user verified Hesabiniz Olusturuldu!
