package Selenium_HRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity6 {
	
	WebDriver driver;
	
	@Test
	public void directory()
	{
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		WebElement username = driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
		username.sendKeys("orange");
		
		WebElement password =driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		password.sendKeys("orangepassword123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
	
	    driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[9]/a/b")).click();
	    
		
		///html/body/div[1]/div[2]/ul/li[9]/a/b //*[@id = 'menu_directory_viewDirectory']
	    //String title = driver.findElement(By.xpath("//*[@class = 'toggle tiptip']")).getText();
		String expTitle = "Search Directory";
	    Assert.assertEquals("Search Directory", expTitle);
	    boolean a = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[9]/a/b")).isDisplayed();
		System.out.println(a);
	
	}

}
