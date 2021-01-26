package Selenium_HRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity8 {
	
WebDriver driver;
	
	@Test
	public void applyLeave() throws InterruptedException
	{
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		WebElement username = driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
		username.sendKeys("orange");
		
		WebElement password =driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		password.sendKeys("orangepassword123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		driver.findElement(By.xpath("//*[@id = 'menu_leave_viewLeaveModule']")).click();
		driver.findElement(By.xpath("//*[@id = 'menu_leave_applyLeave']")).click();
		driver.findElement(By.xpath("//*[@id = 'applyleave_txtLeaveType']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[1]/select/option[2]")).click();
		
		//From Date
				driver.findElement(By.xpath("//*[@class = 'ui-datepicker-trigger']")).click();
				driver.findElement(By.xpath("/html/body/div[3]/div/div/select[1]/option[1]")).click();
				driver.findElement(By.xpath("/html/body/div[3]/div/div/select[2]/option[101]")).click();
				driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[5]/td[1]/a")).click();
				
				//To Date
				driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[4]/img")).click();
				driver.findElement(By.xpath("/html/body/div[3]/div/div/select[1]/option[1]")).click();//month
				driver.findElement(By.xpath("/html/body/div[3]/div/div/select[2]/option[101]")).click();//year
				driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[5]/td[4]/a")).click();//date
				
				//comments
				driver.findElement(By.xpath("*//*[@id = 'applyleave_txtComment']")).sendKeys("Sick");
				
				driver.findElement(By.xpath("//*[@id= 'applyBtn']")).click();	
				
				driver.findElement(By.xpath("menu_leave_viewMyLeaveList")).click();
				driver.quit();

}

}