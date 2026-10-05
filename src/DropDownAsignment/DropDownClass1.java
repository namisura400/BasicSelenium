package DropDownAsignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownClass1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
	    
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
	
		
		WebElement U = driver.findElement(By.name("txtUserName"));
		              U.sendKeys("selenium");
		WebElement P = driver.findElement(By.name("txtPassword"));
		               P.sendKeys("admin");
		WebElement L = driver.findElement(By.name("Submit"));     
		               L.click();
		               
	   driver.switchTo().frame(driver.findElement(By.id("rightMenu")));    //moved to frame based on WebElement
		               
		               
		WebElement DD = driver.findElement(By.id("loc_code"));  //Drop Down WebElement
		
       List<WebElement> alldd = DD.findElements(By.tagName("option"));
		
		
       
		for(int n = 0 ; n < alldd.size(); n++)
		{
			alldd.get(n).click();
			Thread.sleep(2000);
			Select S = new Select(DD);
			Thread.sleep(2000);
			
			}
		
		}
}
