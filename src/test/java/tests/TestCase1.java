package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import common.BaseClass;
public class TestCase1 extends BaseClass {
	
	@Test
	public void Test()
	{
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Hello and welcome to test automation");
	}

}
