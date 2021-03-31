package io.cucumber.danilo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.danilo.servicos.Configuracoes;

import io.cucumber.java.pt.*;

public class Formulario2InsurantSteps {
	
	@Dado("seleciono em Gender Female")
	public void seleciono_em_Gender_Female() {
		Configuracoes.browser.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]/span")).click();
	}

	@Dado("seleciono em Hobbies Bungee Jumping")
	public void seleciono_em_Hobbies_Bungee_Jumping() {
		Configuracoes.browser.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]/span")).click();
	}

	@Dado("anexo em Picture foto jpeg")
	public void anexo_em_Picture_foto_jpeg() {
		WebElement addFile = Configuracoes.browser.findElement(By.xpath("//*[@id=\"picturecontainer\"]"));
		String dir = new String();
		// Foto exemplo na pasta assets, antes de rodar o teste ajustar o caminho do diretório.
		dir = "C:\\Users\\isabe\\Desktop\\Projetos\\prova-individual-accenture\\assets\\foto.jpeg"; 
		addFile.sendKeys(dir);
	}
}
