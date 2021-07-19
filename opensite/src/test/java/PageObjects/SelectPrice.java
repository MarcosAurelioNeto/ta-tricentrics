package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import classes.BrowserClass;

public class SelectPrice extends BrowserClass{

	public SelectPrice(WebDriver browser) {
		super(browser);
	}
	
	//IDS
	By idNext		= By.id("nextsendquote");
	
	//CSS-SELECTORS
	By cssSilver	= By.cssSelector("label.choosePrice.ideal-radiocheck-label:nth-child(1)");
	By cssGold	= By.cssSelector("label.choosePrice.ideal-radiocheck-label:nth-child(2)");
	By cssPlatium	= By.cssSelector("label.choosePrice.ideal-radiocheck-label:nth-child(3)");
	By cssUltimate	= By.cssSelector("label.choosePrice.ideal-radiocheck-label:nth-child(4)");
	
	//CHECKBOXES
	public void selecionarPlano(String plano) {
		switch(plano) {
		case "Silver":
			clickElement(cssSilver);
			break;
		case "Gold":
			clickElement(cssGold);
			break;
		case "Plation":
			clickElement(cssUltimate);
			break;
		case "Ultimate":
			clickElement(cssUltimate);
			break;			
		}
	}
	
	//BUTTONS
	public void clicarNext() {
		clickElement(idNext);
	}
	
}
