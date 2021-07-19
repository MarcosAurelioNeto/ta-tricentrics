# language: pt

@Formularios
Funcionalidade: Preenchimento de formularios
  I want to use this template for my feature file

  @Formulario_CT001_MSGSUCESSO
  Cenário: Verificar Mensagem de sucesso ao preencher todos os formulários
    Dado que estou no site "http://sampleapp.tricentis.com/101/app.php"
    	E preencho o fomulario, aba "Enter Vehicle Data" e pressiono next
    	E preencho o fomulario, aba "Enter Insurant Data" e pressiono next
    	E preencho o fomulario, aba "Enter Product Data" e pressiono next
    	E preencho o fomulario, aba "Select Price Option" e pressiono next
    	Quando preencho o fomulario, aba "Send Quote" e pressiono o botão send    
    Então verifico a mensagem "Sending e-mail success!" na tela