package com.SP.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.SP.base.TestBase;

public class extends TestBase {

	
	@Test
	public void bankManagerLoginTest() throws InterruptedException, IOException{
		
		
		//verifyEquals("abc", "xyz");
		Thread.sleep(3000);
		log.debug("Inside Login Test");
		click("bmlBtn_XPATH");

//		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))),"Login not successful");
		
		log.debug("Login successfully executed");
		
		//Assert.fail("Login not successful");
		
		
		
	
	
	}
	
}
