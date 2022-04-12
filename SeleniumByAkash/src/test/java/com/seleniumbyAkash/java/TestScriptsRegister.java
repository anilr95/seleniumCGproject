package com.seleniumbyAkash.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScriptsRegister {

	public static void main(String[] args) {
		// Set the path of browser driver
		WebDriverManager.chromedriver().setup();

		// Topcasting/Upcasting - Object of ChromeDriver class with WebDriver interface
		// step 1:
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize(); // maximize browser window
		// driver.manage().deleteAllCookies(); // delete all cookies

		// Step 2: entering url to open
		driver.get("http://demo.automationtesting.in/Index.html");

		// 3.Find element and perform operation on it
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("enterimg")).click(); 
		
		
		  //1.for FullName
		  driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys(
		  "Anil");
		  driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys(
		  "Rikshe");
		  
		  //2.for Address
		  driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).
		  sendKeys("Anusaya nagar parbhani");
		  
		  //3.For Email
		  driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys(
		  "abc@gmail.com");
		  
		  //4.Phone
		  driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys(
		  "9999999999");
		  
		  //5.Gender 
		  driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		  
		  //6.Hobbies
		  driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		  driver.findElement(By.xpath("//*[@value='Movies']")).click(); 
		  //Or we can use  above statement as like below 
		  //driver.findElement(By.xpath("//input[@type='checkbox'] and [@value='Cricket']")).click();
		  //driver.findElement(By.xpath("//*[@value='Cricket']")).click();
		  
		//7.For Language
		  Actions action=new Actions(driver); 
		  driver.findElement(By.xpath("//*[@id='msdd']")).click();
		  action.moveToElement(driver.findElement(By.xpath("//*[@id='msdd']"))).build().perform();
		  driver.findElement(By.xpath("//a[text()='English']")).click();
		  driver.findElement(By.xpath("//a[text()='Hindi']")).click();
		
		  
		  //8.For skill 
		  Select select=new Select(driver.findElement(By.id("Skills")));
		  select.selectByVisibleText("Java"); //always prefer selectbyvisibletext
		  
		  //9.For country 
		  Select select1=new Select(driver.findElement(By.id("countries")));
		  select1.selectByVisibleText("India");
		  
		  
		  //10.For Select country Actions action=new Actions(driver);
		  driver.findElement(By.xpath("//*[@aria-labelledby='select2-country-container']")).click();
		  action.moveToElement(driver.findElement(By.xpath("//li[text()='India']"))).build().perform();
		  driver.findElement(By.xpath("//li[text()='India']")).click();
		  
		  
		  //11.Date of Birth 
		  Select s1=new Select(driver.findElement(By.id("yearbox"))); 
		  s1.selectByVisibleText("1995");
		  
		  Select s2=new Select(driver.findElement(By.xpath("//select[@ng-model='monthbox']")));
		  s2.selectByVisibleText("May");
		  
		  Select s3=new Select(driver.findElement(By.xpath("//select[@ng-model='daybox']")));
		  s3.selectByVisibleText("15");
		  
		  //12.Password
		  driver.findElement(By.xpath("//Input[@ng-model='Password']")).sendKeys("anil@123");
		  
		  //13.Confirm Password
		  driver.findElement(By.xpath("//Input[@ng-model='CPassword']")).sendKeys("anil@123");	 
	}

}
