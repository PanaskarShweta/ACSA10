package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("shwetapanaskar@yahoo.com");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("manasi2003");
		Thread.sleep(2000);
		 WebElement login = driver.findElement(By.xpath("//button[@value='1']"));
		 login.click();
		 /*Thread.sleep(10000);
		 WebElement logout = driver.findElement(By.xpath("//div[@aria-label='Account']"));
		 logout.click();
		 Thread.sleep(4000);
		 WebElement out = driver.findElement(By.xpath("//span[.='Log Out']"));
		 out.click();*/
		 Thread.sleep(4000);
		

		
		driver.close(); 
		
		
		
		
		
		
		

}}
