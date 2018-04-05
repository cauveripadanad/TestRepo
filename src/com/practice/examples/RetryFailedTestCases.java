package com.practice.examples;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestCases implements IRetryAnalyzer{

	//set the counter to 0
	int minretryCount = 0;
	
	//set maximum counter , try 2 times
	int maxretryCount=2;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if (!result.isSuccess()) {
			
		
		 // this will run until max count completes if test pass within this frame it will come out of for loop
		if(minretryCount<maxretryCount){
			
			System.out.println("Retrying " + result.getName() + " again and the count is " + (minretryCount+1));
			minretryCount++;
			return true;
		}
		}
		return false;
	}

}
