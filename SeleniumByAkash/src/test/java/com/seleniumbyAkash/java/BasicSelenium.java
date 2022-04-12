package com.seleniumbyAkash.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicSelenium {

	public static void main(String[] args) 
	{
	
		// Set the path of browser driver
		         WebDriverManager.chromedriver().setup();
		         
				// Topcasting/Upcasting - Object of ChromeDriver class with WebDriver interface
		         //step 1:
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize(); // maximize browser window 
				//driver.manage().deleteAllCookies(); // delete all cookies
						
				//Step 2: entering url to open
				driver.get("http://demo.automationtesting.in/Index.html");
				
				//Step 3a:find the element
				WebElement email=driver.findElement(By.id("email"));
				
				//step 3b: Perform operation on it
				email.sendKeys("abc@gmail.com");
				
				//or step 4:find element and perform operation
				driver.findElement(By.id("enterimg")).click();
				
				//Validation /assertion
				
				// fetching page title
				String pageTitle = driver.getTitle();
				System.out.println("Current Page title is : " + pageTitle);
				
				// fetching page url after the page is opened in browser
				String pageUrl = driver.getCurrentUrl();
				System.out.println("Current Page Url is : "+ pageUrl);
				
				//System.out.println("Current Page Source is : "+ driver.getPageSource());

				
				// Validation
				if(pageTitle.equalsIgnoreCase("Register"))
				{
					System.out.println("Page title is correct");
				}
				else {
					System.out.println("Page Title is incorrect");
				}
				
				driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Anil");
				// closing the current opened browser window
				driver.quit();
	}

}
