package SeleniumPracticeQuestion;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.switchTo().frame("frame1");
		try{
			
			WebElement box=driver.findElement(By.xpath("//*[@id='topic']/following-sibling::input"));
			//Thread.sleep(3000);
			box.sendKeys("17 LPA");
			Rectangle r=box.getRect();
			System.out.println(r.height);
			System.out.println(r.width);
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			Point p=box.getLocation();
			System.out.println(p.x+"\n"+p.y);
			File file=((TakesScreenshot) box).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("C:\\Users\\DELL\\OneDrive\\Eclipse Workspace\\Crio-Sprint9_\\ScreenCaptures\\ss.png"));
//			driver.switchTo().frame("frame3");
//			driver.findElement(By.id("a")).click();
//			driver.switchTo().parentFrame();
//			driver.findElement(By.xpath("//*[@id='topic']/following-sibling::input")).sendKeys(" package");
//			//Thread.sleep(3000);
//			driver.switchTo().defaultContent();
//			driver.switchTo().frame("frame2");
//			Select sel=new Select(driver.findElement(By.id("animals")));
//			sel.selectByValue("avatar");
//			//Thread.sleep(3000);
//			driver.switchTo().defaultContent();
			
			
		}catch(NoSuchElementException e){
			System.out.println("Element was not found");
		}
		driver.quit();
	}
}