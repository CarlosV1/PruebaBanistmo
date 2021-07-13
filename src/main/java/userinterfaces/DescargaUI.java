package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DescargaUI {
    public static final Target BUTTON_DOWNLOAD = Target.the("Boton Descargar").located(By.className("hidden-xs img-responsive"));
}
