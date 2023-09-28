package runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import static Hook.Hook.notificaciones;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin =  "pretty",
        features = "src/test/resources/features",
        glue = "Operaciones.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class Runner {
    @AfterClass
    public static void finalizando(){
        notificaciones();
    }
}
