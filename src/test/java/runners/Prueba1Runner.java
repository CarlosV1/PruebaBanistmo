package runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/IngresoEmpresas.feature",
        glue = "{@EscenarioSinEjemplos}",
        tags = "steps"

)


public class Prueba1Runner {

}
