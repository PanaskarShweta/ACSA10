package QSP;


import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmaillogout {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}	
		public static void main(String[]args) throws InterruptedException{
			WebDriver driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			
			driver.get("http://www.naukri.com");

			String parent =  driver.getWindowHandle();
			Set<String> allWHS = driver.getWindowHandles();
			
			for( String a : allWHS) {
			
			 if(a.equals(parent)) {
				 
			 }
else {
	Thread.sleep(2000);
	WebDriver win = driver.switchTo().window(a);
	win.close();
}
		 }
		 }
			
			
		}

