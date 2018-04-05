package com.practice.examples;

import org.testng.annotations.Test;

public class IgnoreTest {
	
	@Test(enabled=false)
	public void t1(){
		
		System.out.println("t1");
	}
	
	@Test
	public void t11(){
		
		System.out.println("t11");
	}
}
