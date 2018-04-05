package com.practice.examples;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationExample {

	@BeforeMethod //executes before every method
	public void bm(){
		
		System.out.println("Before Method");
	}
	
	@AfterMethod //executes After every method
	public void am(){
		
		System.out.println("After Method");
		
		
	}
	
	@Test
	public void t1(){
		
		System.out.println("t1");
		Assert.assertTrue(false);;
	}
	
	@Test
	public void t2(){
		
		System.out.println("t2");
		
	}
	
	@BeforeTest
	public void bt(){
		
		System.out.println("Before test");
	}
	
	@AfterTest
	public void at(){
		
		System.out.println("After test");
	}
	
	@BeforeClass
	public void bc(){
		
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void ac(){
		
		System.out.println("After Class");
	}
}
