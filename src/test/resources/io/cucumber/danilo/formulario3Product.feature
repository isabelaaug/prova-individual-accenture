#language: pt
Funcionalidade: Acessar o site da Tricentis e testar o cadastro para envio de cotacao
  Criando uma rotina de teste para validar formulario que gera cotacoes
	
	
  Cenario: Formulario 3 Enter Product Data
    Dado que eu estou no site da Tricentis no formulario "Enter Product Data"
    E digito em Start Date "05/01/2021"
    E seleciono em Insurance Sum "3000000"
    E seleciono em Merit Rating "Bonus 1"
    E seleciono em Damage Insurance "Full Coverage"
    E seleciono em Optional Products Euro Protection
    E seleciono em Courtesy Car "Yes"
    Entao devo clicar em Next para o formulario Price Option
    