package browser;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class LaunchCloseBrowser {
	
	public WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	
	public void launchBrowser(String browser){
	
		if(browser.equalsIgnoreCase("Firefox")){

			   File file = new File("/Users/mr.a2z/Drivers_Jars/FireFoxDriver/geckodriver");
			   System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		       driver = new FirefoxDriver();
		       driver.manage().window().maximize();
		}
		
		else if(browser.equalsIgnoreCase("Chrome")){
			
			File file = new File("/Users/mr.a2z/Drivers_Jars/ChromeDriver_101/chromedriver");
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		else if(browser.equalsIgnoreCase("Edge")){
			
			File file = new File("/Users/mr.a2z/Drivers_Jars/edgedriver_mac64/msedgedriver");
			System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
			driver =new EdgeDriver();
			driver.manage().window().maximize();
		}
		else {
			
			File file = new File("/Users/mr.a2z/Drivers_Jars/ChromeDriver_101/chromedriver");
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
	}
	
	
	
	@AfterTest
	public void closeBrowser(){
		
		driver.close();
	}

}
