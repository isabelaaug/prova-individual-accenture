package io.cucumber.danilo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.danilo.servicos.Configuracoes;

import io.cucumber.java.pt.*;


public class Formulario2InsurantSteps {
	
	@Dado("informo em First Name {string}")
	public void informo_em_First_Name(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("input[name='First Name']"));
		input.sendKeys(string);
	}

	@Dado("informo em Last Name {string}")
	public void informo_em_Last_Name(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("input[name='Last Name']"));
		input.sendKeys(string);
	}

	@Dado("digito em Date of Birth {string}")
	public void digito_em_Date_of_Birth(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("input[name='Date of Birth']"));
		input.sendKeys(string);
	}

	@Dado("seleciono em Gender Female")
	public void seleciono_em_Gender_Female() {
		Configuracoes.browser.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]/span")).click();
	}

	@Dado("informo em Street Address {string}")
	public void informo_em_Street_Address(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("input[name='Street Address']"));
		input.sendKeys(string);
	}

	@Dado("seleciono em Country {string}")
	public void seleciono_em_Country(String string) {
		Select dropdown = new Select(Configuracoes.browser.findElement(By.id("country")));
		dropdown.selectByValue(string);
	}

	@Dado("informo em Zip Code {string}")
	public void informo_em_Zip_Code(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("input[name='Zip Code']"));
		input.sendKeys(string);
	}

	@Dado("informo em City {string}")
	public void informo_em_City(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("input[name='City']"));
		input.sendKeys(string);
	}

	@Dado("seleciono em Occupation {string}")
	public void seleciono_em_Occupation(String string) {
		Select dropdown = new Select(Configuracoes.browser.findElement(By.id("occupation")));
		dropdown.selectByValue(string);
	}

	@Dado("seleciono em Hobbies {string}")
	public void seleciono_em_Hobbies(String string) {
		Configuracoes.browser.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]/span")).click();
	}

	@Dado("informo em Website {string}")
	public void informo_em_Website(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("input[name='Website']"));
		input.sendKeys(string);
	}

	@Dado("anexo em Picture foto jpeg")
	public void anexo_em_Picture_foto_jpeg() {
		WebElement addFile = Configuracoes.browser.findElement(By.xpath("//*[@id=\"picture\"]"));
  		addFile.sendKeys("C:/Users/isabe/Desktop/Projetos/prova-individual-accenture/assets/foto.jpeg");
	}

	@Entao("devo clicar em Next para o formulario Product Data")
	public void devo_clicar_em_Next_para_o_formulario_Product_Data() {
		Configuracoes.browser.findElement(By.cssSelector("button[id='nextenterproductdata']")).click();
	}
}
