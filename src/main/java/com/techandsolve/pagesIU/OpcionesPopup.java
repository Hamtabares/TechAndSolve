package com.techandsolve.pagesIU;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://sahitest.com/demo/jsPopup.htm")
public class OpcionesPopup extends PageObject{

	
	@FindBy(xpath="//button[@onclick='myFun()']")
	public	WebElementFacade btnAllPopup;
		
	@FindBy(xpath="//a[@href='index.htm']")
	public	WebElementFacade btnBack;
	
	
	
	public void clickBtnAll() {
		btnAllPopup.click();
		waitABit(1000);
	}
	public void botonConfirmarAlerta() {
		waitABit(1000);
		getDriver().switchTo().alert().accept();
		waitABit(1000);
	}
	public void botonConfirmarAlerta2() {
		getDriver().switchTo().alert().accept();
		waitABit(1000);
	}
	public void botonConfirmarAlerta3() {
		waitABit(1000);
		getDriver().switchTo().alert().sendKeys("Hola tech");
		getDriver().switchTo().alert().dismiss();
	}
	public void botoncancelar() {
//		waitABit(1000);
//		getDriver().switchTo().window(getTitle()).close();
//		
//		
		Actions action = new Actions(getDriver());
		action.sendKeys(Keys.ESCAPE).build().perform();
		waitABit(3000);
		
	}	
	public void botonBack() {
		btnBack.click();
		waitABit(3000);
	}
		
	
}