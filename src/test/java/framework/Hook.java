package framework;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hook {

    private static WebDriver driver;
    private static Scenario currentScenario;



    @Before
    //inicia el Driver
    public void setup(Scenario scenario){
        try{
            DriverManager.initializeDriver();
            driver = DriverManager.getDriver();
            currentScenario = scenario;
        } catch (Exception e ){
            System.err.println("Error al inicializar el WebDriver" + e.getMessage());
        }

    }

    @After
    //cierra el driver , en caso de fallar saca una captura
    public void tearDown(Scenario scenario){
        takeScreenshot(scenario.isFailed());
        if(DriverManager.getDriver() != null){
            try{
                DriverManager.quitDriver();
            }catch (Exception e ){
                System.err.println("Error al cerrar el driver " + e.getMessage());
            }
        }

    }



    //metodo de cucumber para sacar foto
    public static void takeScreenshot(boolean isfailet){
        try{
            TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
            byte[] screenShot = screenshotDriver.getScreenshotAs(OutputType.BYTES);
            if(isfailet){
                currentScenario.attach(screenShot,"image/png","Captura de pantalla en caso de fallo");
            }else{
                currentScenario.attach(screenShot,"image/png", "Caputa de pantalla exitosa");
            }
         }catch (Exception e){
            System.err.println("Error al tomar la captura de pantalla" + e.getMessage());
        }
    }

}
