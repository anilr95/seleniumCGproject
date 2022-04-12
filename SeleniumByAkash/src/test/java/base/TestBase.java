package base;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import manager.DriverManager;

public class TestBase 
{
	protected WebDriver driver;
	protected String baseurl="http://demo.automationtesting.in";
	
	@Before
	public void setup() 
	{
		  WebDriverManager.chromedriver().setup(); 
		
		 //driver = new ChromeDriver();----instead we can write this as below
		  driver=DriverManager.getDriver("chrome");  //or
		  
		  //use this for  taking input from cmd to which browser we have to use
		//String getBrowserNameFromCmd=System.getProperty("browser");  
		//driver=DriverManager.getDriver(getBrowserNameFromCmd);
		  
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
	}
	
	@After
	public void cleanUp() 
	{
		driver.quit();
	}
	
}
