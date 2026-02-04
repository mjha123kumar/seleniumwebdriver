package day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipledropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();

		// 1. Open dropdown
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();

		// 2. Locate all options
		List<WebElement> options = driver.findElements(
				By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));

		System.out.println("Total options in dropdown: " + options.size());

		// 3. Print all options using normal for loop
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());
		}

		// 4. Select multiple specific options (example: Java & Python) using normal for loop
		for (int i = 0; i < options.size(); i++) {
			String text = options.get(i).getText();
			if (text.equals("Java") || text.equals("Python")) {
				options.get(i).click();
				Thread.sleep(500);
			}
		}

		// 5. Close browser
		Thread.sleep(2000);
		driver.quit();
	}
}
