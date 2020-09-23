package QSP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5 {//fetch title source url
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.fb.com");
		 String title = driver.getTitle();
		 System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.print(url);
		 String source = driver.getPageSource();
		 System.out.print(source);
		
		 driver.close();
	
		
	}

}
