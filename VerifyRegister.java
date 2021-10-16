package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VerifyRegister extends AbstractClass {
	@Test(priority = 0)
	public static void VerifyRegister() {
		WebElement w = driver.findElement(By.xpath("//*[@style= 'margin-left:20px;']/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
		w.click();
		
		List<WebElement> childElements = driver.findElements(By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']/input"));
		for(int i = 0; i<childElements.size();i++) {
			childElements.get(0).sendKeys("Trieu");
			childElements.get(1).sendKeys("Tu");
			childElements.get(2).sendKeys("1234456789");
			childElements.get(3).sendKeys("tuminhtrieu@gmail.com");
			
			childElements.get(4).sendKeys("5 Ton Dan");
			childElements.get(5).sendKeys("TP HCM");
			childElements.get(6).sendKeys("Phuong 10");
			childElements.get(7).sendKeys("113457178347");
			
			childElements.get(8).sendKeys("trieu123");
			childElements.get(9).sendKeys("trieu321");
			childElements.get(10).sendKeys("trieu321");
			break;
        }
		
		WebElement submit = driver.findElement(By.xpath("//*[@name='submit']"));
		submit.click();
		
		System.out.println("PASS!");
	}
	
	@Test(priority = 1)
	public static void Login() {
		WebElement login = driver.findElement(By.xpath("//*[@face='Arial, Helvetica, sans-serif']/a"));
		login.click();
		List<WebElement> childElements1 = driver.findElements(By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']/input"));
		for(int i = 0; i<childElements1.size();i++) {
			childElements1.get(0).sendKeys("trieu123");
			childElements1.get(1).sendKeys("trieu321");
			break;
		}
		
		WebElement submitlogin = driver.findElement(By.xpath("//*[@name='submit']"));
		submitlogin.click();
	}
}
