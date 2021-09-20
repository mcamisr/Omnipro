package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.StepAgregar;
import steps.StepInicioSesion;

public class InicioSesionStepdefinition {
    @Steps
    StepAgregar agregar;
    @Steps
    StepInicioSesion sesion;

    @Given("^que ingreso a la pagina de falabella para logearme$")
    public void que_ingreso_a_la_pagina_de_falabella_para_logearme() {
        agregar.AbrirPagina();


    }

    @When("^ingreso mis credenciales correctamente (.+) (.+)$")
    public void ingreso_mis_credenciales_correctamente(String usuario, String contrasena) {
         sesion.IngresarCredenciales(usuario,contrasena);
    }

    @Then("^deberia ver el home de la pagina$")
    public void deberia_ver_el_home_de_la_pagina() {
sesion.IngresoExitoso();
}
}
