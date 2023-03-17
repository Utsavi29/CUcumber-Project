package runnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features", //can use feature path(from TechfiosLogin.feature-(properties) as well instead of "classpath:features"
		glue = "stepDefination", 
	//	tags = "@Scenario1","@Scenario2"
		monochrome = true,
  //    dryRun=false,
		plugin = { "pretty", // used for generating type of report
		"html:target/cucumber", "json:target/cucumber.json" })
		
		
		

public class Runner {
	
	
	

}
