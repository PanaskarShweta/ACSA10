package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dr {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.facebook.com");
	Thread.sleep(3000);
	 test t1 = new test(driver);
	 t1.setusername();
	 Thread.sleep(3000);
	 t1.setpassword();
	 Thread.sleep(2000);
	 t1.setlogin();
	 Thread.sleep(10000);
	 driver.close();
	 
	
}
}
