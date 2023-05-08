package com.kitapyurdu.step_definitions;

import com.kitapyurdu.pages.UyeolPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register_StepDef {
    UyeolPage uyeolPage=new UyeolPage();


    @Given("The user is on the Website")
    public void the_user_is_on_the_website() {
     uyeolPage.understandBtn.click();
    }
    @When("The user click on the UyeolBtn")
    public void the_user_click_on_the_uyeol_btn() {
        uyeolPage.UyeolBtn.click();
        uyeolPage.understandBtn.click();
    }

    @Then("The user verfied Hesap Olustur")
    public void the_user_verfied_hesap_olustur() {
        uyeolPage.isDisplayedMtd();
    }
    @Then("The user fill {string} and {string} and {string} and {string} and {string}")
    public void the_user_fill_and_and_and_and(String usernameyusuf, String userlastnameYsf, String usernameEmailYsf, String userpasswordYsf, String userpassword2) {
        uyeolPage.register(usernameyusuf,userlastnameYsf,usernameEmailYsf,userpasswordYsf,userpassword2);
    }
    @And("The user verified Hesabiniz Olusturuldu!")
    public void theUserVerifiedHesabinizOlusturuldu() {

    }
}

