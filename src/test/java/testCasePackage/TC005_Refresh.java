package testCasePackage;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import driverPackage.BaseDriver;

public class TC005_Refresh extends BaseDriver {
	
	public static String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";
	
	@Test
	public static void refreshPage() throws InterruptedException {
	
	driver.get(baseUrl);
	new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	driver.navigate().to("http://www.google.com");
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	
	
	}
}

