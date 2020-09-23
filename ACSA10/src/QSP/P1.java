package QSP;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]args) throws InterruptedException{
		
		ChromeDriver Driver = new ChromeDriver();
		Thread.sleep(5000);
		Driver.close();
		
				
		
	}

}
