package com.practice.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGExample {
	
	WebDriver driver = new FirefoxDriver();

	@Test
	public void MyFirstTestNGTestCase() throws InterruptedException {
		
		String title = driver.getTitle();
		System.out.print("Current page title is : " + title);

		WebElement user = driver.findElement(By.name("userName"));
		user.sendKeys("test");
		
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("test");
		
		WebElement signin = driver.findElement(By.name("login"));
		signin.click();

		System.out.print("\n'SUCCESSFUL EXECUTION!!!");
	}

	@BeforeMethod
	public void startFireFox() {
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
	}

	@AfterMethod
	public void closeBrowser() {
		System.out.print("\nBrowser close");
		driver.quit();
	}

}
