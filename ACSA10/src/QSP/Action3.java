package QSP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

public class Action3 {public static class Action1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	
public static void main(String[]args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.urbanladder.com/");
	Thread.sleep(5000);
WebElement sale = driver.findElement(By.xpath("//span[contains(.,'Sale')]"));
	
	
	Actions act = new Actions(driver);
	act.moveToElement(sale).build().perform();
	Thread.sleep(2000);
	
	for(int i=0 ; i<=sale.size(); i++) {
	 	String s =  sale.get(i).getText();
	 	System.out.println(s);
	} 
	Thread.sleep(5000);
	
	
	driver.close();
}}}
