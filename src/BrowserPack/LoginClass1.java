package BrowserPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass1 {

	public static void main(String[] args) {
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
		               
	}

}
