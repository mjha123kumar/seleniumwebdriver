package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

    public static void main(String[] args) {

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open URL
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        
        // Validate Title
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test case passed");
        } else {
            System.out.println("❌ Title did not match. Found: " + actualTitle);
        }

        // Close browser
        driver.close();
    }
}
