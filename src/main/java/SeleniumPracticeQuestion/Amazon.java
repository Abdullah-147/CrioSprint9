package SeleniumPracticeQuestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")))
				.sendKeys("Mobile" + Keys.ENTER);
		
		//Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.xpath("//a/following-sibling::span[contains(text(),'% off')]"));
		System.out.println(list.size());
		List<WebElement> list1 = driver.findElements(By.xpath("//div[contains(@data-cel-widget,'search_result')]/preceding-sibling::div//div[@class='puisg-row']//div[@data-cy='title-recipe']/h2//span"));
		System.out.println(list1.size());
		int[] percentOff = new int[list.size()];
		int maxIndex = 0, max = 0;
		for (int i = 0; i < list.size(); i++) {// (60% off)
			//new Actions(driver).moveToElement(list1.get(i));
			percentOff[i] = Integer.parseInt(list.get(i).getText().split("%")[0].split("\\(")[1]);
			max = Math.max(max, percentOff[i]);
			if (max == percentOff[i])
				maxIndex = i;
		}
		//Arrays.sort(percentOff);
		System.out.println("Maximum discount available= " + max + "% on product-"
				+ list1.get(maxIndex).getText());
		System.out.println(list.get(0).getText()+"-->"+list1.get(0).getText());
		System.out.println();
		
		System.out.println(list.get(list.size()-1).getText()+"-->"+list1.get(list1.size()-1).getText());
		//driver.quit();

	}

}
