package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver() ;
		driver.get("http://www.google.com");
		
		WebElement search;
		search = driver.findElement(By.name("q"));
		search.sendKeys("java");
		Thread.sleep(2000);
		driver.close();
				
		
	}

}
