package QSP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cleartrip2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}	
		public static void main(String[]args) throws InterruptedException{
			WebDriver driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			Thread.sleep(2000);
			driver.get("https://www.cleartrip.com/");
			Thread.sleep(8000);
			WebElement from = driver.findElement(By.id("FromTag"));
			from.sendKeys("ban");
			Thread.sleep(6000);
			 List<WebElement> autosuggestions = driver.findElements(By.xpath("//a[contains(text(),'Ban')]"));
			int count = autosuggestions.size();
			System.out.println("count:"+ count);
			for(int i=0;i<autosuggestions.size();i++) {
				String auto = autosuggestions.get(i).getText();
				System.out.println(auto);
			}
				autosuggestions.get(1).click();
				Thread.sleep(3000); 
				
				WebElement to = driver.findElement(By.id("ToTag"));
				to.sendKeys("chan");
				Thread.sleep(8000);
				 List<WebElement> allautosug = driver.findElements(By.xpath("//a[contains(text(),'Chan')]"));
				 Thread.sleep(3000);
				int count1 = allautosug.size();
				System.out.println("count:"+ count1);
				for(int i=0;i<allautosug.size();i++) {
					String auto = allautosug.get(i).getText();
					System.out.println(auto);
				}
					autosuggestions.get(1).click();
					Thread.sleep(3000); 
					
			
			WebElement adult = driver.findElement(By.id("Adults"));
			Select s1 = new Select(adult);
			s1.selectByVisibleText("3");
			Thread.sleep(2000);
			
		WebElement children = driver.findElement(By.id("Childrens"));
		Select s2 = new Select(children);
		s2.selectByIndex(2);
		Thread.sleep(2000);
		
		WebElement infants = driver.findElement(By.id("Infants"));
		Select s3 = new Select(infants);
		s3.selectByValue("1");
		Thread.sleep(2000);
			
			
				
			driver.close();
				}
			
			
			
		}