package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P9 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/Webpages/A.html");
		Thread.sleep(2000);
		 WebElement fb = driver.findElement(By.xpath("./html/body/a[1]"));
		 fb.click();
		 Thread.sleep(2000);
		 driver.get("file:///C:/Users/User/Desktop/Webpages/B.html");
			Thread.sleep(2000);
			 WebElement a=driver.findElement(By.xpath("./html/body/input[1]"));//("./html/body/a")
			  a.click();
			 Thread.sleep(2000);
			 
			 driver.get("file:///C:/Users/User/Desktop/Webpages/C.html");
				Thread.sleep(2000);
				 WebElement b=driver.findElement(By.xpath("./html/body/input[6]"));//("./html/body/a")
				  b.click();
				  Thread.sleep(2000);
				  
				  driver.get("file:///C:/Users/User/Desktop/Webpages/D.html");
					Thread.sleep(2000);
					 WebElement google = driver.findElement(By.xpath("./html/body/a"));
					  google.click();
					 Thread.sleep(2000);
				  
			 
		 
		 driver.close();
		 
		
		

}}
