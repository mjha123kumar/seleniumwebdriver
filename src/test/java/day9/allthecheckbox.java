package day9;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class allthecheckbox {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@class=\"form-check-input\"][@type=\"checkbox\"]"));
		
		for(int i=0; i< checkbox.size(); i++) {
			checkbox.get(i).click();
		//	Thread.sleep(600);
			
			
		}
		
      driver.close();
	}

}
