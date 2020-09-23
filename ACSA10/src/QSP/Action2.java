package QSP;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Action2 {
	static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

public static void main(String[]args) throws InterruptedException {

WebDriver driver = new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.urbanladder.com/");
	List<WebElement> list = driver.findElements(By.xpath("//p[contains(@class='topnav_item ']"));
	for(int i=0 ; i<=list.size(); i++) {
	 	String s =  list.get(i).getText();
	 	System.out.println(s);
	} 
	
	
 
	}
}
