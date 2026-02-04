package day13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlestatictabel {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	//find total number of row--------------------------------------------------------------------------	
	List<WebElement> Tabelrow=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr"));
	System.out.println(Tabelrow.size());
	
	//find the total number of column
	List<WebElement>TableColumn=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr[1]//th"));
	System.out.println(TableColumn.size());
	
	
	driver.close();
	 
		
		

	} 

}
