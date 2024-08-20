package framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;
import java.util.Properties;

public class DriverManager {

    private static final ThreadLocal<WebDriver> driverThreadlocal = new ThreadLocal<>();
    public static Properties confing;


    static{
    confing = new Properties();
    try{
        confing.load(DriverManager.class.getClassLoader().getResourceAsStream("config.properties"));
    }catch(Exception e){
    throw new RuntimeException("Error al cargar configuracion ", e);
    }
    }


    public static WebDriver getDriver(){
        return driverThreadlocal.get();
    }


    public static void initializeDriver(){
        String browsers = confing.getProperty("browser","chrome").trim().toLowerCase();

        WebDriver driver;
        switch(browsers){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new  ChromeOptions();
                chromeOptions.addArguments("--ignore-certificate-errors");
                driver = new ChromeDriver(chromeOptions);
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--ignore-certificate-errors");
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--ignore-certificate-errors");
                driver = new EdgeDriver();
                break;
            default:
                throw new IllegalArgumentException("Invalido Chome " + browsers);
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driverThreadlocal.set(driver);
        System.out.println("El driver se inicio con " + browsers);
    }

public static void quitDriver(){
    WebDriver driver = driverThreadlocal.get();
        if(driver != null){
            driver.quit();
            driverThreadlocal.remove();
        }
}

}
