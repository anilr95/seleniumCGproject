package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager 
{
	private static WebDriver driver;
	
	public static WebDriver getDriver(String browserName) 
	{
		if(browserName.equalsIgnoreCase("chrome")) 
		{
			driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) 
		{
			driver=new FirefoxDriver();
		}else {
			driver=null;
		      }
		return driver;
	}
}
