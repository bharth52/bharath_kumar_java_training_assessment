package training_assessment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class idcss {
	

@Test
	

	public class CssTest {
	 
	  public void css() {
		  
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.cssSelector("button#openwindow")).click();
		  
		  driver.quit();

		  
		  
	  }
	}

}
