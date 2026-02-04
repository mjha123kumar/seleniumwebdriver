package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class dropdown {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		WebElement selectdropdown=driver.findElement(By.xpath("//select[@id='country']"));
		Select country=new Select(selectdropdown);
		//select by  visible text
		country.selectByContainsVisibleText("Canada");
		//select by value
        country.selectByValue("germany");
        //select by index
        
        country.selectByIndex(4);
        
        
        driver.close();
        
		
		
		
		
		
		

	}

}
