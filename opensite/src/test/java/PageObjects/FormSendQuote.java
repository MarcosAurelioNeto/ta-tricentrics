package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import classes.BrowserClass;

public class FormSendQuote extends BrowserClass{

	public FormSendQuote(WebDriver browser) {
		super(browser);
	}
	
	//IDS
	By idEmail 				= By.id("email");
	By idNumero 			= By.id("phone");
	By idUsuario 			= By.id("username");
	By idSenha				= By.id("password");
	By idConfirmarSenha 	= By.id("confirmpassword");
	By idComentario 		= By.id("Comments");
	By idSend				= By.id("sendemail");
	
	//INPUTS
	public void inserirEmail(String email) {
		cleanElement(idEmail);
		fillField(idEmail,email);
	}
	
	public void inserirNumero(String numero) {
		cleanElement(idNumero);
		fillField(idNumero,numero);
	}
	
	public void inserirUsuario(String usuario) {
		cleanElement(idUsuario);
		fillField(idUsuario,usuario);
	}
	
	public void inserirSenha(String senha) {
		cleanElement(idSenha);
		fillField(idSenha,senha);
	}
	
	public void inserirSenhaN(String senha) {
		cleanElement(idConfirmarSenha);
		fillField(idConfirmarSenha,senha);
	}
	
	public void inserirComentario(String comentario) {
		cleanElement(idComentario);
		fillField(idComentario,comentario);
	}
	
	//BUTTONS
	public void clicarEnviar() {
		clickElement(idSend);
	}

}
