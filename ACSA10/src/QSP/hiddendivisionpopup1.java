package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddendivisionpopup1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}	
		public static void main(String[]args) throws InterruptedException{
			WebDriver driver = new ChromeDriver();
			 
			driver.get("http:/wwwflipkart.com");
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button)[2]")).click();
			Thread.sleep(3000);
			
			driver.close();
		}

}

