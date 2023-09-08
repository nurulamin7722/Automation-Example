package testCasePackage;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import driverPackage.BaseDriver;

public class TC011_PopUp extends BaseDriver {
	public static String baseUrl = "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert";
	
	@Test
	public static void alertHandlingCheck() throws InterruptedException
	{
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement b = driver.findElement(By.name("iframeResult"));
		driver.switchTo().frame(b);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
	}

}
