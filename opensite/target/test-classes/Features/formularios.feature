# language: pt

@Formularios
Funcionalidade: Preenchimento de formularios
  EU COMO Motoqueiro
	QUERO verificar se meu email foi enviado com sucesso depois de enviar orçamento
	PARA contratar os serviços do site Tricentis

  @Formulario_CT001_MSGSUCESSO
  Cenário: Verificar Mensagem de sucesso ao preencher todos os formulários
    Dado que estou no site "http://sampleapp.tricentis.com/101/app.php"
    	E preencho o fomulario, aba "Enter Vehicle Data" e pressiono next
    	E preencho o fomulario, aba "Enter Insurant Data" e pressiono next
    	E preencho o fomulario, aba "Enter Product Data" e pressiono next
    	E preencho o fomulario, aba "Select Price Option" e pressiono next
    	Quando preencho o fomulario, aba "Send Quote" e pressiono o botão send    
    Então verifico a mensagem "Sending e-mail success!" na tela