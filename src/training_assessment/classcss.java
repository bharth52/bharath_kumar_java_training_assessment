package training_assessment;


	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class classcss {
	  @Test
	  public void cls() {
		  
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.cssSelector("input.btn-style")).click();
	  }
	}


