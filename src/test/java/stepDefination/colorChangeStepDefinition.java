package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SkyBluePage;
import pages.SkyWhitePage;
import pages.TestBase;

public class colorChangeStepDefinition  {
	WebDriver driver;

	@Before
	public void setUp() {
		TestBase.init();
		driver.get("http://techfios.com/test/101/");
		SkyBluePage skyBluePage = PageFactory.initElements(driver, SkyBluePage.class);
		SkyWhitePage  skyWhitePage =PageFactory.initElements(driver, SkyWhitePage.class);
		

	}

	@Given("^Set SkyBlue background button exists$")
	public void set_skyblue_background_button_exist() {
     try {
    	 driver.findElement(By.xpath("//button[contains(text(),'Set SkyBlue Background')]"));
    	 System.out.println("The SKy Blue Button EXsists");
     }catch(Exception e)
     
     {
    	e.printStackTrace(); 
     }
	}

	@When("^I click on the button on \"([^\"]*)\"&")
	public void i_click_on_the_button_on(String color) throws InterruptedException {
		String colors ="";
		switch(colors) {
		case "Sky Blue":
			SkyBluePage.changeBlueButton();
			Thread.sleep(2000);
			break;
		case "Sky White":
			SkyWhitePage.changeToWhiteButton();
			Thread.sleep(3000);
			break;
			default:
				System.out.println("color did not change");
				
		}

	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue()  {
	 String colorExpected ="#87ceeb" ;
	 String bgColor = driver.findElement(By.xpath("//body[@style='background-color: skyblue;']")).getCssValue("background-color");
	 String hexColor = Color.fromString(bgColor).asHex();
	 String actual = hexColor;
	 Assert.assertEquals("actual color does not match ", colorExpected, actual);
	 System.out.println("color was changed to sky Blue");
	 try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	}
	 @When("^set skywhite background button exists$")
	public void set_skywhite_background_button_exists() {
		try {
			driver.findElement(By.xpath("//button[contains(text(), 'Set White Background')]"));
			
			System.out.println("white button exists");
		} 
		catch(Exception e ) {
			e.printStackTrace();
		}
	 }
	
@Then("^the background color will change to sky white$")
 public void the_background_color_will_change_to_sky_white() throws InterruptedException {
	
	String colorWhiteExpected = "#ffffff";
	String bgColorWhite = driver.findElement(By.xpath("//body[@style='backgroung-color: white;']")).getCssValue("background-color"); ;
	String hexColorWhite =Color.fromString(bgColorWhite).asHex();
	String actualWhite = hexColorWhite;
	Assert.assertEquals("actual colr does not match with expected",colorWhiteExpected,actualWhite);
	System.out.println("the color was changed to white");
	Thread.sleep(3000);
    
}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
	

}
