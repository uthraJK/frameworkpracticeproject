package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObject extends BasePage {
	
	@FindBy(xpath = "//ul/li/a[@title='Women']")
	private WebElement women;
	
	@FindBy(xpath = " //ul/li[2]/a[@title='Dresses']")
	private WebElement dresses;
	
	@FindBy(xpath ="//ul/li[3]/a[@title ='T-shirts']")
	private WebElement tshirt;
	
	public WebElement getWomenPath()
	{
		return women;
	}
	public WebElement getDressesPath()
	{
		return dresses;
	}
	public WebElement getTshirtPath()
	{
		return tshirt;
	}
	public void navigateWomen() 
	{
		women.click();
	}
	public void navigateDresses() 
	{
		dresses.click();
	}
	public void navigateTshirt() 
	{
		tshirt.click();
	}

}
