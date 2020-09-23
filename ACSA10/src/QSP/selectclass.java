package QSP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/Webpages/k.html");
		Thread.sleep(2000);
		WebElement KunjViharListBox = driver.findElement(By.id("kv"));
		Select s1 = new Select(KunjViharListBox);
		List<WebElement> kvoptions = s1.getOptions();
		for(int i=0; i<=kvoptions.size(); i++) {
			System.out.println(kvoptions.get(i).getText());
		}
			
		
		/*s1.selectByIndex(3);
		
		Thread.sleep(4000);
		s1.selectByValue("mmd");
		Thread.sleep(4000);
		s1.selectByVisibleText("momos");
		Thread.sleep(4000);
	
		 WebElement navratnalistbbox = driver.findElement(By.id("NR"));
		     Select s2 = new Select  (navratnalistbbox);
		     s2.selectByIndex(2);
		     Thread.sleep(2000);
		     s2.selectByValue("mc");
		     Thread.sleep(2000);
		     s2.selectByVisibleText("milk");
		     Thread.sleep(2000);
		     s2.deselectByIndex(2);
		     System.out.println(s2.isMultiple());
		*/
		
	
		driver.close();

	}
}
