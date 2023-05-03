package com.kitapyurdu.step_definitions;

import com.kitapyurdu.pages.AnyProductOnHomePage;
import com.kitapyurdu.pages.CartPage;
import com.kitapyurdu.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VerifyProductQuantityInCart {
    AnyProductOnHomePage anyProduct = new AnyProductOnHomePage();
    CartPage cartPage = new CartPage();
    @Then("Kitap Yurdu Add Products in Cart")
    public void kitap_yurdu_add_products_in_cart() {

    }

    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertEquals(anyProduct.anaSayfa.getText(), "Haftanın Yayınevi");
    }


    @Then("Click {string} for any product on home page")
    public void click_for_any_product_on_home_page(String string) {

        BrowserUtils.hover(anyProduct.ürünSec);
        anyProduct.ürünSec.click();
    }

    @Then("Click understand button and verify this product")
    public void click_understand_button_and_verify_this_product() {
        anyProduct.understandBtn.click();
        Assert.assertEquals(anyProduct.Roket1.getText(), "Kraliçeyi Kurtarmak");
    }

    @Then("Increase quantity to {int}")
    public void increase_quantity_to(Integer int1) {
        int x = 0;
        for (x = 1; x <= 4; x++) {
            BrowserUtils.hover(anyProduct.sepeteEkle);
            anyProduct.sepeteEkle.click();
        }
    }

    @Then("Click {string} button")
    public void click_button(String string) {
        BrowserUtils.hover(anyProduct.sepetim);
        anyProduct.sepetim.click();
        anyProduct.sepeteGit.click();
        Assert.assertEquals(cartPage.quantity.getText(), "4");
    }


    /*
   #public class  extends TestBase {
#    @Test
#    public void verifyProductQuantityInCart() {
#        extentLogger = report.createTest("Kitap Yurdu Add Products in Cart");
#
#
#
#        extentLogger.info("Verify that home page is visible successfully");
#        Assert.assertEquals(anyProduct.anaSayfa.getText(),"Haftanın Yayınevi");
#
#        extentLogger.info("Click 'View Product' for any product on home page");
#        BrowserUtils.hover(anyProduct.ürünSec);
#        anyProduct.ürünSec.click();
#
#
#        extentLogger.info("Click understand button");
#        anyProduct.understandBtn.click();
#        Assert.assertEquals(anyProduct.Roket1.getText(), "Kraliçeyi Kurtarmak");
#
#        extentLogger.info("Increase quantity to 4");
#        int x = 0;
#        for (x = 1; x <= 4; x++) {
#            BrowserUtils.hover(anyProduct.sepeteEkle);
#            anyProduct.sepeteEkle.click();
#        }
#        extentLogger.info("Click 'Add to cart' button");
#        BrowserUtils.hover(anyProduct.sepetim);
#        anyProduct.sepetim.click();
#        anyProduct.sepeteGit.click();
#        Assert.assertEquals(cartPage.quantity.getText(),"4");
     */
}
