package HandlingDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownPrintAll {

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
		
		List<WebElement> alldds = DD.findElements(By.tagName("option"));
		
		System.out.println("The Number of Elements in the DropDown is :" +alldds.size());
		
		for(int n = 0 ; n < alldds.size(); n++)
		{
			System.out.println(alldds.get(n).getText());
		}
		
		
	}

}
