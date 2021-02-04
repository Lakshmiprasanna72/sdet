package Selenium_HRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity9 {

WebDriver driver;
	
	@Test
	public void emergencyContacts() throws InterruptedException
	{
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		WebElement username = driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
		username.sendKeys("orange");
		
		WebElement password =driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		password.sendKeys("orangepassword123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	
		driver.findElement(By.xpath("//*[@id= 'menu_pim_viewMyDetails']")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[3]/a")).click();
		String innerText = driver.findElement(By.xpath("//*[@class='emgContactName']")).getText();
		System.out.println(innerText);
	}
}
