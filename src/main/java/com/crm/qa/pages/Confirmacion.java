package com.crm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class Confirmacion extends TestBase {

	// Page Factory - OR:
	@FindBy(xpath = "//input[@id='saveplantilla']")
	private WebElement grabar;
	
	private WebDriverWait wait;

	// Initializing the Page Objects:
	public Confirmacion() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public void clickOnGrabar() {

		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("saveplantilla")));
		//wait.until(ExpectedConditions.visibilityOf(grabar));
		
		//Actions actions = new Actions(driver);
		//actions.moveToElement(grabar).click().perform();
		new Actions(driver).moveToElement(grabar).click().perform();

		
		

	
	}
}
