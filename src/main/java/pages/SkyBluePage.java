package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SkyBluePage {
	WebDriver driver;
	
	public SkyBluePage(WebDriver driver ) {
		this.driver= driver;
	}
	
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Set SkyBlue Background')]")
	static WebElement SkyBlueButton; 
	
	
	public static void changeBlueButton() {
		SkyBlueButton.click();	
	}

}
