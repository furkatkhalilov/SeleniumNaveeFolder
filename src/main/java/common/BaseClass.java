package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeTest
	public void browserSetup() {
		driver = new ChromeDriver();
	}
	
	@AfterTest
	public void browserTearDown()
	{
		driver.quit();
	}
}
