package pages;

import framework.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class crearCuenta extends PageBase {

    //Atributo de clase
    private By botonMyAccount = By.xpath("//span[normalize-space()='My Account']");
    private By linkRegister = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(text(),'Register')]");
    private By firstName = By.xpath("//input[@name='firstname']");
    private By lastName = By.xpath("//input[@name='lastname']");
    private By email = By.xpath("//input[@name='email']");
    private By telephone = By.xpath("//input[@name='telephone']");
    private By password = By.xpath("//input[@name='password']");
    private By passwordConfin = By.xpath("//input[@name='confirm']");
    private By radioBotonYes = By.xpath("//label[normalize-space()='Yes']");
    private By botonPrivacyPolicy = By.xpath("//input[@name='agree']");
    private By botonContinue = By.xpath("//input[@value='Continue']");
    private By textWelcome = By.xpath("//p[contains(text(),'Congratulations! Your new account has been success')]");

    //contructor
    public crearCuenta(WebDriver driver){
    super(driver);
    }

    //1
    public void clickMyAccount(){
        hacerClick(botonMyAccount);
    }
    //2
    public void  clickRegister(){
        hacerClick(linkRegister);
    }

    //3
    public void texFirstName(String nombre){
        escribirElemento(firstName,nombre);
    }
    //4
    public void textLastName(String apellido){
        escribirElemento(lastName,apellido);
    }
    //5
    public void textEmail(String correo){
        escribirElemento(email,correo);
    }
    //6
    public void numberPhone(String telefono){
        escribirElemento(telephone,telefono);
    }
    //7
    public void textpassword(String contrasena){
        escribirElemento(password,contrasena);
    }
    //8
    public void retryPassword(String contrasenaR){
        escribirElemento(passwordConfin,contrasenaR);
    }
    //9
    public void botonRadioclick(){
        hacerClick(radioBotonYes);
    }
    //10
    public void clickPoliticasPrivadas(){
        hacerClick(botonPrivacyPolicy);
    }

    //11
    public void clickBotonContinue(){
        hacerClick(botonContinue);
    }

    //12
    public boolean validarTextoBienvenida(){
        return validarElementoVisible(textWelcome);
    }
}
