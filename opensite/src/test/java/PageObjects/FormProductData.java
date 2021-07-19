package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import classes.BrowserClass;

public class FormProductData extends BrowserClass{

	public FormProductData(WebDriver browser) {
		super(browser);
	}
	
	//IDS
	By idDatainicio = By.id("startdate");
	By idNext		= By.id("nextselectpriceoption");
	
	//INPUTS
	public void inserirDataInicio(String data) {
		cleanElement(idDatainicio);
		fillField(idDatainicio,data);
	}
	
	//CHECKBOXES
	public void selecionarSeguro(String seguro) {
		seguro="//select[@id='insurancesum']/option[@value='"+seguro+"']";
		clickElement(By.xpath(seguro));
	}
	
	public void selecionarClassificacao(String classe) {
		classe="//select[@id='meritrating']/option[@value='"+classe+"']";
		clickElement( By.xpath(classe));
	}
	
	public void selecionarDanosSeg(String danos) {
		danos="//select[@id='damageinsurance']/option[@value='"+danos+"']";
		clickElement( By.xpath(danos));
	}
	
	public void selecionarCortesia(String cortesia) {
		cortesia="//select[@id='courtesycar']/option[@value='"+cortesia+"']";
		clickElement( By.xpath(cortesia));
	}
	
	//RADIOS
	public void ProdutosOpc(String[] produtos) {
		for(String prod:produtos) {
			prod = "//p[@class='group']/label[text()='"+prod+"']";
			clickElement(By.xpath(prod));
		}
	}
	
	//BUTTONS
	public void clicarNext() {
		clickElement(idNext);
	}
	

}
