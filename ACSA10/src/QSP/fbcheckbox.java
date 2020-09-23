package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbcheckbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}	
		public static void main(String[]args) throws InterruptedException{
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.facebook.com");
			WebElement signup = driver.findElement(By.id("u_0_2"));
			signup.click();
			Thread.sleep(2000);
			WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
			firstname.sendKeys("sheela");
			Thread.sleep(3000);
			WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
			lastname.sendKeys("panaskar");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9769534627");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("sheela@123");
			Thread.sleep(2000);
		
			
			WebElement day = driver.findElement(By.id("day"));
		
			Select s1 = new Select(day);
			s1.selectByVisibleText("21");
		
			
			
			WebElement month = driver.findElement(By.id("month"));
			Select s2 = new Select(month);
			s2.selectByVisibleText("Apr");
		
			
			WebElement year = driver.findElement(By.id("year"));
			Select s3 = new Select(year);
			s3.selectByVisibleText("1995");
			Thread.sleep(2000);
			
			WebElement female = driver.findElement(By.xpath("//label[.='Female']"));
			female.click();
			
			driver.findElement(By.xpath("(//button)[2]")).click();
			Thread.sleep(4000);
			
			driver.close();
		}
	
}
