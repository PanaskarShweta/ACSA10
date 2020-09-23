package QSP;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class hiddendivisionpopup2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	
            public static void main(String[]args) throws InterruptedException{
             WebDriver driver = new ChromeDriver();
             driver.get("https://www.religarehealthinsurance.com/rhicl/proposalcp/renew/index-care");
             Thread.sleep(4000);
             driver.findElement(By.id("policynumber")).sendKeys("123654789");
            Thread.sleep(4000);
driver.findElement(By.id("dob")).click();
Thread.sleep(2000);

WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
month.click();
Select s1 = new Select(month);
s1.selectByVisibleText("Apr");

WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
year.click();
Select s2 = new Select(year);
s2.selectByVisibleText("1995");

driver.findElement(By.xpath("(//a[@class='ui-state-default'])[21]")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//input[@placeholder='Contact Number']")).sendKeys("9769534627");
Thread.sleep(2000);

driver.findElement(By.xpath("//button[@class='submit-login']")).click();
Thread.sleep(2000);

driver.close();
}
	
}
