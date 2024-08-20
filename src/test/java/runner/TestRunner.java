package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", "json:target/cucumber-report/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml",
                "html:target/cucumber-reports/Cucumber.html"
        },
        monochrome = true,
        stepNotifications = true,
        publish = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/main/resources/features/OpenCard"},
        glue = {"stepsDefinations", "framework","pages"},
        tags = "@PruebaE2E" //estos son las diferentes prueba @PruebaE2E
        //la prueba E2E, si se ejecuta mas de 2 veces por que tire error  hay que editar
        //la parte de usuario , en crear cuenta
        //diferentes tipos de pruebas
        // @validarLogin , @ValidarHome , @nuevoUsuario , @AgregarFavorito , @agregarCarrito

)

public class TestRunner {
}
