package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class SignUpPageObjects 
{
	//1st thing--added driver
	WebDriver driver;
	
	//2nd thing----added locators
	private By email=By.id("email");
	private	By clickSubmitBtn=By.id("enterimg");
	
	//3rd thing-------constructor
	public SignUpPageObjects(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	//4th methods
	public void setEmail(String arg)
        {
		driver.findElement(email).sendKeys(arg);
		}
	
	public void clickOnSubmitBtn()
    	{
		driver.findElement(clickSubmitBtn).click();
    	}
	
	//wrapper methods/bussiness method/keyword methods
	public void SignUpUser(String arg)
	{
		setEmail(arg);
		clickOnSubmitBtn();
	}
	
	//validation or assertions ---this also one type of wrapper method
	public void verifyTheTitle(String expectedTitle)
    {
		String title=driver.getTitle();
		Assert.assertEquals("Title Matching assertion","Register",title);
	}
	}
