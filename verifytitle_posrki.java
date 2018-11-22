package demo;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxverifytitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.edureka.co");
		String x = driver.getTitle();
		System.out.println(x);
		

	}

}
