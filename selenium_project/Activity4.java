package Selenium_HRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity4 {
	WebDriver driver;
	@Test
   public void addEmployee()
	{
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		WebElement username = driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
		username.sendKeys("orange");
		
		WebElement password =driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		password.sendKeys("orangepassword123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_pim_addEmployee\"]")).click();
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		firstName.sendKeys("abc");
		WebElement middleName = driver.findElement(By.xpath("//*[@id=\"middleName\"]"));
		middleName.sendKeys("edf");
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		lastName.sendKeys("ghi");
        driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
        driver.quit();
	}
}
