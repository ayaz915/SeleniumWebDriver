package yahoo;


import org.testng.annotations.Test;

import browser.LaunchCloseBrowser;

public class Yahoo extends LaunchCloseBrowser{

	@Test
	public void atTest() throws Exception{
		
		driver.get("http://www.yahoo.com");
		
		System.out.println(driver.getTitle());
		
	}
	
	
}