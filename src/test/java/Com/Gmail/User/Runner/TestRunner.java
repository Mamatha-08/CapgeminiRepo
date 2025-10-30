package Com.Gmail.User.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\java\\Com\\Gmail\\User\\Features\\login3.feature",
					glue="Com.Gmail.User.StepDef",
//					tags ="@test1 or @test2"
					plugin = {"pretty","html:Reports/cucumber-reports.html","json:Reports/cucumber-report.json","junit:Reports/cucumber-report.xml"}
//					tags ="@test3"
					)

 

public class TestRunner {

}
