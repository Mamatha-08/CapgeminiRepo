package Com.Gmail.User.Pages;
 
import java.time.Duration;
 
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import Com.Gmail.User.Config.Reports;
 
public class UserInteraction4 {
    private WebDriver driver;
    private ExtentTest test;
    private WebDriverWait wait;
    
    public UserInteraction4(WebDriver driver,ExtentTest test) {
    	this.test=test;
    	this.driver=driver;
    	wait = new WebDriverWait(driver,Duration.ofSeconds(5));
  	    PageFactory.initElements(driver,this);//this
 
    }
   
    
    @FindBy(name="userName")
    private WebElement username;
    
    @FindBy(name="password")
    private WebElement Password;
    
    @FindBy(how = How.XPATH,using = "//input[@name='submit']")
    private WebElement SubmitButton;
    
    public void setup(String url) {    	
  	  driver.get(url);
  	
  }
  
  public boolean getUserName(String unm) {
	boolean actResult = true;
	try {
		wait.until(ExpectedConditions.visibilityOf(username));
		Reports.generateReport(driver, test, Status.PASS,"Username found!");
  	    username.sendKeys(unm);
	}
	catch(TimeoutException te) {
		actResult = false;
		Reports.generateReport(driver,test,Status.FAIL, "Webelement username not found!");
	}
	return actResult;
  }
  
  public boolean getPassword(String pwd) {
	  boolean actResult = true;
		try {
			wait.until(ExpectedConditions.visibilityOf(Password));
			Reports.generateReport(driver, test, Status.PASS,"Password found!");
	  	    Password.sendKeys(pwd);
		}
		catch(TimeoutException te) {
			actResult = false;
			Reports.generateReport(driver,test,Status.FAIL, "Webelement Password not found!");
		}
		return actResult;
  }
  
  public boolean getSubmit() {
  	
  	 boolean actResult = true;
		try {
			wait.until(ExpectedConditions.visibilityOf(SubmitButton));
			Reports.generateReport(driver, test, Status.PASS,"submit button found!");
			SubmitButton.click();
		}
		catch(TimeoutException te) {
			actResult = false;
			Reports.generateReport(driver,test,Status.FAIL, "submit button not found!");
		}
		return actResult;
  }
  
  public String getTitle() {
  	String str = driver.getTitle();
  	return str;
  }
  
  public WebElement getlocator(String path) {
  	WebElement d;
  	d = driver.findElement(By.xpath(path));
  	return d;
  }
  public boolean Run(String expectedResult) {
			boolean actResult = true;
			WebElement ele;
			if(expectedResult.equals("Login Successfully")) {
				 ele = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
			}else {
				ele=driver.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
			}
			
			try {
				wait.until(ExpectedConditions.visibilityOf(ele));
				if(ele.getText().matches("Login Successfully")){
		   			Reports.generateReport(driver, test, Status.PASS, "Valid User");
		   		 }
		   		 else
		   		 {
		   			actResult = false;
		            Reports.generateReport(driver, test, Status.FAIL, "Invalid Credentials");
		   		 }
			}catch (Exception te) {
	            actResult = false;
	            Reports.generateReport(driver, test, Status.FAIL, "Wait time exceeded...");
	        }
			
		   	 return actResult;
  	}
  }
 
    
    
 
 
 