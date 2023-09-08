package pageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PO_001_LocatorLearning {
	
	WebDriver  driver=null;
	
	public PO_001_LocatorLearning(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By userNameField=By.id("inputUsername");
	
	public void sendUserName(String name)
	{
		driver.findElement(userNameField).sendKeys(name);

	}
	
	By userPassField=By.name("inputPassword");
	
	public void sendPassword(String name)
	{
		driver.findElement(userPassField).sendKeys(name);

	}

}
