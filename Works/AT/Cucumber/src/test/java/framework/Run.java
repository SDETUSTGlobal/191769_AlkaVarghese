package framework;
import org.junit.runner.RunWith;  
import cucumber.api.CucumberOptions;
import cucumber.junit.Cucumber;  
@RunWith(Cucumber.class)  
@Cucumber.Options(format = {"pretty", "html:target/cucumber"}) 
public class Run {}
