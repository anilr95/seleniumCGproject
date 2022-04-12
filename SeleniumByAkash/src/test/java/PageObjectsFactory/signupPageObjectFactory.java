package PageObjectsFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class signupPageObjectFactory 
{
	//1st thing--added driver
		WebDriver driver;
		
		//2nd thing----added locators
		@FindBy(id="email")
		private WebElement email;
		
		@FindBy(id="enterimg")
		private WebElement ClickSubmitBtn;
		
		
		//3rd thing-------constructor
		public signupPageObjectFactory(WebDriver driver) 
		{
			this.driver=driver;
			PageFactory.initElements(driver,signupPageObjectFactory.class);
		}
		
		//4th methods
		public void setEmail(String arg)
	        {
			email.sendKeys(arg);
			}
		
		public void ClickOnSubmitBtn()
	    	{
			ClickSubmitBtn.click();
	    	}
		
		//wrapper methods/bussiness method/keyword methods
		public void SignUpUser(String arg)
		{
			setEmail(arg);
			ClickOnSubmitBtn();
		}
		
		//validation or assertions ---this also one type of wrapper method
		public void verifyTheTitle(String expectedTitle)
	    {
			String title=driver.getTitle();
			Assert.assertEquals("Title Matching assertion","Register",title);
		}

}
