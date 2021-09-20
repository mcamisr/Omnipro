package steps;

import net.thucydides.core.annotations.Step;
import pages.InicioSesion;

public class StepInicioSesion {
    InicioSesion sesion;

    @Step
    public void IngresarCredenciales(String usuario, String contrasena){
        sesion.ingresarCredenciales(usuario, contrasena);
    }
    @Step
    public void IngresoExitoso(){
        sesion.ValidarIngresoExitoso();
    }
}
