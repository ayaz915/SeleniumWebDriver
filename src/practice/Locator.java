package practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		
		
		File file = new File("/Users/mr.a2z/Drivers_Jars/ChromeDriver_101/chromedriver");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.saucedemo.com/");
	    
	   driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys("standard_user");
	   
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
	   
       driver.findElement(By.xpath("//input[@data-test='login-button']")).click();
	}

}
