package stepsDefinations;

import framework.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.crearCuenta;

public class stepCrearCuenta {

    WebDriver driver = DriverManager.getDriver();
    String url = DriverManager.confing.getProperty("url");
    crearCuenta usuario = new crearCuenta(driver);


    @Given("el usuario está en la página de inicio de OpenCart")
    public void el_usuario_está_en_la_página_de_inicio_de_open_cart() {
        driver.get(url);
    }
    @When("el usuario hace click en a My Account")
    public void elUsuarioHaceClickEnAMyAccount() {
        usuario.clickMyAccount();
    }
    @When("el usuario selecciona Register")
    public void el_usuario_selecciona_Register() {
        usuario.clickRegister();

    }
    @When("el usuario completa el formulario con los siguientes datos {string}, {string}, {string} , {string} ,{string} ,{string}")
    public void elUsuarioCompletaElFormularioConLosSiguientesDatos(String nombre, String apellido, String email, String telefono, String contrasena, String reContrasena) {
        usuario.texFirstName(nombre);
        usuario.textLastName(apellido);
        usuario.textEmail(email);
        usuario.numberPhone(telefono);
        usuario.textpassword(contrasena);
        usuario.retryPassword(reContrasena);
    }
    @When("el usuario selecciona Subscribe")
    public void el_usuario_selecciona_Subscribe() {
        usuario.botonRadioclick();

    }
    @When("el usuario acepta los términos y condiciones")
    public void el_usuario_acepta_los_términos_y_condiciones() {
        usuario.clickPoliticasPrivadas();
    }
    @When("el usuario hace clic en Continue")
    public void el_usuario_hace_clic_en_Continue() {
        usuario.clickBotonContinue();
    }
    @Then("Deberia visualizarse el siguente mensaje Congratulations! Your new account has been successfully created!")
    public void deberiaVisualizarseElSiguenteMensajeCongratulationsYourNewAccountHasBeenSuccessfullyCreated() {
        usuario.validarTextoBienvenida();
    }

}
