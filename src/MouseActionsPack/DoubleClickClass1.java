package MouseActionsPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickClass1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	   
	    
		driver.get("C:\\Users\\DELL\\Downloads\\Doubleclick.html");
		
		Actions A = new Actions(driver);
		
		 Thread.sleep(2000);
		
		WebElement W = driver.findElement(By.id("demo"));
		
		A.doubleClick(W).perform();
		

	}

}
