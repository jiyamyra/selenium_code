package testNG_demo;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ajay {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://www.ntt.com/en/index.html");
	    String x = driver.getCurrentUrl();
	    System.out.println(x);
	    Assert.assertEquals(x, "https://www.ntt.com/en/index.html");
  }
}
