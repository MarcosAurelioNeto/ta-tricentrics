## **Descrição** ##

Este teste automatizado foi feito com o intuito de automatizar o preenchimento de fomulário do site:http://sampleapp.tricentis.com/101/app.php. validando a mensagem de envio por email na aba de envio de orçamento. Foi utilizado o desing patterns page objects.

## **Instalação** ##

- Java  1.8.0_181 instalado na máquina;
- Maven 3.5.0 instaldo na máquina.

## **Como Usar ?** ##

Há duas formas de execuções do teste automatizado:

- 1º execute a feature fomrularios.feature no local: **opensite/src/test/resources/Features/**
- 2º executar via terminal para gerar relatórios: primeiro deve ser executado o comando **mvn clean test** e depois o comando ** mvn verify -DskipTests**

Relatórios se encontram na pasta: **opensite/target/cucumber-report-html/cucumber-html-reports/**

## **OBS:** ##

Modo headless está ativo, para ser desabilitado só precisa abrir a classe Configs.java(opensite/src/test/java/classes/Configs.java) e comentar/remover: **"--headless"**

O teste só foi executado em ambiente Linux, porém também há possibilidade de executar em ambiente Windows.
