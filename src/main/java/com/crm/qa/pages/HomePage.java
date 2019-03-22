package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase  {
	public static WebDriverWait wait;
	
	
	//Page Factory - OR:
 
			@FindBy(xpath = "//a[@id='regionChangeConfirm']")
			private WebElement aceptar;
			
			@FindBy(xpath = "//img[@src='//media.mayoral.com/wcsstore/mayoral/images/ico_user_504F4F.svg']")
			private WebElement lgnImage;
			
			@FindBy(xpath = "//a[@class='newsletter_close']")
			private WebElement cerrar;
			
			@FindBy(xpath = "//a[contains(text(),'Recién nacido')]")
			private WebElement recienNacido;
			
			@FindBy(xpath="//a[@id='mgmenu_300000000000089168']")
			private WebElement el;
			
			@FindBy(xpath="//a[@id='menu_300000000000929119']")
			private WebElement abrigos;
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);

		
	}
	
	//actions
	public void quitarBasura() {
		aceptar.click();
		wait = new WebDriverWait(driver, Integer.parseInt(prop.getProperty("explicit.wait")));
		wait.until(ExpectedConditions.elementToBeClickable(cerrar)).click();
	}
	
	public LoginPage clickOnLogin() {
		lgnImage.click();
		return new LoginPage();
	}

	public void comprarRecienNacidoEl() {
		Actions builder = new Actions(driver);
		builder.moveToElement(recienNacido).moveToElement(el).click().perform();
		wait = new WebDriverWait(driver, Integer.parseInt(prop.getProperty("explicit.wait")));
		wait.until(ExpectedConditions.elementToBeClickable(abrigos)).click();
	}

	/*@FindBy(xpath = "//td[contains(text(),'User: Naveen K')]")
	@CacheLookup
	WebElement userNameLabel;

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newContactLink;
	

	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement dealsLink;

	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement tasksLink;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	
	public boolean verifyCorrectUserName(){
		return userNameLabel.isDisplayed();
	}
	
	public ContactsPage clickOnContactsLink(){
		contactsLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink(){
		dealsLink.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTasksLink(){
		tasksLink.click();
		return new TasksPage();
	}
	
	public void clickOnNewContactLink(){
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLink.click();
		
	}*/
	
	
	
	
	
	
	

}
