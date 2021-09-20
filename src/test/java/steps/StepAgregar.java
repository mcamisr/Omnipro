package steps;

import net.thucydides.core.annotations.Step;
import pages.Homepage;

public class StepAgregar {
    Homepage homepage;

@Step
public void AbrirPagina() {
    homepage.open();
}
    @Step

    public void Agregarprodcuto() {
        homepage.agregaralcarrito();
    }
    @Step
    public void validar() {
        homepage.Validarmensaje();
    }

}
