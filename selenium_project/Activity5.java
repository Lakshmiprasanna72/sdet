package Selenium_HRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity5 {
	
	WebDriver driver;
	
	@Test
	public void editEmployee()
	{
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		WebElement username = driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
		username.sendKeys("orange");
		
		WebElement password =driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		password.sendKeys("orangepassword123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[6]/a/b")).click();
		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"personal_txtEmpFirstName\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"personal_txtEmpFirstName\"]")).sendKeys("deviS");
		
		driver.findElement(By.xpath("//*[@id=\"personal_txtEmpMiddleName\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"personal_txtEmpMiddleName\"]")).sendKeys("rajaF");
		
		driver.findElement(By.xpath("//*[@id=\"personal_txtEmpLastName\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"personal_txtEmpLastName\"]")).sendKeys("tat1");
		
		//driver.findElement(By.xpath("//*[@id=\"personal_optGender_1\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"personal_optGender_1\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"personal_cmbNation\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/ol[3]/li[3]/select/option[83]")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/ol[3]/li[4]/img")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div/select[1]/option[3]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div/select[2]/option[76]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();	
		driver.quit();
	}
	
	

}
