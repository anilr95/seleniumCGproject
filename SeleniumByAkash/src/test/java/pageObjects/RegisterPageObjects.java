package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegisterPageObjects 
{    
	//1st thing--added driver
     WebDriver driver;
	
	//2nd thing----added locators
	private By firstName=By.xpath("//input[@ng-model='FirstName']");
	private	By lastName=By.xpath("//input[@ng-model='LastName']");
	private	By address=By.xpath("//textarea[@ng-model=\"Adress\"]");
	private	By email=By.xpath("//input[@ng-model='EmailAdress']");
	private	By phone=By.xpath("//input[@ng-model='Phone']");
	private	By genderRadioMale=By.xpath("//input[@value='FeMale']");
	private	By cricketCheckbox=By.xpath("//input[@value='Cricket']");
	private	By language=By.xpath("//*[@id='msdd']");
	private	By skillsDropdown=By.id("Skills");
	private By countries=By.id("countries");
	private By selectCountry=By.xpath("//*[@aria-labelledby='select2-country-container']");
	private By yearbox=By.id("yearbox");
	private By monthbox=By.xpath("//select[@ng-model='monthbox']");
	private By daybox=By.xpath("//select[@ng-model='daybox']");
	private By password=By.xpath("//Input[@ng-model='Password']");
	private By confirmPassword=By.xpath("//Input[@ng-model='CPassword']");
	
	//3rd thing-------constructor
	public RegisterPageObjects(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	//4th methods
	public void setFirstName(String arg)
    {
	driver.findElement(firstName).sendKeys(arg);
	}
	public void setLastName(String arg)
    {
	driver.findElement(lastName).sendKeys(arg);
	}
	public void setAddress(String arg)
    {
	driver.findElement(address).sendKeys(arg);
	}
	public void setEmail(String arg)
    {
	driver.findElement(email).sendKeys(arg);
	}
	public void setPhone(String arg)
    {
	driver.findElement(phone).sendKeys(arg);
	}
	
	//methods for radio button
	public void clickOngenderRadioMale()
    {
	driver.findElement(genderRadioMale).click();
	}
	
	public void cricketCheckbox()
    {
	driver.findElement(cricketCheckbox).click();
	}
	
	//methods for dropdown
	
	
	public void selectSkillFromList(String arg)
    {
	WebElement skillList=driver.findElement(skillsDropdown);
	Select List=new Select(skillList);
	List.selectByVisibleText(arg);
	}
}
