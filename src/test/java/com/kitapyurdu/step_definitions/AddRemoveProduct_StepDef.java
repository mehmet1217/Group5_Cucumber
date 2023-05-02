package com.kitapyurdu.step_definitions;

import com.kitapyurdu.pages.CartPage;
import com.kitapyurdu.pages.SeachPage;
import com.kitapyurdu.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AddRemoveProduct_StepDef {
    SeachPage seach = new SeachPage();
    CartPage cart = new CartPage();

    @Then("The user hovers the first product and click add to cart button")
    public void the_user_hovers_the_first_product_and_click_add_to_cart_button() {
        BrowserUtils.hover(seach.firstProduct);
        seach.firstProductAddCartBtn.click();
    }

    @Then("The user hovers the second product and click add to cart button")
    public void the_user_hovers_the_second_product_and_click_add_to_cart_button() {
        BrowserUtils.hover(seach.secondProduct);
        seach.secondProductAddCartBtn.click();
    }

    @Then("The user hovers the cart and click Sepete Git button")
    public void the_user_hovers_the_cart_and_click_button() {
        BrowserUtils.hover(seach.cart);
        seach.cart.click();
        seach.sepeteGitBtn.click();
    }

    @Then("The user verifies both products are added to Cart")
    public void the_user_verifies_both_products_are_added_to_cart() {
        BrowserUtils.verifyElementDisplayed(cart.atomikAliskanliklar);
        Assert.assertEquals("Gece Yarısı Kütüphanesi", cart.geceYarisiKutuphanesi.getText());
    }

    @Then("The user verifies total price")
    public void the_user_verifies_total_price() throws InterruptedException {
        Assert.assertEquals("123,36",cart.totalPrice.getText());
        Thread.sleep(1000);
    }

    @Then("The user removes the products from cart")
    public void the_user_removes_the_products_from_cart() throws InterruptedException {
        cart.removeProductBtn.click();
        Thread.sleep(1000);
        cart.removeProductBtn.click();
    }

    @Then("The user verifies all products removed from the cart")
    public void the_user_verifies_all_products_removed_from_the_cart() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals("0", cart.cart.getText());
    }


}
