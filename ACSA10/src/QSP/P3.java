package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/Webpages/C.html");
		Thread.sleep(2000);
		
			
			
			WebElement fbLink = driver.findElement(By.id("L1"));
			fbLink.click();
			driver.close();
		
			

}}

