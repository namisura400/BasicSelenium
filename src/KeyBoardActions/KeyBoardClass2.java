package KeyBoardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardClass2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	   	driver.get("https://www.google.com/");

		
		Actions A = new Actions(driver);
		
		driver.findElement(By.id("ti6dpd")).sendKeys("Today We are Going to Mall");
		
		 Thread.sleep(2000);
		 
		 A.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
		 Thread.sleep(1000);
		 A.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
		 Thread.sleep(1000);
		 A.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		 Thread.sleep(1000);
		 A.keyDown(Keys.DELETE).keyUp(Keys.DELETE).perform();
		 
	
		 
	}

}
