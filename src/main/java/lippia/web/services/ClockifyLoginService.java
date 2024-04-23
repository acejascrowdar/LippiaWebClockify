package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.ClockifyLoginConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class ClockifyLoginService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void IngresarPaginaIniciarSesion(){
        click(ClockifyLoginConstants.BTN_INICIAR_SESION);
    }

    public static void IngresarEmail(String email) {
        setInput(ClockifyLoginConstants.INPUT_EMAIL_FORMA_MANUAL, email);
    }

    public static void IngresarSeccionIngresoManual() {
        click(ClockifyLoginConstants.BTN_INICIAR_SESION_MANUALMENTE_PARA_INGRESAR_AL_FORMULARIO);
    }

    public static void IngresarContrasena(String pswd) {
        setInput(ClockifyLoginConstants.INPUT_CONTRASENA_FORMA_MANUAL, pswd);
    }

    public static void PrecionarBotonIngresoFormaManual() {
        click(ClockifyLoginConstants.BTN_INICIAR_SECION_MANUALMENTE_PARA_ENVIAR_FORMULARIO);
    }

}
