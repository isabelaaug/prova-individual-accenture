package io.cucumber.danilo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.danilo.servicos.Configuracoes;

import io.cucumber.java.pt.*;


public class Formulario3ProductSteps {
	
	@Dado("digito em Start Date {string}")
	public void digito_em_Start_Date(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("input[name='Start Date']"));
		input.sendKeys(string);
	}

	@Dado("seleciono em Insurance Sum {string}")
	public void seleciono_em_Insurance_Sum(String string) {
		Select dropdown = new Select(Configuracoes.browser.findElement(By.id("insurancesum")));
		dropdown.selectByValue(string);
	}

	@Dado("seleciono em Merit Rating {string}")
	public void seleciono_em_Merit_Rating(String string) {
		Select dropdown = new Select(Configuracoes.browser.findElement(By.id("meritrating")));
		dropdown.selectByValue(string);
	}
	
	@Dado("seleciono em Damage Insurance {string}")
	public void seleciono_em_Damage_Insurance(String string) {
		Select dropdown = new Select(Configuracoes.browser.findElement(By.id("damageinsurance")));
		dropdown.selectByValue(string);
	}

	@Dado("seleciono em Optional Products Euro Protection")
	public void seleciono_em_Optional_Products_Euro_Protection() {
		Configuracoes.browser.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span")).click();
	}

	@Dado("seleciono em Courtesy Car {string}")
	public void seleciono_em_Courtesy_Car(String string) {
		Select dropdown = new Select(Configuracoes.browser.findElement(By.id("courtesycar")));
		dropdown.selectByValue(string);
	}

	@Entao("devo clicar em Next para o formulario Price Option")
	public void devo_clicar_em_Next_para_o_formulario_Price_Option() {
		Configuracoes.browser.findElement(By.cssSelector("button[id='nextselectpriceoption']")).click();
	}
}
