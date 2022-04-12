package PageObjectsFactory;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.SignUpPageObjects;

public class TestScriptJUnitPageFactory 
{

	  @Test 
	  public void Register() 
	  { 
		  //Steps :
	  WebDriverManager.chromedriver().setup(); 
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://demo.automationtesting.in/Index.html");
	  
	  SignUpPageObjects signUpPageObjects=new SignUpPageObjects(driver);
	  
	  //Tests steps
	  signUpPageObjects.SignUpUser("abc@gmail.com");
	  signUpPageObjects.verifyTheTitle("Register");
	  
	  }
}
