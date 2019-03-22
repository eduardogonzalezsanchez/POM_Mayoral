package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class CampaignContentAfterNew extends TestBase{
	
	//Page Factory - OR:
	
	@FindBy(xpath ="//tr[@class='odd']//a[@data-toggle='modal']")
	private WebElement editar;
	
	public CampaignContentAfterNew() {
		PageFactory.initElements(driver, this);
	}
	
	public Formulario clickOnEdit() {
		editar.click();
		return new Formulario();
	}
	
	

}
