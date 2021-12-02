package newpackage;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;  
import cucumber.annotation.en.Given;  
import cucumber.annotation.en.Then;  
import cucumber.annotation.en.When;

public class Logincuc {
	
	WebDriver driver= null;
	  @Given("^user on user login page$")  
	  public void goToWebLogin() throws Throwable {  
	  driver= new ChromeDriver();
	  driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");  
	  }  
	     
	  @When("^I enter valid data on the page$")  
	  public void enterDetails() throws Throwable {  
	  driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
	  driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");    
	         
	     driver.findElement(By.id("ctl00$MainContent$login_button")).click();  
	 
	  }  
	     
	  @Then("^User login should be successful$")  
	  public void successfulLogin() throws Throwable { 
	    if(driver.getTitle().equalsIgnoreCase("Web Orders")){  
	      System.out.println("Test Pass");  
	   } else {  
	      System.out.println("Test Failed");  
	   }  
	    
	}

}
