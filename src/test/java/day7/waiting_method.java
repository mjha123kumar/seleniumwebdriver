package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class waiting_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver= new ChromeDriver();
    driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
    driver.manage().window().maximize();
    
    
    Thread.sleep(4000);
    
    
    driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("iphone");
    
    
    driver.close();
    
	}

}
