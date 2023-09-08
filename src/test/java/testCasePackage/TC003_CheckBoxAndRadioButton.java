package testCasePackage;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import driverPackage.BaseDriver;

public class TC003_CheckBoxAndRadioButton extends BaseDriver {
	
	public static String baseUrl = "https://jqueryui.com/checkboxradio";
	
	@Test
	public static void CheckBoxAndRadioButtonInFrame() throws InterruptedException{
		
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("/html/body/div/fieldset[1]/label[2]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div/fieldset[2]/label[3]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div/fieldset[3]/label[4]")).click();
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		
		driver.close();
	}
	

}
