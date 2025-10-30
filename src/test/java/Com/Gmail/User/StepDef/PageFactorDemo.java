package Com.Gmail.User.StepDef;
 
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import Com.Gmail.User.Pages.UserInteraction4;
import io.cucumber.java.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class PageFactorDemo{
    WebDriver driver = Hooks.driver;
    ExtentTest test = Hooks.test;
    UserInteraction4 
	obj2 = new UserInteraction4(driver, test);

   
    @Given("I navigated to main page {string}")
    public void i_navigated_to_main_page(String string) {
        obj2.setup(string);
    }
    @When("I inserted the {string} and {string}")
    public void i_inserted_the_and(String string, String string2) {
    	obj2.getUserName(string);
        obj2.getPassword(string2);
        System.out.println(string+ " "+string2);
        
    }
    @When("After I have clicked signin button")
    public void after_i_have_clicked_signin_button() {
    	obj2.getSubmit();
    	System.out.println("Submit Button Clicked...");
        
    }
    @Then("It got navigated to the home page {string}")
    public void it_got_navigated_to_the_home_page(String ex) {

    	try {
    	    boolean result = obj2.Run(ex);
    	    Assert.assertTrue(result);
    	    System.out.println("Success..");
    	} catch (AssertionError ae) {
    	    System.out.println("Failure... Assertion failed: ");
    	}
	    	
        
    }



}
 
 