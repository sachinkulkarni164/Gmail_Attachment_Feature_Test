package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Sachin\\eclipse-workspace\\Gmail_Attachment_1.0\\src\\main\\java\\Features\\login.feature"
		,glue={"stepDefinations"}	
		,format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}
		,plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" }
		,dryRun = false
		,monochrome = true //displays report in more readable output
		)
public class TestRunner {

}
