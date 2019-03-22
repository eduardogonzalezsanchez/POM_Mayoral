package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;
import com.crm.qa.config.*;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:

	
	@FindBy(xpath = "//input[@name='logonId']")
	private WebElement Id;

	@FindBy(xpath = "//input[@name='logonPassword']")
	private WebElement password;
	
	@FindBy(xpath ="//button[@id='WC_AccountDisplay_links_2']")
	private WebElement btnIniciar;
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:

	
	public HomePage login(String un, String pwd){
		Id.sendKeys(un);
		password.sendKeys(pwd);
		//loginBtn.click();
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", btnIniciar);
		return new HomePage();
	}
	

}
