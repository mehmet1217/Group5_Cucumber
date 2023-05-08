package com.kitapyurdu.pages;


import com.kitapyurdu.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UyeolPage extends BasePage {


    @FindBy(xpath = "//a[text()='Üye Ol']")
    public WebElement UyeolBtn;
    @FindBy(xpath = "//*[.='Kabul Et']")
    public WebElement understandBtn;

  @FindBy(xpath = "//h3[.='Hesap Oluştur']")
    public WebElement HesapOlustur;

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

    @FindBy(xpath = "//label[@for='agree']")
    public WebElement KisiselVerilerCheckBox;

    @FindBy(css = "(//div[@class='ky-checkbox-input'])[2]")
    public WebElement elektronikiletiCheckBox;

    @FindBy(xpath = "//button[text()='Üye Ol']")
    public WebElement UyeOlBtn2;
    @FindBy(id = "jBox-overlay")
    public WebElement warningMessage;

   @FindBy(className = "[class='ky-error']")
   public WebElement existingMailAdress;

//    @FindBy(id = "jBox-overlay")
//    public WebElement warningMessage;

//
//    @FindBy(xpath = "//h1[text()='Hesabınız Oluşturuldu!']")
//    public WebElement HesabınızOluşturuldu;
//    @FindBy(xpath = "//a[text()='Anasayfaya Git']")
//    public WebElement AnasayfayaGitBtn;

    public void isDisplayedMtd(){
        Assert.assertTrue(HesapOlustur.isDisplayed());
    }

    public void register(String usernameyusuf, String userlastnameYsf, String usernameEmailYsf, String userpasswordYsf, String userpassword2) {

        AdBox.sendKeys(usernameyusuf);
        SoyadBox.sendKeys(userlastnameYsf);
        EpostaBox.sendKeys(usernameEmailYsf);
        SifreBox.sendKeys(userpasswordYsf);
        SifreTekrariBox.sendKeys(userpassword2);
        KisiselVerilerCheckBox.click();
        BrowserUtils.waitFor(5);
        warningMessage.click();
        elektronikiletiCheckBox.click();
        UyeOlBtn2.click();
        existingMailAdress.isDisplayed();
    }
}
