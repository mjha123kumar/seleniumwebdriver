package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalmethod {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		//isDispalyed method--------
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println("Display_logo_status:"+status);
		//isEnabeled   method---------
		boolean button_status=driver.findElement(By.xpath("//button[@id='register-button']")).isEnabled();
		System.out.println("Button_Active_Status:"+button_status);
		
		//isSelected  method ------
	//	boolean male =driver.findElement(By.xpath("//input[@id='gender-male']").click());
		//System.out.println(male.isSelected());
		
		
		driver.close(); 
	}

}
