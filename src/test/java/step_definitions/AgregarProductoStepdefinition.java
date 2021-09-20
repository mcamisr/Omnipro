package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.StepAgregar;

public class AgregarProductoStepdefinition {
    @Steps
    StepAgregar agregar;

    @Given("^que ingreso a la pagina de falabella$")
    public void que_ingreso_a_la_pagina_de_falabella() {
 agregar.AbrirPagina();
    }


    @When("^busco un producto y lo agrego al carrito$")
    public void busco_un_producto_y_lo_agrego_al_carrito() {
      agregar.Agregarprodcuto();
    }

    @Then("^deberia ver un mensaje de confirmacion$")
    public void deberia_ver_un_mensaje_de_confirmacion() {
     agregar.validar();
    }

}
