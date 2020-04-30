import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClass {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
	
	// selenium class
	WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com");
		
		System.out.println("Youtube is launched");
		//driver.close();
		
		//good============
		//888888888888888888
		
	}

}
