package testCasePackageAdvance;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.BaseDriver;
import pageObjectPackage.PO_001_LocatorLearning;

public class TC001_LocatorLearning_POM_TC extends BaseDriver {
	
String baseUrl="https://rahulshettyacademy.com/locatorspractice/";
	
	@Test
	public void locatorLearning() throws InterruptedException
	{
		driver.get(baseUrl);
		driver.manage().window().maximize()	;
		Thread.sleep(2000);
		
		PO_001_LocatorLearning learning = new PO_001_LocatorLearning(driver);
		learning.sendUserName("Shuzan");
		
		learning.sendPassword("Shuzan");


		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		//Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		//Formula:  tagname.value (if class is given)
		//			tagname#value (if id is given)
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Sumaiya");
		//tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("nipa123@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("01772264270");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		
		driver.findElement(By.id("inputUsername")).sendKeys("Shuzan");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(2000);
		
		
		Thread.sleep(2000);
		
	}

}
