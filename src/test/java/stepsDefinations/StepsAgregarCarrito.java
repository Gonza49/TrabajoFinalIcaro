package stepsDefinations;

import framework.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AgregarCarrito.agregarCarrito;

public class StepsAgregarCarrito {
    private WebDriver driver = DriverManager.getDriver();
    private String baseUrl = DriverManager.confing.getProperty("url");
    private agregarCarrito carrito = new agregarCarrito(driver);

    @Given("que el usuario está previamente logeado")
    public void que_el_usuario_está_previamente_logeado() {
        driver.get(baseUrl);
        carrito.login();
    }
    @When("el usuario hace click en Tablets")
    public void el_usuario_hace_click_en_tablets() {
        carrito.clickTablets();
    }
    @Then("deberia poder visualizar productos")
    public void deberia_poder_visualizar_productos() {
        carrito.validarProducto();
    }

    @When("hace click en el botón que se encuentra abajo con el icono de carrito")
    public void hace_click_en_el_botón_que_se_encuentra_abajo_con_el_icono_de_carrito() {
        carrito.clickAddToCArd();

    }

    @When("el usuario hace click en ShoppingCard")
    public void el_usuario_hace_click_en_shopping_card() {
        carrito.clickShoppingCart();
    }
    @Then("deberia visualizar el producto previamente añadido")
    public void deberia_visualizar_el_producto_previamente_añadido() {
        carrito.validarProductoAñadido();
    }




}
