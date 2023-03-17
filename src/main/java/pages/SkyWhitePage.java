package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SkyWhitePage {
	
	 WebDriver driver;
	
	public SkyWhitePage(WebDriver driver) {
		this.driver= driver;
	}

	
	@FindBy(how = How.XPATH,using="//button[contains(text(),'Set White Background')])")
	static WebElement SkyWhiteBgButton;
	
	public static void changeToWhiteButton() {
		try {
			SkyWhiteBgButton.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("clicked on white button ");
	}
	public void whiteButtonCondition() {
		
	}
}
