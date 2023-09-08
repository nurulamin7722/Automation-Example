package testCasePackageAdvance;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPackage.BaseDriver;
import pageObjectPackage.PO_003_CheckboxAndRadio;

public class TC003_CheckboxAndRadioButton_POM_TC extends BaseDriver {
	
public static String baseUrl = "https://jqueryui.com/checkboxradio";
	
	@Test
	public static void CheckBoxAndRadioButtonInFrame() throws InterruptedException{
		
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.switchTo().frame(0);
		
		//driver.findElement(By.xpath("/html/body/div/fieldset[1]/label[3]")).click();
		
		PO_003_CheckboxAndRadio radioClass =new PO_003_CheckboxAndRadio(driver);
		
		radioClass.clickRadioButtonLondon();
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("/html/body/div/fieldset[2]/label[2]")).click();
		
		radioClass.clickThreeStarCheckBox();
		Thread.sleep(5000);
	
		
		driver.switchTo().defaultContent();
		driver.close();
	}
	

}
