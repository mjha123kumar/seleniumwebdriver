package day5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethod {

	public static void main(String[] args) {
		
    WebDriver driver= new ChromeDriver();
    driver.get("https://demo.nopcommerce.com/");
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());
    String windowid=driver.getWindowHandle();
    System.out.println(windowid);
    driver.findElement(By.cssSelector(windowid)).click();
    Set<String> windows=driver.getWindowHandles();
    System.out.println(windows);
    driver.close();
	}
	

}
