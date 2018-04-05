package com.practice.examples;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PriorityExampled {
	
	WebDriver driver;			

    // Method 1: Open Browser say Firefox			
    @Test (priority=1)		
    public void openBrowser() {
    	
    	System.out.println("Open the browser");				
    }		

    // Method 2: Launch Google.com			
    @Test (priority=2)		
    public void launchGoogle() {				
        
    	System.out.println("Launch Google Page");
    }		

    // Method 3: Perform a search			
    @Test (priority=3)		
    public void peformSeach() {				
        
    	System.out.println("Perform search");
    	
    }		

 // Method 4: Close the browser		
    @Test (priority=4)		
    public void closeBrowser() {				
        
    	System.out.println("Close Browser");
    	
    }

}
