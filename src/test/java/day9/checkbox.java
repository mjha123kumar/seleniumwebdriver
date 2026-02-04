package day9;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkbox {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();

		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
	
		
		
		driver.close();
	}

}
