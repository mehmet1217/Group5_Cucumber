package com.kitapyurdu.step_definitions;


import com.kitapyurdu.pages.UyeolPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Existing_StepDef {
    UyeolPage uyeolPage=new UyeolPage();

    @Given("As a user I am  on the Website")
    public void as_a_user_i_am_on_the_website() {
        uyeolPage.understandBtn.click();
    }
    @When("As a user I click on the UyeolBtn")
    public void as_a_user_i_click_on_the_uyeol_btn() {
        uyeolPage.UyeolBtn.click();
        uyeolPage.understandBtn.click();
    }
    @Then("As a user I verfied Hesap Olustur")
    public void as_a_user_i_verfied_hesap_olustur() {
        uyeolPage.isDisplayedMtd();
    }
    @Then("As a user I fill {string} and {string} and {string} and {string} and {string}")
    public void as_a_user_i_fill_and_and_and_and(String usernameyusuf, String userlastnameYsf, String usernameEmailYsf, String userpasswordYsf, String userpassword2) {
        uyeolPage.register(usernameyusuf,userlastnameYsf,usernameEmailYsf,userpasswordYsf,userpassword2);
    }

    @Then("As a user I should be see message")
    public void as_a_user_i_should_be_see_message(String expectedmessage) {
        Assert.assertEquals(expectedmessage,uyeolPage.existingMailAdress.getText());

    }
}
