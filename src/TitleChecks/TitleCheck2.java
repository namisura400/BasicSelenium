package TitleChecks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleCheck2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		//home title
		String htitle = driver.getTitle();
		//System.out.println("The Home Page Title is :" +htitle);
		
		if(htitle.equals("OrangeHRM - New Level of HR Management"))
		{
			System.out.println("The Home page Title Validated Successfully");
		}
		else
		{
			System.out.println("Incorrect Home Page title");
		}
		
		
		
		WebElement U = driver.findElement(By.name("txtUserName"));
		              U.sendKeys("selenium");
		WebElement P = driver.findElement(By.name("txtPassword"));
		               P.sendKeys("selenium");
		WebElement L = driver.findElement(By.name("Submit"));     
		               L.click();
		               
		               //after login title
		               
		  String atitle = driver.getTitle();
		 // System.out.println("After Login Title is :" +atitle);
		               
	}

}
