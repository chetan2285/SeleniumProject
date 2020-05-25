package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}


	By signin=  By.linkText("Login");
	By AllCourseButon=  By.linkText("View all Courses");
	
	
	public WebElement login(){
		
		return  driver.findElement(signin);
		
	}
	
    public WebElement AllCourseLink(){
		
		return  driver.findElement(AllCourseButon);
		
	}
}
