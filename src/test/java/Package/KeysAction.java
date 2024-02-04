package Package;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
////		driver.findElement(By.name("q")).sendKeys("Abdul Jamadar");
////		driver.findElement(By.name("q")).sendKeys(""+Keys.CONTROL+"A");
////		Thread.sleep(2000);
////		driver.findElement(By.name("q")).sendKeys(""+Keys.CONTROL+"X");
////		Thread.sleep(2000);
////		driver.findElement(By.name("q")).sendKeys(""+Keys.CONTROL+"V");
//		Actions act=new Actions(driver);
//		//act.sendKeys(act.keyDown(keys.A));
//		WebElement w=driver.findElement(By.linkText("About"));
//		act.keyDown(Keys.CONTROL).perform();
//		w.click();
//		act.keyUp(Keys.CONTROL).perform();
//		Set<String> set=driver.getWindowHandles();
//		String mainWindow=driver.getWindowHandle();
//		for(String s:set) {
//			driver.switchTo().window(s);
//		}
//		System.out.println(driver.findElement(By.tagName("h1")).getText());
//		driver.switchTo().window(mainWindow);
//		driver.findElement(By.name("q")).sendKeys("Abdul Jamadar");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)","" );
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-1000)","" );
		
		jse.executeScript("arguments[0].value='abdul';", driver.findElement(By.name("q")));
		
		jse.executeScript("arguments[0].click();", driver.findElement(By.linkText("About")));
		
		Set<String> set=driver.getWindowHandles();
		for(String s:set) {
			driver.switchTo().window(s);
		}
		
		jse.executeScript("window.scrollBy(0,1000)","" );
		Thread.sleep(2000);
		
		
	}

}
