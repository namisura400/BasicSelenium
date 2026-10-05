package ModelPopUpPack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModelPopUpClass1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("C:\\Users\\DELL\\Downloads\\Model Popup.html");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("Modal")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.switchTo().activeElement();   //switch to the model pop up
	    
	    driver.findElement(By.className("close")).click();  
	    
	}

}
