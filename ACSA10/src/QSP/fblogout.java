package QSP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogout {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");

driver.findElement(By.id("email")).sendKeys("shwetapanaskar@yahoo.com");

driver.findElement(By.id("pass")).sendKeys("manasi2003");


driver.findElement(By.xpath("//button[@name='login']")).click();



driver.findElement(By.xpath("(//div[.='Account Settings'] )[2]")).click();






driver.close();
	}
}
