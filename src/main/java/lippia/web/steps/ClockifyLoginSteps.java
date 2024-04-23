package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lippia.web.services.ClockifyLoginService;

public class ClockifyLoginSteps extends PageSteps {

    @Given("^que ingreso a la pagina de inicio$")
    public void home() {
        ClockifyLoginService.navegarWeb();
    }

    @When("^Ingreso de forma manual con email (.*) y contrasena (.*)$")
    public void Ingreso_de_email(String email, String pswd) {
        ClockifyLoginService.IngresarPaginaIniciarSesion();
        ClockifyLoginService.IngresarSeccionIngresoManual();
        ClockifyLoginService.IngresarEmail(email);
        ClockifyLoginService.IngresarContrasena(pswd);
        ClockifyLoginService.PrecionarBotonIngresoFormaManual();
    }

}
