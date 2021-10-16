package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SupportTest extends AbstractClass {
	@Test
	public static void RegisterTest() {
		WebElement w =driver.findElement(By.xpath("//*[@style= 'margin-left:20px;']/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[3]/a"));
		w.click();
		
		String expectedTitle = "Support: Mercury Tours";
		String actualTitle = driver.getTitle();
	     if (actualTitle.contentEquals(expectedTitle)) {
	    	 System.out.println("Actual title is equal to expected one");
	     } else {
	         System.out.println("Failed");
	     }
	}
}