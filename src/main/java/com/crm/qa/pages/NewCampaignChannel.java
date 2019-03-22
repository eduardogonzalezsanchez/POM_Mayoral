package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;


public class NewCampaignChannel extends TestBase{
			
		// Page Factory - OR:
		
		@FindBy(xpath ="//input[@value='0']")
		private WebElement cofaresChbx;
		
		@FindBy(xpath="//button[@type='button']")
		private WebElement GuardarBtn;
		

		//Initializing the Page Objects:
		public NewCampaignChannel(){
			PageFactory.initElements(driver, this);
			
		}
		
		//actions
		
		public Contenido stepTwo() {
			cofaresChbx.click();
			GuardarBtn.click();
			return new Contenido();	
		}

}
