package AlertsPopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsClass2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("C:\\Users\\DELL\\Downloads\\Alert Message.html");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/button")).click();
	    
	    Alert k = driver.switchTo().alert();
	    
	    Thread.sleep(1000);
	    
	    System.out.println(k.getText());
	    
	    k.accept();    //click on OK
	    
	    //k.dismiss();  //click on Cancel
	    
	    
	}

}
