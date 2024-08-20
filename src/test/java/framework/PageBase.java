package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public PageBase(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(5));
    }

    //Encuentra un elemento web en la página utilizando una espera explícitamente
    public WebElement fildElement(By locator){
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    //Encuentra un elemento y escribe texto sobre el mismo
    public void escribirElemento(By locator,String text){
        fildElement(locator).sendKeys(text);
    }

    //Encuentra un elemento y hace click sobre el
    public void hacerClick(By locator){
        fildElement(locator).click();
    }

    //Devuelve true , si un elemento es visible
    public boolean validarElementoVisible(By locator){
        return fildElement(locator).isDisplayed();
    }




}

