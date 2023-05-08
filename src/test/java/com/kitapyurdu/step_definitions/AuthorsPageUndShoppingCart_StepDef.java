package com.kitapyurdu.step_definitions;

import com.kitapyurdu.pages.AllCategoriesUndAuthorsPage;
import com.kitapyurdu.pages.SeachPage;
import com.kitapyurdu.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AuthorsPageUndShoppingCart_StepDef {
    AllCategoriesUndAuthorsPage categorie = new AllCategoriesUndAuthorsPage();
    SeachPage seach = new SeachPage();

    @When("The user navigate to the Yazarlar and click")
    public void the_user_navigate_to_the_yazarlar_and_click() {
        BrowserUtils.hover(seach.yazarlarBtn);
        seach.yazarlarBtn.click();
    }

    @Then("The user viewed that Yazarlar page loaded")
    public void the_user_viewed_that_yazarlar_page_loaded() throws InterruptedException {
        Assert.assertEquals(categorie.tumYazarlar.getText(), "Tüm Yazarlar ve Kitapları");
        Thread.sleep(1500);
    }

    @Then("The user navigate on any Author's name and click")
    public void the_user_navigate_on_any_author_s_name_and_click() throws InterruptedException {
        BrowserUtils.hover(categorie.booksImamGazali);
        categorie.booksImamGazali.click();
        Thread.sleep(1500);
    }

    @And("The user added the author's book to the Cart.")
    public void the_user_added_the_author_s_book_to_the_cart() throws InterruptedException {
        BrowserUtils.hover(categorie.bookKalplerinKesfi);
        categorie.bookKalplerinKesfi.click();

        BrowserUtils.hover(categorie.buttonCart);
        categorie.buttonCart.click();
        Thread.sleep(1500);
    }

}
