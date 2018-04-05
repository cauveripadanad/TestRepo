package com.practice.java;

import org.testng.annotations.Test;

public class Forloopex {

	//print till 5
	
	@Test
	public void t1(){
		
		for(int i =1;i<=5;i++){
			
			System.out.println(i);
			
		}
	}
	
	//using while
	@Test
	public void t2(){
		
		int i=1;
		
		while(i<=5){
			
			
			System.out.println(i);
			i++;
		}
	}
}
