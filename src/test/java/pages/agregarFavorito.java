package pages;

import framework.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class agregarFavorito extends PageBase {

    protected login iniciando;

    //atributos de clase
    private By botonCameras = By.xpath("//li[7]//a[1]");
    private By textCanonEoS5D = By.xpath("//a[normalize-space()='Canon EOS 5D']");
    private By botonLike = By.xpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/button[2]");
    private By botonWishList = By.xpath("//span[normalize-space()='Wish List (1)']");
    private By validarElemento = By.xpath("//table[@class='table table-bordered table-hover']");


    //Contructor
    public agregarFavorito(WebDriver driver){
        super(driver);
        this.iniciando = new login(driver);
    }

    //Metodo de login traido de #login
    public void login(){
        iniciando.loginExitoso();
    }

    //1
    public void clickCameras(){
        hacerClick(botonCameras);
    }
    //2
    public boolean validandoText(){
        return validarElementoVisible(textCanonEoS5D);
    }
    //3
    public void clickLike(){
        hacerClick(botonLike);
    }
    //4
    public void clickWishList(){
        hacerClick(botonWishList);
    }
    //5
    public boolean validandoElemento(){
        return validarElementoVisible(validarElemento);
    }




}
