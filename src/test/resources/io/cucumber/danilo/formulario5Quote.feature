#language: pt
Funcionalidade: Acessar o site da Tricentis e testar o cadastro para envio de cotacao
  Criando uma rotina de teste para validar formulario que gera cotacoes
	
	@ignore
  Cenario: Formulario 5 Send Quote
    Dado que eu estou no site da Tricentis no formulario "Send Quote"
    E informo em e-mail "fulana@gmail.com"
    E informo em Phone "41999885656"
    E informo em Username "fulanaAugusta"
    E informo em Password "Admin1234"
    E informo em Confirm Password "Admin1234"
    E informo em Comments "NA"
    E clico em Send
    Entao devo ver a mensagem "Sending e-mail success!"
   