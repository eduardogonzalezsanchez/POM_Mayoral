package com.crm.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Formulario extends TestBase {
	
	@FindBy(xpath ="//input[@value='TEMPLATE-1']")
	private WebElement form;
	
	@FindBy(xpath ="//input[@id='NOMBRE_FARMACIA']")
	private WebElement name;
	
	@FindBy(xpath ="//textarea[@id='TITLE']")
	private WebElement title;
	
	@FindBy(xpath ="//textarea[@id='CONTENT']")
	private WebElement content;
	
	@FindBy(xpath ="//input[@id='PRICE']")
	private WebElement price;
	
	@FindBy(xpath ="//input[@id='IMG']")
	private WebElement img;
	
	@FindBy(xpath ="//input[@id='SUBMIT']")
	private WebElement submit;
	
	String currentUrl;
	String idContent;
	String idCampaign;
	String newUrl;
	
	
	
	
	public Formulario() {
		PageFactory.initElements(driver, this);
	}
	
	public Confirmacion chooseForm() {
		currentUrl = new String(driver.getCurrentUrl());
		idCampaign = currentUrl.substring(73);
		idContent = currentUrl.substring(67, 72);
		driver.get("https://ladorianids.com/plantillascontenido/7/formulario.php?idcontent="
				+ idContent + "&idcampaign=" + idCampaign);
		form.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");
		name.sendKeys("rutilla");
		title.sendKeys("campo");
		content.sendKeys("pagar");
		price.sendKeys("60€");
		img.sendKeys("C:\\Users\\Eduardo Gonzalez\\Desktop\\eduardo gonzalez\\pilar y edu.jpg");
		submit.click();
		return new Confirmacion();
		
	}

}
