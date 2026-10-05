package HyperLinkAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinkClass1 {

	public static void main(String[] args) {
		
        
		System.setProperty("webdriver.chrome.driver" , "C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("C:\\Users\\DELL\\Downloads\\Hyper links.html");
		
		WebElement HL = driver.findElement(By.tagName("a"));
		
		 List<WebElement> allcount = HL.findElements(By.xpath("/html/body/p/font/i[2]/a"));
		    
		
		 System.out.println("The Number of Count :" +allcount.size());
		
	}

}
