package RobotPack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass2 {

public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	   
	    
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		
		 Thread.sleep(4000);
		
		Actions A = new Actions(driver);
		
		
		WebElement W = driver.findElement(By.id("pim"));
		
		A.moveToElement(W).perform();
		
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//*[@id=\"pim\"]/ul/li[2]/a/span")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.switchTo().frame(driver.findElement(By.id("rightMenu")));
		 
		 driver.findElement(By.id("txtEmployeeId")).clear();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.name("txtEmployeeId")).sendKeys("884455");
		 driver.findElement(By.name("txtEmpLastName")).sendKeys("Parrot");
		 driver.findElement(By.name("txtEmpFirstName")).sendKeys("Peacock");
		 driver.findElement(By.name("txtEmpMiddleName")).sendKeys("Rabbit");
		 driver.findElement(By.name("txtEmpNickName")).sendKeys("Dear");
		 
		Thread.sleep(2000);
		
		A.moveToElement(driver.findElement(By.id("photofile"))).click().perform();
		
		Thread.sleep(2000);
		
		//Challange1:
		
		StringSelection ss = new StringSelection("C:\\Users\\DELL\\Downloads\\Lord krishna.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);    //copied the location
		
		Thread.sleep(2000);
		
		//Challange2:
		
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_CONTROL);
		R.keyPress(KeyEvent.VK_V);
		R.keyRelease(KeyEvent.VK_CONTROL);
		R.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(2000);
		
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		
	   
		
		}

}

