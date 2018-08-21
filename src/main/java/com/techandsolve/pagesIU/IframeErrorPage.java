package com.techandsolve.pagesIU;

	import net.serenitybdd.core.annotations.findby.By;
	import net.serenitybdd.core.annotations.findby.FindBy;
	import net.serenitybdd.core.pages.PageObject;
	import net.serenitybdd.core.pages.WebElementFacade;
	import net.thucydides.core.annotations.DefaultUrl;


	@DefaultUrl("http://sahitest.com/demo/iframesTest.htm")
				
	public class IframeErrorPage  extends PageObject{
		
		public void Timeout() {
			waitABit(2000);
		}
		
		@FindBy(xpath="//td//a[@href='errorPages.htm']")
		public	WebElementFacade ClickError;
		
		@FindBy(xpath="//a[@href='404random.htm']")
		public WebElementFacade click404Page;
		
		@FindBy(xpath ="/html/body/p")
		public WebElementFacade txtError;
		
		public void clickErrorPage() {
			waitABit(1000);
			getDriver().switchTo().frame(getDriver().findElement(By.xpath("//*[@id='another']/iframe")));	
			ClickError.click();
		}
		
		public void click404() {
			click404Page.click();
			waitABit(2000);
		}
		
		public void verificarMsjError() {
			System.out.println(txtError.findBy("/html/body/p").getText());
		
		}

	

			

}
