package com.app.tests;

import org.testng.Assert;

import com.app.pages.BasePage;
import com.app.pages.HomePageObject;

public class HomePageTest extends BasePage {
	HomePageObject ho;
	BasePage bp;
	HomePageTest ht;
	
	public HomePageTest()
	{
		ho = new HomePageObject();
		bp = new BasePage();
	}
	
	
	public void verifyTags()
	{
		Assert.assertEquals(arg0, arg1);
	}
	
	
	
}
 