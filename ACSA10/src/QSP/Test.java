package QSP;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	WebDriver Driver;
	
	Test(WebDriver Driver){
		this.Driver = Driver;
	}
	
	public void fbTest() throws InterruptedException {
		
		Driver.get("http://www.facebook.com");
			Thread.sleep(3000);
	}
			
			public void gogleTest() throws InterruptedException {
				
				Driver.get("http://www.google.com");
					Thread.sleep(3000);
		Driver.close();
			

		
		
		
		
	}

}
