package sel1;
import org.openqa.selenium.By;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;


public class Homework1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://Software//SEL_JAR-20210901T092836Z-001//SEL_JAR//chromedriver_win32//chromedriver.exe");
		
        DesiredCapabilities capabilities = DesiredCapabilities.chrome(); 
        
        capabilities.setCapability("marionette",true);  

        WebDriver driver= new ChromeDriver(capabilities);  
		
		driver.manage().window().maximize();
		
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		String product= driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[3]/td[4]")).getText();
		
		System.out.println("family album sold in canada = "+product);
		
	   WebElement c = driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody"));
	   
	   List  rows = driver.findElements(By.xpath("//*[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
	  
		int c1=0;
		for(int i=1; i<rows.size() ; i++){
	
		if(c.getText().contains("MyMoney") && c.getText().contains("MasterCard") )
		{
			c1++;
		}
	}
		
		System.out.println("count= "+c1);
	   
		
		
		
		//driver.findElement(By.partialLinkText("Order")).click();
		
		//Select dropdown= new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
		
		//dropdown.selectByIndex(1);		
		//dropdown.selectByVisibleText("ScreenSaver");  
		//dropdown.selectByValue("MyMoney");  
		
		driver.close();

	}

}
