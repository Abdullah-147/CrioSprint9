package Package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AppTest extends Utility{
	
//	@Test
//	public void testCase01() {
//		driver.get("https://www.goibibo.com");
//		int size=driver.findElements(By.tagName("a")).size();
//		System.out.println("a= "+size);
//	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://crio-qkart-frontend-qa.vercel.app/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//Registeration
		String userName="Abdul Jamadar"+System.currentTimeMillis();
		String password="Abdul1234";

		driver.findElement(By.xpath("//button[text()='Register']")).click();

		Assert.assertTrue(driver.getCurrentUrl().endsWith("register"));
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("confirmPassword")).sendKeys(password);

		driver.findElement(By.xpath("//button[text()='Register Now']")).click();


		//wait and then login
		Thread.sleep(3000);
		Assert.assertTrue(driver.getCurrentUrl().endsWith("login"));
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Login to QKart']")).click();

		//wait

		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class='username-text']"))));
		List<WebElement> productTitles=driver.findElements(By.xpath("//p[contains(@class,'css-yg30e6')]"));

		for(WebElement e:productTitles){
			System.out.println(e.getText());
		}
		
		driver.quit();





	}
}
