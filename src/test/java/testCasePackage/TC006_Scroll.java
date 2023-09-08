package testCasePackage;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPackage.BaseDriver;

public class TC006_Scroll extends BaseDriver {
	
	public static String baseUrl = "https://www.seleniumhq.org";
	
	@Test
	
	public static void scrollCheck() throws InterruptedException
	{
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(5000);
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight,0);");
		Thread.sleep(5000);
		
		WebElement e =driver.findElement(By.xpath("//body/div[1]/main[1]/div[3]/div[2]/a[1]/img[1]"));
		js.executeScript("arguments[0].scrollIntoView;", e);
		Thread.sleep(5000);
		
	}

}
