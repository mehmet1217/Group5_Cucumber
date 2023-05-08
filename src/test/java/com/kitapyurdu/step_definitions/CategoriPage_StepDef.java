package com.kitapyurdu.step_definitions;

import com.kitapyurdu.pages.AllCategoriesUndAuthorsPage;
import com.kitapyurdu.pages.SeachPage;
import com.kitapyurdu.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CategoriPage_StepDef {

    SeachPage seach = new SeachPage();
    AllCategoriesUndAuthorsPage categorie = new AllCategoriesUndAuthorsPage();

    @When("The user navigate to {string} and click")
    public void the_user_navigate_to_and_click(String string) {
        BrowserUtils.hover(seach.tumKategorilerBtn);
        seach.tumKategorilerBtn.click();
    }

    @Then("The user viewed that ‘all categories' page loaded")
    public void the_user_viewed_that_all_categories_page_loaded() throws InterruptedException {
        Assert.assertEquals(categorie.tumKategorilerPage.getText(), "Kitap Kategorileri");
        Thread.sleep(1500);
    }

    @Then("The user click on ‘Computer' \\(’Bilgisayar') category")
    public void the_user_click_on_computer_bilgisayar_category() {
        BrowserUtils.hover(categorie.bilgisayarBtn);
        categorie.bilgisayarBtn.click();
    }

    @Then("The user viewed that ‘Computer' \\(’Bilgisayar') page loaded")
    public void the_user_viewed_that_computer_bilgisayar_page_loaded() throws InterruptedException {
        Assert.assertEquals(categorie.bilgisayarPage.getText(), "Bilgisayar");
        Thread.sleep(3000);
    }

}
