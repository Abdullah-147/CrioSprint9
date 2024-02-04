package Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		
		Actions act=new Actions(driver);
		act.contextClick();
		act.doubleClick();
		try{driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		act.dragAndDrop(driver.findElement(By.xpath("//h5[text()='High Tatras']")), driver.findElement(By.id("trash"))).build().perform();
		
		act.dragAndDrop(driver.findElement(By.xpath("//h5[text()='High Tatras 2']")), driver.findElement(By.id("trash"))).build().perform();
		
		act.dragAndDrop(driver.findElement(By.xpath("//h5[text()='High Tatras 3']")), driver.findElement(By.id("trash"))).build().perform();
	
		act.dragAndDrop(driver.findElement(By.xpath("//h5[text()='High Tatras 4']")), driver.findElement(By.id("trash"))).build().perform();
		}catch(Exception e) {
			e.printStackTrace();
		}
		driver.switchTo().defaultContent();
		
	}
}
