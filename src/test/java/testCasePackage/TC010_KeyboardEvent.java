package testCasePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPackage.BaseDriver;

public class TC010_KeyboardEvent extends BaseDriver {

	public static String baseUrl = "http://automationpractice.pl/index.php";
	
	@Test
	
	public static void keyboardEventClick() throws InterruptedException
	{
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement e = driver.findElement(By.xpath("//input[@id='search_query_top']"));
		Thread.sleep(3000);
		e.sendKeys(Keys.chord(Keys.SHIFT,"tedtalk"));
		
		Thread.sleep(3000);
		e.sendKeys(Keys.chord(Keys.ENTER));
		Thread.sleep(3000);
		
		
	}
	

}
