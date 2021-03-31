#language: pt
Funcionalidade: Acessar o site da Tricentis e testar o cadastro para envio de cotacao
  Criando uma rotina de teste para validar formulario que gera cotacoes
	
  Cenario: Formulario 1 Enter Vehicle Data
    Dado que eu estou no site da Tricentis "http://sampleapp.tricentis.com/101/app.php"
    E seleciono em "Make": "BMW"
    E seleciono em "Model": "Motorcycle"
    E informo em "Cylinder Capacity": "1000"
    E informo em "[kW]": "8"
    E informo em "Date of Manufacture": "02/05/2019"
    E seleciono em "Number of Seats": "2"
    E seleciono em Right Hand Drive No
    E seleciono em "Number of Seats Motorcycle": "2"
    E seleciono em "Fuel Type": "Gas"
    E informo em "Payload": "200"
    E informo em "Total Weight": "250"
    E informo em "List Price": "15000"
    E informo em "License Plate Number": "ABW-3456"
    E informo em "Annual Mileage": "10000"
    Entao devo clicar em Next para o formulario "enter insurant data"
   