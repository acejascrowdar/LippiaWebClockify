package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.ClockifyTrackerConstants;
import org.testng.Assert;

public class ClockifyTrackerService extends ActionManager {

    public static void BotonAgregarTareaEstaPresente() {
        waitVisibility(ClockifyTrackerConstants.BTN_AGREGAR_TAREA_AL_TRACKER);
        Assert.assertTrue(isVisible(ClockifyTrackerConstants.BTN_AGREGAR_TAREA_AL_TRACKER));
    }
}
