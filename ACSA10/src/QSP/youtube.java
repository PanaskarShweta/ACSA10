package QSP;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}	
		public static void main(String[]args) throws InterruptedException{
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			
			driver.get("http://www.youtube.com");
			Thread.sleep(4000);
			WebElement search = driver.findElement(By.xpath("//input[@name='search_query']"));
			
			Thread.sleep(2000);
		
			
		
			search.sendKeys("bakhuda");
			Thread.sleep(4000);
			
			WebElement search1 = driver.findElement(By.xpath("(//button)[3]"));
			search1.click();
			 Thread.sleep(5000);
			 
			 driver.findElement(By.linkText("Bakhuda")).click();
			 Thread.sleep(5000);
			 
			 
			
			driver.close();
			
}}
