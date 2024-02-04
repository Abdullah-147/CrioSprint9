package Package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverInstance {
	private WebDriverInstance() {};
	
	private static WebDriver webdriver;
	
	public static WebDriver getWebDriverInstance() {
		if(webdriver==null) {
		webdriver=new ChromeDriver();
		webdriver.manage().window().maximize();
		webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		return webdriver;
	}
	
}
