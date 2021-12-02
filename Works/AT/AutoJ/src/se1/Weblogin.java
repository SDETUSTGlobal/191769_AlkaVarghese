package se1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Weblogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E://eclipse//chromedriver_win32//chromedriver.exe");
		
        DesiredCapabilities capabilities = DesiredCapabilities.chrome(); 
        
        capabilities.setCapability("marionette",true);  

        WebDriver driver= new ChromeDriver(capabilities);
		
		driver.manage().window().maximize();
		
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		driver.findElement(By.id("ctl00_MainContent_btnCheckAll")).click();

		driver.findElement(By.className("btnDeleteSelected")).click();

		driver.navigate().back();
		
		driver.findElement(By.id("ctl00_MainContent_btnUncheckAll")).click();
		
		driver.findElement(By.linkText("View all products")).click();
		
		driver.findElement(By.partialLinkText("Order")).click();
		
		Select dropdown = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));  
	    dropdown.selectByVisibleText("ScreenSaver");  
	    
	    driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("100");
	    
	    driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtUnitPrice")).sendKeys("70");
	    
	    driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtDiscount")).sendKeys("20");
	    
	   // driver.findElement(By.id("ctl00$MainContent$fmwOrder$txtDiscount")).sendKeys("");
	    
	    driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("ALKA");
	    
	    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("CHILAVANNOOR");
	    
	    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("ERNAKULAM");
	    
	    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("KERALA");
	    
	    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("682020");
	    
	    driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_cardList_1")).click();
	    
	    driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/ol[3]/li[2]/input")).sendKeys("500100");
	    
	    driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1")).sendKeys("06/05");
	    
	    driver.close();

	}

}
