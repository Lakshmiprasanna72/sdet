package Selenium_HRM_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity1 {
	
		WebDriver driver;
	    @Test
		public void openBrowser()
		{
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\LakshmiTatakuntla\\Documents\\Selenium\\chromedriver_win32(1)/chromedriver.exe");
         	 driver = new FirefoxDriver();
			driver.get("http://alchemy.hguy.co/orangehrm");
			String title = driver.getTitle();
			String expTitle = "OrangeHRM";
			Assert.assertEquals(title, expTitle);
	         driver.quit();
 		}

}
