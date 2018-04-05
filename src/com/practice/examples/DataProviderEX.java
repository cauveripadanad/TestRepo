package com.practice.examples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEX {
	
	@DataProvider(name="dataproviderexample")
	public Object[][] getdata(){
		
		Object[][] obj = new Object[3][2];
		
		//1st row
		obj[0][0]="aa";
		obj[0][1]="aa1";
		
		//2nd row
		obj[1][0]="bb";
		obj[1][1]="bb1";
		
		//3rd row
		obj[2][0]="cc";
		obj[2][1]="cc1";
		
		return obj;
		
	}

	@Test(dataProvider="dataproviderexample")
	public void t1(String usr,String pwd){
		
		System.out.println("usr -- "+usr);
		System.out.println("pwd -- "+pwd);
	}
}
