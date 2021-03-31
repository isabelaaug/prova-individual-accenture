package io.cucumber.danilo;

import io.cucumber.java.pt.*;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.danilo.servicos.Configuracoes;

public class CompartilhadoSteps {

	@Dado("seleciono em {string}: {string}")
	public void seleciono_em(String string, String string2) {
		Select dropdown = new Select(Configuracoes.browser.findElement(By.name(string)));
		dropdown.selectByValue(string2);
	}

	@Dado("informo em {string}: {string}")
	public void informo_em(String string, String string2) {
		WebElement input = Configuracoes.browser.findElement(By.name(string));
		input.sendKeys(string2);
	}
	
	@Entao("devo clicar em Next para o formulario {string}")
	public void devo_clicar_em_Next_para_o_formulario(String string) {
		Configuracoes.browser.findElement(By.cssSelector("button[id='next"+string.replace(" ", "")+"']")).click();
	}
	
	@Dado("que eu estou no site da Tricentis no formulario {string}")
	public void que_eu_estou_no_site_da_Tricentis_no_formulario(String string) throws InterruptedException{
		Thread.sleep(5000);
		String formSelecionado = Configuracoes.browser.findElement(By.cssSelector("li[class='idealsteps-step-active']")).getText();
		assertTrue(formSelecionado.contains(string));
	}	
}
