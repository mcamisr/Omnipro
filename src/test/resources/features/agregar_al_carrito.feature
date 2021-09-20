#lenguage: es
#autor: maria camila salas

@Agregar
Feature: Agregar producto
  YO COMO  una persona natural
  QUIERO buscar un producto
  PARA agregarlo al carrito

  @tag1
  Scenario: Agregar producto
    Given que ingreso a la pagina de falabella
    When busco un producto y lo agrego al carrito
    Then deberia ver un mensaje de confirmacion