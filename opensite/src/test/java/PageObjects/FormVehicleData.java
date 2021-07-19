package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import classes.BrowserClass;

public class FormVehicleData extends BrowserClass{
	
	public FormVehicleData(WebDriver browser) {
		super(browser);
	}
	
	//IDS
	By idCilindrada = By.id("cylindercapacity");
	By idDesempenho = By.id("engineperformance");
	By idDataF		= By.id("dateofmanufacture");
	By idCarga		= By.id("payload");
	By idPeso		= By.id("totalweight");
	By idPreco		= By.id("listprice");
	By idMatricula	= By.id("licenseplatenumber");
	By idMiliaA		= By.id("annualmileage");
	By idNext		= By.id("nextenterinsurantdata");
	
	//INPUTS
	public void inserirCilindrada(String ccm) {
		cleanElement(idCilindrada);
		fillField(idCilindrada,ccm);
	}
	
	public void inserirDesempenho(String km) {
		cleanElement(idDesempenho);
		fillField(idDesempenho,km);
	}
	
	public void inserirFabricacao(String dataF) {
		cleanElement(idDataF);
		fillField(idDataF,dataF);
	}
	
	public void inserirCarga(String carga) {
		cleanElement(idCarga);
		fillField(idCarga,carga);
	}
	
	public void inserirPeso(String peso) {
		cleanElement(idPeso);
		fillField(idPeso,peso);
	}
	
	public void inserirPreco(String preco) {
		cleanElement(idPreco);
		fillField(idPreco,preco);
	}
	
	public void inserirMatricula(String matricula) {
		cleanElement(idMatricula);
		fillField(idMatricula,matricula);
	}
	
	public void inserirMilia(String milia) {
		cleanElement(idMiliaA);
		fillField(idMiliaA,milia);
	}
	
	//COMBOBOXES
	public void selecionarMarca(String marca) {
		marca = "//select[@id='make']/option[@value='"+marca+"']";
		clickElement(By.xpath(marca));
	}
	
	public void selecionarModelo(String modelo) {
		modelo="//select[@id='model']/option[@value='"+modelo+"']";
		clickElement(By.xpath(modelo));
	}
	
	public void selecionarCombustivel(String combustivel) {
		combustivel = "//select[@id='fuel']/option[@value='"+combustivel+"']";
		clickElement(By.xpath(combustivel));
	}
	
	public void selecionarAssentosMotocicleta(String assentos) {
		assentos="//select[@id='numberofseatsmotorcycle']/option[@value='"+assentos+"']";
		clickElement(By.xpath(assentos));
	}
	
	public void selecionarNAssentos(String assentos) { 
		assentos="//select[@id='numberofseats']/option[@value='"+assentos+"']";
		clickElement(By.xpath(assentos));
	}
	
	//RADIOS
	public void direcaoDireita(boolean direcaoD){
		String direcao;
		
		if (direcaoD == true) {
			direcao = "//label[text()='Yes']";
		}else {
			direcao = "//label[text()='No']";
		}
		
		clickElement(By.xpath(direcao));
	}
	
	//BUTTONS
	public void clicarNext() {
		clickElement(idNext);	
	}

}
