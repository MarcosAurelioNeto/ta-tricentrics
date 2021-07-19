package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PageObjects.FormInsurentData;
import PageObjects.FormProductData;
import PageObjects.FormSendQuote;
import PageObjects.FormVehicleData;
import PageObjects.SelectPrice;
import classes.BrowserClass;


public class PageForms extends BrowserClass{
	
	public PageForms(WebDriver browser) {
		super(browser);
	}
	
	By xPathEmailM = By.xpath("//h2");
	
	public void selecionarFormulario(String form) {
		switch(form) {
			case "Enter Vehicle Data":
				preencherFormVeiculo();
				break;
			case "Enter Insurant Data":
				preencherFormSeguro();
				break;
			case "Enter Product Data":
				preencherFormProd();
				break;
			case "Select Price Option":
				escolherPlano();
				break;
			case "Send Quote":
				enviarOrcamento();
				break;
		}
	}
	
	public void verificarMensagemEmail(String msg) {
		waitTextPresentInElement(xPathEmailM,msg);
	}
	
	private void preencherFormVeiculo() {
		FormVehicleData formVeiculo = new FormVehicleData(driver);
		formVeiculo.selecionarMarca("Audi");
		formVeiculo.selecionarModelo("Three-Wheeler");
		formVeiculo.inserirCilindrada("500");
		formVeiculo.inserirDesempenho("400");
		formVeiculo.inserirFabricacao("08/10/2018");
		formVeiculo.selecionarNAssentos("2");
		formVeiculo.direcaoDireita(true);
		formVeiculo.selecionarAssentosMotocicleta("2");
		formVeiculo.selecionarCombustivel("Petrol");
		formVeiculo.inserirCarga("11");
		formVeiculo.inserirPeso("150");
		formVeiculo.inserirPreco("3000");
		formVeiculo.inserirMatricula("123");
		formVeiculo.inserirMilia("1111");
		formVeiculo.clicarNext();
	}
	
	private void preencherFormSeguro() {
		String[] hobbies = {" Speeding"," Bungee Jumping"};
		String pathImg = "../../resources/images/b.png";
		
		FormInsurentData formSeguro = new FormInsurentData(driver);
		formSeguro.inserirNome("Tester");
		formSeguro.inserirUltimoNome("Test");
		formSeguro.inserirDataNasc("01/01/2001");
		formSeguro.tipoGenero(false);
		formSeguro.inserirRua("Avenida Sampaio Correia");
		formSeguro.selecionarPais("Brazil");
		formSeguro.inserirCEP("9090");
		formSeguro.inserirCidade("Campinas");
		formSeguro.selecionarTrabalho("Employee");
		formSeguro.hobbies(hobbies);
		formSeguro.inserirWebSite("https://www.accenture.com/br-pt");
		formSeguro.inserirFoto(pathImg);
		formSeguro.clicarNext();
	}
	
	private void preencherFormProd() {
		String[] prodOpc = {"Euro Protection"};
		
		FormProductData formProduto = new FormProductData(driver);
		formProduto.inserirDataInicio("01/01/2022");
		formProduto.selecionarSeguro("3000000");
		formProduto.selecionarClassificacao("Bonus 1");
		formProduto.selecionarDanosSeg("No Coverage");
		formProduto.ProdutosOpc(prodOpc);
		formProduto.selecionarCortesia("Yes");
		formProduto.clicarNext();
	}
	
	private void escolherPlano() {
		SelectPrice formPlano = new SelectPrice(driver);
		formPlano.selecionarPlano("Plation");
		formPlano.clicarNext();
	}
	
	private void enviarOrcamento() {
		FormSendQuote formOrcamento = new FormSendQuote(driver);
		formOrcamento.inserirEmail("teste@gmail.com");
		formOrcamento.inserirNumero("1998998676");
		formOrcamento.inserirUsuario("teste");
		formOrcamento.inserirSenha("123acbD");
		formOrcamento.inserirSenhaN("123acbD");
		formOrcamento.inserirComentario("Teste chegando no final");
		formOrcamento.clicarEnviar();
	}
		

}

