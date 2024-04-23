Feature: Login

  Background:
    Given que ingreso a la pagina de inicio

  @Regression @Clockify @Login
  Scenario: Ingreso manual
    When Ingreso de forma manual con email abel.cejas@crowdaronline.com y contrasena LoboAzul1996
    Then ingresa a la pagina tracker de clockify