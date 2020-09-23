package QSP;

import org.openqa.selenium.WebDriver;
import java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowserpopup2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[]args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
	
		driver.get("http://www.naukri.com");
		Thread.sleep(2000);
		
		
		Set<String> allwhs = driver.getWindowHandles();
		System.out.println("count :" + allwhs.size());
		
		
		
		for(String a : allwhs ) {
			driver.switchTo().window(a);
		System.out.println("browser title :"+  driver.getTitle());
		driver.switchTo().window(a).close();
		}}
			
			
			
		}
	
		
		
	
		
		
	


