package testCasePackage;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import driverPackage.BaseDriver;

public class TC008_DragAndDrop extends BaseDriver {
	
public static String baseUrl = "https://jqueryui.com/droppable";

	@Test
	public static void dragAndDropCheck() throws InterruptedException
	{
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		
		WebElement e1 = driver.findElement(By.id("draggable"));
		WebElement e2 = driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(e1, e2).build().perform();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
	}


}
