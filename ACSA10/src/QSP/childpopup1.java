package QSP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class childpopup1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
			
			
		}
		public static void main(String []args) throws InterruptedException{
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.naukri.com");
		 	String parent = driver.getWindowHandle();
		 	Set<String> allwhs = driver.getWindowHandles();
		 	
		 	for(String a : allwhs) {
		 		if(a.equals(parent)) {
		 			driver.switchTo().window(a).close();
		 			
		 		}
		 	else {
		 		
		 	}
		 		
	}

		}}
