package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class csslocators {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		 // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open URL
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
                                                                                                                          
        
       //tag+id   tagname#id
        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("iphone");
        
        
        //tab+class    tagname.classname
      driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("samsung");
        
        //tagename+attribute     tagname[attribute=""]
       driver.findElement(By.cssSelector("input[type=text]")).sendKeys("jeans");
        
        //tag+class+attribute   tageneme.classname[attribute="value"]
        
     driver.findElement(By.cssSelector("input.search-box-text[type=\"text\"]")).sendKeys("trauser");
     
        
        


       
        // Close browser
        //driver.close();
    } 
	}


