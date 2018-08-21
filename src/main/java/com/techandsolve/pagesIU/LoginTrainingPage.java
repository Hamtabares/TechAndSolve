package com.techandsolve.pagesIU;

import java.util.List;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://sahitest.com/demo/training/login.htm")

public class LoginTrainingPage extends PageObject{
	
	@FindBy (xpath ="//td//input[@name='user']")
	public WebElementFacade txtUser;

	@FindBy (xpath ="//td//input[@name='password']")
	public WebElementFacade txtPassword;
	
	@FindBy (xpath ="//td//input[@class='button']")
	public WebElementFacade btnLogin;
	
	public void ingresarUsuario(List<String>Lista) {
		txtUser.type(Lista.get(2));
	}
	
	public void ingresarclave(List<String>Lista) {
		txtPassword.type(Lista.get(3));
	}
	public void presionarLogin() {
		btnLogin.click();
		waitABit(2000);
	}
	
}
