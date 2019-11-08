package com.app.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.BasePage;
import com.app.pages.HomePageObject;

public class HomePageTest {
	HomePageObject ho;
	
	HomePageTest ht;

	public HomePageTest()
	{
		ho = new HomePageObject();
		
	}
	
@Test	
	public void verifyTags()
	{
	
	System.out.println("start   1");
	Assert.assertTrue(ho.elementFound(ho.getWomenPath()));
	//Assert.assertTrue(ho.elementFound(ho.getDressesPath()));
	//Assert.assertTrue(ho.elementFound(ho.getTshirtPath()));	
	
	}
	public void verifyNavigation()
	{
		ho.navigateWomen();
		Assert.assertTrue(ho.getTitle().contains("women"));
		//ho.navigateDresses();
		//Assert.assertTrue(ho.getTitle().contains("dresses"));
		//ho.navigateTshirt();
		//Assert.assertTrue(ho.getTitle().contains("Tshirt"));
	}}

	
	