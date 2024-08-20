package pages;

import framework.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login extends PageBase {
    //atributo de clase
    private By botonMyAccount = By.xpath("//span[normalize-space()='My Account']");
    private By linkLogin = By.xpath("//li[normalize-space()='Login']");
    private By email = By.xpath("//input[@name='email']");
    private By password = By.xpath("//input[@name='password']");
    private By botonLogin = By.cssSelector("input[value='Login']");
    private By textMyAccount = By.xpath("//h2[normalize-space()='My Account']");

    //Contructor
    public login(WebDriver driver) {
        super(driver);
    }

    //#1
    public void clickMyAccount() {
        hacerClick(botonMyAccount);
    }

    //#2
    public void clickLoginlink() {
        hacerClick(linkLogin);
    }

    //#3
    public void escribirEmail(String text) {
        escribirElemento(email, text);
    }

    //#4
    public void escribirPassowrd(String text) {
        escribirElemento(password, text);
    }

    //#5
    public void clickLogin() {
        hacerClick(botonLogin);
    }

    //#6
    public boolean validarTextMyAccount() {
    return validarElementoVisible(textMyAccount);
    }

        //metodo login exitoso
        public void loginExitoso () {
            clickMyAccount();
            clickLoginlink();
            escribirEmail("prueba1233@example.com");
            escribirPassowrd("123456789s");
            clickLogin();
        }

    }