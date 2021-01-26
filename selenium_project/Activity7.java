package Selenium_HRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity7 {

	WebDriver driver;
	
	@Test
	public void addQualification() throws InterruptedException
	{
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		WebElement username = driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
		username.sendKeys("orange");
		
		WebElement password =driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		password.sendKeys("orangepassword123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	
		driver.findElement(By.xpath("//*[@id = 'menu_pim_viewMyDetails']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[9]/a")).click();
		driver.findElement(By.xpath("//*[@id = 'addWorkExperience']")).click();
		
		WebElement company = driver.findElement(By.xpath("//*[@id = 'experience_employer']"));
		company.sendKeys("apple");
		WebElement jobtitle = driver.findElement(By.xpath("//*[@id = 'experience_jobtitle']"));
		jobtitle.sendKeys("testing");
		
		//From Date
		driver.findElement(By.xpath("//*[@class = 'ui-datepicker-trigger']")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div/select[1]/option[4]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div/select[2]/option[98]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[4]/a")).click();
		
		//To Date
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/ol/li[4]/img")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div/select[1]/option[6]")).click();//month
		driver.findElement(By.xpath("/html/body/div[3]/div/div/select[2]/option[100]")).click();//year
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[4]/a")).click();
		
		//comments
		driver.findElement(By.xpath("*//*[@id = 'experience_comments']")).sendKeys("good");
		
		driver.findElement(By.xpath("//*[@id= 'btnWorkExpSave']")).click();	
		
		driver.quit();
}
}

