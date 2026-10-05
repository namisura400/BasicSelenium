package SelectPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectValueClass1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
	    
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
	
		
		 driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		 driver.findElement(By.name("txtPassword")).sendKeys("admin");
		 driver.findElement(By.name("Submit")).click();
		               
		driver.switchTo().frame(driver.findElement(By.id("rightMenu")));    //moved to frame based on WebElement
		               
		
		
		WebElement DD = driver.findElement(By.id("loc_code"));  //Drop Down WebElement
		
		Select S = new Select(DD);
		
		S.selectByValue("3");     //based on value
		
	}

}
