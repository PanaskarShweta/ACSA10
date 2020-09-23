package QSP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[]args) throws InterruptedException{
	WebDriver driver = new ChromeDriver();
	Test t1 = new Test(driver);
	t1.fbTest();
	Thread.sleep(2000);
	t1.gogleTest();
	Thread.sleep(2000);
	driver.close();}
}

	
	
	

