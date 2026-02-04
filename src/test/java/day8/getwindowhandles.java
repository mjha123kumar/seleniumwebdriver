package day8;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowhandles {

	@SuppressWarnings("unused")
	public static void main(String[] args) { 
		WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.orangehrm.com/es/open-source");
		driver.manage().window().maximize(); 
		
		driver.findElement(By.xpath("//a[@href='https://www.orangehrm.com/company/about-us'][normalize-space()='About Us']")).click();
		
		
		Set<String>windid=driver.getWindowHandles();
		
	List<String> windowList=new ArrayList<String>(windid);
		
  String parentid=windowList.get(0);
  String childid=windowList.get(1);
  System.out.println(parentid);
  System.out.println(childid);
  
  driver.switchTo().window(childid);
  System.out.println(driver.getTitle());
  
  driver.switchTo().window(parentid);
  System.out.println(driver.getCurrentUrl());
  
 // driver.navigate().back();
  driver.switchTo().window(childid);
  System.out.println(driver.getCurrentUrl());
  
  
  
 System.out.println(driver.getCurrentUrl());
  
  driver.close();
 
  
  
	}

}
