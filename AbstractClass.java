package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

public class AbstractClass {

	public static String baseUrl = "http://demo.guru99.com/test/newtours/index.php";
    public static String driverPath = "E:\\HOCTAP\\KIỂM THỰ TỰ ĐỘNG\\chromedriver.exe";
    public static WebDriver driver; 
   

    
    @BeforeTest 
	public void beforeTest()
	{
    	System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}
    
   
    @AfterTest 
	public void tearDown()
	{
		//driver.close();
	}
  
    @BeforeClass
	public void beforeClass()
	{
    	System.out.println("Start testing for class");
	}
  

    @org.testng.annotations.AfterClass
	public void AfterClass()
	{
    	System.out.println("End testing for class");
	}
}