package io.cucumber.danilo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.danilo.servicos.Configuracoes;

import io.cucumber.java.pt.*;


public class Formulario1VehicleSteps {
	
	@Dado("que eu estou no site da Tricentis {string}")
	public void que_eu_estou_no_site_da_Tricentis(String string) {
	    Configuracoes.abrir(string);
	}
	
	@Dado("seleciono em Make {string}")
	public void seleciono_em_Make(String string) {
		Select dropdown = new Select(Configuracoes.browser.findElement(By.id("make")));
		dropdown.selectByValue(string);
	}

	@Dado("seleciono em Model {string}")
	public void seleciono_em_Model(String string) {
		Select dropdown = new Select(Configuracoes.browser.findElement(By.id("model")));
		dropdown.selectByValue(string);
	}

	@Dado("informo em Cylinder Capacity {string}")
	public void informo_em_Cylinder_Capacity(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("input[name='Cylinder Capacity']"));
		input.sendKeys(string);
	}

	@Dado("informo em Engine Performance {string}")
	public void informo_em_Engine_Performance(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("input[name='[kW]']"));
		input.sendKeys(string);
	}

	@Dado("digito em Date of Manufacture {string}")
	public void digito_em_Date_of_Manufacture(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("input[name='Date of Manufacture']"));
		input.sendKeys(string);
	}

	@Dado("seleciono em Number of Seats {string}")
	public void seleciono_em_Number_of_Seats(String string) {
		Select dropdown = new Select(Configuracoes.browser.findElement(By.id("numberofseats")));
		dropdown.selectByValue(string);
	}

	@Dado("seleciono em Right Hand Drive No")
	public void seleciono_em_Right_Hand_Drive_No() {
		Configuracoes.browser.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[2]/span")).click();
	}

	@Dado("seleciono novamente Number of Seats {string}")
	public void seleciono_novamente_Number_of_Seats(String string) {
		Select dropdown = new Select(Configuracoes.browser.findElement(By.id("numberofseatsmotorcycle")));
		dropdown.selectByValue(string);
	}

	@Dado("seleciono Fuel Type {string}")
	public void seleciono_Fuel_Type(String string) {
		Select dropdown = new Select(Configuracoes.browser.findElement(By.id("fuel")));
		dropdown.selectByValue(string);
	}

	@Dado("informo em Payload {string}")
	public void informo_em_Payload(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("input[name='Payload']"));
		input.sendKeys(string);
	}

	@Dado("informo em Total Weight {string}")
	public void informo_em_Total_Weight(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("input[name='Total Weight']"));
		input.sendKeys(string);
	}

	@Dado("informo em List Price {string}")
	public void informo_em_List_Price(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("input[name='List Price']"));
		input.sendKeys(string);
	}

	@Dado("informo em License Plate Number {string}")
	public void informo_em_License_Plate_Number(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("input[name='License Plate Number']"));
		input.sendKeys(string);
	}

	@Dado("informo em Annual Mileage {string}")
	public void informo_em_Annual_Mileage(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("input[name='Annual Mileage']"));
		input.sendKeys(string);
	}

	@Entao("devo clicar em Next para o formulario Insurant Data")
	public void devo_clicar_em_Next_para_o_formulario_Insurant_Data() {
		Configuracoes.browser.findElement(By.cssSelector("button[id='nextenterinsurantdata']")).click();
	}
}
