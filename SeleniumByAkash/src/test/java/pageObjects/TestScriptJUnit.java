package pageObjects;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestScriptJUnit extends TestBase
{ 
	/*//No need to define these things here coz we have created separat class i.e:TestBase
	 * 
	 * WebDriver driver; String baseurl="http://demo.automationtesting.in";
	 * 
	 * @Before public void setup() { WebDriverManager.chromedriver().setup(); driver
	 * = new ChromeDriver(); driver.manage().timeouts().implicitlyWait(30,
	 * TimeUnit.SECONDS); driver.manage().window().maximize(); }
	 * 
	 * @After public void cleanUp() { driver.quit(); }
	 */ 
	  @Test 
	  public void Register() 
	  { 
	  
	  driver.get(baseurl + "/Index.html");       //optimizing the url or avoiding hardcode or url
	  
	  SignUpPageObjects signUpPageObjects=new SignUpPageObjects(driver);
	  
	  //Tests steps
	  signUpPageObjects.SignUpUser("abc@gmail.com");
	  
	  //signUpPageObjects.setEmail("abc@gmail.com");
	  //signUpPageObjects.ClickOnSubmitBtn();
	  
	  signUpPageObjects.verifyTheTitle("Register");
	  
	  }
	 
	@Test
	public void Formfilling()
	 {
		driver.get(baseurl + "/Register.html");
		
		RegisterPageObjects registerPageObjects=new RegisterPageObjects(driver);
		registerPageObjects.setFirstName("anil");
		registerPageObjects.setLastName("rikshe");
		registerPageObjects.setAddress("Khanapur phata parbhani");
		registerPageObjects.setEmail("abc@gmail.com");
		registerPageObjects.setPhone("8275826483");
		registerPageObjects.clickOngenderRadioMale();
		registerPageObjects.selectSkillFromList("Java");


			 }

}
