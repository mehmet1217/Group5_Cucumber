Feature: Login auf Kitapyurdu-Webseite


  Scenario: Erfolgreicher Login als Benutzer mit correct email und password
    Given Ich bin auf der Loginpage
    When ich gebe eine gültige "doorfree17@gmail.com" ein
    And ein gültiges "Tdoor.17"
    And ich klicke auf Giris Yap button
    Then Ich habe mich erfolgreich in die Webseite eingelogt


  Scenario Outline: Fehlerhafter Login als Benutzer mit uncorrect mail und password
    Given Ich bin auf der Loginpage
    When ich gebe eine ungültige "<mail>" und "<password>" ein
    Then Ich bekomme eine Fehlermeldung als '<message>'
    Examples:
      | mail                 | password | message                               |
      | doorfree17@gmail.co  | Tdoor.17 | E-Posta Adresi ya da şifreniz yanlış. |
      | doorfree18@gmail.com | Tdoor.17 | E-Posta Adresi ya da şifreniz yanlış. |
      | doorfree18           | Tdoor.17 | E-Posta Adresi ya da şifreniz yanlış. |
      | doorfree17@gmail.com | Tdoor.18 | E-Posta Adresi ya da şifreniz yanlış. |

  @wip
  Scenario: Erfolgreicher Login als Benutzer mit correct email und password
    Given Ich bin auf der Loginpage
    When ich gebe eine gültige "doorfree17@gmail.com" ein
    And ein gültiges "Tdoor.17"
    And ich klicke auf Giris Yap button
    And Ich habe mich erfolgreich in die Webseite eingelogt
    And Ich klicke Cikis button
    Then Ich bin auf der Hompage


