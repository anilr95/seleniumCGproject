package com.seleniumbyAkash.java;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestScriptJunit 
{
	@Test
public void Register()
    {  //Steps :
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("http://demo.automationtesting.in/Index.html");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("abc@gmail.com");
		driver.findElement(By.id("enterimg")).click();
		String title=driver.getTitle();
		
		//Validation or Assertion:in selenium we will use word "assertion".
		Assert.assertEquals("Title Matching assertion","Register",title);
		/*
		 * if(title.contentEquals("Register")) {
		 * System.out.println("Test case is passed"); } else {
		 * System.out.println("Test case is Failed"); }
		 */
    }
@Test
public void Formfilling()
 {
	WebDriverManager.chromedriver().setup();

	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();

	driver.get("http://demo.automationtesting.in/Index.html");

	driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	driver.findElement(By.id("enterimg")).click(); 
	
	  driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Anil");
	  driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Rikshe");
	  
	  driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).
	  sendKeys("Anusaya nagar parbhani");
	  
	  driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("abc@gmail.com");
	  
	  driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9999999999");
	  
	  driver.findElement(By.xpath("//input[@value='Cricket']")).click();
	  driver.findElement(By.xpath("//*[@value='Movies']")).click(); 
	  
	  Actions action=new Actions(driver); 
	  driver.findElement(By.xpath("//*[@id='msdd']")).click();
	  action.moveToElement(driver.findElement(By.xpath("//*[@id='msdd']"))).build().perform();
	  driver.findElement(By.xpath("//a[text()='English']")).click();
	  driver.findElement(By.xpath("//a[text()='Hindi']")).click();
	 
	  Select select=new Select(driver.findElement(By.id("Skills")));
	  select.selectByVisibleText("Java"); //always prefer selectbyvisibletext
	   
	  Select select1=new Select(driver.findElement(By.id("countries")));
	  select1.selectByVisibleText("India");
	 
	  driver.findElement(By.xpath("//*[@aria-labelledby='select2-country-container']")).click();
	  action.moveToElement(driver.findElement(By.xpath("//li[text()='India']"))).build().perform();
	  driver.findElement(By.xpath("//li[text()='India']")).click();
	   
	  Select s1=new Select(driver.findElement(By.id("yearbox"))); 
	  s1.selectByVisibleText("1995");
	  Select s2=new Select(driver.findElement(By.xpath("//select[@ng-model='monthbox']")));
	  s2.selectByVisibleText("May");
	  Select s3=new Select(driver.findElement(By.xpath("//select[@ng-model='daybox']")));
	  s3.selectByVisibleText("15");
	  
	  driver.findElement(By.xpath("//Input[@ng-model='Password']")).sendKeys("anil@123");
	  driver.findElement(By.xpath("//Input[@ng-model='CPassword']")).sendKeys("anil@123");
 }
}
