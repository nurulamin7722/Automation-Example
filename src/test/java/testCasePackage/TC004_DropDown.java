package testCasePackage;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import driverPackage.BaseDriver;

public class TC004_DropDown extends BaseDriver {
	
	public static String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";
	
	
	@Test
	public static void selectingValueFromDropdown() throws InterruptedException
	{
	
	driver.get(baseUrl);
	new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	driver.switchTo().frame("iframeResult");
	WebElement e = driver.findElement(By.name("cars"));
	Select s = new Select(e);
	Thread.sleep(3000);
	s.selectByIndex(1);
	Thread.sleep(3000);
	
	driver.switchTo().defaultContent();
	
	}
	
	@Test
	public static void selectMultipleValueFromDropdown() throws InterruptedException
	{
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		WebElement e = driver.findElement(By.name("cars"));
		Select s = new Select(e);
		
		Actions a = new Actions(driver);
		a.keyDown(Keys.CONTROL).click(s.getOptions().get(3)).click(s.getOptions().get(1)).keyUp(Keys.CONTROL).build().perform();
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		
		
	}
	

}
