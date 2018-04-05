package com.practice.examples;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupEx {
	
	@Test(groups="java")
	public void java1(){
		
		System.out.println("java1");
		Reporter.log("java1 executed");
	}
	
	@Test(groups="java",dependsOnMethods="java3")
	public void java2(){
		
		System.out.println("java2");
		Reporter.log("java2 is executed");
	}
	
	@Test(groups="java")
	public void java3(){
		
		System.out.println("java3");
	}
	
	@Test(groups="py")
	public void py1(){
		
		System.out.println("py1");
	}
	
	@Test(groups="py")
	public void py2(){
		
		System.out.println("py2");
		Reporter.log("py2 executed");
	}
	
	@Test(groups="py")
	public void py3(){
		
		System.out.println("py3");
	}

}
