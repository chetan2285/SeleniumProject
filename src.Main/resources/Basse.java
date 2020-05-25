package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basse {
 
  
  	public WebDriver driver;
  	public Properties prop;
    public WebDriver Launch() throws IOException {
	  
    	    	 		
    	    prop = new Properties();
            FileInputStream fil = new FileInputStream("C:\\Users\\admin\\workspace\\Pract\\src.Main\\resources\\global.properties");
    		
    		prop.load(fil);   //this connects above two methods to each other
    		
    	String browsertype = prop.getProperty("browser");    //get value of browser
    
    		
    		if(browsertype.equals("chrome"))
    		
    		{
    			
    			System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
    			
    			 driver = new ChromeDriver();
    					
    		}
    		else if (browsertype.equals("firefox"))
    		
    		{
    			//Code to launch chrome browser
    			//driver = new firefoxDriver();
    				
    		}
    		
    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //
    		
    				
    		return driver;	
    		
    		}
 
}
 

