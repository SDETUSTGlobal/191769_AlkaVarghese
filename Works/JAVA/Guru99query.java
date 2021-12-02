package sel1;
import java.text.ParseException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.text.NumberFormat;
public class Guru99query {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D://Software//SEL_JAR-20210901T092836Z-001//SEL_JAR//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("http://demo.guru99.com/test/web-table-element.php"); 
		
		String row="//*[@id='leftcontainer']/table/tbody/tr";
		int data = driver.findElements(By.xpath(row)).size();
		WebElement currentprice =driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/table/thead/tr/th[4]"));
		
		 String text = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]/td[4]")).getText();  
	     System.out.println(text);  
		
		/*for(int i=1;i<data;i++){
			
		}*/
	     
	     driver.close();
	}

}
