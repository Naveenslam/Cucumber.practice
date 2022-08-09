package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;
@CucumberOptions(features="src/main/java/feature/CreateLead.feature",glue="steps",monochrome=true,publish=true)
public class CucumberRunner extends BaseClass {
	

}
