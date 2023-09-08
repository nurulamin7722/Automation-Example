package testCasePackage;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import driverPackage.BaseDriver;

public class TC009_Slider extends BaseDriver {
	
	public static String baseUrl = "https://jqueryui.com/slider/";
	
	@Test
	public static void sliderCheck() throws InterruptedException
	{
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		WebElement e = driver.findElement(By.xpath("//div[@id='slider']/span"));
		
		Actions a = new Actions(driver);
		
		a.dragAndDropBy(e,300,0).build().perform();
		Thread.sleep(3000);
		
		a.dragAndDropBy(e,-200,0).build().perform();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Vertical slider")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		WebElement e1 = driver.findElement(By.xpath("//div[@id='slider-vertical']/descendant::span"));
		
		a.dragAndDropBy(e1, 0,100).build().perform();
		Thread.sleep(3000);
		
		a.dragAndDropBy(e1,0, -200).build().perform();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
	}

}
