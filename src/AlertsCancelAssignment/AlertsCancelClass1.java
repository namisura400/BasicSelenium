package AlertsCancelAssignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsCancelClass1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("C:\\Users\\DELL\\Downloads\\AlertsOkCancel.html");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/button")).click();
	    
	    Alert k = driver.switchTo().alert();
	    
	    Thread.sleep(2000);
	    
	    k.dismiss();  //click on Cancel
	      
	}
}
