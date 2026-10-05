package CheckListPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckListClass2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("C:\\Users\\DELL\\Downloads\\Country Name.Htm");
	    
	    WebElement CL = driver.findElement(By.id("CheckList"));
	    
	    Select H = new Select(CL);
	    
	    H.selectByIndex(4);
	    H.selectByVisibleText(" Japan");
	    H.selectByIndex(7);
	    H.selectByVisibleText(" Russia");
	    
	}

}
