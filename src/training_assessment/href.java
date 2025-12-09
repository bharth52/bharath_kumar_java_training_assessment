package training_assessment;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class href {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        List<WebElement> anchors = driver.findElements(By.tagName("a"));
        System.out.println("Total Anchor Tags: " + anchors.size());

        for(WebElement a : anchors) {
            System.out.println(a.getAttribute("href"));
        }

        driver.quit();
    }
}
