package testng_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class oranermtest {
   WebDriver driver;
	@Test (priority=0)
	void openapp() {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/events/greatindianfestival?ref_=nav_cs_gb&bubble-id=deals-collection-lightning-deals");
		driver.manage().window().maximize();
		
	}
	
	@Test (priority=1) 
	void testlogo() {			
		boolean Status=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();
		System.out.println(Status);
				
	    }
	@Test(priority=2)
	void SEARCHPRODUCT() throws InterruptedException {
		Thread.sleep(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone16");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button'] ")).click();
		
		}
	
	@Test(priority=3)
	void closebrowser() {
		//driver.close();
		
	    }
}
