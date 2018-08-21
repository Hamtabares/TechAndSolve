package com.techandsolve.steps;

import java.util.List;

import com.techandsolve.pagesIU.CanastaComprasPage;
import com.techandsolve.pagesIU.IframeErrorPage;
import com.techandsolve.pagesIU.IframesPage;
import com.techandsolve.pagesIU.LoginTrainingPage;
import com.techandsolve.pagesIU.OpcionesPopup;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class DefinitionsSteps extends PageObject{

	IframesPage iframePage;
	IframeErrorPage iframeErrorPage;
	LoginTrainingPage loginTrainingPage;
	CanastaComprasPage canastaComprasPage;
	OpcionesPopup opcionesPopup;
	
	@Step
	public void clickLinkTable() {
		iframePage.open();

	}
	
	@Step
	public void iframeDerecho() {
		iframePage.Timeout();
		iframePage.clickventana();
	
	}	
	
	@Step
	public void CambiarPestana() {
		iframePage.CambiarVentana(0);
	}
	
	@Step
	public void ClickOpenPage() {
		iframeErrorPage.open();
		
	}
	
	@Step
	public void ClickErrorPage() {
		iframeErrorPage.Timeout();
		iframeErrorPage.clickErrorPage();
		
					
	}
	@Step
	public void VerificarMsj() {
		iframeErrorPage.click404();
		iframeErrorPage.verificarMsjError();
	}	
	@Step
	public void ClickOpen() {
		loginTrainingPage.open();
	}
	
	@Step
	public void IngresarDatos(List<String>Lista) {
		loginTrainingPage.ingresarUsuario(Lista);
		loginTrainingPage.ingresarclave(Lista);
			
	}
	
	@Step
	public void IngresarSahiTraining() {
		loginTrainingPage.presionarLogin();
	}
	
	@Step
	public void IngresarCanastaCompra() {
		canastaComprasPage.open();
	}

	@Step
	public void IngresarValorCanasta(List<String>Product) {
		canastaComprasPage.ingresarUsuario(Product);
		canastaComprasPage.ingresarclave(Product);
		canastaComprasPage.presionarLogin();
		canastaComprasPage.ingresarCoreJava(Product);
		canastaComprasPage.ingresarRubyR(Product);
		canastaComprasPage.ingresarPhyton(Product);
		canastaComprasPage.agregarCompra();
	}

	@Step 
	public void compararSuma(List<String>valor){
		canastaComprasPage.compararSuma(valor);
	}	
	
	@Step 
	public void Openurl() {
		opcionesPopup.open();
	}
	
	@Step 
	public void botonAlerta() {
		opcionesPopup.clickBtnAll();
		opcionesPopup.botonConfirmarAlerta();
		opcionesPopup.botonConfirmarAlerta2();
		opcionesPopup.botonConfirmarAlerta3();
		opcionesPopup.botoncancelar();
	}
	@Step
	public void regresarPaginaPrinp() {
		opcionesPopup.botonBack();
	}

}
