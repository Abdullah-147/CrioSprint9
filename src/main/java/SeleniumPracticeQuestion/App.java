package SeleniumPracticeQuestion;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class App {
	public void method() {
		try {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.findElement(By.className("abd"));
		Select sel=new Select(null);
		Alert alert=driver.switchTo().alert();
		Actions act=new Actions(driver);
		
		
		
		}catch(NoSuchElementException e) {
			
		}catch(InterruptedException e) {
			
		}
	}
}