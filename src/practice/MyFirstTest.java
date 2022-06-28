package practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirstTest {
	
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		
		File file = new File("/Users/mr.a2z/Drivers_Jars/ChromeDriver_101/chromedriver");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	    driver = new ChromeDriver(); //tell webdriver in which browser you want to run your test case
	    driver.manage().window().maximize(); // my test should run in maximize mode of browser
			
	}
	
	@Test
	public void atTest() {
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
	
	@AfterTest
	public void tearDown() {
		
		//driver.close();
	}

}
