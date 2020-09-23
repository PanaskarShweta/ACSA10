package QSP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	
public static void main(String[]args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.vtiger.com");
	Thread.sleep(2000);
	WebElement Resources = driver.findElement(By.xpath("//a[contains(.,'Resources')]"));
	
	Actions act = new Actions(driver);
	act.moveToElement(Resources).build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//h6[contains(.,'Contact')]")).click();
	
	Thread.sleep(2000);
	WebElement phno = driver.findElement(By.xpath("//p[contains(.,'Bengaluru')]/following-sibling::p"));
	System.out.println(phno.getText());
	
	driver.close();
}
}
