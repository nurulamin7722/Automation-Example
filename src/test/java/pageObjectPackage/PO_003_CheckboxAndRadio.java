package pageObjectPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PO_003_CheckboxAndRadio {
	
	
	WebDriver  driver=null;
	

	public PO_003_CheckboxAndRadio(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By londonRadioButton=By.xpath("/html/body/div/fieldset[1]/label[3]");
	By threestarCheckBox= By.xpath("/html/body/div/fieldset[2]/label[2]");
	
	public void clickRadioButtonLondon()
	{
		driver.findElement(londonRadioButton).click();
	}
	
	public void clickThreeStarCheckBox()
	{
		driver.findElement(threestarCheckBox).click();
	}
	
	
	
	
}
