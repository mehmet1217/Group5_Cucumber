package com.kitapyurdu.step_definitions;

import com.kitapyurdu.pages.AccountPage;
import com.kitapyurdu.pages.LoginPage;
import com.kitapyurdu.utilities.BrowserUtils;
import com.kitapyurdu.utilities.ConfigurationReader;
import com.kitapyurdu.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitons {
    LoginPage loginPage = new LoginPage();
    AccountPage accountPage = new AccountPage();

    @Given("Ich bin auf der Loginpage")
    public void ich_bin_auf_der_loginpage() {
        loginPage.getLoginPage();
    }

    @When("ich gebe eine gültige {string} ein")
    public void ich_gebe_eine_gültige_ein(String email) {
        loginPage.emailInput.sendKeys(email);

    }

    @When("ein gültiges {string}")
    public void ein_gültiges(String password) {
        loginPage.passwordInput.sendKeys(password);

    }

    @When("ich klicke auf Giris Yap button")
    public void ich_klicke_auf_giris_yap_button() {
        loginPage.girisYapSubmit.click();
    }

    @Then("Ich habe mich erfolgreich in die Webseite eingelogt")
    public void ich_habe_mich_erfolgreich_in_die_webseite_eingelogt() {
        accountPage.verifyLogin();
    }

    @When("ich gebe eine ungültige {string} und {string} ein")
    public void ich_gebe_eine_ungültige_und_ein(String email, String password) {
       loginPage.login(email,password);
    }
    @Then("Ich bekomme eine Fehlermeldung als {string}")
    public void ich_bekomme_eine_fehlermeldung_als(String message) {
        loginPage.verifyNOTLogin(message);
    }

    @When("Ich klicke Cikis button")
    public void ich_klicke_cikis_button() {
        BrowserUtils.hover(accountPage.account);
        accountPage.cikis.click();
    }
    @Then("Ich bin auf der Hompage")
    public void ich_bin_auf_der_hompage() {
        Assert.assertEquals("https://www.kitapyurdu.com/index.php?route=common/home",Driver.get().getCurrentUrl());
    }
}
