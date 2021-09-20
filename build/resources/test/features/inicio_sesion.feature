#lenguage: es
#autor: maria camila salas

@Registro
Feature: Registro de usuarios
  YO COMO  una persona natural
  QUIERO ingresar mis credenciales en la pagina de falabella
  PARA realizar operaciones con mi cuenta

  @tag1
  Scenario Outline: ingreso exitoso
    Given que ingreso a la pagina de falabella para logearme
    When ingreso mis credenciales correctamente <usuario> <contrasena>
    Then deberia ver el home de la pagina
    Examples:
      | usuario                      | contrasena           |
      | mariasalas16@gmail.com       | Camila2021*          |