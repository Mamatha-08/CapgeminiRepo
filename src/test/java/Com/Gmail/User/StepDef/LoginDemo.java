package Com.Gmail.User.StepDef;
 
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
 
public class LoginDemo {
	@Given("I navigate to login page")
	public void i_navigate_to_login_page() {
		System.out.println("Page Opened...");
		
	}
 
	@And("I entered username and password")
	public void i_entered_username_and_password() {
		System.out.println("Correct credentials...");
		
	}
 
	@And("I clicked signin button")
	public void i_clicked_signin_button() {
		System.out.println("SigninButton Clicked...");
		
	}
	
	@And("I entered correct username")
	public void I_entered_correct_username() {
		System.out.println("Correct Username Entered...");
		
	}
 
	@Then("Its navigated to the HomePage")
	public void its_navigated_to_the_home_page() {
		System.out.println("successfull HomePage Launched...");
		
		
	}
	@But("Invalid pwd")
		public void Invalid_pws() {
		System.out.println("Login Failed....");
			
	}
	@Then("Its navigated to the error msg")
	public void Its_navigated_to_the_error_msg() {
		System.out.println("...Wrong password Entered...");
	Assert.assertEquals("error", "error");
		
	}
 
}
 
 