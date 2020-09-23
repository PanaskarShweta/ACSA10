package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdepinde {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}	
		public static void main(String[]args) throws InterruptedException{
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.seleniumhq.org");
			Thread.sleep(4000);
			WebElement down = driver.findElement(By.xpath("//a[text()='Downloads']"));
			down.click();
			Thread.sleep(4000);
			WebElement version = driver.findElement(By.xpath("//td[text()='Ruby']/../td[2]"));
			System.out.println(version.getText());
			Thread.sleep(2000);
			WebElement date = driver.findElement(By.xpath("//td[text()='Java']/../td[3]"));
			System.out.println(date.getText());
			WebElement alphaversion = driver.findElement(By.xpath("//td[text()='Python']/../td[4]"));
			System.out.println(alphaversion.getText());
			WebElement date2 = driver.findElement(By.xpath("//td[text()='C#']/../td[5]"));
			System.out.println(date2.getText());
			WebElement link = driver.findElement(By.xpath("//td[text()='JavaScript']/../td[6]"));
			link.click();
			Thread.sleep(4000);
			
			
			
			driver.close();
			
			
			
			
		}
}
