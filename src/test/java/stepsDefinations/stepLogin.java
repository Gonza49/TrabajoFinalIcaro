package stepsDefinations;

import framework.DriverManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import pages.login;

public class stepLogin {

    private WebDriver driver = DriverManager.getDriver();
    private String baseUrl = DriverManager.confing.getProperty("url");
    private login ingreso =  new login(driver);

    @Given("el usuario esta en el Home")
    public void el_usuario_esta_en_el_home() {
        driver.get(baseUrl);
    }
    @When("el usuario Se dirige a My account")
    public void el_usuario_se_dirige_a_my_account() {
        ingreso.clickMyAccount();
    }
    @When("el usuario hace click en login")
    public void el_usuario_hace_click_en_login() {
        ingreso.clickLoginlink();
    }

    @When("el usuario ingresa las siguente credenciales {string} y {string}")
    public void elUsuarioIngresaLasSiguenteCredencialesY(String email, String password) {
        ingreso.escribirEmail(email);
        ingreso.escribirPassowrd(password);
    }

    @When("hace click en login")
    public void hace_click_en_login() {
        ingreso.clickLogin();
    }
    @Then("deberia poder visualizar la palabra {string}")
    public void deberia_poder_visualizar_la_palabra(String string) {
        ingreso.validarTextMyAccount();
    }




}
