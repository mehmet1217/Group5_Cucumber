package com.kitapyurdu.step_definitions;

import com.kitapyurdu.pages.CartPage;
import com.kitapyurdu.pages.CocukKitaplari;
import com.kitapyurdu.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AddProductsInCart_StepDef {
    CocukKitaplari cocukKitaplari=new CocukKitaplari();
    CartPage cartPage=new CartPage();


    @Then("Hover the first product and click add to cart button")
    public void hover_the_first_product_and_click_add_to_cart_button() {
        BrowserUtils.hover(cocukKitaplari.cocukKitaplari);
        cocukKitaplari.cocukKitaplari.click();
        BrowserUtils.hover(cocukKitaplari.firstBook);
        cocukKitaplari.firstBook.click();
    }

    @Then("Hover the second product and click add to cart button")
    public void hover_the_second_product_and_click_add_to_cart_button() {
        BrowserUtils.hover(cocukKitaplari.secondBook);
        cocukKitaplari.secondBook.click();
    }

    @Then("Hover the cart and click {string} button")
    public void hover_the_cart_and_click_button(String string) throws InterruptedException {
        BrowserUtils.hover(cocukKitaplari.sepetim);
        cocukKitaplari.sepetim.click();

        Thread.sleep(3000);
    }

    @Then("Verify their prices, quantity and total price")
    public void verify_their_prices_quantity_and_total_price() {
        BrowserUtils.hover(cocukKitaplari.sepeteGitBtn);
        cocukKitaplari.sepeteGitBtn.click();


        Assert.assertEquals(cartPage.ÜrünSayisi.getText(), "2");
        Assert.assertEquals(cartPage.totalFiyat.getText(), "44,69");
    }

}
