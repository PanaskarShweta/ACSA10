package QSP;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[]args) throws InterruptedException{
          WebDriver driver = new ChromeDriver();
          driver.get("file:///C:/Users/User/Desktop/Webpages/page%202%20.html");
          Thread.sleep(2000);
          
          JavascriptExecutor jse = (JavascriptExecutor)driver;
          jse.executeScript("document.getElementById('t2').value=\"singham\"\r\n" + 
          		"");
          
          Thread.sleep(2000);
          driver.close();
	}
}
