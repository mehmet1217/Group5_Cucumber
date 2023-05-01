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

    @FindBy(css = "#register-name")
    public WebElement AdBox;

    @FindBy(css = "#register-lastname")
    public WebElement SoyadBox;

    @FindBy(css = "#register-email")
    public WebElement EpostaBox;

    @FindBy(css = "#register-password")
    public WebElement SifreBox;

    @FindBy(css = "#register-password-confirm")
    public WebElement SifreTekrariBox;

   /*   @FindBy(xpath = "//label[@for='agree']")
    public WebElement KisiselVerilerCheckBox;

    @FindBy(css = "[for='is_campaign_newsletter']")
    public WebElement elektronikiletiCheckBox;
*/
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement UyeOlBtn;

    @FindBy(xpath = "//h1[text()='Hesabınız Oluşturuldu!']")
    public WebElement HesabınızOluşturuldu;

    @FindBy(xpath = "//a[text()='Anasayfaya Git']")
    public WebElement AnasayfayaGitBtn;


    public void login1() {

        AdBox.sendKeys(ConfigurationReader.get("usernameyusuf"));
        SoyadBox.sendKeys(ConfigurationReader.get("userlastnameYsf"));
        EpostaBox.sendKeys(ConfigurationReader.get("usernameEmailYsf"));
        SifreBox.sendKeys(ConfigurationReader.get("userpasswordYsf"));
        SifreTekrariBox.sendKeys(ConfigurationReader.get("userpassword2Ysf"));
        UyeOlBtn.click();
    }


    public void login(){
        getLoginPage();
        emailInput.sendKeys(ConfigurationReader.get("usernameMHMT"));
        passwordInput.sendKeys(ConfigurationReader.get("passwordMHMT"));
        girisYapSubmit.click();
        understandBtn.click();
    }

    public void login(String username, String password){
        getLoginPage();
        emailInput.sendKeys(username);
        passwordInput.sendKeys(password);
        girisYapSubmit.click();
//      understandBtn.click();
    }

    public void verifyNOTLogin(){
        Assert.assertTrue(errorMessage.getText().contains("E-Posta Adresi ya da şifreniz yanlış."));
    }
}
