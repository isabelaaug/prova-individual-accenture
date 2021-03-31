package io.cucumber.danilo;

import org.openqa.selenium.By;

import io.cucumber.danilo.servicos.Configuracoes;

import io.cucumber.java.pt.*;


public class Formulario3ProductSteps {
	
	@Dado("seleciono em Optional Products Euro Protection")
	public void seleciono_em_Optional_Products_Euro_Protection() {
		Configuracoes.browser.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span")).click();
	}
}
