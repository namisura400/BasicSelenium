package CheckBoxpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxClass1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("C:\\Users\\DELL\\Downloads\\Country Check box.html");
	    
	    driver.findElement(By.xpath("/html/body/form/input[1]")).click();
	    driver.findElement(By.xpath("/html/body/form/input[2]")).click();
        driver.findElement(By.xpath("/html/body/form/input[3]")).click();
        driver.findElement(By.xpath("/html/body/form/input[4]")).click();
        driver.findElement(By.xpath("/html/body/form/input[5]")).click();
	}

}
