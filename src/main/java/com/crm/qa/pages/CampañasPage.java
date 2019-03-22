package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class CampañasPage extends TestBase {

	// Page Factory - OR:

	@FindBy(xpath = "//a[contains(text(),'Nueva')]")
	private WebElement Nueva;

	// Initializing the Page Objects:

	public CampañasPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public NuevaCampañaPage clickOnNuevaCam() {
		Nueva.click();
		return new NuevaCampañaPage();
	}

}
