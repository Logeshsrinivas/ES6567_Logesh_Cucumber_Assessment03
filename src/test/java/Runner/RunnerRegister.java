package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="",features="src\\test\\resource\\Features\\Register.feature",glue="com.Logesh.TechAssessment03",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
	public class RunnerRegister {
}











































//plugin = {"pretty","junit:target/Cucumber-reports/Cucumber.junit"}