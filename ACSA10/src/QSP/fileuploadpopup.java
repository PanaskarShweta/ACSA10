package QSP;

import java.awt.AWTException;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileuploadpopup {static {
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
}

public static void main(String[] args) throws InterruptedException, AWTException {
	File f = new File("./cv/Shweta Resume.docx");
	String absolutepath = f.getAbsolutePath();
	System.out.println(absolutepath);
	WebDriver driver = new FirefoxDriver();
driver.get("https://www.ilovepdf.com/word_to_pdf");
Thread.sleep(2000);
WebElement choosefile = driver.findElement(By.linkText("Select WORD files"));
choosefile.sendKeys(absolutepath);

Thread.sleep(10000);
driver.findElement(By.linkText("Covert to PDF")).click();
Thread.sleep(2000);

driver.close();
}}
