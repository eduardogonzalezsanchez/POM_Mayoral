package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class NuevaCampañaPage extends TestBase{
	
	// Page Factory - OR:
	
	@FindBy(xpath ="//input[@name='name']")
	private WebElement name;
	
	@FindBy(xpath="//input[@name='date_time']")
	private WebElement date; 
	
	@FindBy(xpath="//div[3]//div[1]//div[1]//input[1]")
	private WebElement startDate;
	
	@FindBy(xpath="//div[3]//div[2]//input[1]")
	private WebElement finishDate;
	
	@FindBy(xpath="//div[3]//div[3]//button[contains(text(),'Aplicar')]")
	private WebElement buttonDate;
	
	@FindBy(xpath="//button[@id='savecampaign']")
	private WebElement siguienteBtn;
	
	
	
	
	//Initializing the Page Objects:
	public NuevaCampañaPage(){
		PageFactory.initElements(driver, this);
		
	}
	
	public NewCampaignChannel fillForm() {
		name.sendKeys("prueba1");
		date.click();
		startDate.sendKeys("14/07/2019");
		finishDate.sendKeys("10/10/2019");
		buttonDate.click();
		siguienteBtn.click();
		return new NewCampaignChannel();	
	}
	
	
	
	

}
