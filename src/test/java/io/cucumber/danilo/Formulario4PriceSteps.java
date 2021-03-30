package io.cucumber.danilo;

import org.openqa.selenium.By;

import io.cucumber.danilo.servicos.Configuracoes;

import io.cucumber.java.pt.*;


public class Formulario4PriceSteps {
	
	@Dado("seleciono em Select Option o plano Platinum")
	public void seleciono_em_Select_Option_o_plano_Platinum() {
		Configuracoes.browser.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span")).click();
	}

	@Entao("devo clicar em Next para o formulario Send Quote")
	public void devo_clicar_em_Next_para_o_formulario_Send_Quote() throws InterruptedException{
		Thread.sleep(3000);
		Configuracoes.browser.findElement(By.cssSelector("button[id='nextsendquote']")).click();
	}
}
