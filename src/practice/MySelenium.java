package practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MySelenium {

	WebDriver driver;
	
	
	@BeforeTest
	public void setUp() {
	
		File file = new File("/Users/mr.a2z/Drivers_Jars/ChromeDriver_102/chromedriver");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void atTest() throws Exception {
		
		driver.get("https://www.wework.com/");
		
		new Select(driver.findElement(By.id("locations-dropdown"))).selectByVisibleText("Atlanta");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='select-location-btn']")).submit();
		
        Thread.sleep(30000);
		driver.findElement(By.xpath("//h3[normalize-space()='Terminus']")).click();
		
	}
	
	@AfterTest
	public void tearDown() {
		
		
	}
	
	
}
