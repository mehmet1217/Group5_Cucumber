package com.kitapyurdu.pages;


import com.kitapyurdu.utilities.BrowserUtils;
import com.kitapyurdu.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[.='Kabul Et']")
    public WebElement understandBtn;
    @FindBy(css = "[class='common-sprite button-search']")
    public WebElement searchBtn;
    @FindBy(id = "search-input")
    public WebElement searchInput;
    @FindBy(id = "js-cart")
    public WebElement sepeteGitBtn;
    @FindBy(id="cart-items")
    public WebElement cart;
    @FindBy(css = "[class='mn-icon icon-arrowRight']")
    public WebElement tumKitaplarBtn;
    @FindBy(xpath = "(//span[.='Tüm Kitaplar'])[1]")
    public WebElement tumKitaplarHover;
    @FindBy(xpath = "//a[.='Giriş Yap']")
    public WebElement girisYap;
    @FindBy(css = "[class='common-sprite allCategories']")
    public WebElement tumKategorilerBtn;
    @FindBy(xpath = "//*[.='Yazarlar']")
    public WebElement yazarlarBtn;

    public void getLoginPage(){
        understandBtn.click();
        BrowserUtils.hover(girisYap);
        girisYap.click();
    }



}
