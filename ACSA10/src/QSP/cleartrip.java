package QSP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cleartrip {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}	
		public static void main(String[]args) throws InterruptedException{
			WebDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.get("https://www.cleartrip.com/");
			Thread.sleep(8000);
			WebElement from = driver.findElement(By.id("FromTag"));
			from.sendKeys("ban");
			Thread.sleep(10000);
			 List<WebElement> autosuggestions = driver.findElements(By.xpath("//a[contains(text(),'Ban')]"));
			int count = autosuggestions.size();
			System.out.println("count:"+ count);
			for(int i=0;i<autosuggestions.size();i++) {
				String auto = autosuggestions.get(i).getText();
				System.out.println(auto);
			}
				autosuggestions.get(1).click();
				Thread.sleep(3000);
				driver.close();
				}
			
			
			
		}


