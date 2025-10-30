package Com.Gmail.User.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import org.junit.runner.RunWith;
// 
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
// 
//@RunWith(CucumberOptions.class)
@CucumberOptions(features=".\\src\\test\\java\\Com\\Gmail\\User\\Features\\Login5.feature",
					glue="Com.Gmail.User.StepDef",
                    tags = "@sce1",
                    plugin= {"pretty","html:Reports/cucumber-reports.html","json:Reports/cucumber-report.json",
                    		"junit:Reports/cucumber-report.xml"}
)
public class TestRunner1 extends AbstractTestNGCucumberTests {
 
}
 