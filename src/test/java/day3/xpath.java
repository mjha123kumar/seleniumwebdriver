package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();

driver.get("https://dsssbonline.nic.in/Apply.aspx?advt_no=vFo3QbbhN%2fs%3d&postCode=fTygJ7vdmks%3d&jobtitle=2j1YY0ODRBbwappiQo31Eu96ORyUfWFT9wXTYsZA0naAWdHAbvzoJLRb7LSLcLsq&dobfrom=ZDHsn8%2fgcPKv0XjiuP2udQ%3d%3d&dobto=8Uh+e9KsXk%2fvZE2sr0Amow%3d%3d&jid=GVNPtoiHmMY%3d&endson=8Uh+e9KsXk%2fWbxT7Br3tog%3d%3d&JobDesc=pYi7bLSrVuQ%3d&reqid=eqY0q7MFIcc%3d&endson_org=8Uh+e9KsXk%2fWbxT7Br3tog%3d%3d&Digest=DoZcfpc+NXwD8ndFKs1Eeg");

driver.manage().window().maximize();
//tagename[@attribut=value]
driver.findElement(By.xpath("//*[@name='q']")).sendKeys("samsung s 24 ultra");
//with multiple attributes
driver.findElement(By.xpath("//input[@name='q'][@placeholder='Search store']")).sendKeys("samsung s 24 ultra");
//or aur and operator use kr ke
driver.findElement(By.xpath("//input[@name='q'and @placeholder='Search store']")).sendKeys("iphone");

driver.close();

	}

}
