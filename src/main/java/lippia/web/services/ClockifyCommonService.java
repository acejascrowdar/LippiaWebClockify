package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import org.testng.Assert;

public class ClockifyCommonService extends ActionManager {

    public static void ForzarFalloDadoMotivo(String motivo) {
        Assert.fail(motivo);
    }
}
