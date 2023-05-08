package com.kitapyurdu.pages;


import com.kitapyurdu.utilities.ConfigurationReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {

    @FindBy(id = "login-email")
    public WebElement emailInput;

    @FindBy(id = "login-password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement girisYapSubmit;

    @FindBy(xpath = "//div[@class='ky-error']")
    public WebElement errorMessage;

    public void login(){
        getLoginPage();
        emailInput.sendKeys(ConfigurationReader.get("usernameMHMT"));
        passwordInput.sendKeys(ConfigurationReader.get("passwordMHMT"));
        girisYapSubmit.click();
        understandBtn.click();
    }

    public void login(String username, String password){
        //getLoginPage();
        emailInput.sendKeys(username);
        passwordInput.sendKeys(password);
        girisYapSubmit.click();
//      understandBtn.click();
    }

    public void verifyNOTLogin(String message){
        Assert.assertTrue(errorMessage.getText().contains(message));
    }
}
