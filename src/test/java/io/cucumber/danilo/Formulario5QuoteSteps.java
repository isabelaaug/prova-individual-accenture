package io.cucumber.danilo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.danilo.servicos.Configuracoes;

import io.cucumber.java.pt.*;


public class Formulario5QuoteSteps {
	
	@Dado("clico em Send")
	public void clico_em_Send() throws InterruptedException{
		Thread.sleep(5000);
		Configuracoes.browser.findElement(By.cssSelector("button[id='sendemail']")).click();
	}

	@Entao("devo ver a mensagem {string}")
	public void devo_ver_a_mensagem(String string) throws InterruptedException {
		Thread.sleep(15000);
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("div[class='sweet-alert showSweetAlert visible']"));
		WebElement mensagem = Configuracoes.browser.findElement(By.cssSelector("body>div.sweet-alert.showSweetAlert.visible>h2"));
	    assertTrue(input.isDisplayed());
	    assertEquals(string, mensagem.getText());
	    Configuracoes.fechar();
	}
}
