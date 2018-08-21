package com.techandsolve.pagesIU;


import java.util.List;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;



@DefaultUrl("http://sahitest.com/demo/training/login.htm")
public class CanastaComprasPage extends PageObject {

	
	@FindBy (xpath ="//td//input[@name='user']")
	public WebElementFacade txtUser;

	@FindBy (xpath ="//td//input[@name='password']")
	public WebElementFacade txtPassword;
	
	@FindBy (xpath ="//td//input[@class='button']")
	public WebElementFacade btnLogin;
	
	@FindBy (xpath="//*[@id='listing']/tbody/tr[2]/td[4]/input")
	public WebElementFacade txtCoreJava;
	
	@FindBy (xpath="//*[@id='listing']/tbody/tr[3]/td[4]/input")
	public WebElementFacade txtRubyRails;
	
	@FindBy (xpath="//*[@id='listing']/tbody/tr[4]/td[4]/input")
	public WebElementFacade txtPhytonCook;
	
	@FindBy (xpath="//input[@value = 'Add']")
	public WebElementFacade btnAdd;
	
//	@FindBy (xpath="//*[@id='added']/tbody/tr[2]/td[4]")
//	public WebElementFacade costoCoreJava;
//	
//	@FindBy (xpath="//*[@id='added']/tbody/tr[3]/td[4]")
//	public WebElementFacade costoRubyRails;
//	
//	@FindBy (xpath="//*[@id='added']/tbody/tr[4]/td[4]")
//	public WebElementFacade costoPhytonCook;
	
	@FindBy (xpath="//input[@id='total']")
	public WebElementFacade GrandTotal;
	
	
	public void ingresarUsuario(List<String>Product) {
		txtUser.type(Product.get(5));
	}
	
	public void ingresarclave(List<String>Product) {
		txtPassword.type(Product.get(6));
	}
	public void presionarLogin() {
		btnLogin.click();
	}
	
	public void ingresarCoreJava(List<String>Product) {
		txtCoreJava.type(Product.get(7));
	}
	public void ingresarRubyR(List<String>Product) {
		txtRubyRails.type(Product.get(8));
	}
	public void ingresarPhyton(List<String>Product) {
		txtPhytonCook.type(Product.get(9));
	}	
	public void agregarCompra() {
		btnAdd.click();
	}
	
	public void compararSuma(List<String>valor) {
		if (GrandTotal.findBy("//input[@id='total' and @value='0']").getText().toString() == ("2300"))//(valor.get(7)))
		{	waitABit(1000);
		  System.out.println("el valor es correcto");
		} 
		else
		{
			System.out.println("valor incorrecto");
		}				
	}
	
//	public void listaPreciosSuma(List<String>valor) {
//		
//		List<WebElementFacade> listPrecios = findBy("//input[@id='total' and @value='0']");
//		String[] strListaPrecios = new String[listPrecios.size()];
//		for (int i = 0; i < strListaPrecios.length; i++) {
//			strListaPrecios[i] = listPrecios.get(i).getText();
//			System.out.println(strListaPrecios[i]);
//			}
//		}	
	
}


	
//	public void verificarCoreJava(String corejava) {
//		System.out.println( costoCoreJava.findBy("//*[@id='added']/tbody/tr[2]/td[4]").getText());
//	}
//	
//	public void verificarRubyRails(String rubyrails) {
//		System.out.println( costoRubyRails.findBy("//*[@id='added']/tbody/tr[3]/td[4]").getText());
//	}
//	
//	public void verificarPhytonCook(String phytoncook) {
//		costoPhytonCook.findBy("//*[@id='added']/tbody/tr[4]/td[4]").getText();
//	}

	

