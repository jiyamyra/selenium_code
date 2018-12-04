package testNG_demo;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ajay {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://www.edureka.co/");
	    String x = driver.getCurrentUrl();
	    System.out.println(x);
	    Assert.assertEquals(x, "https://www.edureka.co/");
  }
}
