package stepsDefinations;

import framework.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.agregarFavorito;

public class stepAgregarFavorito {
    WebDriver driver = DriverManager.getDriver();
    String url = DriverManager.confing.getProperty("url");
    agregarFavorito favorito = new agregarFavorito(driver);


    @Given("el usuario estás previamente logeado en su cuenta")
    public void el_usuario_estás_previamente_logeado_en_su_cuenta() {
        driver.get(url);
        favorito.login();

    }
    @When("el usuario hace click en Cameras en el menu superior")
    public void el_usuario_hace_click_en_en_el_menu_superior() {
        favorito.clickCameras();
    }
    @Then("Tendria que poder visualizar el producto Canon EOS 5D")
    public void tendria_que_poder_visualizar_el_producto() {
        favorito.validandoText();

    }
    @When("el usuario hace click en el corazón que se encuentra abajo del producto")
    public void el_usuario_hace_click_en_el_corazón_que_se_encuentra_abajo_del_producto() {
       favorito.clickLike();
    }

    @When("el usuario hace click en Wish List que se encuentra arriba de todo")
    public void el_usuario_hace_click_en_que_se_encuentra_arriba_de_todo() {
        favorito.clickWishList();

    }
    @Then("Tendria que visualizarse en la lista de favorito  Canon EOS 5D")
    public void tendria_que_visualizarse_en_la_lista_de_favorito_canon_eos_5d() {
        favorito.validandoElemento();
    }


}
