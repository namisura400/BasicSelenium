package KeyBoardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardClass1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	   
	    
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		Actions A = new Actions(driver);
		
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		
		 Thread.sleep(2000);
		 
		 A.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		 
		 Thread.sleep(2000);
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		
		Thread.sleep(2000);
		
		 A.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();    //login button
		
		 Thread.sleep(2000);
		 
		 A.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform(); 
		

	}

}
