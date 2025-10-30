package Com.Gmail.User.Runner;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;

import Com.Gmail.User.Pages.UserInteraction;
import Com.Gmail.User.StepDef.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Login2Demo {
    WebDriver driver = Hooks.driver;
    ExtentTest test = Hooks.test;
    UserInteraction demo;
    
//    @Given("I navigate to Browser")
//    public void i_navigate_to_browser() {
//        driver = new ChromeDriver();
//        demo = new UserInteraction(driver); // Pass driver to UserInteraction
//    }

    @Given("I navigate {string}")
    public void i_navigate_to_url(String url) {
        driver.get(url);
        demo = new UserInteraction(driver,test);
    }

    @When("I insert {string} and {string}")
    public void I_Insert_userName(String un, String pwrd) {
        demo.getUserName(un);
        demo.getPassword(pwrd);
        System.out.println(un + " " + pwrd);
    }

    @And("I clicked the signin button")
    public void I_Clicked_Login() {
        demo.getSubmitted();
    }
    @Then("Its navigates the UI")
    public void its_navigated_to_the_home_page() {
    			demo.LoginSuccess();
    }
    @Then("Its not navigates the UI")
    public void its_not_navigates_the_ui() {
    	demo.LoginFails();
		}		
    @Then("Its navigated to the {string}")
    public void its_navigated_to_the(String expectedResult) {
        demo.Run(expectedResult);
    }
}


