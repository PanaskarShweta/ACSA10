package QSP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6 {//navigate
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		Thread.sleep(2000);
				  driver.navigate().to("http://www.fb.com");
				  Thread.sleep(2000);
				  driver.navigate().to("http://www.flipkart.com");
				  Thread.sleep(2000);
				  driver.navigate().back();
				  Thread.sleep(2000);
				  driver.navigate().back();
				  Thread.sleep(2000);
				  driver.navigate().forward();
				  Thread.sleep(2000);
				  driver.navigate().refresh();
				  Thread.sleep(2000);
				  driver.close();
				
		
				  
				
	}
}
