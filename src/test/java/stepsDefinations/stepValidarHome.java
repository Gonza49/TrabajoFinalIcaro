package stepsDefinations;

import framework.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.validarHome;

public class stepValidarHome {

    public WebDriver driver = DriverManager.getDriver();
    public String url = DriverManager.confing.getProperty("url");
    public validarHome home = new validarHome(driver);


    @Given("que el usuario esta en la pagina de inicio")
    public void que_el_usuario_esta_en_la_pagina_de_inicio() {
      driver.get(url);
    }
    @Then("debera poder visualizar el logotipo de la web")
    public void debera_poder_visualizar_el_logotipo_de_la_web() {
        home.validandoImg();
    }
}
