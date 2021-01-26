package Selenium_HRM_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver;
	@Test
	public void headerImage()
	{
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		System.out.print("Printing the URL: " + driver.getCurrentUrl() +"\n");
		System.out.println("Printing the title:" + driver.getTitle());
		driver.quit();
	}

}
