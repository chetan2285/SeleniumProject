package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

	

	public LoginPage(WebDriver driver)
	{
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}


	By usrname=  By.xpath("//*[@type='email']");
	By pass=  By.xpath("//*[@type='password']");
	By Login=  By.xpath("//*[@name='commit']");
	
	
	public WebElement username()
	{
		
		return  driver.findElement(usrname);
		
	}
	
	public WebElement password()
	{
		
		return  driver.findElement(pass);
		
	}
	
	public WebElement loginButton()
	{
		
		return  driver.findElement(Login);
		
	}
	
	
	
}
