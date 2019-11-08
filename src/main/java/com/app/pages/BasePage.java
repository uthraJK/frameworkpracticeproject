package com.app.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public static WebDriver driver;
	public static String browser ="chrome";
	
	public BasePage()
	{
		if(driver==null)
		{
			if(browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Balajee\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			driver.manage().window().maximize();
			
			driver.get("http://automationpractice.com/index.php ");
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}
		}
		public boolean elementFound(WebElement element) 
		{
			boolean res = false;
			try
		{
				res= element.isDisplayed();
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return res;
		}
		public void setText(WebElement element,String name)  
		{
			if(name!=null)
			{
				
			element.click();
			element.clear();
			element.sendKeys(name);
		}
		}
		public String getTxtAttribute(WebElement element)
		{
			return element.getAttribute("value");
		}
		public String selectFromDropdown(WebElement element, String option)
		{
			Select select = new Select(element);
			select.selectByValue(option);
			return select.getFirstSelectedOption().getText();
		}
		public boolean isElementVisible(WebElement element)
		{
			try
			{
				WebDriverWait wait = new WebDriverWait(driver,90);
				wait.until(ExpectedConditions.visibilityOf(element));
				return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return false;
			}
		}
		public String getTitle()
		{
			return driver.getTitle();
		}
		public void quitDriver()
		{
			driver.quit();
		}
}
		
		
		