package CheckListAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckListSelectallClass1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("C:\\Users\\DELL\\Downloads\\Country Name.Htm");
	    
	   WebElement CL = driver.findElement(By.id("CheckList"));
	   
	   List<WebElement> allCB = CL.findElements(By.tagName("option"));
	   
	   for(int s = 0 ; s < allCB.size(); s++){
		   {
			   allCB.get(s).click();
		   }
	   }
	}

}
