package com.techandsolve.pagesIU;

import java.util.Set;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://sahitest.com/demo/iframesTest.htm")
			
public class IframesPage extends PageObject{
	
	public void Timeout() {
		waitABit(2000);
	}
	
	@FindBy(xpath="//td//a[@target ='popWin']")
	public	WebElementFacade clickwindow;

	
	public void clickventana() {
		waitABit(2000);
		getDriver().switchTo().frame(getDriver().findElement(By.xpath("//*[@id='another']/iframe")));	
		clickwindow.click();
		waitABit(2000);
	}

	public void CambiarVentana(int intNroWin) {
		Set<String> allWindows = getDriver().getWindowHandles();
		Integer intW = 0;
		for(String curWindow : allWindows) {
			intW = intW + 1;
			if(intW == intNroWin) {
				getDriver().switchTo().window(curWindow);
				break;
				
			}

		}
	}


}