package com.kitapyurdu.step_definitions;

import com.kitapyurdu.pages.SeachPage;
import com.kitapyurdu.utilities.BrowserUtils;
import com.kitapyurdu.utilities.ConfigurationReader;
import com.kitapyurdu.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class SearchProduct_StepDef {
    SeachPage seach = new SeachPage();

    @Given("The user is on the main page")
    public void the_user_is_on_the_main_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        seach.understandBtn.click();
    }

    @When("The user navigate to the {string} and click")
    public void the_user_navigate_to_the_and_click(String string) {
        BrowserUtils.hover(seach.tumKitaplarHover);
        seach.tumKitaplarBtn.click();
    }

    @Then("The user viewed that {string} page loaded")
    public void the_user_viewed_that_page_loaded(String string) {
        Assert.assertEquals("Kitap",seach.kitapMessage.getText());

    }

    @When("The user search {string} product in search input and click search button")
    public void the_user_search_product_in_search_input_and_click_search_button(String productName) {
        seach.searchInput.sendKeys(productName+ Keys.ENTER);
    }

    @Then("The user viewed that searched product is displayed")
    public void the_user_viewed_that_searched_product_is_displayed() {
        Assert.assertTrue(seach.assertKitap.getText().contains("JAVA"));

    }

    @Then("The user viewed that related searched products are displayed")
    public void the_user_viewed_that_related_searched_products_are_displayed() {
        Assert.assertEquals("Java için arama sonuçları",seach.assertTumSonuclar.getText());

    }

    @Then("The user viewed that searched product is NOT found displayed")
    public void the_user_viewed_that_searched_product_is_not_found_displayed() {
        Assert.assertTrue(seach.productNotFoundMessage.isDisplayed());

    }
}
