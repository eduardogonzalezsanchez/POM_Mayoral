package com.crm.qa.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CampaignContentAfterNew;
import com.crm.qa.pages.CampañasPage;
import com.crm.qa.pages.Confirmacion;
import com.crm.qa.pages.Contenido;
import com.crm.qa.pages.Formulario;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MenuLateral;
import com.crm.qa.pages.NewCampaignChannel;
import com.crm.qa.pages.NuevaCampañaPage;

public class CampañasTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	CampañasPage campañasPage;
	NuevaCampañaPage nuevaCampañaPage;
	NewCampaignChannel newCampaignChannel;
	Contenido contenido;
	CampaignContentAfterNew campaignContentAfterNew;
	Formulario formulario;
	Confirmacion confirmacion;
	
	
	public CampañasTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
		homePage=new HomePage();
		campañasPage=new CampañasPage();
		nuevaCampañaPage=new NuevaCampañaPage();
		newCampaignChannel= new NewCampaignChannel();
		contenido= new Contenido();
		campaignContentAfterNew= new CampaignContentAfterNew(); 
		formulario=new Formulario();
		confirmacion=new Confirmacion();
	}
	
	
	@Test(priority=3)
	public void CampañasTest(){
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		homePage.clickOnCampañas();
		campañasPage.clickOnNuevaCam();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// This will scroll down the page by 2500 pixel vertical and click in
		// grabar
		js.executeScript("window.scrollBy(0,2500)");
		System.out.println("estoy aqui:  "+driver.getCurrentUrl());
		nuevaCampañaPage.fillForm();
		newCampaignChannel.stepTwo();
		contenido.cargarContenido();
		campaignContentAfterNew.clickOnEdit();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Contenido contenido1=new Contenido();
		contenido1.clickOnPlantilla();
		initialization();
		formulario.chooseForm();
		confirmacion.clickOnGrabar();
		
		
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}
}
