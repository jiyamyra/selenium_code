package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void verifytitle() {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.edureka.co");
		String x = driver.getTitle();
		System.out.println(x);
		Assert.assertEquals(x,x); 
		
		
		
  }
  
  @Test
  public void verifyurl() {
	  
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("http://www.edureka.co");
	     String x = driver.getCurrentUrl();
	     System.out.println(x);
	     Assert.assertEquals(x,"edureka");
	     
	     
  }
  
}
