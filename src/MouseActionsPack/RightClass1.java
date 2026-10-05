package MouseActionsPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClass1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		Actions A = new Actions(driver);
		
		WebElement W = driver.findElement(By.linkText("OrangeHRM"));
		
		A.contextClick(W).perform();
		

	}

}
