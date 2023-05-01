package com.kitapyurdu.pages;


import com.kitapyurdu.utilities.ConfigurationReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AccountPage extends BasePage{
    LoginPage loginPage;

    @FindBy(xpath = "//b[text()='Adler Free']")
    public WebElement merhabaKullanici;

    @FindBy(xpath = "//a[@class='common-sprite']")
    public WebElement account;

    @FindBy(xpath = "//a[text()='Çıkış']")
    public WebElement cikis;


    public void verifyLogin(){
        Assert.assertEquals(merhabaKullanici.getText(), ConfigurationReader.get("userForAndLastNameMHMT"));
    }

}
