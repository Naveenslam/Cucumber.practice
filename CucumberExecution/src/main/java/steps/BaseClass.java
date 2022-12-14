package steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass extends AbstractTestNGCucumberTests {
	
	public static ChromeDriver driver;	
	    @BeforeMethod
		public void preCondition_login()
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
			}
	    @AfterMethod
	    public void postCondition_close()
	    {
	    	driver.close();
	    }
				
	}

