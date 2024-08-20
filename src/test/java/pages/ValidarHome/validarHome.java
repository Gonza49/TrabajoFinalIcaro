package pages.ValidarHome;

import framework.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class validarHome extends PageBase {
    //Atributo de clase
    private By logoImgHome = By.xpath("//a[normalize-space()='Your Store']");

    //contructor
    public validarHome(WebDriver driver){
        super(driver);
    }


    //1
    public boolean validandoImg(){
        return fildElement(logoImgHome).isDisplayed();
    }


}
