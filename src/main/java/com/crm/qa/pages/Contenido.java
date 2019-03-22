package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class Contenido extends TestBase{
	
	//Page Factory - OR:
		@FindBy(xpath = "//input[@id='contentname']")
		private WebElement name;
		
		@FindBy(xpath = "//select[@id='idcontenttype']")
		private WebElement contentype;

		@FindBy(xpath = "//select[@id='weekday']")
		private WebElement dialaborable;
		
		@FindBy(xpath ="//button[@id='btn-submit']")
		private WebElement guardar;
		
		@FindBy(xpath ="//a[@id='preview']")
		private WebElement plantilla;
		
		
		
		
		
		//Initializing the Page Objects:
		public Contenido(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		
		public CampaignContentAfterNew cargarContenido() {
			name.sendKeys("prueba");
			Select dropdown = new Select(contentype);
			dropdown.selectByIndex(2);
			Select dropdown1 = new Select(dialaborable);
			dropdown1.selectByVisibleText("Domingo");
			guardar.click();
			return new CampaignContentAfterNew(); 
		}
		
		public Formulario clickOnPlantilla() {
			plantilla.click();
			return new Formulario();
		}

}
