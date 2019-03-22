package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class MenuLateral extends TestBase{
	
	//Page Factory - OR:
	
		@FindBy(xpath = "//span[contains(text(),'CAMPAÑAS')]")
		private WebElement CAMPANAS;
		
		@FindBy(xpath = "//a[contains(text(),'Campa')]")
		private WebElement campanas;
		
		
		//Initializing the Page Objects:
		public MenuLateral(){
			PageFactory.initElements(driver, this);
		}
		
		//actions
		
		public CampañasPage clickOnCampañas() {
			CAMPANAS.click();
			campanas.click();
			return new CampañasPage();
		}

}
