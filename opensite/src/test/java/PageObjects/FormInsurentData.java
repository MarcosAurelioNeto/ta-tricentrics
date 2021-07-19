package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import classes.BrowserClass;

public class FormInsurentData extends BrowserClass{

	public FormInsurentData(WebDriver browser) {
		super(browser);
	}
		
	//IDS
	By idNome				= By.id("firstname");
	By idUltimoNome			= By.id("lastname");
	By idDataNascimento		= By.id("birthdate");
	By idRua				= By.id("streetaddress");
	By idCEP				= By.id("zipcode");
	By idCidade				= By.id("city");
	By idWebSite			= By.id("website");
	By idFoto				= By.id("picture");
	By idNext				= By.id("nextenterproductdata");
	
	//INPUTS
	public void inserirNome(String nome) {
		cleanElement(idNome);
		fillField(idNome,nome);
	}
	
	public void inserirUltimoNome(String ultimoNome) {
		cleanElement(idUltimoNome);
		fillField(idUltimoNome,ultimoNome);
	}
	
	public void inserirDataNasc(String dataNasc) {
		cleanElement(idDataNascimento);
		fillField(idDataNascimento,dataNasc);
	}
	
	public void inserirRua(String rua) {
		cleanElement(idRua);
		fillField(idRua,rua);
	}
	
	public void inserirCEP(String cep) {
		cleanElement(idCEP);
		fillField(idCEP,cep);
	}
	
	public void inserirCidade(String cidade) {
		cleanElement(idCidade);
		fillField(idCidade,cidade);
	}
	
	public void inserirWebSite(String website) {
		cleanElement(idWebSite);
		fillField(idWebSite,website);
	}
	
	public void inserirFoto(String foto) {
		cleanElement(idFoto);
		fillField(idFoto,foto);
	}
	
	//CHECKBOXES
	public void selecionarPais(String pais) {
		pais="//select[@id='country']/option[@value='"+pais+"']";
		clickElement(By.xpath(pais));
	}
	
	public void selecionarTrabalho(String ocupacao) {
		ocupacao="//select[@id='occupation']/option[@value='"+ocupacao+"']";
		clickElement(By.xpath(ocupacao));
	}
	
	//RADIOS
	public void tipoGenero(boolean generoT){
		String genero;
		
		if (generoT == true) {
			genero = "//label[text()='Female']";
		}else {
			genero = "//label[text()='Male']";
		}
		
		clickElement(By.xpath(genero));
	}
	
	public void hobbies(String[] hobbies) {
		
		for(String hobby:hobbies) {
			hobby = "//p[@class='group']/label[text()='"+hobby+"']";
			clickElement(By.xpath(hobby));
		}
		
	}
	
	//BUTTONS
	public void clicarNext() {
		clickElement(idNext);	
	}
}
