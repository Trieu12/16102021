package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VerifyTitle extends AbstractClass {
	@Test
	public static void VerifyTitleTest() {
		String expectedTitle = "Welcome: Mercury Tours";
		
		WebElement title = driver.findElement(By.xpath("//title"));
				
		 String actualTitle = driver.getTitle();
	     if (actualTitle.contentEquals(expectedTitle)) {
	    	 System.out.println("Actual title is equal to expected one");
	     } else {
	         System.out.println("Failed");
	     }
	}
}
