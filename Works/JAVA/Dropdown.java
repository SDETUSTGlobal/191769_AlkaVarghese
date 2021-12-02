package sel1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {

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
		
		driver.findElement(By.partialLinkText("Order")).click();
		
	    Select dropdown= new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
				
	    dropdown.selectByIndex(1);	
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("100");
	    
	    driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtUnitPrice")).sendKeys("70");
	    
	    driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtDiscount")).sendKeys("20");
	   
	    driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("ALKA");
	    
	    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("CHILAVANNOOR");
	    
	    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("ERNAKULAM");
	    
	    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("KERALA");
	    
	    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("682020");
	    
	    driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_cardList_1")).click();
	    
	    driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/ol[3]/li[2]/input")).sendKeys("500100");
	    
	    driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1")).sendKeys("06/05");
	    
	    
	    driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/div/input")).click();
	    
	    
		dropdown.selectByVisibleText("ScreenSaver");  
		 
		   driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("1000");
		    
		    driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtUnitPrice")).sendKeys("700");
		    
		    driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtDiscount")).sendKeys("200");
		   
		    driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("ALEENA");
		    
		    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("THATTAHs");
		    
		    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("PATHANAMTHITTA");
		    
		    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("KERALA");
		    
		    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("682020");
		    
		    driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_cardList_1")).click();
		    
		    driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/ol[3]/li[2]/input")).sendKeys("4009878");
		    
		    driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1")).sendKeys("30/12");
		    
		    driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/div/input")).click();
		    
		    
		dropdown.selectByValue("MyMoney");  
		 
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("10");
		    
		    driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtUnitPrice")).sendKeys("7");
		    
		    driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtDiscount")).sendKeys("2");
		   
		    driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("BLESSY");
		    
		    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("ANCHAL");
		    
		    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("KOLLAM");
		    
		    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("KERALA");
		    
		    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("682020");
		    
		    driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_cardList_1")).click();
		    
		    driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/ol[3]/li[2]/input")).sendKeys("5908780");
		    
		    driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1")).sendKeys("18/02");
		    
		    driver.close();
				

	}

}
