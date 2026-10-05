package HandlingWindowsPack;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsClass2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	   
	    
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		
	    Thread.sleep(4000);
		 
		System.out.println("After Login Title is : " +driver.getTitle());
		
		Actions A = new Actions(driver);
		
		
		WebElement W = driver.findElement(By.id("help"));
		
		A.moveToElement(W).perform();
		
	    Thread.sleep(3000);
		 
	    driver.findElement(By.xpath("//*[@id=\"help\"]/ul/li[2]/a/span")).click();
		 
	    Thread.sleep(6000);
	    
	    Set<String> allopenwins =  driver.getWindowHandles();
	    
	    System.out.println("The Number of Windows are : " +allopenwins.size());
	    
	    ArrayList<String> myorder = new ArrayList(allopenwins);    //To keep in Order 
	    
	    driver.switchTo().window(myorder.get(1));   //move to sub window
	    
	    System.out.println("After proper implementation - title is : " +driver.getTitle());

	}

}
