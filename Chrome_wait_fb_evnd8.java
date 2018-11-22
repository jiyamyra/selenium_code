package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_wait_fb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("http://www.facebook.com");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	    driver.findElement(By.id("u_0_j")).sendKeys("Dev");
	    driver.findElement(By.id("u_0_l")).sendKeys("Ops");
	    driver.findElement(By.name("reg_email__")).sendKeys("selenium@demo.com");
	    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("selenium@demo.com");
	    driver.findElement(By.id("u_0_v")).sendKeys("demo@1234");
	    driver.findElement(By.id("day")).sendKeys("01");
	    driver.findElement(By.id("month")).sendKeys("12");
	    driver.findElement(By.id("year")).sendKeys("1992");
	    driver.findElement(By.id("u_0_a")).click();
	    driver.findElement(By.name("websubmit")).click();
	    
	    		
	}

}
