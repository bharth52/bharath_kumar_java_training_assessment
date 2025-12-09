package training_assessment;
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class web {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter browser name (chrome / edge / firefox): ");
        String browser = sc.nextLine();

        WebDriver driver = null;

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } 
        else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } 
        else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } 
        else {
            System.out.println("Invalid browser name!");
            System.exit(0);
        }

        driver.get("https://www.wikipedia.org/");
        driver.manage().window().maximize();
    }
}
