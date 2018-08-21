package com.techandsolve.definitions;



import java.util.List;
import com.techandsolve.steps.DefinitionsSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IngresarSahiTestDefinitions {
	
	
	
	DefinitionsSteps definitionssteps;

	@Given("^que me encuentro en la web de iframe$")
	public void que_me_encuentro_en_la_web_de_iframe()  {
		
		definitionssteps.clickLinkTable();
	}

	@When("^yo selecciono el iframe derecho$")
	public void yo_selecciono_el_iframe_derecho() {
		
		definitionssteps.iframeDerecho();
	}
		
	@Then("^yo ingreso al link window open$")
	public void yo_ingreso_al_link_window_open() {
		definitionssteps.CambiarPestana();
	}
	
	@Given("^que me encuentro en la web de iframetest$")
	public void que_me_encuentro_en_la_web_de_iframetest()  {
		
		definitionssteps.ClickOpenPage();
	}
	@When("^yo selecciono el iframe derecho error$")
	public void yo_selecciono_el_iframe_derecho_error() {
		definitionssteps.ClickErrorPage();
	}

	@Then("^yo verifico que sale mensaje de error$")
	public void yo_verifico_que_sale_mensaje_de_error() {
		definitionssteps.VerificarMsj();
	}

	@Given("^que me encuentro logueado con el usuario admin$")
	public void que_me_encuentro_logueado_con_el_usuario_admin()  {
		definitionssteps.ClickOpen();
	}
	
	@When("^yo ingreso el usuario y contrasena$")
	public void yo_ingreso_el_usuario_y_contrasena(List<String>Lista)  {
		definitionssteps.IngresarDatos(Lista);
	}

	@Then("^yo ingreso a la web principal$")
	public void yo_ingreso_a_la_web_principal() {
		definitionssteps.IngresarSahiTraining();
	}

	@Given("^que me encuentro logueado con el usuario administrador$")
	public void que_me_encuentro_logueado_con_el_usuario_administrador()  {
		
		definitionssteps.IngresarCanastaCompra();
	
	}

	@When("^yo verifico la suma de los productos$")
	public void yo_verifico_la_suma_de_los_productos(List<String>Product)  {
		
		definitionssteps.IngresarValorCanasta(Product);
	}

	@Then("^debe ver el valor correcto en el campo grandTotal$")
	public void debe_ver_el_valor_correcto_en_el_campo_grandTotal(List<String>valor)  {
		
		  definitionssteps.compararSuma(valor);
		//definitionssteps.listaPrecios(valor);
	}

	@Given("^que me encuentro en el sistema poupp$")
	public void que_me_encuentro_en_el_sistema_poupp()  {
		definitionssteps.Openurl();
	}

	@When("^yo ingreso por todas las opciones$")
	public void yo_ingreso_por_todas_las_opciones()  {
		definitionssteps.botonAlerta();
		
	}

	@Then("^validamos cada una y salimos de nuevo$")
	public void validamos_cada_una_y_salimos_de_nuevo() {
		definitionssteps.regresarPaginaPrinp();

	}


}
