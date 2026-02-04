package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseaction {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
	
		Thread.sleep(Duration.ofSeconds(5));
		
	WebElement computer=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
	WebElement notebook=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Notebooks']"));
	
	Actions act= new Actions(driver);
	act.moveToElement(computer).moveToElement(notebook).build().perform();
	notebook.click();
	
	//driver.navigate().back();
		

	}

}
