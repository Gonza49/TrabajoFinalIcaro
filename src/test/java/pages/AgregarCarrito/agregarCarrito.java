package pages.AgregarCarrito;

import framework.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Login.login;

import java.time.Duration;

public class agregarCarrito extends PageBase {

    private login iniciando;

    //Atributo de clase
    private By linkTablets = By.xpath("//a[normalize-space()='Tablets']");
    private By productoVisible = By.xpath("//div[@class='product-thumb']");
    private By botonAddToCard = By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]");
    private By botonShoppingCart = By.xpath("//span[normalize-space()='Shopping Cart']");
    private By nombreProductoAñadido = By.xpath("//table[@class='table table-bordered']//thead//tr");

    //Contructor
    public agregarCarrito(WebDriver driver){
        super(driver);
        this.iniciando = new login(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    //Metodo de login traido de #login
    public void login(){
        iniciando.loginExitoso();
    }

    //#1
    public void clickTablets(){
        hacerClick(linkTablets);
    }

    //#2
    public boolean validarProducto(){
        return validarElementoVisible(productoVisible);
    }

    //#3
    public void clickAddToCArd(){
        hacerClick(botonAddToCard);
    }

    //#4
    public void clickShoppingCart(){
        hacerClick(botonShoppingCart);
    }

    //#5
    public boolean validarProductoAñadido(){
        return validarElementoVisible(nombreProductoAñadido);
    }


}
