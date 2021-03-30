package io.cucumber.danilo;

import io.cucumber.java.pt.*;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import io.cucumber.danilo.servicos.Configuracoes;

public class CompartilhadoSteps {

	@Dado("que eu estou no site da Tricentis no formulario {string}")
	public void que_eu_estou_no_site_da_Tricentis_no_formulario(String string) throws InterruptedException{
		Thread.sleep(5000);
		String formSelecionado = Configuracoes.browser.findElement(By.cssSelector("li[class='idealsteps-step-active']")).getText();
		assertTrue(formSelecionado.contains(string));
	}
}
