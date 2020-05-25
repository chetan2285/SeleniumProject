package testCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import objects.LandingPage;
import objects.LoginPage;
import resources.Basse;

public class LandingTC extends Basse {


	@BeforeTest()
	public void intBrowser() throws IOException
	{
		driver = Launch();
		
        driver.get(prop.getProperty("url"));
		

		driver.manage().window().maximize();
		
	}
	
	
	
	
	@Test(dataProvider="loginData")
	public void login(String login, String passwo) throws IOException {

		

		LandingPage ld = new LandingPage(driver);

		ld.login().click();
		
       LoginPage lg = new LoginPage(driver);
       
       lg.username().sendKeys(login);
       lg.password().sendKeys(passwo);
       lg.loginButton().click();
   
   
	}
	
	 @AfterTest
	   public void teardown()
	   
	   {
	   
       driver.close(); 		   
	   }
	
	
	
    @DataProvider	
     public Object[][] loginData(){
	
	Object[][] lobj = new Object[2][2];
	
	lobj[0][0] = "chetan";
	lobj[0][1] = "password";
	
	lobj[1][0] = "chetan2285";
	lobj[1][1] = "che143@kar";
	
	return lobj;
	
		
	
	
	}

}
