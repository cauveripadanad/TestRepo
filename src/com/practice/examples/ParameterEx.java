package com.practice.examples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterEx {

	
	@Test
	@Parameters({"browsername"})
	public void openbrowser(String browsername){
		
		System.out.println("Browser name -- "+browsername);
	}
	
	@Test
	@Parameters({"username","password"})
	public void logindata(String username, String password){
		
		System.out.println("Username -- "+username);
		System.out.println("Username -- "+password);
	}
	
	
	
}
