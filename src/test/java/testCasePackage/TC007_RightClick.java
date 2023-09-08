package testCasePackage;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPackage.BaseDriver;

public class TC007_RightClick extends BaseDriver {
	public static String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";
	
	@Test(priority=18)
	public static void doubleClickRightClick() throws InterruptedException
	{
	
	driver.get(baseUrl);
	new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	driver.switchTo().frame("iframeResult");
	
	Actions a = new Actions(driver);
	WebElement doubleClick = driver.findElement(By.xpath("//body/p[1]"));
	a.doubleClick(doubleClick).build().perform();
	Thread.sleep(3000);
	
	
	WebElement rightClick = driver.findElement(By.xpath("//body/form[1]/input[1]"));
	a.doubleClick(rightClick).build().perform();
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	
	
	
}
}
