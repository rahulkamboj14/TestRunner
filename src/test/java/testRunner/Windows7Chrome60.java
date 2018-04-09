package testRunner;

import com.rationaleemotions.Reporters;
import com.rationaleemotions.TestNGCucumberTests;

import cucumber.api.CucumberOptions;

@CucumberOptions(
		strict = true, 
		monochrome = true, 
		features = {"src/main/java/Features"},
		glue = {"stepDefination"}, 
		plugin = { "json:target/RawJsonResult/Windows7Chrome60.json"}
		)
@Reporters(plugin = {"json:target/RawJsonResult/Windows7Chrome60.json"}
)
public class Windows7Chrome60 extends TestNGCucumberTests {
}
