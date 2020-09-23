package QSP;
import java.util.Set;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class P8 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.naukri.com");
		Set<String> a = driver.getWindowHandles();
		for(String x:a) {
			System.out.println(x);
		}
		driver.quit();
			
}}
