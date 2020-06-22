package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Users/Mandira/selenium/FinalPracticalExam/src/test/java/features/ToggleAllCheckBox.feature", glue = {
		"steps" })
public class TCBRunner {

}
