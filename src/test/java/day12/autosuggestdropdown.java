package day12;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

 
public class autosuggestdropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
        Thread.sleep(5000);
        
        //aisa xpath find kro jo sare suggested element select kr paaye
        
        List <WebElement> autosuggedtion=driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li//div[@role=\"option\"]"));
        System.out.println(autosuggedtion.size());
        
        for(int i =0; i<autosuggedtion.size();i++) {
        	System.out.print(autosuggedtion.get(i).getText());
        	if(autosuggedtion.get(i).getText().equals("selenium")) {
        		autosuggedtion.get(i).click();
        		break;
        		}
        }
      driver.findElement(By.xpath("//a[@class=\"gb_A\"]")).click();
       // driver.close();
        
	}

}
