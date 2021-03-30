package io.cucumber.danilo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.danilo.servicos.Configuracoes;

import io.cucumber.java.pt.*;


public class Formulario5QuoteSteps {
	
	@Dado("informo em e-mail {string}")
	public void informo_em_e_mail(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("input[name='E-Mail']"));
		input.sendKeys(string);
	}

	@Dado("informo em Phone {string}")
	public void informo_em_Phone(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("input[name='Phone']"));
		input.sendKeys(string);
	}

	@Dado("informo em Username {string}")
	public void informo_em_Username(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("input[name='Username']"));
		input.sendKeys(string);
	}

	@Dado("informo em Password {string}")
	public void informo_em_Password(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("input[name='Password']"));
		input.sendKeys(string);
	}

	@Dado("informo em Confirm Password {string}")
	public void informo_em_Confirm_Password(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("input[name='Confirm Password']"));
		input.sendKeys(string);
	}

	@Dado("informo em Comments {string}")
	public void informo_em_Comments(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("textarea[name='Comments']"));
		input.sendKeys(string);
	}

	@Dado("clico em Send")
	public void clico_em_Send() throws InterruptedException{
		Thread.sleep(5000);
		Configuracoes.browser.findElement(By.cssSelector("button[id='sendemail']")).click();
	}

	@Entao("devo ver a mensagem {string}")
	public void devo_ver_a_mensagem(String string) throws InterruptedException {
		Thread.sleep(20000);
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("div[class='sweet-alert showSweetAlert visible']"));
		WebElement mensagem = Configuracoes.browser.findElement(By.cssSelector("body>div.sweet-alert.showSweetAlert.visible>h2"));
	    assertTrue(input.isDisplayed());
	    assertEquals(string, mensagem.getText());
	    Configuracoes.fechar();
	}
}
