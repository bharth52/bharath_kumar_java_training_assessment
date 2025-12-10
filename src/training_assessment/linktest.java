package training_assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class linktest{

	public static void main(String[] args) {
		
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://money.rediff.com/news/share-market-news");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Mutual Funds")).click();
	}

}