# Prova Individual - Accenture

<img src="https://github.com/isabelaaug/prova-individual-accenture/blob/master/assets/accenture-gama.PNG" alt="logo">

> Status do Projeto: Concluído. :heavy_check_mark: 

# Descrição do Projeto :page_facing_up:

### Criar um projeto em Selenium Webdrive (Java) e Cucumber usando Page Objects para o seguinte caso:<br>
<p>Entrar no site http://sampleapp.tricentis.com/101/app.php<br>
⮚ Preencher o formulário, aba “Enter Vehicle Data” e pressione next<br>
⮚ Preencher o formulário, aba “Enter Insurant Data” e pressione next<br>
⮚ Preencher o formulário, aba “Enter Product Data” e pressione next<br>
⮚ Preencher o formulário, aba “Select Price Option” e pressione next<br>
⮚ Preencher o formulário, aba “Send Quote” e pressione Send<br>
⮚ Verificar a mensagem “Sending e-mail success!” na tela<p>

--------------------------------------------------------------------

## Tecnologias utilizadas :books:
:heavy_check_mark: <b>Java</b><br>
Linguagem de programação utilizada para o desenvolvimento da aplicação<br>

:heavy_check_mark: <b>Maven</b><br>
Gerenciador de dependências para o Java<br>

:heavy_check_mark: <b>Cucumber</b><br>
Framework responsável por traduzir a linguagem humana dos cenários em códigos Java<br>

:heavy_check_mark: <b>Selenium</b><br>
Framework responsável por fazer a integração do código Java com a linguagem Gherkin(Cucumber), abrindo um browser e realizando os testes de comportamento<br>

--------------------------------------------------------------------
## Como rodar a aplicação :arrow_forward:
--------------------------------------------------------------------
### Pré requisitos :information_source:
- Instalar o Java (projeto desenvolvido em Java 8):
https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR
- Instalar jdk:
https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html
- Verificar se o JAVA_HOME está configurado nas variáveis de ambiente do seu sistema
--------------------------------------------------------------------

- Realizando clone do projeto:
 ```bash
git clone https://github.com/isabelaaug/prova-individual-accenture.git
 ```

- Entrando na pasta do projeto:
 ```bash
cd prova-individual-accenture
 ```

- Configurando Selenium:<br>

Fazer o download do Chrome Webdriver (conforme a versão do Google Chrome que possui instalado em seu computador) e colocar o arquivo descompactado dentro da pasta driver na raiz do projeto:<br>
https://chromedriver.chromium.org/downloads<br>
<br>
<b>Exemplo:</b><br>
 ```bash
cd driver
curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip
cd ../driver
 ```

- Limpando e validando Maven Unix:
 ```bash
./mvnw clean
 ```
 
- Limpando e validando Maven Windows:
 ```bash
mvnw.cmd clean
 ```

- Executando os testes no Unix:
 ```bash
./test.sh
 ```

- Executando os teste no Windows:
 ```bash
test.bat
 ```
 ## Desenvolvedores/Contribuintes :octocat:
Desenvolvido por Isabela Augusta de Oliveira. [Meu contato](https://www.linkedin.com/in/isabela-augusta-de-oliveira-8a50a8194/) :blush:
