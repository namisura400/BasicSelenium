package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesValue1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
	
		
	     driver.findElement(By.name("txtUserName")).sendKeys("selenium");
	     driver.findElement(By.name("txtPassword")).sendKeys("admin");
		 driver.findElement(By.name("Submit")).click();
		 
		 driver.switchTo().frame("rightMenu");  //moved to frame based on value
		               
		
		
		WebElement DD = driver.findElement(By.id("loc_code"));
		               
		driver.switchTo().defaultContent(); //moved out of the frames
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.linkText("Logout")).click();
		
		
		
	}

}
