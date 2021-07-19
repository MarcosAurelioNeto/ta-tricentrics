package Steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;
import static classes.Configs.getDriver;
import org.openqa.selenium.WebDriver;
import Pages.PageForms;

public class StepsForms {
	
	WebDriver driver = getDriver();
	PageForms paginaforms = new PageForms(driver);
	
	@Dado("que estou no site {string}")
	public void que_estou_no_site(String url) {
		paginaforms.openSite(url);
	}

	@Dado("preencho o fomulario, aba {string} e pressiono next")
	public void preencho_o_fomulario_aba(String form) {
		paginaforms.selecionarFormulario(form);
	}

	@Quando("preencho o fomulario, aba {string} e pressiono o botão send")
	public void preencho_o_fomulario_aba_e_pressiono_o_botão_send(String form) {
		paginaforms.selecionarFormulario(form);
	}

	@Então("verifico a mensagem {string} na tela")
	public void verifico_a_mensagem_na_tela(String mensagem) {
		paginaforms.verificarMensagemEmail(mensagem);
	}

}
