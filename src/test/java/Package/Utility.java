package Package;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

public class Utility{
	public static WebDriver driver;
	
	@BeforeSuite(alwaysRun=true)
	public void createDriver() {
		driver=WebDriverInstance.getWebDriverInstance();
	}
}
