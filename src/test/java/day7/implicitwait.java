package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class implicitwait {

	public static void main(String[] args) throws InterruptedException {
		
    WebDriver driver= new ChromeDriver();
    //implicitwait method------
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    
    driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
    driver.manage().window().maximize();
   
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    
    
    driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("iphone");
   
    
    
    driver.close();
    
	}

}
