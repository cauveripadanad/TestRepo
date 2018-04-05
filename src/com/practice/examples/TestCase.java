package com.practice.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase {

	String baseUrl = "https://gmail.com";
	String expectedTitle = "Gmail";
	String actualTitle = "";

	WebDriver driver;

	@BeforeMethod
	public void openBrowser(){

		//Creating instance of Firefox driver
		System.setProperty("webdriver.gecko.driver", "D:\\WorkspaceForPro\\Practice\\BrowserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();

		//WebDriver's get() method is used to launch a new browser session and directs it to the URL that you specify as its parameter.
		driver.get(baseUrl);

	}

	@Test
	public void testNGtestcase(){


		//get the actual value of the title
		//The WebDriver's has the getTitle() method that is always used to obtain the page title of the currently loaded page.
		actualTitle = driver.getTitle();

		System.out.println(actualTitle);

		/*  * compare the actual title of the page with the expected one and print
		 * the result as "Passed" or "Failed"
		 */

		if (actualTitle.contentEquals(expectedTitle)){
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}
	}

	@AfterMethod()
	public void closeBrowser(){
		//Terminating a Browser Session
		driver.close();
	}


}
