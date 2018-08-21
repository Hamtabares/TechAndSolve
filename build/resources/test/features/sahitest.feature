#Author: your.email@your.domain.com
@tag
Feature: Ingresar a la sahitest con usuario y contrasena
  I want to use this template for my feature file

  @Escenario1
  Scenario: ingresar al sistema sahistest iframe
    Given que me encuentro en la web de iframe
    When yo selecciono el iframe derecho
    Then yo ingreso al link window open

  @Escenario2
  Scenario: ingresar al sistema sahistest iframetest
    Given que me encuentro en la web de iframetest
    When yo selecciono el iframe derecho error
    Then yo verifico que sale mensaje de error

  @Escenario3
  Scenario: ingresar al sistema sahistest
    Given que me encuentro logueado con el usuario admin
    When yo ingreso el usuario y contrasena
      | usuario	 | contrasena |
      | test	 | secret 	  |
    Then yo ingreso a la web principal

   @Escenario4
  Scenario: ingresar al sistema sahistest a comprar x productos
    Given que me encuentro logueado con el usuario administrador
    When yo verifico la suma de los productos
    	| usuario	 | contrasena |corejava|ruby rails|phytonCook|
		| test	 	 | secret 	  |2	   |	5	  |     	2|
    Then debe ver el valor correcto en el campo grandTotal
    |core java |300 |
    |rubyrails |200 |
	|pythoncook|350 |
	|grandTotal|2300|
	
    @Escenario5
  Scenario: ingresar al sistema sahistest
    Given que me encuentro en el sistema poupp
    When yo ingreso por todas las opciones
    Then validamos cada una y salimos de nuevo