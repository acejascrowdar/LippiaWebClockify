package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Then;
import lippia.web.services.ClockifyCommonService;
import lippia.web.services.ClockifyTrackerService;

public class ClockifyCommonSteps extends PageSteps {

    @Then("ingresa a la pagina (.*) de clockify")
    public void ValidarIngresoALaPagina(String pagina) {

       switch(pagina) {
            case "tracker":
                ClockifyTrackerService.BotonAgregarTareaEstaPresente();
                break;
            default:
                ClockifyCommonService.ForzarFalloDadoMotivo("ingresa a la pagina (.*) de clockify: " + pagina + " no es una opcion valida.");
       }
    }

}
