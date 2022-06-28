package bing;


import org.testng.annotations.Test;

import browser.LaunchCloseBrowser;

public class Bing extends LaunchCloseBrowser{

	@Test
	public void atTest() throws Exception{
		
		driver.get("http://www.bing.com");
		
		System.out.println(driver.getTitle());
		
	}
	
	
}