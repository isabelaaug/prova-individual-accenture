package io.cucumber.danilo;

import org.openqa.selenium.By;

import io.cucumber.danilo.servicos.Configuracoes;

import io.cucumber.java.pt.*;


public class Formulario1VehicleSteps {
	
	@Dado("que eu estou no site da Tricentis {string}")
	public void que_eu_estou_no_site_da_Tricentis(String string) {
	    Configuracoes.abrir(string);
	}
	
	@Dado("seleciono em Right Hand Drive No")
	public void seleciono_em_Right_Hand_Drive_No() {
		Configuracoes.browser.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[2]/span")).click();
	}
}
