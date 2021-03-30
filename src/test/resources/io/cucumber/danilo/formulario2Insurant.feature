#language: pt
Funcionalidade: Acessar o site da Tricentis e testar o cadastro para envio de cotacao
  Criando uma rotina de teste para validar formulario que gera cotacoes
	
  Cenario: Formulario 2 Enter Insurant Data
    Dado que eu estou no site da Tricentis no formulario "Enter Insurant Data"
    E informo em First Name "Fulana"
    E informo em Last Name "Augusta"
    E digito em Date of Birth "05/02/1995"
    E seleciono em Gender Female
    E informo em Street Address "Rua dos Exemplos"
    E seleciono em Country "Brazil"
    E informo em Zip Code "8150000"
    E informo em City "Curitiba"
    E seleciono em Occupation "Employee"
    E seleciono em Hobbies "Bungee Jumping"
    E informo em Website "www.fulananews.com.br"
    E anexo em Picture "foto"
    Entao devo clicar em Next para o formulario Product Data
	

   