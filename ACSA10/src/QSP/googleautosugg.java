package QSP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleautosugg {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}	
		public static void main(String[]args) throws InterruptedException{
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.google.com");
			WebElement search = driver.findElement(By.name("q"));
			search.sendKeys("java");
			Thread.sleep(10000);
			List<WebElement> autosugestions = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		 	int count = autosugestions.size();
		 	System.out.println(count);
		 	Thread.sleep(4000);
		 	for(int i=0 ; i<=autosugestions.size(); i++) {
		 		String sug = autosugestions.get(i).getText();
		 		System.out.println(sug);
		 	}
		 	autosugestions.get(8).click();
		 	Thread.sleep(4000);
		 	
			driver.close();
		}

			

}
