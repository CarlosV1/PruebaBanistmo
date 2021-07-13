package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Prueba1Step {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }



    @Given("^Que el usuario accede hasta la web$")
    public void QueElUsuarioAccedeHastaLaWeb() {
        theActorCalled("usuario").attemptsTo(Open.url("https://www.grupobancolombia.com/wps/portal/empresas"));
    }

    @When("^Ingrese a empresas seleccionar capital inteligente$")
    public void IngreseaEmpresasSeleccionarCapitalInteligente() {
        theActorCalled("usuario").attemptsTo(Open.url("https://www.grupobancolombia.com/wps/portal/empresas/capital-inteligente?_ga=2.127177102.20346997.1614701551-675894819.1614701551"));

    }

    @Then("^Ingresa a actualidad economica y descarga PDF$")
    public void IngresaaActualidadEconomicayDescargaPDF() {
        theActorCalled("usuario").attemptsTo(Open.url("https://www.grupobancolombia.com/wps/portal/empresas/capital-inteligente/actualidad-economica-sectorial?categoria=Actualidad%20economica%20y%20sectorial"));

    }



}

