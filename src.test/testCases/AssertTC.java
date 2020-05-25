package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import objects.LandingPage;
import objects.LoginPage;
import resources.Basse;

public class AssertTC extends Basse {


	@BeforeTest
	public void LaunchAut() throws IOException
	{
	
		driver = Launch();

		driver.get(prop.getProperty("url"));

		driver.manage().window().maximize();
		
	}
	
	  @AfterTest
	   public void teardown()
	   
	   {
	   
         driver.close(); 		   
	   }
	    
	
	@Test
	public void VerifyHPTitle () throws IOException, InterruptedException  {
		
		
		System.out.println(driver.getTitle());

	  //  Assert.assertEquals(driver.getTitle(), "Home");  //TO compare 2 Strings, AssertError if both strings are different
	    
	    LandingPage ld = new LandingPage(driver);
	    
	   	    
	    Assert.assertTrue(ld.AllCourseLink().isDisplayed());      
	   
   
	 
	    
	    
	}
	
    

}
