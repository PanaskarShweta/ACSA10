package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class test {
	
	WebElement untb;
	WebElement pwtb;
	WebElement login;
	
	 test(WebDriver driver) {
		

		untb = driver.findElement(By.id("email"));
		pwtb = driver.findElement(By.id("pass"));
		login = driver.findElement(By.name("login"));
	
	}
	public void setusername() {
		untb.sendKeys("shwetapanaskar@yahoo.com");
		
	}
	public void setpassword() {
		pwtb.sendKeys("manasi2003");
	}
	
	public void setlogin() {
		login.click();
	}}
